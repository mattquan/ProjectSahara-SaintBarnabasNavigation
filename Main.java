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

    public static void runDijkstrasAlgorithm(ArrayList<Node> listOfNodes, String startingNodeString, String endingNodeString) {
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
        System.out.println("The shortest path is " + endingNode.getMinPath() + "with weight" + endingNode.getWeight());

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
