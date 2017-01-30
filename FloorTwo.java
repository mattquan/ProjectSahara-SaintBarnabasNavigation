package ProjectSahara;
import java.util.*;

//@author nickprimamore

public class FloorTwo extends Graph{
	
	public ArrayList<Node> build(){		
        return new ArrayList<>(
                //alphabetical order
            Arrays.asList(                    
                new Node(Keys.nodeNameElevatorFloorTwo, new Edge[]{
                    new Edge(19.963,Keys.nodeNameHallwayFloorTwoA,0)
                }),                     
                new Node(Keys.nodeNameHallwayFloorTwoA, Keys.descriptionHallwayFloorTwoA, new Edge[]{
                    new Edge(19.963,Keys.nodeNameElevatorFloorTwo,0),
                    new Edge(0, Keys.nodeNameHallwayFloorTwoB1,1),
                    new Edge(0, Keys.nodeNameHallwayFloorTwoD,2),
                    new Edge(0, Keys.nodeNameHallwayFloorTwoE,3)
                }),
                new Node(Keys.nodeNameHallwayFloorTwoB1, new Edge[]{
                    new Edge(0, Keys.nodeNameHallwayFloorTwoA, 0),
                    new Edge(0, Keys.nodeNameHallwayFloorTwoB2,1),
                    new Edge(0, Keys.nodeNameHallwayFloorTwoC,2)
                }),
                new Node(Keys.nodeNameHallwayFloorTwoB2, new Edge[]{
                    new Edge(0, Keys.nodeNameHallwayFloorTwoB1, 0),
                    new Edge(0, Keys.nodeNameHallwayFloorTwoC,1)
                }),
                new Node(Keys.nodeNameHallwayFloorTwoC, new Edge[]{
                    new Edge(0, Keys.nodeNameHallwayFloorB1, 0),
                    new Edge(0, Keys.nodeNameHallwayFloorTwoB2,1),
                    new Edge(0, Keys.nodeNameHallwayFloorTwoD,2)
                }),
                new Node(Keys.nodeNameHallwayFloorTwoD, new Edge[]{
                    new Edge(0, Keys.nodeNameHallwayFloorTwoA, 0),
                    new Edge(0, Keys.nodeNameHallwayFloorTwoC,1)
                }),
                new Node(Keys.nodeNameHallwayFloorTwoE, new Edge[]{
                    new Edge(0, Keys.nodeNameHallwayFloorTwoA, 0),
                    new Edge(0, Keys.nodeNameHallwayFloorTwoF1,1),
                    new Edge(0, Keys.nodeNameHallwayFloorTwoF3,2)
                }),
                new Node(Keys.nodeNameHallwayFloorTwoF1, new Edge[]{
                    new Edge(0, Keys.nodeNameHallwayFloorTwoE, 0),
                    new Edge(0, Keys.nodeNameHallwayFloorTwoF2,1),
                    new Edge(0, Keys.nodeNameHallwayFloorTwoF3,2),
                    new Edge(0, Keys.nodeNameHallwayFloorTwoG,3)
                }),
                new Node(Keys.nodeNameHallwayFloorTwoF2, new Edge[]{
                    new Edge(0, Keys.nodeNameHallwayFloorTwoF1, 0),
                    new Edge(0, Keys.nodeNameHallwayFloorTwoH2,1)
                }),
                new Node(Keys.nodeNameHallwayFloorTwoF3, new Edge[]{
                    new Edge(0, Keys.nodeNameHallwayFloorTwoE, 0),
                    new Edge(0, Keys.nodeNameHallwayFloorTwoF1,1),
                    new Edge(0, Keys.nodeNameHallwayFloorTwoG,2)
                }),
                new Node(Keys.nodeNameHallwayFloorTwoG, new Edge[]{
                    new Edge(0, Keys.nodeNameHallwayFloorTwoF1, 0),
                    new Edge(0, Keys.nodeNameHallwayFloorTwoF3,1),
                    new Edge(0, Keys.nodeNameHallwayFloorTwoH1,2)
                }),
                new Node(Keys.nodeNameHallwayFloorTwoH1, new Edge[]{
                    new Edge(0, Keys.nodeNameHallwayFloorTwoG, 0),
                    new Edge(0, Keys.nodeNameHallwayFloorTwoH2,1),
                    new Edge(0, Keys.nodeNameHallwayFloorTwoI1,2)
                }),
                new Node(Keys.nodeNameHallwayFloorTwoH2, new Edge[]{
                    new Edge(0, Keys.nodeNameHallwayFloorTwoF2, 0),
                    new Edge(0, Keys.nodeNameHallwayFloorTwoH1,1),
                    new Edge(0, Keys.nodeNameHallwayFloorTwoI2,2)
                }),
                new Node(Keys.nodeNameHallwayFloorTwoI1, new Edge[]{
                    new Edge(0, Keys.nodeNameHallwayFloorTwoH1, 0),
                    new Edge(0, Keys.nodeNameHallwayFloorTwoI2,1),
                    new Edge(0, Keys.nodeNameHallwayFloorTwoJ1,2)
                }),
                new Node(Keys.nodeNameHallwayFloorTwoI2, new Edge[]{
                    new Edge(0, Keys.nodeNameHallwayFloorTwoH2, 0),
                    new Edge(0, Keys.nodeNameHallwayFloorTwoI1,1),
                    new Edge(0, Keys.nodeNameHallwayFloorTwoJ2,2)
                }),
                new Node(Keys.nodeNameHallwayFloorTwoJ1, new Edge[]{
                    new Edge(0, Keys.nodeNameHallwayFloorTwoI1, 0),
                    new Edge(0, Keys.nodeNameHallwayFloorTwoJ2,1)
                }),
                new Node(Keys.nodeNameHallwayFloorTwoJ2, new Edge[]{
                    new Edge(0, Keys.nodeNameHallwayFloorTwoI2, 0),
                    new Edge(0, Keys.nodeNameHallwayFloorTwoJ1,1)})
                ));             
    }
}