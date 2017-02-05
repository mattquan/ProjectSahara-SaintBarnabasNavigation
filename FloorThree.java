
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
public class FloorThree extends Graph{
    
    public ArrayList<Node> build() {
        
        
        return new ArrayList<>(
            Arrays.asList( 
                //desk
                new Node(Keys.nodeNameElevatorFloorThree, new Edge[]{
                    new Edge(27.445,Keys.nodeNameHallwayFloorThreeE,0)
                }),
                new Node(Keys.nodeNameHallwayFloorThreeA, new Edge[]{
                    new Edge(0, Keys.nodeNameElevatorFloorThree,0),
                    new Edge(0, Keys.nodeNameHallwayFloorThreeB,1),
                    new Edge(0, Keys.nodeNameHallwayFloorThreeE,2)
                }),
                new Node(Keys.nodeNameHallwayFloorThreeB, new Edge[]{
                    new Edge(0, Keys.nodeNameHallwayFloorThreeA,0)
                }),
                new Node(Keys.nodeNameHallwayFloorThreeC1, new Edge[]{
                    new Edge(0, Keys.nodeNameHallwayFloorThreeA,0),
                    new Edge(0, Keys.nodeNameHallwayFloorThreeC2,1),
                    new Edge(0, Keys.nodeNameHallwayFloorThreeD1,2)
                }),
                new Node(Keys.nodeNameHallwayFloorThreeC2, new Edge[]{
                    new Edge(0, Keys.nodeNameHallwayFloorThreeC1,0),
                    new Edge(0, Keys.nodeNameHallwayFloorThreeD2,1)
                }),
                new Node(Keys.nodeNameHallwayFloorThreeD1, new Edge[]{
                    new Edge(0, Keys.nodeNameHallwayFloorThreeC1,0),
                    new Edge(0, Keys.nodeNameHallwayFloorThreeD2,1)
                }),
                new Node(Keys.nodeNameHallwayFloorThreeD2, new Edge[]{
                    new Edge(0, Keys.nodeNameHallwayFloorThreeC2,0),
                    new Edge(0, Keys.nodeNameHallwayFloorThreeD1,1)
                }),
                new Node(Keys.nodeNameHallwayFloorThreeE, Keys.descriptionDeskFloorThree, new Edge[]{
                    new Edge(27.445,Keys.nodeNameElevatorFloorThree,0)
                })
            ));          
               
    }
}

