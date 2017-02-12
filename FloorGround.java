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
                    new Edge(68.9, Keys.nodeNameHallwayFloorGroundA,0), //TODO how do u know which elevator they entered
                    new Edge(59.1, Keys.nodeNameHallwayFloorGroundB,1)
                }),
                new Node(Keys.nodeNameHallwayFloorGroundA, new Edge[]{
                    new Edge(324.2,Keys.nodeNameHallwayEastWingFloorGround,0,Keys.directions_makeALeftAtTheNextIntersection+" and c"+Keys.directions_continueDownTheHallway.substring(1)), //turn left, becuase i am always coming from one side
                    new Edge(128,Keys.nodeNameHallwayFloorGroundB,1,Keys.directions_turnRight+" and c"+Keys.directions_continueDownTheHallway.substring(1)), //turn right, becuase im always coming in from one side
                    new Edge(68.9, Keys.nodeNameElevatorFloorGround,2,Keys.directions_turnRight+" and c"+Keys.directions_continueStraight.substring(1)+Keys.directions_enterTheFirstSetOfElevators) //same as above
                }),                   
                
                new Node(Keys.nodeNameHallwayFloorGroundB,new Edge[]{
                    new Edge(128,Keys.nodeNameHallwayFloorGroundA,0),
                    new Edge(369,Keys.nodeNameHallwayEastWingFloorGround,1),
                    new Edge(64.5,Keys.nodeNameHallwayFloorGroundC,2), //special
                    new Edge(59.1, Keys.nodeNameElevatorFloorGround,3)
                }),
                new Node(Keys.nodeNameHallwayFloorGroundC,new Edge[]{
                    new Edge(64.5,Keys.nodeNameHallwayFloorGroundB,0,Keys.directions_continueStraight)  //special for the ROOMS
                })
                
                ));                    
               
    }
}
