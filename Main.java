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

        
        FloorGround fg = new FloorGround();
        runDijkstrasAlgorithm(fg.build(),Keys.nodeNameEastWingFloorGround,Keys.nodeNameHallwayFloorGroundC);
    }

    public static String runDijkstrasAlgorithm(ArrayList<Node> listOfNodes, String startingNodeString, String endingNodeString) {
        //creating the unvisited list
        System.out.println("listOfNodes"+listOfNodes+"");
        ArrayList<Node> unvisited = new ArrayList();
        for (Node node : listOfNodes) {
            unvisited.add(node);
        }
        //set my starting node
        Node startingNode = binarySearchAndReturn(startingNodeString, listOfNodes);
        //precondition of starting node. it's weight is 0, not infinity
        startingNode.setWeight(0);
        //because by default, minPath is null. so the first one has to have a non null path so that it can copy to all the other nodes.
        startingNode.setMinPath(new Path(startingNode.getName()));

        //set my ending node
        Node endingNode = binarySearchAndReturn(endingNodeString, listOfNodes);
        //first move. and also so i can initilzie chosen node
        Node chosenNode = startingNode;
        while (chosenNode != endingNode) {
            System.out.println("chosenNode" + chosenNode);
            System.out.println("chosenNodePath" + chosenNode.getMinPath());
            System.out.println("chosenNodeWeight" + chosenNode.getWeight());
            //for each edge in my chosen node, look at that connecting edge and update values if necessary
            for (Edge edge : chosenNode.getAdjacentEdges()) {
                //panda is that particular targetnode from that particular edge
                Node panda = binarySearchAndReturn(edge.getTargetNode(), listOfNodes);
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
                        System.out.println("panda:" + panda);
                        System.out.println("pandaWeight" + panda.getWeight());
                    } else {
                        //debugging info
                        System.out.println("did not update becuase wasn't min" + panda);
                    }
                } else {
                    //debugging info
                    System.out.println("did not look at " + panda+", already updated");                   
                }
            }
            //remove the chosenNode from the unvisited list becuase it was visited
            binarySearchAndDestroyNode(chosenNode.getName(), unvisited);
            //debugging info
            System.out.println(unvisited);
            
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
    
    public static void completeNavigation(String startingNode, String endingNode){
    	
    	//Strings hold starting/ending floors.
    	String startingNodeFloor;
    	String endingNodeFloor;
    	String startingNodeElevator;
    	String endingNodeElevator;
        
    	
    	//Determines what floor startingNode is on and sets elevator variable for later use if nodes are on different floors.
    	if(startingNode.contains("FloorGround")){
    		startingNodeFloor = "FloorGround";
    		startingNodeElevator = Keys.nodeNameElevatorFloorGround;
        }
    	
    	else if(startingNode.contains("FloorOne")){
    		startingNodeFloor = "FloorOne";
    		startingNodeElevator = Keys.nodeNameElevatorFloorOne;}
    	
    	else if(startingNode.contains("FloorTwo")){
    		startingNodeFloor = "FloorTwo";
    		startingNodeElevator = Keys.nodeNameElevatorFloorTwo;}
    	
    	else if(startingNode.contains("FloorThree")){
    		startingNodeFloor = "FloorThree";
    		startingNodeElevator = Keys.nodeNameElevatorFloorThree;}
    	
        else if(startingNode.contains("FloorFour")){
    		startingNodeFloor = "FloorFour";
    		startingNodeElevator = Keys.nodeNameElevatorFloorFour;}
        
        else if (startingNode.contains("EastWingFloorOne")){
                startingNodeFloor = "EastWingFloorOne";
                startingNodeElevator = Keys.nodeNameElevatorEastWingFloorOne;
        }        
        else if (startingNode.contains("EastWingFloorTwo")){
                startingNodeFloor = "EastWingFloorTwo";
                startingNodeElevator = Keys.nodeNameElevatorEastWingFloorTwo;
                 
        }
        else if (startingNode.contains("EastWingFloorThree")){
                startingNodeFloor = "EastWingFloorThree";
                startingNodeElevator = Keys.nodeNameElevatorEastWingFloorThree;    
        }    
        else if (startingNode.contains("EastWingFloorFour")){
                startingNodeFloor = "EastWingFloorFour";
                startingNodeElevator = Keys.nodeNameElevatorEastWingFloorFour;
        }
        else{
                startingNodeFloor = "EastWingFloorFive";
            startingNodeElevator = Keys.nodeNameElevatorEastWingFloorFive;
        }
        
        
    	//Determines what floor endingNode is on and sets elevator variable for later use if nodes are on different floors.
    	if(endingNode.contains("FloorGround")){ 
    		endingNodeFloor = "FloorGround";
    		endingNodeElevator = Keys.nodeNameElevatorFloorGround;
        }
    	
    	else if(endingNode.contains("FloorOne")){
    		endingNodeFloor = "FloorOne";
    		endingNodeElevator = Keys.nodeNameElevatorFloorOne;}
    	
    	else if(endingNode.contains("FloorTwo")){ 
    		endingNodeFloor = "FloorTwo";
    		endingNodeElevator = Keys.nodeNameElevatorFloorTwo;}
    	
    	else if(endingNode.contains("FloorThree")){
    		endingNodeFloor = "FloorThree";
    		endingNodeElevator = Keys.nodeNameElevatorFloorThree;}
    	
        else if(endingNode.contains("FloorFour")){
    		endingNodeFloor = "FloorFour";
    		endingNodeElevator = Keys.nodeNameElevatorFloorFour;}
    	
        else if(endingNode.contains("EastWingFloorOne")){
                endingNodeFloor = "EastWIngFloorOne";
                endingNodeElevator = Keys.nodeNameElevatorEastWingFloorOne;
        }
        else if(endingNode.contains("EastWingFloorTwo")){
                endingNodeFloor = "EastWingFloorTwo";
                endingNodeElevator = Keys.nodeNameElevatorEastWingFloorTwo; 
        }
        else if(endingNode.contains("EastWingFloorThree")){
                endingNodeFloor = "EastWingFloorThree";
                endingNodeElevator = Keys.nodeNameElevatorEastWingFloorThree;
        }
        else if(endingNode.contains("EastWingFloorFour")){
                endingNodeFloor = "EastWingFloorFour";
                endingNodeElevator = Keys.nodeNameElevatorEastWingFloorFour;
        }   
        else{
                endingNodeFloor = "EastWingFloorFive";
                endingNodeElevator = Keys.nodeNameElevatorEastWingFloorFive;
        }
        
    	//Creates floor objects for later use (if needed) in main algorithm.
    	FloorGround fg = new FloorGround();
    	FloorOne f1 = new FloorOne();
    	FloorTwo f2 = new FloorTwo();
    	FloorThree f3 = new FloorThree();
    	FloorFour f4 = new FloorFour();
    	
        EastWingFloorOne ewf1 = new EastWingFloorOne();
        EastWingFloorTwo ewf2 = new EastWingFloorTwo();
        EastWingFloorThree ewf3 = new EastWingFloorThree();
        EastWingFloorFour ewf4 = new EastWingFloorFour();
        EastWingFloorFive ewf5 = new EastWingFloorFive();
    	
    	//Will run main algorithm if starting/ending are on the same floor.
    	if(startingNodeFloor.equals(endingNodeFloor)){
    		
    		if(startingNodeFloor.equals("FloorGround"))
        		System.out.println(runDijkstrasAlgorithm(fg.build(), startingNode, endingNode)); 
    		
    		else if(startingNodeFloor.equals("FloorOne"))
        		System.out.println(runDijkstrasAlgorithm(f1.build(), startingNode, endingNode));
    		
    		else if(startingNodeFloor.equals("FloorTwo")) 
        		System.out.println(runDijkstrasAlgorithm(f2.build(), startingNode, endingNode));
    		
    		else if(startingNodeFloor.equals("FloorThree")) 
        		System.out.println(runDijkstrasAlgorithm(f3.build(), startingNode, endingNode));
        		
    		else if(startingNodeFloor.equals("FloorFour"))
    			System.out.println(runDijkstrasAlgorithm(f4.build(), startingNode, endingNode));
                
                else if(startingNodeFloor.equals("EastWingFloorOne"))
                        System.out.println(runDijkstrasAlgoritm(ewf1.build(), startingNode, endingNode));
                
                else if(startingNodeFloor.equals("EastWingFloorTwo"))
                        System.out.println(runDijkstrasAlgoritm(ewf2.build(), startingNode, endingNode));
                
                else if(startingNodeFloor.equals("EastWingFloorThree"))
                        System.out.println(runDijkstrasAlgoritm(ewf3.build(), startingNode, endingNode));
                
                else if(startingNodeFloor.equals("EastWingFloorFour"))
                        System.out.println(runDijkstrasAlgoritm(ewf4.build(), startingNode, endingNode));
                
                else
                        System.out.println(runDijkstrasAlgoritm(ewf5.build(), startingNode, endingNode));
                
                
    	}
    	//Will run if starting/ending are on different floors but not between east wing and main building.
        else if((startingNodeFloor.contains("EastWing") && endingNodeFloor.contains("EastWing")) || (!startingNodeFloor.contains("EastWing") && !endingNodeFloor.contains("EastWing"))){
    		
    		//Two string outputs.
    		String output1;
    		String output2;
    		
    		//Obtains first minPath. 
    		if(startingNodeFloor.equals("FloorGround"))
    			output1 = runDijkstrasAlgorithm(fg.build(), startingNode, startingNodeElevator);
    			    		
    		else if(startingNodeFloor.equals("FloorOne"))
    			output1 = runDijkstrasAlgorithm(f1.build(), startingNode, startingNodeElevator);
    		
    		else if(startingNodeFloor.equals("FloorTwo"))
    			output1 = runDijkstrasAlgorithm(f2.build(), startingNode, startingNodeElevator);
    		
    		else if(startingNodeFloor.equals("FloorThree"))
    			output1 = runDijkstrasAlgorithm(f3.build(), startingNode, startingNodeElevator);
    		
                else if(startingNodeFloor.equals("FloorFour"))
        		output1 = runDijkstrasAlgorithm(f4.build(), startingNode, startingNodeElevator);
                
                else if(startingNodeFloor.equals("EastWingFloorOne"))
                        output1 = runDijkstrasAlgorithm(ewf1.build(), startingNode, startingNodeElevator);
                
                else if(startingNodeFloor.equals("EastWingFloorTwo"))
                        output1 = runDijkstrasAlgorithm(ewf2.build(), startingNode, startingNodeElevator);
                
                else if(startingNodeFloor.equals("EastWingFloorThree"))
                        output1 = runDijkstrasAlgorithm(ewf3.build(), startingNode, startingNodeElevator);
                
                else if(startingNodeFloor.equals("EastWingFloorFour"))
                        output1 = runDijkstrasAlgorithm(ewf4.build(), startingNode, startingNodeElevator);
                
                else
                        output1 = runDijkstrasAlgorithm(ewf5.build(), startingNode, startingNodeElevator);
                
    		
    		
    		//Obtains second minPath.
    		if(endingNodeFloor.equals("FloorGround"))
    			output2 = runDijkstrasAlgorithm(fg.build(), endingNodeElevator, endingNode);
    		
    		else if(endingNodeFloor.equals("FloorOne"))
    			output2 = runDijkstrasAlgorithm(f1.build(), endingNodeElevator, endingNode);
    		
    		else if(endingNodeFloor.equals("FloorTwo"))
    			output2 = runDijkstrasAlgorithm(f2.build(), endingNodeElevator, endingNode);
    		
    		else if(endingNodeFloor.equals("FloorThree"))
    			output2 = runDijkstrasAlgorithm(f3.build(), endingNodeElevator, endingNode);
    		
                else if(endingNodeFloor.equals("FloorFour"))
    			output2 = runDijkstrasAlgorithm(f4.build(), endingNodeElevator, endingNode);
                
                else if(endingNodeFloor.equals("EastWingFloorOne"))
                        output2 = runDijkstrasAlgorithm(ewf1.build(), endingNodeElevator, endingNode);
                
                else if(endingNodeFloor.equals("EastWingFloorTwo"))
                        output2 = runDijkstrasAlgorithm(ewf2.build(), endingNodeElevator, endingNode);
                
                else if(endingNodeFloor. equals("EastWingFloorThree"))
                        output2 = runDijkstrasAlgorithm(ewf3.build(), endingNodeElevator, endingNode);
                
                else if(endingNodeFloor. equals("EastWingFloorFour"))
                        output2 = runDijkstrasAlgorithm(ewf4.build(), endingNodeElevator, endingNode);
                
                else
                        output2 = runDijkstrasAlgorithm(ewf5.build(), endingNodeElevator, endingNode);
        		
    		
    		//Displays both minPaths.
    		System.out.println(output1 + output2);
    	}
        //Will run if the starting node is in the main building and the ending node is in the east wing or vice versa (does not apply if the starting/ending node is on ground floor).
        else{
             
                //Three string outputs.
    		String output1;
    		String output2;
    		String output3;
                
    		//Obtains first minPath. 
    		if(startingNodeFloor.equals("FloorGround"))
    			output1 = runDijkstrasAlgorithm(fg.build(), startingNode, startingNodeElevator);
    			    		
    		else if(startingNodeFloor.equals("FloorOne"))
    			output1 = runDijkstrasAlgorithm(f1.build(), startingNode, startingNodeElevator);
    		
    		else if(startingNodeFloor.equals("FloorTwo"))
    			output1 = runDijkstrasAlgorithm(f2.build(), startingNode, startingNodeElevator);
    		
    		else if(startingNodeFloor.equals("FloorThree"))
    			output1 = runDijkstrasAlgorithm(f3.build(), startingNode, startingNodeElevator);
    		
                else if(startingNodeFloor.equals("FloorFour"))
        		output1 = runDijkstrasAlgorithm(f4.build(), startingNode, startingNodeElevator);
                
                else if(startingNodeFloor.equals("EastWingFloorOne"))
                        output1 = runDijkstrasAlgorithm(ewf1.build(), startingNode, startingNodeElevator);
                
                else if(startingNodeFloor.equals("EastWingFloorTwo"))
                        output1 = runDijkstrasAlgorithm(ewf2.build(), startingNode, startingNodeElevator);
                
                else if(startingNodeFloor.equals("EastWingFloorThree"))
                        output1 = runDijkstrasAlgorithm(ewf3.build(), startingNode, startingNodeElevator);
                
                else if(startingNodeFloor.equals("EastWingFloorFour"))
                        output1 = runDijkstrasAlgorithm(ewf4.build(), startingNode, startingNodeElevator);
                
                else
                        output1 = runDijkstrasAlgorithm(ewf5.build(), startingNode, startingNodeElevator);
                
                
                //nav from main elevators to east wing elevators or vice versa.
                if(!startingNodeFloor.contains("EastWing"))
                        output2 = runDijkstrasAlgorithm(fg.build(), Keys.nodeNameElevatorFloorGround, Keys.nodeNameElevatorEastWingFloorGround);
                
                else
                    output2 = runDijkstrasAlgorithm(fg.build(), Keys.nodeNameElevatorEastWingFloorGround, Keys.nodeNameElevatorFloorGround);
                
                                
                //Obtains third minPath.
    		if(endingNodeFloor.equals("FloorGround"))
    			output3 = runDijkstrasAlgorithm(fg.build(), endingNodeElevator, endingNode);
    		
    		else if(endingNodeFloor.equals("FloorOne"))
    			output3 = runDijkstrasAlgorithm(f1.build(), endingNodeElevator, endingNode);
    		
    		else if(endingNodeFloor.equals("FloorTwo"))
    			output3 = runDijkstrasAlgorithm(f2.build(), endingNodeElevator, endingNode);
    		
    		else if(endingNodeFloor.equals("FloorThree"))
    			output3 = runDijkstrasAlgorithm(f3.build(), endingNodeElevator, endingNode);
    		
                else if(endingNodeFloor.equals("FloorFour"))
    			output3 = runDijkstrasAlgorithm(f4.build(), endingNodeElevator, endingNode);
                
                else if(endingNodeFloor.equals("EastWingFloorOne"))
                        output3 = runDijkstrasAlgorithm(ewf1.build(), endingNodeElevator, endingNode);
                
                else if(endingNodeFloor.equals("EastWingFloorTwo"))
                        output3 = runDijkstrasAlgorithm(ewf2.build(), endingNodeElevator, endingNode);
                
                else if(endingNodeFloor. equals("EastWingFloorThree"))
                        output3 = runDijkstrasAlgorithm(ewf3.build(), endingNodeElevator, endingNode);
                
                else if(endingNodeFloor. equals("EastWingFloorFour"))
                        output3 = runDijkstrasAlgorithm(ewf4.build(), endingNodeElevator, endingNode);
                
                else
                        output3 = runDijkstrasAlgorithm(ewf5.build(), endingNodeElevator, endingNode);
                   
            
                //Displays all three minPaths.
    		System.out.println(output1 + output2 + output3);
        }
    	
    	
    } 		

    public static Node binarySearchAndReturn(String findThis, ArrayList<Node> listOfNodes) {
        //returns index of the toBeDestroyed within the array
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
