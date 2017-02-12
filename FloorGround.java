/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectSahara;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author mattquan
 */
public class FloorGround extends Graph{
    public ArrayList<Node> build(){
		
	


        return new ArrayList<>(
            Arrays.asList(
                new Node(Keys.nodeNameHallwayEastWingFloorGround,  new Edge[]{
                    new Edge(324.2,Keys.nodeNameHallwayFloorGroundA,0),
                    new Edge(369,Keys.nodeNameHallwayFloorGroundB,1),
                    new Edge(50,Keys.nodeNameElevatorEastWingFloorGround,2)
                }),
                new Node(Keys.nodeNameElevatorEastWingFloorGround, new Edge[]{
                    new Edge(50,Keys.nodeNameHallwayEastWingFloorGround,0, Keys.directions_exitTheElevators)
                }),
                new Node(Keys.nodeNameElevatorFloorGround, new Edge[]{
                    new Edge(68.9, Keys.nodeNameHallwayFloorGroundA,0, Keys.directions_followTheLongHallway),
                    new Edge(59.1, Keys.nodeNameHallwayFloorGroundB,1, Keys.directions_followTheLongHallway)
                }),
                new Node(Keys.nodeNameHallwayFloorGroundA, new Edge[]{
                    new Edge(324.2,Keys.nodeNameHallwayEastWingFloorGround,0),
                    new Edge(128,Keys.nodeNameHallwayFloorGroundB,1,Keys.directions_passTheElevatorsUntilEndOfHallway),
                    new Edge(68.9, Keys.nodeNameElevatorFloorGround,2,Keys.directions_enterTheFirstClusterOfElevators)
                }),                   
                
                new Node(Keys.nodeNameHallwayFloorGroundB,new Edge[]{
                    new Edge(128,Keys.nodeNameHallwayFloorGroundA,0, Keys.directions_passTheElevatorsUntilFrontDoors),
                    new Edge(369,Keys.nodeNameHallwayEastWingFloorGround,1, Keys.directions_followTheLongHallway),
                    new Edge(64.5,Keys.nodeNameHallwayFloorGroundC,2), //special
                    new Edge(59.1, Keys.nodeNameElevatorFloorGround,3, Keys.directions_enterTheSecondClusterOfElevators)
                }),
                new Node(Keys.nodeNameHallwayFloorGroundC,new Edge[]{
                    new Edge(64.5,Keys.nodeNameHallwayFloorGroundB,0)  //special
                })
                
                ));                    
               
    }
}
