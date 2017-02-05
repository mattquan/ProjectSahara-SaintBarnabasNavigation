/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectSahara;

import java.util.*;

/**
 *
 * @author tinawu
 */
public class Main {

    public static void main(String[] args) {
        //first creates path of strings from complete navigation
        ArrayList<String> path =  completeNavigation(Keys.nodeNameRoomE00C6FloorGround, Keys.nodeNameRoomG336FloorGround);
        ArrayList<String> wifi = generateWifiFromPath(path);
        //then creates array list of wifi info using generateWifiFromPath()
    }

    public static ArrayList<String> runDijkstrasAlgorithm(ArrayList<Node> listOfNodes, String startingNodeString, String endingNodeString) {
        //creating the unvisited list
        System.out.println("listOfNodes"+listOfNodes+""+"finding"+startingNodeString);
        ArrayList<Node> unvisited = new ArrayList(); 
        for (Node node : listOfNodes) {
            unvisited.add(node);
        }
        //set my starting node
        Node startingNode = findNodeGivenString(startingNodeString, listOfNodes);
        //precondition of starting node. it's weight is 0, not infinity
        startingNode.setWeight(0);
        //because by default, minPath is null. so the first one has to have a non null path so that it can copy to all the other nodes.
        startingNode.setMinPath(new Path(startingNode.getName()));

        //set my ending node
        Node endingNode = findNodeGivenString(endingNodeString, listOfNodes);
        //first move. and also so i can initilzie chosen node
        Node chosenNode = startingNode;
        while (chosenNode != endingNode) {
            
            /*System.out.println("chosenNode" + chosenNode);
            System.out.println("chosenNodePath" + chosenNode.getMinPath());
            System.out.println("chosenNodeWeight" + chosenNode.getWeight());*/
            
            //for each edge in my chosen node, look at that connecting edge and update values if necessary
            for (Edge edge : chosenNode.getAdjacentEdges()) {
                //panda is that particular targetnode from that particular edge
                Node panda = findNodeGivenString(edge.getTargetNode(), listOfNodes);
                //update only if panda has been unvisited. if it has already been visited, we don't look at it. 
                //basiclaly don't look at the targetnode if, as a node, the targetnode has already been looked at
                //confusing a bit. becuase panda is a target node. but that node only goes to unvisited if it was ever the chosenNode
                //so if panda was already a chosenNode, then don't look at it, basically, if that makes more sense
                if (binarySearch(panda, unvisited)) {
                    double suggestedWeight = chosenNode.getWeight() + edge.getWeight();
                    //only if my new weight < my old weight, do i update
                    if (suggestedWeight < panda.getWeight()) {
                        //update values
                        panda.setWeight(suggestedWeight);
                        
                        //so i can add myself, the panda, to the new improved chain. becuase the old chain came from the chosenNode, the startingNode of the edge (vs. targetNode).
                        //and THAT path/chain does not include the targetNode/panda. so you have to add itself to the new, min path. beecause the min path takes
                        //vestiges of the old chain from chosenNode + the panda node.
                        
                        Path path = new Path(chosenNode.getMinPath());
                        path.add(edge);
                        panda.setMinPath(path);
                        //debugging info
                        /*System.out.println("panda:" + panda);
                        System.out.println("pandaWeight" + panda.getWeight());*/
                    } else {
                        //debugging info
                        //System.out.println("did not update becuase wasn't min" + panda);
                    }
                } else {
                    //debugging info
                    //System.out.println("did not look at " + panda+", already updated");                   
                }
            }
            //remove the chosenNode from the unvisited list becuase it was visited
            binarySearchAndDestroyNode(chosenNode.getName(), unvisited);
            //debugging info
            //System.out.println(unvisited);
            
            //choosing the newest minNode
            Node minNode = new Node();
            for (Node node : unvisited) {
                if (node.getWeight() < minNode.getWeight()) {
                    minNode = node;
                }
            }
            chosenNode = minNode;
        }
        //done!
        //this printout works becuase of polymorphism. eventually, chosenNode will = endingNode, and then when that happens, endingNode will have already been altered. 
        /*TODO ArrayList <String> wifis = new ArrayList<>();
        Path finalPath = endingNode.getMinPath();
        for (String name:finalPath.getNodePath()) {
            Node myNode = findNodeGivenString(name,listOfNodes);
            //add
            wifis.add(myNode.getMacAddresses());
        }*/
        return endingNode.getMinPath().getNodePath();

    }
    
    public static ArrayList<String> completeNavigation(String startingNodeString, String endingNodeString){
    	   System.out.println(startingNodeString);
    	//Strings hold starting/ending floors.
    	String startingNodeFloor;
    	String endingNodeFloor;
    	String startingNodeElevator;
    	String endingNodeElevator;
        
    	
    	//Determines what floor startingNode is on and sets elevator variable for later use if nodes are on different floors.
    	String [] results = Keys.findFloorAndElevator(startingNodeString);
        startingNodeFloor = results[0];        
        startingNodeElevator =results[1];
        System.out.println(startingNodeFloor);
        System.out.println(startingNodeElevator);
        
        
    	//Determines what floor endingNode is on and sets elevator variable for later use if nodes are on different floors.
    	results = Keys.findFloorAndElevator(endingNodeString);
        endingNodeFloor = results[0];
        endingNodeElevator = results[1];
        //System.out.println(endingNodeFloor);
        //System.out.println(endingNodeElevator);       
         	
        //create the first graph... if they are are on the same floor, great! just use this. if not, you will need to add seperate graphs for other sections
        ArrayList<Node> myFirstFloor = Keys.returnGraphFromFloor(startingNodeFloor).build();
        //add starting node to graph IFF the starting node is a room
        Node startingNode = findNodeGivenString(startingNodeString,Keys.listOfRooms);         
            //System.out.println(startingNode);
        if (startingNode!=null) {
            //this is the correct add method to use... adds it alphabetically
            Keys.add(myFirstFloor, startingNode);
                //System.out.println("added starting room");
            }
        ArrayList <String> data;
    	//If starting/ending are on the SAME FLOOR.
    	if(startingNodeFloor.equals(endingNodeFloor)){            
            //System.out.println("Same floor!");
            
            //add endingNode to graph IFF nodes are rooms       
            Node endingNode = findNodeGivenString(endingNodeString,Keys.listOfRooms);
            //System.out.println(endingNode);            
            if (endingNode !=null) {
                Keys.add(myFirstFloor, endingNode);
                for (Edge edge:endingNode.getAdjacentEdges()) {
                    //for all of ITS ending nodes, you must create a link TO THOSE POINTS
                    //add for every target node, a symetrical edge
                    //we also have to switch the edge's target node to the endingNode
                    System.out.println("edge"+edge);
                    Node targetNode = findNodeGivenString(edge.getTargetNode(),myFirstFloor);
                    edge.setTargetNode(endingNodeString);
                    System.out.println("adding "+edge+" to "+targetNode);
                    targetNode.addEdge(edge);
                }
                //System.out.println("added ending node");
            }
            
            //cool now run the algorithm
            data = runDijkstrasAlgorithm(myFirstFloor,startingNodeString, endingNodeString);
            
                
    	}
        
        else {
            data = runDijkstrasAlgorithm(myFirstFloor,startingNodeString,startingNodeElevator);
            ArrayList<Node> mySecondFloor = Keys.returnGraphFromFloor(endingNodeFloor).build();
            //add endingNode to graph IFF nodes are rooms       
            Node endingNode = findNodeGivenString(endingNodeString,Keys.listOfRooms);
            //System.out.println(endingNode);
            if (endingNode !=null) {
                Keys.add(mySecondFloor, endingNode);
                //System.out.println("added ending node");
                for (Edge edge:endingNode.getAdjacentEdges()) {
                    //for all of ITS ending nodes, you must create a link TO THOSE POINTS
                    //add for every target node, a symetrical edge
                    //we also have to switch the edge's target node to the endingNode
                    System.out.println("edge"+edge);
                    Node targetNode = findNodeGivenString(edge.getTargetNode(),mySecondFloor);
                    edge.setTargetNode(endingNodeString);
                    System.out.println("adding "+edge+" to "+targetNode);
                    targetNode.addEdge(edge);
                }
            }
            /*System.out.println(endingNodeElevator);
            System.out.println(endingNodeString);
            System.out.println(mySecondFloor);*/
            if (startingNodeFloor.contains("EastWing")||endingNodeFloor.contains("EastWing")) {
                //if startingNode is NOT in the east wing... go to the east wing
                //else go FROM the east wing to the mainbuilding
                ArrayList <String> data1point5;
                if(!startingNodeFloor.contains("EastWing")){
                    data1point5 = runDijkstrasAlgorithm(new FloorGround().build(), Keys.nodeNameElevatorFloorGround, Keys.nodeNameHallwayEastWingFloorGround);
                    for (int i =0; i <data1point5.size();i++) {
                        data.add(data1point5.get(i));
                    }
                }
                else{
                    data1point5 = runDijkstrasAlgorithm(new FloorGround().build(), Keys.nodeNameHallwayEastWingFloorGround, Keys.nodeNameElevatorFloorGround);
                    
                }   
                for (int i =0; i <data1point5.size();i++) {
                        data.add(data1point5.get(i));
                    }
        }   
            ArrayList<String> data2 = runDijkstrasAlgorithm(mySecondFloor,endingNodeElevator,endingNodeString);
            for (int i =0; i<data2.size();i++) {
                data.add(data2.get(i));
            }
            //but if you need a bridge to the east wing the starting node is in the main building and the ending node is in the east wing or vice versa (does not apply if the starting/ending node is on ground floor).            
            
        }
                
    	return data;
    } 
    
    public static ArrayList<String> generateWifiFromPath(ArrayList<String> pathOfStrings)
    {
        
        ArrayList<String> ipAddresses = new ArrayList<String>(); //master list of ip addresses
        
        for(int index = 0; index < pathOfStrings.size(); index++)  
        {
            //gets current string, makes it a node, finds ip addresses using getIPAddresses method from Node class
            String currentLocation = pathOfStrings.get(index);
            Node currentNode = findNodeGivenString(currentLocation, Keys.listOfRooms); 
            ArrayList<String> thisNodesIPAddresses = currentNode.getIPAddresses();
            
            for(int i = 0; i < thisNodesIPAddresses.size(); i++) //now accesses each ip address from the thisNodesIPAddresses array list
            {
                ipAddresses.add(thisNodesIPAddresses.get(i)); //adds each one to the master list
            }
        }
        
        return ipAddresses; //returns the master list of ip addresses
    }

    public static Node findNodeGivenString(String findThis, ArrayList<Node> listOfNodes) {
        //returns node object given String
        int min = 0;
        int max = listOfNodes.size() - 1;
        int index;

        while (max - min > -1) {
            index = (min + max) / 2;
            if (listOfNodes.get(index).getName().equals((findThis))) {
                //found it!
                return listOfNodes.get(index);
            } else if (listOfNodes.get(index).getName().compareToIgnoreCase(findThis) < 0) {
                min = index + 1;
            } else { //(unselected[center+1] > toBeDestroyed)
                max = index - 1;
            }

        }
        return null;
    }

    public static void binarySearchAndDestroyNode(String toBeDestroyed, ArrayList<Node> searchThis) {
        //returns index of the toBeDestroyed within the array
        int min = 0;
        int max = searchThis.size() - 1;
        int index;

        while (max - min > -1) {
            index = (min + max) / 2;
            if (searchThis.get(index).getName().equals(toBeDestroyed)) {
                searchThis.remove(index);
                break;
            } else if (searchThis.get(index).getName().compareToIgnoreCase(toBeDestroyed) < 0) {
                min = index + 1;
            } else { //(unselected[center+1] > toBeDestroyed)
                max = index - 1;
            }
        }
    }

    public static boolean binarySearch(Node checkThis, ArrayList<Node> inThis) {
        //returns a boolean. checks the path. 
        //will return true if the path's last element is in the unselected.
        int min = 0;
        int max = inThis.size() - 1;
        int index;

        while (max - min > -1) {
            index = (min + max) / 2;
            if (inThis.get(index).getName().equals(checkThis.getName())) {
                //found it!
                return true;
            } else if (inThis.get(index).getName().compareToIgnoreCase(checkThis.getName()) < 0) {
                min = index + 1;
            } else { //(unselected[center+1] > toBeDestroyed)
                max = index - 1;
            }

        }
        return false;
    }


    
}
