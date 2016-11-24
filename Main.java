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
        completeNavigation(Keys.nodeNameEastWingFloorGround, Keys.nodeNameDeskFloorThree);
    }

    public static String runDijkstrasAlgorithm(ArrayList<Node> listOfNodes, String startingNodeString, String endingNodeString) {
        //creating the unvisited list
        System.out.println("listOfNodes"+listOfNodes+"");
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
                        String self = panda.getName();
                        Path path = new Path(chosenNode.getMinPath());
                        path.add(self);
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
        
        String output = "The shortest path is " + endingNode.getMinPath() + "with a weight of " + endingNode.getWeight() + ", ";
        return output;

    }
    public static String[] findFloorAndElevator (String node) {
        //element 0 is floor
        //element 1 is elevator
        String[] data = new String [2];
        if(node.contains("FloorGround")){
    		data[0] = "FloorGround";
    		data[1] = Keys.nodeNameElevatorFloorGround;
        }
    	
    	else if(node.contains("FloorOne")){
    		data[0] = "FloorOne";
    		data[1] = Keys.nodeNameElevatorFloorOne;}
    	
    	else if(node.contains("FloorTwo")){
    		data[0] = "FloorTwo";
    		data[1] = Keys.nodeNameElevatorFloorTwo;}
    	
    	else if(node.contains("FloorThree")){
    		data[0] = "FloorThree";
    		data[1] = Keys.nodeNameElevatorFloorThree;}
    	
        else if(node.contains("FloorFour")){
    		data[0] = "FloorFour";
    		data[1] = Keys.nodeNameElevatorFloorFour;}
        
        else if (node.contains("EastWingFloorOne")){
                data[0] = "EastWingFloorOne";
                data[1] = Keys.nodeNameElevatorEastWingFloorOne;
        }        
        else if (node.contains("EastWingFloorTwo")){
                data[0] = "EastWingFloorTwo";
                data[1] = Keys.nodeNameElevatorEastWingFloorTwo;                 
        }
        else if (node.contains("EastWingFloorThree")){
                data[0] = "EastWingFloorThree";
                data[1] = Keys.nodeNameElevatorEastWingFloorThree;    
        }    
        else if (node.contains("EastWingFloorFour")){
                data[0] = "EastWingFloorFour";
                data[1] = Keys.nodeNameElevatorEastWingFloorFour;
        }
        else if (node.contains("EastWingFloorFive")){
            data[0] = "EastWingFloorFive";
            data[1] = Keys.nodeNameElevatorEastWingFloorFive;
        }
        return data;
    }
    
    public static Graph returnGraphFromFloor (String floor) {
        System.out.println(floor);
        if(floor.equals("FloorGround"))
            return new FloorGround(); 
    		
        else if(floor.equals("FloorOne"))
            return new FloorOne();

        else if(floor.equals("FloorTwo")) 
            return new FloorTwo();

        else if(floor.equals("FloorThree")) 
            return new FloorThree();

        else if(floor.equals("FloorFour"))
            return new FloorFour();

        else if(floor.equals("EastWingFloorOne"))
            return new EastWingFloorOne();

        else if(floor.equals("EastWingFloorTwo"))
            return new EastWingFloorTwo();

        else if(floor.equals("EastWingFloorThree"))
            return new EastWingFloorThree();

        else if(floor.equals("EastWingFloorFour"))
            return new EastWingFloorFour();

        else if (floor.equals("EastWingFloorFive"))
            return new EastWingFloorFive();
        else
            return null;
    }
    public static void completeNavigation(String startingNodeString, String endingNodeString){
    	   System.out.println(startingNodeString);
    	//Strings hold starting/ending floors.
    	String startingNodeFloor;
    	String endingNodeFloor;
    	String startingNodeElevator;
    	String endingNodeElevator;
        
    	
    	//Determines what floor startingNode is on and sets elevator variable for later use if nodes are on different floors.
    	String [] results = findFloorAndElevator(startingNodeString);
        startingNodeFloor = results[0];        
        startingNodeElevator =results[1];
        System.out.println(startingNodeFloor);
        System.out.println(startingNodeElevator);
        
        
    	//Determines what floor endingNode is on and sets elevator variable for later use if nodes are on different floors.
    	results = findFloorAndElevator(endingNodeString);
        endingNodeFloor = results[0];
        endingNodeElevator = results[1];
        //System.out.println(endingNodeFloor);
        //System.out.println(endingNodeElevator);       
         	
        //create the first graph... if they are are on the same floor, great! just use this. if not, you will need to add seperate graphs for other sections
        ArrayList<Node> myFirstFloor = returnGraphFromFloor(startingNodeFloor).build();
        //add starting node to graph IFF the starting node is a room
        Node startingNode = findNodeGivenString(startingNodeString,Keys.listOfRooms);         
            //System.out.println(startingNode);
        if (startingNode!=null) {
                myFirstFloor.add(startingNode);
                //System.out.println("added starting room");
            }
        String output;
    	//If starting/ending are on the SAME FLOOR.
    	if(startingNodeFloor.equals(endingNodeFloor)){            
            //System.out.println("Same floor!");
            
            //add endingNode to graph IFF nodes are rooms       
            Node endingNode = findNodeGivenString(endingNodeString,Keys.listOfRooms);
            //System.out.println(endingNode);            
            if (endingNode !=null) {
                myFirstFloor.add(endingNode);
                //System.out.println("added ending node");
            }
            
            //cool now run the algorithm
            output = runDijkstrasAlgorithm(myFirstFloor,startingNodeString, endingNodeString);
            
                
    	}
        
        else {
            String output1 = runDijkstrasAlgorithm(myFirstFloor,startingNodeString,startingNodeElevator);
            ArrayList<Node> mySecondFloor = returnGraphFromFloor(endingNodeFloor).build();
            //add endingNode to graph IFF nodes are rooms       
            Node endingNode = findNodeGivenString(endingNodeString,Keys.listOfRooms);
            //System.out.println(endingNode);
            if (endingNode !=null) {
                mySecondFloor.add(endingNode);
                //System.out.println("added ending node");
            }
            System.out.println(endingNodeElevator);
            System.out.println(endingNodeString);
            System.out.println(mySecondFloor);
            String output2 = runDijkstrasAlgorithm(mySecondFloor,endingNodeElevator,endingNodeString);
            //but if you need a bridge to the east wing the starting node is in the main building and the ending node is in the east wing or vice versa (does not apply if the starting/ending node is on ground floor).            
            
            if (startingNodeFloor.contains("EastWing")||endingNodeFloor.contains("EastWing")) {
                //if startingNode is NOT in the east wing... go to the east wing
                //else go FROM the east wing to the mainbuilding
                if(!startingNodeFloor.contains("EastWing"))
                    output1+= runDijkstrasAlgorithm(new FloorGround().build(), Keys.nodeNameElevatorFloorGround, Keys.nodeNameElevatorEastWingFloorGround);

                else
                    output1+=runDijkstrasAlgorithm(new FloorGround().build(), Keys.nodeNameElevatorEastWingFloorGround, Keys.nodeNameElevatorFloorGround);
                }           
            output = output1+output2;
        }       
    	System.out.println(output);
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
