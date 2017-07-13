/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectSahara;
import java.util.*;

/**
 *
 * @author Steffi
 */
public class FloorOne extends Graph{
    public ArrayList<Node> build(){
        //in meters
        
        return new ArrayList<>(
                Arrays.asList(
                   new Node(Keys.nodeNameElevatorFloorOne, new Edge[]{
                        new Edge(18.017, Keys.nodeNameHallwayFloorOneA, 0),
                        new Edge(20.500, Keys.nodeNameHallwayFloorOneB, 1)
                        }),
                    new Node(Keys.nodeNameHallwayFloorOneA,  new Edge[]{
                        new Edge(39.019, Keys.nodeNameHallwayFloorOneB,0),
                        new Edge(18.017, Keys.nodeNameElevatorFloorOne,1)

                    }),
                    new Node(Keys.nodeNameHallwayFloorOneB, new Edge[]{
                        new Edge(39.019, Keys.nodeNameHallwayFloorOneA, 0),
                        new Edge(8.724, Keys.nodeNameHallwayFloorOneC, 1),
                        new Edge (27.243, Keys.nodeNameHallwayFloorOneD, 2),
                        new Edge(20.500, Keys.nodeNameElevatorFloorOne, 3),
                        new Edge(21.070, Keys.nodeNameHallwayFloorOneG, 4)
                    }),
                    new Node(Keys.nodeNameHallwayFloorOneC, new Edge[]{
                        new Edge(8.724, Keys.nodeNameHallwayFloorOneB, 0),
                        new Edge(31.937, Keys.nodeNameHallwayFloorOneD, 1),
                        new Edge(71.465, Keys.nodeNameHallwayFloorOneF, 2)
                    }),
                    new Node(Keys.nodeNameHallwayFloorOneD, new Edge[]{
                        new Edge(27.243, Keys.nodeNameHallwayFloorOneB, 0),
                        new Edge(31.937, Keys.nodeNameHallwayFloorOneC, 1),
                        new Edge(15.691, Keys.nodeNameHallwayFloorOneE, 2)
                    }),
                    new Node(Keys.nodeNameHallwayFloorOneE, new Edge[]{
                        new Edge(15.691, Keys.nodeNameHallwayFloorOneD, 0)
                    }),
                    new Node(Keys.nodeNameHallwayFloorOneF, new Edge[]{
                        new Edge(71.465, Keys.nodeNameHallwayFloorOneC, 0)
                    }),
                    new Node(Keys.nodeNameHallwayFloorOneG, new Edge[]{
                        new Edge(21.070, Keys.nodeNameHallwayFloorOneB, 0)
                        })


                    ));                           
    }
}
