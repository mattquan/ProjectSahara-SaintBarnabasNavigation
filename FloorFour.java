
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
                new Node(Keys.nodeNameHallwayFloorFourA, new Edge[]{
                    new Edge(13.2+38.221+24.373,Keys.nodeNameDeskFloorFour,0,Keys.directions_passThroughTheArchwayAndContinueStraightPassTheEleveatorsThereShouldBeTwoHallwaysInFrontOfYou),
                    new Edge(24.321+13.2+38.221+24.373,Keys.nodeNameElevatorFloorFour,1,Keys.directions_passThroughTheArchwayAndContinueStraightPassTheEleveatorsThereShouldBeTwoHallwaysInFrontOfYou),
                    new Edge(89.551, Keys.nodeNameHallwayFloorFourB1,2,Keys.directions_goThroughTheLeftDoorway),
                    new Edge(89.551, Keys.nodeNameHallwayFloorFourB2,3,Keys.directions_goThroughTheRightDoorway)
                }), 
                new Node(Keys.nodeNameHallwayFloorFourB1, new Edge[]{
                }), 
                new Node(Keys.nodeNameHallwayFloorFourB2, new Edge[]{
                }), 
                new Node(Keys.nodeNameHallwayFloorFourC1, new Edge[]{
                }), 
                new Node(Keys.nodeNameHallwayFloorFourC2, new Edge[]{
                }), 
                new Node(Keys.nodeNameHallwayFloorFourD1, new Edge[]{
                }), 
                new Node(Keys.nodeNameHallwayFloorFourD2, new Edge[]{
                }), 
                new Node(Keys.nodeNameHallwayFloorFourE1, new Edge[]{
                }), 
                new Node(Keys.nodeNameHallwayFloorFourE2, new Edge[]{
                }), 
                new Node(Keys.nodeNameElevatorFloorFour, new Edge[]{
                    new Edge(24.321,Keys.nodeNameDeskFloorFour,0),})                     
                ));            
               
    }
}

