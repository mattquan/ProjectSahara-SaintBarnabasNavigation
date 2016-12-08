/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ProjectSahara;

/**
 *
 * @author tinawu
 */
import java.util.*;

public class Path {
    
    //instance variables
    //private double weight;
    private ArrayList <String> nodePath = new ArrayList <String> ();
    private ArrayList <String> directions = new ArrayList<String>();
    
    //constructor
    /*public Path (String initialNode, String finalNode){
        //this.weight = weight;
        path.add(initialNode);
        path.add(finalNode);
    }*/
    /*public Path (String initialNode, String finalNode, double weight){
        this.weight = weight;
        path.add(initialNode);
        path.add(finalNode);
    }*/
    
    public Path (String initialNode){
        //this.weight = weight;
        nodePath.add(initialNode);
    }
    public Path(Path temp){
        //weight = temp.getWeight();
        ArrayList<String> newNodePath = new ArrayList<>();
        for (int i =0; i <temp.getNodePath().size();i++) {
            newNodePath.add(temp.getNodePath().get(i));
        }
        nodePath = newNodePath;
        
        ArrayList<String> newDirections = new ArrayList<>();
        for (int i =0; i <temp.getDirections().size();i++) {
            newDirections.add(temp.getDirections().get(i));
        }
        directions = newDirections;
    }

    
    
    public void add (Edge targetEdge) {
        nodePath.add(targetEdge.getTargetNode());
        directions.add(targetEdge.getDirection());
    }
    
    
    public ArrayList<String> getNodePath(){
        return nodePath;
    }
    public ArrayList<String> getDirections(){
        return directions;
    }
    
    /*public String getLast(){
        return path.get(path.size()-1);
    }*/
   
    public String toString(){
        return "nodes: "+nodePath.toString()+"directions: "+directions;
    }
}
