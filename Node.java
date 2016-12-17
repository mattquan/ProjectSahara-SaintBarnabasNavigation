/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor
 */

package ProjectSahara;
import java.util.*;

/**
 *
 * @author tinawu
 */
public class Node {

    
    private String name;
    private ArrayList<String> description;
    private Edge[] adjacencies;
    private double weight;
    private Path minPath;
    private ArrayList<String> macAddresses;
    
    public Node(String name, Edge[] myEdges, ArrayList<String> mac) { 
        this.name = name;
        adjacencies = myEdges;
        weight = Double.MAX_VALUE;
        minPath = null;
    }
    public Node(String name, Edge[] myEdges ) { 
        this.name = name;
        adjacencies = myEdges;
        weight = Double.MAX_VALUE;
        minPath = null;
    }
    public Node(String name, ArrayList<String> description, Edge[] myEdges, ArrayList<String> mac) { 
        this.name = name;
        adjacencies = myEdges;
        weight = Double.MAX_VALUE;
        minPath = null;
        this.description = description;
        macAddresses=mac;
    }
    public Node(String name, ArrayList<String> description, Edge[] myEdges) { 
        this.name = name;
        adjacencies = myEdges;
        weight = Double.MAX_VALUE;
        minPath = null;
        this.description = description;
        macAddresses=null;
    }
    public Node () {
        weight = Double.MAX_VALUE;
    }
    
    public Node (String name, ArrayList<String> mac) {
        this(name,null,new Edge[0],null);
    }
     public Node (String name) {
        this(name,null,new Edge[0],null);
    }

    public ArrayList<String> getMacAddresses() {
        return macAddresses;
    }

    public void setMacAddresses(ArrayList<String> macAddresses) {
        this.macAddresses = macAddresses;
    }
    
    
    
    public String getName() { 
        return name; 
    }
    public void setName(String name) {
        this.name = name;
    }
    public Edge[] getAdjacentEdges() {
        return adjacencies;
    }
    public void setAdjacentEdges(Edge[] setThis){
        adjacencies = setThis;

    }
    public String toString() {
        return "Name:"+name+"AdjacentEdges:"+Arrays.toString(adjacencies);
    }
    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Path getMinPath() {
        return minPath;
    }

    public void setMinPath(Path minPath) {
        this.minPath = minPath;
    }
    
    public void addEdge(Edge edge) {
        //the tricky thing is that we have to add an edge into an alphabetized list
        //wait, i dont think that it needs to be alphabetized....
        //it's an array, so i need to create a new array that's one larger
        System.out.println("hey"+Arrays.toString(adjacencies));
        Edge [] adjacenciesNew = new Edge[adjacencies.length+1];
        for (int i =0; i<adjacencies.length;i++) {
            adjacenciesNew[i]=adjacencies[i];
        }
        edge.setIndex(adjacencies.length);
        adjacenciesNew[adjacencies.length]=edge;
        adjacencies = adjacenciesNew;
        System.out.println("hey5"+Arrays.toString(adjacencies));
        
    }
}
