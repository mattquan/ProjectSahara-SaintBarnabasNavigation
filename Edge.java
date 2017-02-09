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
public class Edge {
    private double weight;
    private String targetNode;
    private int index;
    private String direction;
    private ArrayList<String> IPAddresses;
    
    public Edge(double w, String n, int i){
        weight = w;
        targetNode = n;
        index = i;
    }
    public Edge(double w, String n, int i, String d){
        weight = w;
        targetNode = n;
        index = i;
        direction = d;
    }
    public Edge(double w, String n, int i, String d, ArrayList<String> ip){
        weight = w;
        targetNode = n;
        index = i;
        direction = d;
        IPAddresses = ip;
    }
    public double getWeight(){
        return weight;
    }
    public void setWeight(double a){
        weight = a;
    }
    public String getTargetNode(){
        return targetNode;
    }
    public void setTargetNode(String n){
        targetNode = n;
    }
    public ArrayList<String> getIPAddresses() {
        return IPAddresses;
    }

    public void setIPAddresses(ArrayList<String> macAddresses) {
        this.IPAddresses = macAddresses;
    }
    public int getIndex(){
        return index;
    }
    public void setIndex(int i){
        index = i;
    }
    public String getDirection() {
        return direction;
    }
    public void setDirection(String d) {
        direction = d;
    }
    @Override
    public String toString() {
        return "TargetNode:"+targetNode+"Weight:"+weight+"Index: "+index;
    }
}
