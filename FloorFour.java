
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectSahara;
import java.util.*;
/**
 *
 * @author yanasang
 */
public class FloorFour extends Graph{
    public ArrayList<Node> build() {
        //TODO check where is this desk we are talking about????
        return new ArrayList<>(
            Arrays.asList( 
                    
                new Node(Keys.nodeNameDeskFloorFour, Keys.descriptionDeskFloorFour, new Edge[]{
                    new Edge(24.321,Keys.nodeNameElevatorFloorFour,0)}),
                
                new Node(Keys.nodeNameElevatorFloorFour, new Edge[]{
                    new Edge(24.321,Keys.nodeNameDeskFloorFour,0),
                }),           
                new Node(Keys.nodeNameHallwayFloorFourA, new Edge[]{
                    new Edge(13.2+38.221+24.373,Keys.nodeNameDeskFloorFour,0,Keys.directions_passThroughTheArchwayAndContinueStraightPassTheEleveatorsThereShouldBeTwoHallwaysInFrontOfYou),
                    new Edge(24.321+13.2+38.221+24.373,Keys.nodeNameElevatorFloorFour,1,Keys.directions_passThroughTheArchwayAndContinueStraightPassTheEleveatorsThereShouldBeTwoHallwaysInFrontOfYou),
                    new Edge(89.551, Keys.nodeNameHallwayFloorFourB1,2,Keys.directions_goThroughTheLeftDoorway),
                    new Edge(89.551, Keys.nodeNameHallwayFloorFourB2,3,Keys.directions_goThroughTheRightDoorway)
                }), 
                new Node(Keys.nodeNameHallwayFloorFourB1, new Edge[]{
                    new Edge(89.551,Keys.nodeNameHallwayFloorFourA,0), //special directions
                    new Edge(17, Keys.nodeNameHallwayFloorFourB2,1), //special directions
                    new Edge (95.19,Keys.nodeNameHallwayFloorFourC1,2) //special d
                    
                    
                }), 
                new Node(Keys.nodeNameHallwayFloorFourB2, new Edge[]{
                    new Edge(89.551,Keys.nodeNameHallwayFloorFourA,0), //special directions
                    new Edge (17, Keys.nodeNameHallwayFloorFourB1,1),//special directions
                    new Edge(95.19, Keys.nodeNameHallwayFloorFourC2,2)//special directions
                }), 
                new Node(Keys.nodeNameHallwayFloorFourC1, new Edge[]{
                    new Edge(95.19,Keys.nodeNameHallwayFloorFourB1,0), //special d
                    new Edge(17,Keys.nodeNameHallwayFloorFourC2,1), //special d
                    new Edge(60.107,Keys.nodeNameHallwayFloorFourD1,2) //special d
                }), 
                new Node(Keys.nodeNameHallwayFloorFourC2, new Edge[]{
                    new Edge(17,Keys.nodeNameHallwayFloorFourC1,0),//special d
                    new Edge(95.19,Keys.nodeNameHallwayFloorFourB2,1),//special d
                    new Edge(57.959,Keys.nodeNameHallwayFloorFourD2,2)//special d
                }), 
                new Node(Keys.nodeNameHallwayFloorFourD1, new Edge[]{
                    new Edge(60.107,Keys.nodeNameHallwayFloorFourC1,0),//special d
                    new Edge(20.828,Keys.nodeNameHallwayFloorFourD2,1),//special d
                    new Edge(41.211,Keys.nodeNameHallwayFloorFourE1,2)//special d
                }), 
                new Node(Keys.nodeNameHallwayFloorFourD2, new Edge[]{
                    new Edge(61.907,Keys.nodeNameHallwayFloorFourC2,0),//special d
                    new Edge(20.828,Keys.nodeNameHallwayFloorFourD1,1),//special d
                    new Edge(41.211,Keys.nodeNameHallwayFloorFourE2,2)//special d
                }), 
                new Node(Keys.nodeNameHallwayFloorFourE1, new Edge[]{
                    new Edge(20.740,Keys.nodeNameHallwayFloorFourE2,0, Keys.directions_turnRight), //always form D1
                    new Edge(41.211,Keys.nodeNameHallwayFloorFourD1,1, Keys.directions_turnLeft),
                    
                }), 
                new Node(Keys.nodeNameHallwayFloorFourE2, new Edge[]{
                    new Edge(41.211,Keys.nodeNameHallwayFloorFourD2,0, Keys.directions_turnRight),
                    new Edge(20.740,Keys.nodeNameHallwayFloorFourE1,1,Keys.directions_turnLeft),//always from D2
                    
                })
        
        
        
            ));            
               
    }
}

