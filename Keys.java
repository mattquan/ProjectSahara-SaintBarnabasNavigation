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
public class Keys {

    public static String extraDirectionsInfo(String preNode, String node, String postNode) {
        //find the floor of the Node.
        //so you can search within it
        String floor = findFloorAndElevator(node)[0];

        switch (floor) {
            case "FloorOne":
                //hard logic code for directions
                break;
            case "FloorTwo":
                //logic for floor two
                 if (node.equals(Keys.nodeNameHallwayFloorTwoA)) {
                    if (postNode.equals(Keys.nodeNameElevatorFloorTwo)) {
                        if (preNode.equals(Keys.nodeNameHallwayFloorTwoB1)||preNode.equals(Keys.nodeNameHallwayFloorTwoD)) { //basically the same                           
                            return Keys.directions_exitTheReceptionArea+" and t" +Keys.directions_turnRight.substring(1)+". "+Keys.directions_continueStraightPassingByTheFirstSetOfElevatorsContinueStraight;
                        } else if (preNode.equals(Keys.nodeNameHallwayFloorTwoE)) {
                            //contiue striaght, pass the elevators, take the leftmost door.
                            return Keys.directions_continueStraightPassingByTheFirstSetOfElevatorsContinueStraight;
                        }
                        //place holders below. need to edit.
                    } else if (postNode.equals(Keys.nodeNameHallwayFloorTwoB1)) {
                        if (preNode.equals(Keys.nodeNameElevatorFloorTwo)) {
                            return Keys.directions_enterTheReceptionArea+", on your left. "+ Keys.directions_goThroughTheLeftmostHallway;
                        } else if (preNode.equals(Keys.nodeNameHallwayFloorTwoD)) {
                            return Keys.directions_stayInTheReceptionAreaContinueThroughTheOtherCorridorAtTheBackOfTheReceptionAreaOnYourRight; //some really weird loop stuff
                        } else if (preNode.equals(Keys.nodeNameHallwayFloorTwoE)) {
                            return Keys.directions_enterTheReceptionArea+", on your right. "+Keys.directions_goThroughTheLeftmostHallway;
                        }
                    } else if (postNode.equals(Keys.nodeNameHallwayFloorTwoD)) {
                        if (preNode.equals(Keys.nodeNameElevatorFloorTwo)) {
                            return Keys.directions_enterTheReceptionArea+". "+Keys.directions_goThroughTheRightmostHallway;
                        } else if (preNode.equals(Keys.nodeNameHallwayFloorTwoB1)) {
                            return Keys.directions_stayInTheReceptionAreaContinueThroughTheOtherCorridorAtTheBackOfTheReceptionAreaOnYourLeft; //some really weird loop stuff
                        } else if (preNode.equals(Keys.nodeNameHallwayFloorTwoE)) {
                            return Keys.directions_enterTheReceptionArea+", on your right."+Keys.directions_goThroughTheRightmostHallway;
                        }
                        
                    } else if (postNode.equals(Keys.nodeNameHallwayFloorTwoE)) { 
                        if (preNode.equals(Keys.nodeNameElevatorFloorTwo)) {
                            return Keys.directions_goThroughTheLeftDoorway; //continue straight would be repetitive, becuase im alreayd going straight.
                        } else if (preNode.equals(Keys.nodeNameHallwayFloorTwoB1)||preNode.equals(Keys.nodeNameHallwayFloorTwoD)) { //basically teh same
                            return Keys.directions_exitTheReceptionArea+" and t"+Keys.directions_turnLeft.substring(1)+". "+Keys.directions_goThroughTheLeftDoorway; //some really weird loop stuff
                        } 
                    }                                
                }
                 if (node.equals(Keys.nodeNameHallwayFloorTwoB1)) {
                    if (postNode.equals(Keys.nodeNameHallwayFloorTwoA)) {
                        if (preNode.equals(Keys.nodeNameHallwayFloorTwoB2)) { //basically the same                           
                            return Keys.directions_turnRight+" and c" +Keys.directions_continueStraight.substring(1);
                        } 
                        else if (preNode.equals(Keys.nodeNameHallwayFloorTwoC)) {
                            //contiue striaght, pass the elevators, take the leftmost door.
                            return Keys.directions_continueStraight;
                        }
                    } 
                    else if (postNode.equals(Keys.nodeNameHallwayFloorTwoB2)) {
                        if (preNode.equals(Keys.nodeNameHallwayFloorTwoA)) {
                            return Keys.directions_makeALeftAtTheNextIntersection+ " and c"+Keys.directions_continueStraight.substring(1); //don't continue straight because its so small?? no. always add continue straight. always. from now on.
                        } 
                        else if (preNode.equals(Keys.nodeNameHallwayFloorTwoC)) {
                            return Keys.directions_makeARightAtTheNextIntersection+ " and c"+Keys.directions_continueStraight.substring(1);
                        } 
                    } 
                    else if (postNode.equals(Keys.nodeNameHallwayFloorTwoC)) {
                        if (preNode.equals(Keys.nodeNameHallwayFloorTwoA)) {
                            return Keys.directions_continueStraight;
                        } 
                        else if (preNode.equals(Keys.nodeNameHallwayFloorTwoB2)) {
                            return Keys.directions_turnLeft+" and c"+Keys.directions_continueStraight.substring(1);
                        } 
                    } 
                 }
                if (node.equals(Keys.nodeNameHallwayFloorTwoC)) {
                    if (postNode.equals(Keys.nodeNameHallwayFloorTwoD)) {
                        if (preNode.equals(Keys.nodeNameHallwayFloorTwoB1)) {
                             return Keys.directions_continueStraightDownTheLoopedHallwayMakingSlightRightTurns;
                         }
                         else if (preNode.equals(Keys.nodeNameHallwayFloorTwoB2)) {
                             return Keys.directions_continueDownTheHallway + " and t" + Keys.directions_turnLeft.substring(1)+". "+Keys.directions_continueStraightDownTheLoopedHallwayMakingSlightRightTurns;
                         }
                     }
                 }
                
                if (node.equals(Keys.nodeNameHallwayFloorTwoE)) {
                    if (postNode.equals(Keys.nodeNameHallwayFloorTwoA)) {
                        if (preNode.equals(Keys.nodeNameHallwayFloorTwoF1)) { //basically the same                           
                            return Keys.directions_continueStraight;
                        } 
                        else if (preNode.equals(Keys.nodeNameHallwayFloorTwoF3)) {
                            return Keys.directions_turnRight+" and c"+Keys.directions_continueStraight.substring(1);
                        }
                    } 
                    else if (postNode.equals(Keys.nodeNameHallwayFloorTwoF1)) {
                        if (preNode.equals(Keys.nodeNameHallwayFloorTwoA)) {
                            return Keys.directions_continueStraight;
                        } 
                        else if (preNode.equals(Keys.nodeNameHallwayFloorTwoF3)) {
                            return Keys.directions_turnLeft + ". " + Keys.directions_continueStraight;
                        } 
                    } 
                    else if (postNode.equals(Keys.nodeNameHallwayFloorTwoF3)) {
                        if (preNode.equals(Keys.nodeNameHallwayFloorTwoA)) {
                            return Keys.directions_makeALeftAtTheNextIntersection+ " and c"+Keys.directions_continueStraight.substring(1);
                        } 
                        else if (preNode.equals(Keys.nodeNameHallwayFloorTwoF1)) {
                            return "Error: This should not have happened because it is not the shortest path. Nice job team.";
                        } 
                    } 
                 }
                 
                 
                 if (node.equals(Keys.nodeNameHallwayFloorTwoF1)) {
                    if (postNode.equals(Keys.nodeNameHallwayFloorTwoE)) {
                        if (preNode.equals(Keys.nodeNameHallwayFloorTwoF2)) {                           
                            return Keys.directions_turnLeft+". " +Keys.directions_continueStraight; //because that way, we say that there IS an intersection
                        } 
                        else if (preNode.equals(Keys.nodeNameHallwayFloorTwoF3)) {
                            return Keys.directions_turnRight+" and c" +Keys.directions_continueStraight.substring(1);
                        }
                        else if (preNode.equals(Keys.nodeNameHallwayFloorTwoG)) {
                            return Keys.directions_continueStraight+". "+Keys.directions_continueStraight; //because it passes two intersections
                        }
                    } 
                    else if (postNode.equals(Keys.nodeNameHallwayFloorTwoF2)) {
                        if (preNode.equals(Keys.nodeNameHallwayFloorTwoE)) {                           
                            return Keys.directions_continueStraight +". "+ Keys.directions_makeARightAtTheNextIntersection;
                        } 
                        else if (preNode.equals(Keys.nodeNameHallwayFloorTwoF3)) {
                            return Keys.directions_turnLeft+" and then t"+Keys.directions_turnRight.substring(1); //this is a little different, so hopefully post production doesn't touch cuz this works just fine
                        }
                        else if (preNode.equals(Keys.nodeNameHallwayFloorTwoG)) {
                            return Keys.directions_makeALeftAtTheNextIntersection;
                        }
                    } 
                    else if (postNode.equals(Keys.nodeNameHallwayFloorTwoF3)) {
                        if (preNode.equals(Keys.nodeNameHallwayFloorTwoF2)) { //basically the same                           
                            return Keys.directions_turnLeft+" and then t"+Keys.directions_turnRight.substring(1); //this is a little different, so hopefully post production doesn't touch cuz this works just fine
                        } 
                        else if (preNode.equals(Keys.nodeNameHallwayFloorTwoE)) {
                            return "Guys, this should never happen, because this isn't the quickest path.";
                        }
                        else if (preNode.equals(Keys.nodeNameHallwayFloorTwoG)) {
                            return Keys.directions_continueStraight+". "+Keys.directions_turnRight;//cont. straight first, becuase you need to pass one intersection
                        }
                    } 
                    else if (postNode.equals(Keys.nodeNameHallwayFloorTwoG)) {
                        if (preNode.equals(Keys.nodeNameHallwayFloorTwoF2)) {                   
                            return Keys.directions_turnRight + " and c"+Keys.directions_continueStraight.substring(1);
                        } 
                        else if (preNode.equals(Keys.nodeNameHallwayFloorTwoE)) {
                            return Keys.directions_continueStraight; //only pass one, becuase if you went from e to f1, you already said continue straight
                        }
                        else if (preNode.equals(Keys.nodeNameHallwayFloorTwoF3)) {
                            //contiue striaght, pass the elevators, take the leftmost door.
                            return Keys.directions_turnLeft+". "+Keys.directions_continueStraight;
                        }
                    } 
                 }
                 
                 if (node.equals(Keys.nodeNameHallwayFloorTwoG)) {
                    if (postNode.equals(Keys.nodeNameHallwayFloorTwoH1)) {
                        if (preNode.equals(Keys.nodeNameHallwayFloorTwoF1)) {                         
                            return Keys.directions_continueStraight;
                        } 
                        else if (preNode.equals(Keys.nodeNameHallwayFloorTwoF3)) {
                            return Keys.directions_turnLeft+" and c"+Keys.directions_continueStraight.substring(1);
                        }
                    } 
                    else if (postNode.equals(Keys.nodeNameHallwayFloorTwoF1)) {
                        if (preNode.equals(Keys.nodeNameHallwayFloorTwoH1)) {
                            return Keys.directions_continueStraight;
                        } 
                        else if (preNode.equals(Keys.nodeNameHallwayFloorTwoF3)) {
                            return "Error: This should never happen. You done made a boo boo."; //more efficient to go F3--> F1 then all the way around
                        } 
                    } 
                    else if (postNode.equals(Keys.nodeNameHallwayFloorTwoF3)) {
                        if (preNode.equals(Keys.nodeNameHallwayFloorTwoF1)) {
                            return "Error: Why would you go around, just go straight aiya.";
                        } 
                        else if (preNode.equals(Keys.nodeNameHallwayFloorTwoH1)) {
                            return Keys.directions_makeARightAtTheNextIntersection;
                        } 
                    } 
                 }
                 
                 if (node.equals(Keys.nodeNameHallwayFloorTwoH1)) {
                    if (postNode.equals(Keys.nodeNameHallwayFloorTwoG)) {
                        if (preNode.equals(Keys.nodeNameHallwayFloorTwoH2)) {                         
                            return Keys.directions_turnLeft+" and c"+Keys.directions_continueStraight.substring(1);
                        } 
                        else if (preNode.equals(Keys.nodeNameHallwayFloorTwoI1)) {
                            return Keys.directions_continueStraight;
                        }
                    } 
                    else if (postNode.equals(Keys.nodeNameHallwayFloorTwoH2)) {
                        if (preNode.equals(Keys.nodeNameHallwayFloorTwoG)) {
                            return Keys.directions_makeARightAtTheNextIntersection;
                        } 
                        else if (preNode.equals(Keys.nodeNameHallwayFloorTwoI1)) {
                            return Keys.directions_makeALeftAtTheNextIntersection;
                        } 
                    } 
                    else if (postNode.equals(Keys.nodeNameHallwayFloorTwoI1)) {
                        if (preNode.equals(Keys.nodeNameHallwayFloorTwoG)) {
                            return Keys.directions_continueStraight;
                        } 
                        else if (preNode.equals(Keys.nodeNameHallwayFloorTwoH2)) {
                            return Keys.directions_turnRight + " and c"+Keys.directions_continueStraight.substring(1);
                        } 
                    } 
                 }
                 if (node.equals(Keys.nodeNameHallwayFloorTwoH2)) {
                    if (postNode.equals(Keys.nodeNameHallwayFloorTwoF2)) {
                        if (preNode.equals(Keys.nodeNameHallwayFloorTwoH1)) {                         
                            return Keys.directions_turnRight+" and c"+Keys.directions_continueStraight.substring(1);
                        } 
                        else if (preNode.equals(Keys.nodeNameHallwayFloorTwoI2)) {
                            return Keys.directions_continueStraight;
                        }
                    } 
                    else if (postNode.equals(Keys.nodeNameHallwayFloorTwoH1)) {
                        if (preNode.equals(Keys.nodeNameHallwayFloorTwoF2)) {
                            return Keys.directions_makeALeftAtTheNextIntersection;
                        } 
                        else if (preNode.equals(Keys.nodeNameHallwayFloorTwoI2)) {
                            return Keys.directions_makeARightAtTheNextIntersection;
                        } 
                    } 
                    else if (postNode.equals(Keys.nodeNameHallwayFloorTwoI2)) {
                        if (preNode.equals(Keys.nodeNameHallwayFloorTwoF2)) {
                            return Keys.directions_continueStraight;
                        } 
                        else if (preNode.equals(Keys.nodeNameHallwayFloorTwoH1)) {
                            return Keys.directions_turnLeft + " and c"+Keys.directions_continueStraight.substring(1);
                        } 
                    } 
                 }
                 
                 if (node.equals(Keys.nodeNameHallwayFloorTwoI1)) {
                    if (postNode.equals(Keys.nodeNameHallwayFloorTwoH1)) {
                        if (preNode.equals(Keys.nodeNameHallwayFloorTwoI2)) {                         
                            return Keys.directions_turnLeft+" and c"+Keys.directions_continueStraight.substring(1);
                        } 
                        else if (preNode.equals(Keys.nodeNameHallwayFloorTwoJ1)) {
                            return Keys.directions_continueStraight;
                        }
                    } 
                    else if (postNode.equals(Keys.nodeNameHallwayFloorTwoI2)) {
                        if (preNode.equals(Keys.nodeNameHallwayFloorTwoH1)) {
                            return Keys.directions_makeARightAtTheNextIntersection;
                        } 
                        else if (preNode.equals(Keys.nodeNameHallwayFloorTwoJ1)) {
                            return Keys.directions_makeALeftAtTheNextIntersection;
                        } 
                    } 
                    else if (postNode.equals(Keys.nodeNameHallwayFloorTwoJ1)) {
                        if (preNode.equals(Keys.nodeNameHallwayFloorTwoH1)) {
                            return Keys.directions_continueStraight;
                        } 
                        else if (preNode.equals(Keys.nodeNameHallwayFloorTwoI2)) {
                            return Keys.directions_turnRight + " and c"+Keys.directions_continueStraight.substring(1);
                        } 
                    } 
                 }
                 
                 if (node.equals(Keys.nodeNameHallwayFloorTwoI2)) {
                    if (postNode.equals(Keys.nodeNameHallwayFloorTwoH2)) {
                        if (preNode.equals(Keys.nodeNameHallwayFloorTwoI1)) {                         
                            return Keys.directions_turnRight+" and c"+Keys.directions_continueStraight.substring(1);
                        } 
                        else if (preNode.equals(Keys.nodeNameHallwayFloorTwoJ2)) {
                            return Keys.directions_continueStraight;
                        }
                    } 
                    else if (postNode.equals(Keys.nodeNameHallwayFloorTwoI1)) {
                        if (preNode.equals(Keys.nodeNameHallwayFloorTwoH2)) {
                            return Keys.directions_makeALeftAtTheNextIntersection;
                        } 
                        else if (preNode.equals(Keys.nodeNameHallwayFloorTwoJ2)) {
                            return Keys.directions_makeARightAtTheNextIntersection;
                        } 
                    } 
                    else if (postNode.equals(Keys.nodeNameHallwayFloorTwoJ2)) {
                        if (preNode.equals(Keys.nodeNameHallwayFloorTwoH2)) {
                            return Keys.directions_continueStraight;
                        } 
                        else if (preNode.equals(Keys.nodeNameHallwayFloorTwoI1)) {
                            return Keys.directions_turnLeft + " and c"+Keys.directions_continueStraight.substring(1);
                        } 
                    } 
                 }
                 
                break;
            case "FloorThree":
                //logic for floor three
                break;
            case "FloorFour":
                //logic for floor four
                if (node.equals(Keys.nodeNameHallwayFloorFourB1)) {
                    if (postNode.equals(Keys.nodeNameHallwayFloorFourB2)) {
                        if (preNode.equals(Keys.nodeNameHallwayFloorFourA)) {
                            return Keys.directions_turnRight;
                        } else if (preNode.equals(Keys.nodeNameHallwayFloorFourC1)) {
                            return Keys.directions_turnLeft;
                        }
                    } else if (postNode.equals(Keys.nodeNameHallwayFloorFourC1)) {
                        if (preNode.equals(Keys.nodeNameHallwayFloorFourB2)) {
                            return Keys.directions_turnRight;
                        } else if (preNode.equals(Keys.nodeNameHallwayFloorFourA)) {
                            return Keys.directions_continueStraight;
                        }
                    } else if (postNode.equals(Keys.nodeNameHallwayFloorFourA)) {
                        if (preNode.equals(Keys.nodeNameHallwayFloorFourB2)) {
                            return Keys.directions_turnLeft;
                        } else if (preNode.equals(Keys.nodeNameHallwayFloorFourC1)) {
                            return Keys.directions_continueStraight;
                        }
                    }

                }
                if (node.equals(Keys.nodeNameHallwayFloorFourB2)) {
                    if (postNode.equals(Keys.nodeNameHallwayFloorFourB1)) {
                        if (preNode.equals(Keys.nodeNameHallwayFloorFourA)) {
                            return Keys.directions_turnLeft;
                        } else if (preNode.equals(Keys.nodeNameHallwayFloorFourC2)) {
                            return Keys.directions_turnRight;
                        }
                    } else if (postNode.equals(Keys.nodeNameHallwayFloorFourC2)) {
                        if (preNode.equals(Keys.nodeNameHallwayFloorFourB1)) {
                            return Keys.directions_turnLeft;
                        } else if (preNode.equals(Keys.nodeNameHallwayFloorFourA)) {
                            return Keys.directions_continueStraight;
                        }
                    } else if (postNode.equals(Keys.nodeNameHallwayFloorFourA)) {
                        if (preNode.equals(Keys.nodeNameHallwayFloorFourB1)) {
                            return Keys.directions_turnRight;
                        } else if (preNode.equals(Keys.nodeNameHallwayFloorFourC2)) {
                            return Keys.directions_continueStraight;
                        }
                    }
                }
                if (node.equals(Keys.nodeNameHallwayFloorFourC1)) {
                    if (postNode.equals(Keys.nodeNameHallwayFloorFourC2)) {
                        if (preNode.equals(Keys.nodeNameHallwayFloorFourD1)) {
                            return Keys.directions_turnLeft;
                        } else if (preNode.equals(Keys.nodeNameHallwayFloorFourB1)) {
                            return Keys.directions_turnRight;
                        }
                    } else if (postNode.equals(Keys.nodeNameHallwayFloorFourB1)) {
                        if (preNode.equals(Keys.nodeNameHallwayFloorFourC2)) {
                            return Keys.directions_turnLeft;
                        } else if (preNode.equals(Keys.nodeNameHallwayFloorFourD1)) {
                            return Keys.directions_continueStraight;
                        }
                    } else if (postNode.equals(Keys.nodeNameHallwayFloorFourD1)) {
                        if (preNode.equals(Keys.nodeNameHallwayFloorFourC2)) {
                            return Keys.directions_turnRight;
                        } else if (preNode.equals(Keys.nodeNameHallwayFloorFourB1)) {
                            return Keys.directions_continueStraight;
                        }
                    }

                }
                if (node.equals(Keys.nodeNameHallwayFloorFourC2)) {
                    if (postNode.equals(Keys.nodeNameHallwayFloorFourC1)) {
                        if (preNode.equals(Keys.nodeNameHallwayFloorFourB2)) {
                            return Keys.directions_turnLeft;
                        } else if (preNode.equals(Keys.nodeNameHallwayFloorFourD2)) {
                            return Keys.directions_turnRight;
                        }
                    } else if (postNode.equals(Keys.nodeNameHallwayFloorFourB2)) {
                        if (preNode.equals(Keys.nodeNameHallwayFloorFourC1)) {
                            return Keys.directions_turnRight;
                        } else if (preNode.equals(Keys.nodeNameHallwayFloorFourD2)) {
                            return Keys.directions_continueStraight;
                        }
                    } else if (postNode.equals(Keys.nodeNameHallwayFloorFourD2)) {
                        if (preNode.equals(Keys.nodeNameHallwayFloorFourC1)) {
                            return Keys.directions_turnLeft;
                        } else if (preNode.equals(Keys.nodeNameHallwayFloorFourB2)) {
                            return Keys.directions_continueStraight;
                        }
                    }

                }
                if (node.equals(Keys.nodeNameHallwayFloorFourD1)) {
                    if (postNode.equals(Keys.nodeNameHallwayFloorFourD2)) {
                        if (preNode.equals(Keys.nodeNameHallwayFloorFourC1)) {
                            return Keys.directions_turnRight;
                        } else if (preNode.equals(Keys.nodeNameHallwayFloorFourE1)) {
                            return Keys.directions_turnLeft;
                        }
                    } else if (postNode.equals(Keys.nodeNameHallwayFloorFourC1)) {
                        if (preNode.equals(Keys.nodeNameHallwayFloorFourD2)) {
                            return Keys.directions_turnLeft;
                        } else if (preNode.equals(Keys.nodeNameHallwayFloorFourE1)) {
                            return Keys.directions_continueStraight;
                        }
                    } else if (postNode.equals(Keys.nodeNameHallwayFloorFourE1)) {
                        if (preNode.equals(Keys.nodeNameHallwayFloorFourD2)) {
                            return Keys.directions_turnRight;
                        } else if (preNode.equals(Keys.nodeNameHallwayFloorFourC1)) {
                            return Keys.directions_continueStraight;
                        }
                    }

                }
                if (node.equals(Keys.nodeNameHallwayFloorFourD2)) {
                    if (postNode.equals(Keys.nodeNameHallwayFloorFourD1)) {
                        if (preNode.equals(Keys.nodeNameHallwayFloorFourC2)) {
                            return Keys.directions_turnLeft;
                        } else if (preNode.equals(Keys.nodeNameHallwayFloorFourE2)) {
                            return Keys.directions_turnRight;
                        }
                    } else if (postNode.equals(Keys.nodeNameHallwayFloorFourC2)) {
                        if (preNode.equals(Keys.nodeNameHallwayFloorFourD1)) {
                            return Keys.directions_turnRight;
                        } else if (preNode.equals(Keys.nodeNameHallwayFloorFourE2)) {
                            return Keys.directions_continueStraight;
                        }
                    } else if (postNode.equals(Keys.nodeNameHallwayFloorFourE2)) {
                        if (preNode.equals(Keys.nodeNameHallwayFloorFourD1)) {
                            return Keys.directions_turnLeft;
                        } else if (preNode.equals(Keys.nodeNameHallwayFloorFourC2)) {
                            return Keys.directions_continueStraight;
                        }
                    }

                }
                break;
            case "Floor Ground":
                //logic
                break;
            case "EastWingFloorOne":
                //logic
                break;
            case "EastWingFloorTwo":
                //logic
                break;
            case "EastWingFloorThree":
                //logic
                break;
            case "EastWingFloorFour":
                break;
            case "EastWingFloorFive":

        }
        return null;

    }

    public static Graph returnGraphFromFloor(String floor) {
        //System.out.println(floor);
        if (floor.equals("FloorGround")) {
            return new FloorGround();
        } else if (floor.equals("FloorOne")) {
            return new FloorOne();
        } else if (floor.equals("FloorTwo")) {
            return new FloorTwo();
        } else if (floor.equals("FloorThree")) {
            return new FloorThree();
        } else if (floor.equals("FloorFour")) {
            return new FloorFour();
        } else if (floor.equals("EastWingFloorOne")) {
            return new EastWingFloorOne();
        } else if (floor.equals("EastWingFloorTwo")) {
            return new EastWingFloorTwo();
        } else if (floor.equals("EastWingFloorThree")) {
            return new EastWingFloorThree();
        } else if (floor.equals("EastWingFloorFour")) {
            return new EastWingFloorFour();
        } /*else if (floor.equals("EastWingFloorFive"))
            return new EastWingFloorFive();*/ else {
            return null;
        }
    }

    public static String[] findFloorAndElevator(String node) {
        //element 0 is floor
        //element 1 is elevator
        String[] data = new String[2];
        if (node.contains("EastWing")) {
            if (node.contains("FloorOne")) {
                data[0] = "EastWingFloorOne";
                data[1] = Keys.nodeNameElevatorEastWingFloorOne;
            } else if (node.contains("FloorTwo")) {
                data[0] = "EastWingFloorTwo";
                data[1] = Keys.nodeNameElevatorEastWingFloorTwo;
            } else if (node.contains("FloorThree")) {
                data[0] = "EastWingFloorThree";
                data[1] = Keys.nodeNameElevatorEastWingFloorThree;
            } else if (node.contains("FloorFour")) {
                data[0] = "EastWingFloorFour";
                data[1] = Keys.nodeNameElevatorEastWingFloorFour;
            } else if (node.contains("FloorFive")) {
                data[0] = "EastWingFloorFive";
                data[1] = Keys.nodeNameElevatorEastWingFloorFive;
            }
        } else if (node.contains("FloorGround")) {
            data[0] = "FloorGround";
            data[1] = Keys.nodeNameElevatorFloorGround;
        } else if (node.contains("FloorOne")) {
            data[0] = "FloorOne";
            data[1] = Keys.nodeNameElevatorFloorOne;
        } else if (node.contains("FloorTwo")) {
            data[0] = "FloorTwo";
            data[1] = Keys.nodeNameElevatorFloorTwo;
        } else if (node.contains("FloorThree")) {
            data[0] = "FloorThree";
            data[1] = Keys.nodeNameElevatorFloorThree;
        } else if (node.contains("FloorFour")) {
            data[0] = "FloorFour";
            data[1] = Keys.nodeNameElevatorFloorFour;
        }

        return data;
    }

    //directions
    final public static String directions_passTheElevatorsUntilEndOfHallway = "Pass the elevators and continue the end of the hallway";
    final public static String directions_passTheElevatorsUntilFrontDoors = "Pass the elevators, and continue until the front doors";
    final public static String directions_enterTheSecondClusterOfElevators = "Enter the SECOND cluster of elevators";
    final public static String directions_enterTheFirstClusterOfElevators = "Enter the FIRST cluster of elevators";
    final public static String directions_enterTheElevators = "Enter the elevators";
    final public static String directions_exitTheElevators = "Exit the elevators";
    final public static String directions_followTheLongHallway = "Follow the (long) hallway until you reach "; //TODO until you reach...    
    final public static String directions_followTheHallway = "Follow the hallway until you reach "; //TODO until you reach...
    final public static String directions_untilTheDesk = "until you reach the desk"; //...

    final public static String directions_facingAwayFromPV = "Facing away from the parking validation booth, ";
    final public static String directions_exitBurnOutpatient = "Exit the Burn Outpatient Center and ";
    final public static String directions_exitPediatricOutpatient = "Exit the Pediatric Outpatient Center and ";
    final public static String directions_exitRestroom = "Exit the restroom and ";
    final public static String directions_exitCafeteria = "Exit the cafeteria and ";
    final public static String directions_exittheOutpatientLabAndTurnLeftAndContinueStraight = "Exit the outpatient lab and turn left. Continue straight.";
    final public static String directions_exitClinicalLabAndTurnLeftAndFollowHallwayUntilIntersection = "Exit the clinical lab and turn left. Follow the hallway until you reach the intersection.";
    final public static String directions_exitMedicalRecordsAndTurnLeftAndContinueStraight = "Exit the medical records and turn left. Continue straight.";

    //fourth floor directions
    final public static String directions_passThroughTheArchwayAndContinueStraightPassTheEleveatorsThereShouldBeTwoHallwaysInFrontOfYou = "Pass through the archway and continue straight. Pass the eleveators. There should be two hallways in front ofY you";
    final public static String directions_goThroughTheLeftDoorway = "Go through the left doorway";
    final public static String directions_goThroughTheRightDoorway = "Go through the right doorway";
    
    
    //second floor directions
    final public static String directions_continueStraightPassingByTheFirstSetOfElevatorsContinueStraight = "Continue straight, passing by a cluster of elevators. Continue straight, into the fourth floor lobby. The elevators are upahead, next to the windows.";
    final public static String directions_walkStraightPastTheFirstSetOfElevatorsContinueStraightAndTakeTheElevatorsAtEndOfHallway = "Walk straight, past the first set of elevators. Continue straight and take the elevators at the end of the hallway.";
    final public static String directions_makeARightAtTheEndOfTheLoop  = "Make a right at the end of the loop";
    final public static String directions_continueStraightDownTheLoopedHallwayMakingSlightLeftTurns = "Continue straight, down the looped hallway, making slight left turns.";
    final public static String directions_continueStraightDownTheLoopedHallwayMakingSlightRightTurns = "Continue straight, down the looped hallway, making slight right turns.";
    final public static String directions_passTheSetOfEleators = "Pass the set of elevators";
    final public static String directions_stayInTheReceptionAreaContinueThroughTheOtherCorridorAtTheBackOfTheReceptionAreaOnYourRight = "Stay in the reception area. Continue through the other corridor at the back of the reception area, on your right";
    final public static String directions_stayInTheReceptionAreaContinueThroughTheOtherCorridorAtTheBackOfTheReceptionAreaOnYourLeft = "Stay in the reception area. Continue through the other corridor at the back of the reception area, on your left";
    
    final public static String directions_exitTheLobby  = "Exit the lobby";
    final public static String directions_enterTheReceptionArea  = "Enter the receptetion area";
    final public static String directions_exitTheReceptionArea  = "Exit the reception area";
    final public static String directions_makeARightAtTheEndOfTheHallway = "Make a right at the end of the hallway";    
    final public static String directions_makeALeftAtTheEndOfTheHallway = "Make a left at the end of the hallway";
    final public static String directions_makeALeftAtTheFirstIntersection = "Make a left at the first intersection";    
    final public static String directions_makeARightAtTheFirstIntersection = "Make a right at the first intersection";
    final public static String directions_makeALeftAtTheNextIntersection = "Make a left at the next intersection";    
    final public static String directions_makeARightAtTheNextIntersection = "Make a right at the next intersection"; 
    final public static String directions_turnLeft = "Turn left";
    final public static String directions_turnRight = "Turn right";
    final public static String directions_walkStraight = "Walk straight";
    final public static String directions_proceedStraight = "Proceed straight";
    final public static String directions_continueStraight = "Continue straight";
    final public static String directions_exitTheRoom = "Exit the room";
    final public static String directions_continueDownTheHallway = "Continue down the hallway";
    final public static String directions_goThroughTheLeftmostHallway = "Go through the leftmost hallway";    
    final public static String directions_goThroughTheRightmostHallway = "Go through the rightmost hallway";
    //floor ground
    //names
    final public static String nodeNameHallwayFloorGroundA = "hallwayFloorGroundA";
    final public static ArrayList<String> IPelevatorFloorGroundA = new ArrayList<>(Arrays.asList(
            "10.21.222.35"
     ));
    final public static String nodeNameHallwayFloorGroundB = "hallwayFloorGroundB";
    final public static String nodeNameHallwayFloorGroundC = "hallwayFloorGroundC";
     final public static ArrayList<String> IPhallwayFloorGroundC = new ArrayList<>(Arrays.asList(
         "10.21.222.12"
            ));
    final public static String nodeNameHallwayEastWingFloorGround = "eastWingFloorGround";
    final public static String nodeNameElevatorFloorGround = "elevatorFloorGround";
     final public static ArrayList<String> IPelevatorFloorGround = new ArrayList<>(Arrays.asList(
            "10.21.222.8",
             "10.21.222.18",
             "10.21.222.35"
     ));
    final public static String nodeNameElevatorEastWingFloorGround = "elevatorEastWingFloorGround";
    //descriptions
    final public static ArrayList<String> descriptionEastWingFloorGround = new ArrayList<>(Arrays.asList(
            "Apnea Center",
            "Vangvanichyakorn",
            "Barnabas Health Retail Pharmacy",
            "Retail Pharmacy",
            "Craniofacial center",
            "Craniofacial",
            "High risk infant follow up",
            "High risk infant",
            "North Jersey Blood Center",
            "Blood Center",
            "Pediatric health center",
            "pediactric",
            "Glick",
            "Liptsyn",
            "Center for Wound and Burn Healing",
            "Wound and burn healing",
            "wound healing",
            "burn healing",
            "Chase atm"
    ));

    //floor one names
    final public static String nodeNameHallwayFloorOneA = "hallwayFloorOneA";
    final public static String nodeNameHallwayFloorOneB = "hallwayFloorOneB";
    final public static String nodeNameHallwayFloorOneC = "hallwayFloorOneC";
    final public static String nodeNameHallwayFloorOneD = "hallwayFloorOneD";
    final public static String nodeNameHallwayFloorOneE = "hallwayFloorOneE";
    final public static String nodeNameHallwayFloorOneF = "hallwayFloorOneF";
    final public static String nodeNameHallwayFloorOneG = "hallwayFloorOneG";
    final public static String nodeNameElevatorFloorOne = "elevatorFloorOne";

    //floor two names +descirptions
    final public static String nodeNameElevatorFloorTwo = "elevatorFloorTwo";
    final public static String nodeNameHallwayFloorTwoA = "hallwayFloorTwoA";
    final public static ArrayList<String> descriptionHallwayFloorTwoA = new ArrayList<>(Arrays.asList(
            "Cardiac Telemetry",
            "Cardiothoracic ICU",
            "Cardiothoracic ICU",
            "Burn Center Control Room",
            "Burn Surgery Section",
            "Burn Center Administration",
            "Burn Center Administrator",
            "Burn Center",
            "Burn ICU",
            "Burn Intensive Care Unit",
            "Burn Step Down Unit",
            "Department of Emergency Medicine"
    ));

    //floor three names + descriptions
    final public static String nodeNameElevatorFloorThree = "elevatorFloorThree";
    final public static String nodeNameHallwayFloorThreeA = "hallwayFloorThreeA";
    final public static String nodeNameHallwayFloorThreeB = "hallwayFloorThreeB";
    final public static String nodeNameHallwayFloorThreeC1 = "hallwayFloorThreeC1";
    final public static String nodeNameHallwayFloorThreeC2 = "hallwayFloorThreeC2";
    final public static String nodeNameHallwayFloorThreeD1 = "hallwayFloorThreeD1";
    final public static String nodeNameHallwayFloorThreeD2 = "hallwayFloorThreeD2";
    final public static String nodeNameHallwayFloorThreeE = "deskFloorThree";//the desk at front
    final public static ArrayList<String> descriptionDeskFloorThree = new ArrayList<>(Arrays.asList(
            "NICU",
            "premature babies",
            "neonatal intensive care unit",
            "babies",
            "baby",
            "preemies"
    ));

    //floor four names
    final public static String nodeNameElevatorFloorFour = "elevatorFloorFour";
    final public static String nodeNameDeskFloorFour = "deskFloorFour";
    final public static String nodeNameHallwayFloorFourA = "hallwayFloorFourA";
    final public static String nodeNameHallwayFloorFourB1 = "hallwayFloorFourB1";
    final public static String nodeNameHallwayFloorFourB2 = "hallwayFloorFourB2";
    final public static String nodeNameHallwayFloorFourC1 = "hallwayFloorFourC1";
    final public static String nodeNameHallwayFloorFourC2 = "hallwayFloorFourC2";
    final public static String nodeNameHallwayFloorFourD1 = "hallwayFloorFourD1";
    final public static String nodeNameHallwayFloorFourD2 = "hallwayFloorFourD2";
    final public static String nodeNameHallwayFloorFourE1 = "hallwayFloorFourE1";
    final public static String nodeNameHallwayFloorFourE2 = "hallwayFloorFourE2";

    final public static String nodeNameRoom4102FloorFour = "room4102FloorFour";

    final public static String nodeNameRoom4103FloorFour = "room4103FloorFour";

    final public static String nodeNameRoom4104FloorFour = "room4104FloorFour";

    final public static String nodeNameRoom4105FloorFour = "room4105FloorFour";

    final public static String nodeNameRoom4106FloorFour = "room4106FloorFour";

    final public static String nodeNameRoom4107FloorFour = "room4107FloorFour";

    final public static String nodeNameRoom4108FloorFour = "room4108FloorFour";

    final public static String nodeNameRoom4109FloorFour = "room4109FloorFour";

    final public static String nodeNameRoom4110FloorFour = "room4110FloorFour";

    final public static String nodeNameRoom4130FloorFour = "room4130FloorFour";

    final public static String nodeNameRoom4131FloorFour = "room4131FloorFour";

    final public static String nodeNameRoom4132FloorFour = "room4132FloorFour";

    final public static String nodeNameRoom4133FloorFour = "room4133FloorFour";

    final public static String nodeNameRoom4134FloorFour = "room4134FloorFour";

    final public static String nodeNameRoom4135FloorFour = "room4135FloorFour";

    final public static String nodeNameRoom4136FloorFour = "room4136FloorFour";

    final public static String nodeNameRoom4137FloorFour = "room4137FloorFour";

    final public static String nodeNameRoom4138FloorFour = "room4138FloorFour";

    final public static String nodeNameRoom4139FloorFour = "room4139FloorFour";
    
    final public static String nodeNameRoom4712FloorFour = "room4712FloorFour";

final public static String nodeNameRoom4714FloorFour = "room4714FloorFour";

final public static String nodeNameRoom4715FloorFour = "room4715FloorFour";

final public static String nodeNameRoom4717FloorFour = "room4717FloorFour";

final public static String nodeNameRoom4718FloorFour = "room4718FloorFour";

final public static String nodeNameRoom4719FloorFour = "room4719FloorFour";
final public static String nodeNameRoom4720FloorFour = "room4720FloorFour";

final public static String nodeNameRoom4721FloorFour = "room4721FloorFour";

final public static String nodeNameRoom4722FloorFour = "room4722FloorFour";

final public static String nodeNameRoom4723FloorFour = "room4723FloorFour";

final public static String nodeNameRoom4724FloorFour = "room4724FloorFour";

final public static String nodeNameRoom4725FloorFour = "room4725FloorFour";

final public static String nodeNameRoom4726FloorFour = "room4726FloorFour";

final public static String nodeNameRoom4727FloorFour = "room4727FloorFour";
final public static String nodeNameRoom4728FloorFour = "room4728FloorFour";
    
// floor four IPs
final public static ArrayList<String> IPFloorFourDesk = new ArrayList<>(Arrays.asList(
        
                "10.21.223.64",
                "10.21.223.210"
                
        ));
    final public static ArrayList<String> IPFloorFourElevators = new ArrayList<>(Arrays.asList(
 
                "10.21.223.64",
                "10.21.223.210"
        ));
    final public static ArrayList<String> IPFloorFourRoom4102 = new ArrayList<>(Arrays.asList(
 
                "10.21.223.46",
                "10.21.223.244",
                "10.21.223.45"
        ));
    final public static ArrayList<String> IPFloorFourRoom4103 = new ArrayList<>(Arrays.asList(
 
                "10.21.223.46",
                "10.21.223.247",
                "10.21.223.244",
                "10.21.223.45"
        ));
    final public static ArrayList<String> IPFloorFourRoom4104 = new ArrayList<>(Arrays.asList(
 
                "10.21.223.46",
                "10.21.223.247",
                "10.21.223.171"
        ));
    final public static ArrayList<String> IPFloorFourRoom4105 = new ArrayList<>(Arrays.asList(
 
                "10.21.223.247",
                "10.21.223.171"
        ));
    final public static ArrayList<String> IPFloorFourRoom4137 = new ArrayList<>(Arrays.asList(
 
                "10.21.223.46",
                "10.21.223.171",
                "10.21.223.37"
        ));
    final public static ArrayList<String> IPFloorFourRoom4138 = new ArrayList<>(Arrays.asList(
 
                "10.21.223.46",
                "10.21.223.244",
                "10.21.223.37"
        ));
    final public static ArrayList<String> IPFloorFourRoom4139 = new ArrayList<>(Arrays.asList(
 
                "10.21.223.46",
                "10.21.223.244",
                "10.21.223.251",
                "10.21.223.37"
        ));
    final public static ArrayList<String> IPFloorFourRoom4110 = new ArrayList<>(Arrays.asList(
 
                "10.21.223.43",
                "10.21.223.39",
                "10.21.223.248",
                "10.21.223.42"
        ));
    final public static ArrayList<String> IPFloorFourRoom4112 = new ArrayList<>(Arrays.asList(
 
                "10.21.223.39",
                "10.21.223.248",
                "10.21.222.147"
        ));
    final public static ArrayList<String> IPFloorFourRoom4712 = new ArrayList<>(Arrays.asList(
 
                "10.21.223.39",
                "10.21.223.248",
                "10.21.223.38",
                "10.21.222.147",
                "10.21.223.35"
        ));
    final public static ArrayList<String> IPFloorFourRoom4726 = new ArrayList<>(Arrays.asList(
 
                "10.21.223.39",
                "10.21.223.248",
                "10.21.223.250",
                "10.21.223.169",
                "10.21.223.168",
                "10.21.223.254"
        ));
    final public static ArrayList<String> IPFloorFourRoom4727 = new ArrayList<>(Arrays.asList(
 
                "10.21.223.39",
                "10.21.223.248",
                "10.21.223.250",
                "10.21.223.169"
        ));
    final public static ArrayList<String> IPFloorFourRoom4728 = new ArrayList<>(Arrays.asList(
 
                "10.21.223.39",
                "10.21.222.155",
                "10.21.223.248",
                "10.21.223.249",
                "10.21.223.250",
                "10.21.223.169"
        ));
    final public static ArrayList<String> IPHallwayFloorFourA = new ArrayList<>(Arrays.asList(
 
                "10.21.223.55"
        ));
    final public static ArrayList<String> IPHallwayFloorFourB1 = new ArrayList<>(Arrays.asList(
 
                "10.21.223.245",
                "10.21.223.50",
                "10.21.223.36"
        ));
    final public static ArrayList<String> IPHallwayFloorFourB2 = new ArrayList<>(Arrays.asList(
 
                "10.21.223.245",
                "10.21.223.50",
                "10.21.223.36"
        ));
    final public static ArrayList<String> IPHallwayFloorFourC1 = new ArrayList<>(Arrays.asList(
 
                "10.21.222.155",
                "10.21.223.248",
                "10.21.223.249",
                "10.21.223.250"
        ));
    final public static ArrayList<String> IPHallwayFloorFourC2 = new ArrayList<>(Arrays.asList(
 
                "10.21.222.155",
                "10.21.223.248",
                "10.21.223.249",
                "10.21.223.250",
                "10.21.223.169"
        ));
    final public static ArrayList<String> IPHallwayFloorFourD1 = new ArrayList<>(Arrays.asList(
 
                "10.21.220.190"
        ));
    final public static ArrayList<String> IPHallwayFloorFourD2 = new ArrayList<>(Arrays.asList(
 
                "10.21.220.190"
        ));
    final public static ArrayList<String> IPHallwayFloorFourE1 = new ArrayList<>(Arrays.asList(
 
                "10.21.223.170"
        ));
    final public static ArrayList<String> IPHallwayFloorFourE2 = new ArrayList<>(Arrays.asList(
 
                "10.21.221.77",
                "10.21.223.246"
        ));
    final public static ArrayList<String> IPFloorFourRoom4130 = new ArrayList<>(Arrays.asList(
 
                "10.21.222.155",
                "10.21.223.249",
                "10.21.223.42"
        ));
    final public static ArrayList<String> IPFloorFourRoom4131 = new ArrayList<>(Arrays.asList(
 
                "10.21.222.155",
                "10.21.223.249",
                "10.21.223.42"
        ));
    final public static ArrayList<String> IPFloorFourRoom4132 = new ArrayList<>(Arrays.asList(
 
                "10.21.223.42",
                "10.21.223.222"
        ));
    final public static ArrayList<String> IPFloorFourRoom4133 = new ArrayList<>(Arrays.asList(
 
                "10.21.223.222"
        ));
    final public static ArrayList<String> IPFloorFourRoom4134 = new ArrayList<>(Arrays.asList(
 
                "10.21.223.222",
                "10.21.223.36"
        ));
    final public static ArrayList<String> IPFloorFourRoom4135 = new ArrayList<>(Arrays.asList(
 
                "10.21.223.36",
                "10.21.223.171"
        ));
    final public static ArrayList<String> IPFloorFourRoom4136 = new ArrayList<>(Arrays.asList(
 
                "10.21.223.36",
                "10.21.223.171"
        ));
    final public static ArrayList<String> IPFloorFourRoom4108 = new ArrayList<>(Arrays.asList(
 
                "10.21.223.43",
                "10.21.223.245",
                "10.21.223.222",
                "10.21.223.50"
        ));
    final public static ArrayList<String> IPFloorFourRoom4109 = new ArrayList<>(Arrays.asList(
 
                "10.21.223.43",
                "10.21.223.42",
                "10.21.223.222"
        ));
    final public static ArrayList<String> IPFloorFourRoom4106 = new ArrayList<>(Arrays.asList(
 
                "10.21.223.245",
                "10.21.223.50",
                "10.21.223.171"
        ));
    final public static ArrayList<String> IPFloorFourRoom4107 = new ArrayList<>(Arrays.asList(
 
                "10.21.223.245",
                "10.21.223.222",
                "10.21.223.50"
        ));
    final public static ArrayList<String> IPFloorFourRoom4154 = new ArrayList<>(Arrays.asList(
 
                "10.21.223.244"
        ));
    final public static ArrayList<String> IPFloorFourRoom4157 = new ArrayList<>(Arrays.asList(
 
                "10.21.223.244",
                "10.21.223.171"
        ));
    final public static ArrayList<String> IPFloorFourRoom4141A = new ArrayList<>(Arrays.asList(
 
                "10.21.223.251"
        ));
    final public static ArrayList<String> IPFloorFourRoom4141B = new ArrayList<>(Arrays.asList(
 
                "10.21.223.251"
        ));
    final public static ArrayList<String> IPFloorFourRoom4141C = new ArrayList<>(Arrays.asList(
 
                "10.21.223.251"
        ));
    final public static ArrayList<String> IPFloorFourRoom4141D = new ArrayList<>(Arrays.asList(
 
                "10.21.223.251"
        ));
    final public static ArrayList<String> IPFloorFourRoom4141E = new ArrayList<>(Arrays.asList(
 
                "10.21.223.251"
        ));
    final public static ArrayList<String> IPFloorFourRoom4143A = new ArrayList<>(Arrays.asList(
 
                "10.21.223.251"
        ));
    final public static ArrayList<String> IPFloorFourRoom4143E = new ArrayList<>(Arrays.asList(
 
                "10.21.223.251"
        ));
    final public static ArrayList<String> IPFloorFourRoom4143C = new ArrayList<>(Arrays.asList(
 
                "10.21.223.251"
        ));
    final public static ArrayList<String> IPFloorFourRoom4166 = new ArrayList<>(Arrays.asList(
 
                "10.21.223.42"
        ));
    final public static ArrayList<String> IPFloorFourRoom4167 = new ArrayList<>(Arrays.asList(
 
                "10.21.223.42"
        ));
    final public static ArrayList<String> IPFloorFourRoom4153A = new ArrayList<>(Arrays.asList(
 
                "10.21.223.45"
        ));
    final public static ArrayList<String> IPFloorFourRoom4714 = new ArrayList<>(Arrays.asList(
 
                "10.21.223.38",
                "10.21.222.147",
                "10.21.223.35"
        ));
    final public static ArrayList<String> IPFloorFourRoom4715 = new ArrayList<>(Arrays.asList(
 
                "10.21.223.38",
                "10.21.223.253",
                "10.21.223.35"
        ));
    final public static ArrayList<String> IPFloorFourRoom4717 = new ArrayList<>(Arrays.asList(
 
                "10.21.223.38",
                "10.21.223.253"
        ));
    final public static ArrayList<String> IPFloorFourRoom4718 = new ArrayList<>(Arrays.asList(
 
                "10.21.223.170",
                "10.21.223.253"
        ));
    final public static ArrayList<String> IPFloorFourRoom4719 = new ArrayList<>(Arrays.asList(
 
                "10.21.223.170"
        ));
    final public static ArrayList<String> IPFloorFourRoom4720 = new ArrayList<>(Arrays.asList(
 
                "10.21.221.77",
                "10.21.223.246"
        ));
    final public static ArrayList<String> IPFloorFourRoom4721 = new ArrayList<>(Arrays.asList(
 
                "10.21.220.190",
                "10.21.221.77",
                "10.21.223.246"
        ));
    final public static ArrayList<String> IPFloorFourRoom4722 = new ArrayList<>(Arrays.asList(
 
                "10.21.220.190",
                "10.21.221.77"
        ));
    final public static ArrayList<String> IPFloorFourRoom4723 = new ArrayList<>(Arrays.asList(
 
                "10.21.220.190"
        ));
    final public static ArrayList<String> IPFloorFourRoom4724 = new ArrayList<>(Arrays.asList(
 
                "10.21.223.168",
                "10.21.223.254"
        ));
    final public static ArrayList<String> IPFloorFourRoom4725 = new ArrayList<>(Arrays.asList(
 
                "10.21.223.168",
                "10.21.223.254"
        ));


//floor two hallway names
//hallway floor A is renamed somewhere else
final public static String nodeNameHallwayFloorTwoB1 = "hallwayFloorTwoB1";
final public static String nodeNameHallwayFloorTwoB2 = "hallwayFloorTwoB2";
final public static String nodeNameHallwayFloorTwoC = "hallwayFloorTwoC";
final public static String nodeNameHallwayFloorTwoD = "hallwayFloorTwoD";
final public static String nodeNameHallwayFloorTwoE = "hallwayFloorTwoE";
final public static String nodeNameHallwayFloorTwoF1 = "hallwayFloorTwoF1";
final public static String nodeNameHallwayFloorTwoF2 = "hallwayFloorTwoF2";
final public static String nodeNameHallwayFloorTwoF3 = "hallwayFloorTwoF3";
final public static String nodeNameHallwayFloorTwoG = "hallwayFloorTwoG";
final public static String nodeNameHallwayFloorTwoH1 = "hallwayFloorTwoH1";
final public static String nodeNameHallwayFloorTwoH2 = "hallwayFloorTwoH2";
final public static String nodeNameHallwayFloorTwoI1 = "hallwayFloorTwoI1";
final public static String nodeNameHallwayFloorTwoI2 = "hallwayFloorTwoI2";
final public static String nodeNameHallwayFloorTwoJ1 = "hallwayFloorTwoJ1";

final public static String nodeNameHallwayFloorTwoJ2 = "hallwayFloorTwoJ2";




    //descriptions
    final public static ArrayList<String> descriptionDeskFloorFour = new ArrayList<>(Arrays.asList(
            "PICU",
            "pediatric",
            "childrens center",
            "kids",
            "pediatric intensive care unit"
    ));

    //EAST WING:        
    //East Wing Floor One
    final public static String nodeNameElevatorEastWingFloorOne = "elevatorEastWingFloorOne";
    final public static ArrayList<String> descriptionEastWingFloorOne = new ArrayList<>(Arrays.asList(
            "Department of Cardiothoracac surgery",
            "Cardiothoracic surgery",
            "Camacho",
            "Karanam",
            "Russo",
            "Sardari",
            "Saunders",
            "Heart Failure Management Program",
            "Heart Failure Management",
            "Heart Failure",
            "Zucker",
            "Jaqua Cardiacpulmonary rehabilitation center",
            "Cardiacpulmonary rehabilitation",
            "Cardiacpulmonary rehab",
            "Neonatology",
            "Sun",
            "OBGYN Health Center",
            "OBGYN",
            "Fibroid Center"
    ));

    //East Wing Floor Two
    final public static String nodeNameElevatorEastWingFloorTwo = "elevatorEastWingFloorTwo";
    final public static ArrayList<String> descriptionEastWingFloorTwo = new ArrayList<>(Arrays.asList(
            "Cancer Center",
            "Infusion Center",
            "Cancer",
            "Infusion"
    ));
    //East Wing Floor Three
    final public static String nodeNameElevatorEastWingFloorThree = "elevatorEastWingFloorThree";
    final public static ArrayList<String> descriptionEastWingFloorThree = new ArrayList<>(Arrays.asList(
            "Transplant Medicine",
            "Living Donor Institute",
            "Pre Transplant",
            "Transplant Administration",
            "Transplant Clinic",
            "Transplant Research",
            "Transplant Research",
            "Transplant Short Stay"
    ));

    //East Wing Floor Four
    final public static String nodeNameElevatorEastWingFloorFour = "elevatorEastWingFloorFour";
    final public static ArrayList<String> descriptionEastWingElevatorFloorFour = new ArrayList<>(Arrays.asList(
            "Reproductive Medicine and Science",
            "Perinatal Associates"
    ));

    //East Wing Floor Five
    final public static String nodeNameElevatorEastWingFloorFive = "elevatorEastWingFloorFive";

    //ROOMS
    //floorOne
    final public static String nodeNameRoom1323FloorOne = "room1323FloorOne";
    final public static ArrayList<String> descriptionRoom1323FloorOne = new ArrayList<>(Arrays.asList(
            "same day surgery",
            "same day waiting area",
            "same day",
            "1323"
    ));

    final public static String nodeNameRoom1319FloorOne = "room1319FloorOne";
    final public static ArrayList<String> descriptionRoom1319FloorOne = new ArrayList<>(Arrays.asList(
            "mens bathroom 1",
            "men's bathroom 1",
            "bathroom 1",
            "mens restroom 1",
            "men's restroom 1",
            "restroom 1"
    ));

    final public static String nodeNameRoom1318FloorOne = "room1318FloorOne";
    final public static ArrayList<String> descriptionRoom1318FloorOne = new ArrayList<>(Arrays.asList(
            "womens bathroom 1",
            "womens's bathroom 1",
            "bathroom 1",
            "womens restroom 1",
            "women's restroom 1",
            "restroom 1",
            "ladies room 1"
    ));
    final public static String nodeNameRoomS12FloorOne = "roomS12FloorOne";
    final public static ArrayList<String> descriptionRoomS12FloorOne = new ArrayList<>(Arrays.asList(
            "same day surgery 1",
            "same day holding 1",
            "same day prep 1",
            "same day recovery 1",
            "same day 1",
            "S12"
    ));

    final public static String nodeNameRoomReceptionFloorOne = "roomReceptionFloorOne";
    final public static ArrayList<String> descriptionRoomReceptionFloorOne = new ArrayList<>(Arrays.asList(
            "reception",
            "reception desk",
            "information desk"
    ));

    final public static String nodeNameRoom1398FloorOne = "room1398FloorOne";
    final public static ArrayList<String> descriptionRoom1398FloorOne = new ArrayList<>(Arrays.asList(
            "chapel",
            "1398"
    ));

    final public static String nodeNameRoom1211FloorOne = "room1211FloorOne";
    final public static ArrayList<String> descriptionRoom1211FloorOne = new ArrayList<>(Arrays.asList(
            "parent",
            "parent lounge",
            "1211"
    ));

    final public static String nodeNameRoom1214FloorOne = "room1214FloorOne";
    final public static ArrayList<String> descriptionRoom1214FloorOne = new ArrayList<>(Arrays.asList(
            "mens bathroom ",
            "men's bathroom ",
            "bathroom",
            "mens restroom",
            "men's restroom",
            "restroom"
    ));

    final public static String nodeNameRoom1215FloorOne = "room1215FloorOne";
    final public static ArrayList<String> descriptionRoom1215FloorOne = new ArrayList<>(Arrays.asList(
            "womens bathroom",
            "womens's bathroom",
            "bathroom",
            "womens restroom",
            "women's restroom",
            "restroom"
    ));

    final public static String nodeNameRoom1607FloorOne = "room1607FloorOne";
    final public static ArrayList<String> descriptionRoom1607FloorOne = new ArrayList<>(Arrays.asList(
            "ICU",
            "ICU waiting",
            "ICU waiting area",
            "ICU waiting room",
            "CCU",
            "CCU waiting",
            "CCU waiting area",
            "CCU waiting room",
            "1607"
    ));

    final public static String nodeNameRoom1730AFloorOne = "room1730AFloorOne";
    final public static ArrayList<String> descriptionRoom1730AFloorOne = new ArrayList<>(Arrays.asList(
            "radiation oncology"
    ));

    //floorTwo
    final public static String nodeNameRoom2350AFloorTwo = "room2350AFloorTwo";
    final public static ArrayList<String> descriptionRoom2350AFloorTwo = new ArrayList<>(Arrays.asList(
            "phones",
            "phone"
    ));

    //floorThree
    final public static String nodeNameRoom3301DFloorThree = "room3301DFloorThree";
    final public static ArrayList<String> descriptionRoom3301DFloorThree = new ArrayList<>(Arrays.asList(
            "restroom 3",
            "bathroom 3"
    ));

    //floorFour
    final public static String nodeNameRoom4235FloorFour = "room4235FloorFour";
    final public static ArrayList<String> descriptionRoom4235FloorFour = new ArrayList<>(Arrays.asList(
            "restroom 4",
            "bathroom 4"
    ));

    //ground floor rooms
    final public static String nodeNameRoomG106FloorGround = "roomG106FloorGround";
    final public static ArrayList<String> descriptionRoomG106FloorGround = new ArrayList<>(Arrays.asList(
            "bathroom 0",
            "restroom 0"
    ));
    final public static ArrayList<String> IPG106FloorGround = new ArrayList<>(Arrays.asList(
            "10.21.222.18",
            "10.21.222.8"
     ));
    

    final public static String nodeNameParkingValidationFloorGround = "parkingValidationFloorGround";
    final public static ArrayList<String> descriptionParkingValidationFloorGround = new ArrayList<>(Arrays.asList(
            "parking",
            "validation",
            "parking validation"
    ));

    final public static String nodeNameRoomG453FloorGround = "roomG453FloorGround";
    final public static ArrayList<String> descriptionRoomG453FloorGround = new ArrayList<>(Arrays.asList(
            "records",
            "medical records",
            "G453"
    ));

    final public static String nodeNameRoomG309BFloorGround = "roomG309BFloorGround";
    final public static ArrayList<String> descriptionRoomG309BFloorGround = new ArrayList<>(Arrays.asList(
            "outpatient lab",
            "G309B"
    ));

    final public static String nodeNameRoomG336FloorGround = "roomG336FloorGround";
    final public static ArrayList<String> descriptionRoomG336FloorGround = new ArrayList<>(Arrays.asList(
            "clinical lab",
            "G336"
    ));

    final public static String nodeNameRoomG230NorthFloorGround = "roomG320NorthFloorGround";
    final public static ArrayList<String> descriptionRoomG230NorthFloorGround = new ArrayList<>(Arrays.asList(
            "cafeteria, north exit",
            "food",
            "cafe",
            "G320"
    ));
        final public static ArrayList<String> IProomG230NorthFloorGround = new ArrayList<>(Arrays.asList(
            "10.21.221.237",
            "10.21.221.236",
            "10.21.221.232",
            "10.21.221.246",
            "10.21.221.235",
            "10.21.221.248"
            
            ));


    final public static String nodeNameRoomG230SouthFloorGround = "roomG320SouthFloorGround";
    final public static ArrayList<String> descriptionRoomG230SouthFloorGround = new ArrayList<>(Arrays.asList(
            "cafeteria, south exit",
            "food",
            "cafe",
            "G320"
    ));
    final public static ArrayList<String> IProomG230SouthFloorGround = new ArrayList<>(Arrays.asList(
            "10.21.221.237",
            "10.21.221.236",
            "10.21.221.232",
            "10.21.221.246",
            "10.21.221.235",
            "10.21.221.248"
            
            ));

    final public static String nodeNameRoomE00C6FloorGround = "roomE00C6FloorGround";
    final public static ArrayList<String> descriptionRoomE00C6FloorGround = new ArrayList<>(Arrays.asList(
            "burn",
            "burn outpatient",
            "E00C6"
    ));

    final public static String nodeNameRoomE00C7FloorGround = "roomE00C7FloorGround";
    final public static ArrayList<String> descriptionRoomE00C7FloorGround = new ArrayList<>(Arrays.asList(
            "pediatric",
            "pediatric outpatient",
            "E00C7"
    ));

    final public static String nodeNameRoomG03EastWingFloorGround = "roomG03EastWingFloorGround";
    final public static ArrayList<String> descriptionRoomG03EastWingFloorGround = new ArrayList<>(Arrays.asList(
            "Apnea Center",
            "Vangvanichyakorn",
            "Barnabas Heatlh Retail Pharmacy",
            "Craniofacial center",
            "High risk infant follow up",
            "New Jersey Blood Center",
            "Pediatric Health Center",
            "Glick",
            "Liptsyn",
            "center for wound and burn healing",
            "Chase ATM"
    ));

    //EastWingFloorOne
    final public static String nodeNameRoom144EastWingFloorOne = "room144EastWingFloorOne";
    final public static ArrayList<String> descriptionRoom144EastWingFloorOne = new ArrayList<>(Arrays.asList(
            "Department of Cardiothoracic surgery",
            "Camacho",
            "Karanam",
            "Russo",
            "sandari",
            "Saunders",
            "Heart Failure Management Program",
            "Zucker",
            "Jaqua Cardiac/Pulmonary Rehabilitation Center"
    ));

    final public static String nodeNameRoom121EastWingFloorOne = "room121EastWingFloorOne";
    final public static ArrayList<String> descriptionRoom121EastWingFloorOne = new ArrayList<>(Arrays.asList(
            "Neonatology",
            "Sun"
    ));
    final public static ArrayList<String> IP121 = new ArrayList<>(Arrays.asList(
            "10.21.221.194",
            "10.21.221.197",
            "10.21.221.196",
            "10.21.223.157",
            "10.21.221.195",
            "10.21.221.199",
            "10.21.221.200"
    ));
    final public static String nodeNameRoom117EastWingFloorOne = "room117EastWingFloorOne";
    final public static ArrayList<String> descriptionRoom117EastWingFloorOne = new ArrayList<>(Arrays.asList(
            "Saint Barnabas OBGYN Health Center",
            "The Fibroid center"
    ));
    final public static ArrayList<String> IProom117EastWingFloorOne = new ArrayList<>(Arrays.asList(
            "10.21.221.194",
            "10.21.221.197",
            "10.21.221.196",
            "10.21.223.157",
            "10.21.221.195",
            "10.21.221.199",
            "10.21.221.200"
    ));
    //EastWingFloorTwo
    final public static String nodeNameRoom201EastWingFloorTwo = "room201EastWingFloorTwo";
    final public static ArrayList<String> descriptionRoom201EastWingFloorTwo = new ArrayList<>(Arrays.asList(
            "Cancer Center",
            "Brown",
            "Conde",
            "Grossman",
            "Leitner",
            "Lipari",
            "Litvak",
            "Radovich",
            "Scoppetuolo",
            "Wagmiller"
    ));

    final public static String nodeNameRoom244EastWingFloorTwo = "room244EastWingFloorTwo";
    final public static ArrayList<String> descriptionRoom244EastWingFloorTwo = new ArrayList<>(Arrays.asList(
            "Infusion Center"
    ));

    //EastWingFloorThree
    final public static String nodeNameRoom302EastWingFloorThree = "room302EastWingFloorThree";
    final public static ArrayList<String> descriptionRoom302EastWingFloorThree = new ArrayList<>(Arrays.asList(
            "Associates in Transplant and General Surgery",
            "Aitchison"
    ));

    final public static String nodeNameRoom306EastWingFloorThree = "room306EastWingFloorThree";
    final public static ArrayList<String> descriptionRoom306EastWingFloorThree = new ArrayList<>(Arrays.asList(
            "Associates in Transplant Medicine",
            "Dhillon",
            "Goldberg",
            "Kandula",
            "Luan",
            "Patel",
            "Tibaldi",
            "Weng",
            "Pre Transplant Department",
            "Mulgaonkar"
    ));

    final public static String nodeNameRoom332EastWingFloorThree = "room332EastWingFloorThree";
    final public static ArrayList<String> descriptionRoom332EastWingFloorThree = new ArrayList<>(Arrays.asList(
            "Living Donor Institute"
    ));

    final public static String nodeNameRoom303EastWingFloorThree = "room303EastWingFloorThree";
    final public static ArrayList<String> descriptionRoom303EastWingFloorThree = new ArrayList<>(Arrays.asList(
            "Transplant Administration"
    ));

    final public static String nodeNameRoom305EastWingFloorThree = "room305EastWingFloorThree";
    final public static ArrayList<String> descriptionRoom305EastWingFloorThree = new ArrayList<>(Arrays.asList(
            "Transplant Clinic"
    ));

    final public static String nodeNameRoom307EastWingFloorThree = "room307EastWingFloorThree";
    final public static ArrayList<String> descriptionRoom307EastWingFloorThree = new ArrayList<>(Arrays.asList(
            "Transplant Research"
    ));

    final public static String nodeNameRoom308EastWingFloorThree = "room308EastWingFloorThree";
    final public static ArrayList<String> descriptionRoom308EastWingFloorThree = new ArrayList<>(Arrays.asList(
            "Transplant Short Stay"
    ));

    //EastWingFloorFour
    final public static String nodeNameRoom403EastWingFloorFour = "room403EastWingFloorFour";
    final public static ArrayList<String> descriptionRoom403EastWingFloorFour = new ArrayList<>(Arrays.asList(
            "Institute for Reproductive Medicine and Science",
            "Cekleniak",
            "Chen",
            "Garrisi",
            "Hessler",
            "Keegen",
            "Pascale",
            "Thompson"
    ));

    final public static String nodeNameRoom402EastWingFloorFour = "room402EastWingFloorFour";
    final public static ArrayList<String> descriptionRoom402EastWingFloorFour = new ArrayList<>(Arrays.asList(
            "DziadosZ",
            "Kasdaglis",
            "Miller",
            "O'Brien",
            "Pelaez",
            "Smith",
            "Terrone",
            "Warren",
            "Wolf"
    ));

    //ListOfRooms!! Alphabetical!!
    final public static ArrayList<Node> listOfRooms = new ArrayList<>(Arrays.asList(//groundFloorParkingValidation
            new Node(nodeNameParkingValidationFloorGround, descriptionParkingValidationFloorGround, new Edge[]{
        new Edge(44.291, nodeNameHallwayFloorGroundA, 0, Keys.directions_facingAwayFromPV + "t" + Keys.directions_turnLeft.substring(1)),
        new Edge(40.912, nodeNameElevatorFloorGround, 1, Keys.directions_facingAwayFromPV + "t" + Keys.directions_turnRight.substring(1) + ". Walk straight and " + "e" + Keys.directions_enterTheFirstClusterOfElevators.substring(1)),
        new Edge(112.693, nodeNameHallwayFloorGroundB, 2, Keys.directions_facingAwayFromPV + "t" + Keys.directions_turnRight.substring(1) + "." + Keys.directions_passTheElevatorsUntilEndOfHallway + Keys.directions_followTheHallway)
    }),
            //EastWingFloorOne 117
            new Node(nodeNameRoom117EastWingFloorOne, descriptionRoom117EastWingFloorOne, new Edge[]{
        new Edge(18.00, nodeNameElevatorEastWingFloorOne, 0)
    }),
            //floorOneParentLounge
            new Node(nodeNameRoom1211FloorOne, descriptionRoom1211FloorOne, new Edge[]{
        new Edge(4.708, nodeNameHallwayFloorOneD, 0),
        new Edge(5.991, nodeNameHallwayFloorOneE, 1)
    }),
            //floorOneMensRestroom
            new Node(nodeNameRoom1214FloorOne, descriptionRoom1214FloorOne, new Edge[]{
        new Edge(7.594, nodeNameHallwayFloorOneD, 0),
        new Edge(3.254, nodeNameHallwayFloorOneE, 1)
    }),
            //floorOneWomensRestroom
            new Node(nodeNameRoom1215FloorOne, descriptionRoom1215FloorOne, new Edge[]{
        new Edge(8.569, nodeNameHallwayFloorOneD, 0),
        new Edge(2.190, nodeNameHallwayFloorOneE, 1)
    }),
            //EastWingFloorOneRoom121
            new Node(nodeNameRoom121EastWingFloorOne, descriptionRoom121EastWingFloorOne, new Edge[]{
        new Edge(18.905, nodeNameElevatorEastWingFloorOne, 0)
    }),
            //floorOneWomensRestroom
            new Node(nodeNameRoom1318FloorOne, descriptionRoom1318FloorOne, new Edge[]{
        new Edge(11.753, nodeNameHallwayFloorOneA, 0),
        new Edge(10.504, nodeNameHallwayFloorOneB, 1),
        new Edge(0.461, nodeNameElevatorFloorOne, 2)
    }),
            //floorOneMensRestroom
            new Node(nodeNameRoom1319FloorOne, descriptionRoom1319FloorOne, new Edge[]{
        new Edge(8.760, nodeNameHallwayFloorOneA, 0),
        new Edge(12.830, nodeNameHallwayFloorOneB, 1),
        new Edge(1.832, nodeNameElevatorFloorOne, 2)
    }),
            //floorOneSameDayWaitingArea
            new Node(nodeNameRoom1323FloorOne, descriptionRoom1323FloorOne, new Edge[]{
        new Edge(3.020, nodeNameHallwayFloorOneA, 0),
        new Edge(19.226, nodeNameHallwayFloorOneB, 1),
        new Edge(7.880, nodeNameElevatorFloorOne, 2)
    }),
            //floorOneChapel
            new Node(nodeNameRoom1398FloorOne, descriptionRoom1398FloorOne, new Edge[]{
        new Edge(8.180, nodeNameHallwayFloorOneG, 0)
    }),
            //EastWingFloorOneRoom144
            new Node(nodeNameRoom144EastWingFloorOne, descriptionRoom144EastWingFloorOne, new Edge[]{
        new Edge(5.908, nodeNameElevatorEastWingFloorOne, 0)
    }),
            //floorOneICUWaiting
            new Node(nodeNameRoom1607FloorOne, descriptionRoom1607FloorOne, new Edge[]{
        new Edge(1.725, nodeNameHallwayFloorOneE, 1)
    }),
            //floorOneRadiation
            new Node(nodeNameRoom1730AFloorOne, descriptionRoom1730AFloorOne, new Edge[]{
        new Edge(19.059, nodeNameHallwayFloorOneF, 0)
    }),
            //EastWingFloorTwo 201
            new Node(nodeNameRoom201EastWingFloorTwo, descriptionRoom201EastWingFloorTwo, new Edge[]{
        new Edge(9.150, nodeNameElevatorEastWingFloorTwo, 0)
    }),
            //floorTwoPhones
            new Node(nodeNameRoom2350AFloorTwo, descriptionRoom2350AFloorTwo, new Edge[]{
        new Edge(9.679, nodeNameElevatorFloorTwo, 0),
        new Edge(9.581, nodeNameHallwayFloorTwoA, 1)
    }),
            //EastWingFloorTwo 244
            new Node(nodeNameRoom244EastWingFloorTwo, descriptionRoom244EastWingFloorTwo, new Edge[]{
        new Edge(10.765, nodeNameElevatorEastWingFloorTwo, 0)
    }),
            //EastWingFloorThree 302
            new Node(nodeNameRoom302EastWingFloorThree, descriptionRoom302EastWingFloorThree, new Edge[]{
        new Edge(36.983, nodeNameElevatorEastWingFloorThree, 0)
    }),
            //EastWingFloorThree 306
            new Node(nodeNameRoom306EastWingFloorThree, descriptionRoom306EastWingFloorThree, new Edge[]{
        new Edge(68.945, nodeNameElevatorEastWingFloorThree, 0)
    }),
            //EastWingFloorThree 307
            new Node(nodeNameRoom307EastWingFloorThree, descriptionRoom307EastWingFloorThree, new Edge[]{
        new Edge(69.945, nodeNameElevatorEastWingFloorThree, 0)
    }),
            //EastwingFloorThree 308
            new Node(nodeNameRoom308EastWingFloorThree, descriptionRoom308EastWingFloorThree, new Edge[]{
        new Edge(69.00, nodeNameElevatorEastWingFloorThree, 0)
    }),
            //floorThreeRestroom
            new Node(nodeNameRoom3301DFloorThree, descriptionRoom3301DFloorThree, new Edge[]{
        new Edge(5.543, nodeNameElevatorFloorThree, 0),
        new Edge(22.173, nodeNameHallwayFloorThreeE, 1)
    }),
            //EastWingFloorThree 332
            new Node(nodeNameRoom332EastWingFloorThree, descriptionRoom332EastWingFloorThree, new Edge[]{
        new Edge(225.769, nodeNameElevatorEastWingFloorThree, 0)
    }),
            //EastWingFloorFour 402
            new Node(nodeNameRoom402EastWingFloorFour, descriptionRoom402EastWingFloorFour, new Edge[]{
        new Edge(69.698, nodeNameElevatorEastWingFloorFour, 0)
    }),
            //EastWingFloorFour 403
            new Node(nodeNameRoom403EastWingFloorFour, descriptionRoom403EastWingFloorFour, new Edge[]{
        new Edge(92.583, nodeNameElevatorEastWingFloorFour, 0)
    }),
            //floor fourroom 4102 patient room
            new Node(nodeNameRoom4102FloorFour, new Edge[]{
        new Edge(56.805, nodeNameHallwayFloorFourB1, 0, Keys.directions_turnLeft),
        new Edge(32.746, nodeNameHallwayFloorFourA, 1, Keys.directions_turnRight)
    },IPFloorFourRoom4102),
            //floor fourroom 4103 patient room
            new Node(nodeNameRoom4103FloorFour, new Edge[]{
        new Edge(36.648, nodeNameHallwayFloorFourB1, 0, Keys.directions_turnLeft),
        new Edge(52.903, nodeNameHallwayFloorFourA, 1, Keys.directions_turnRight)
    },IPFloorFourRoom4103),
            //floor fourroom 4104 patient room
            new Node(nodeNameRoom4104FloorFour, new Edge[]{
        new Edge(18.549, nodeNameHallwayFloorFourB1, 0, Keys.directions_turnLeft),
        new Edge(71.002, nodeNameHallwayFloorFourA, 1, Keys.directions_turnRight)
    },IPFloorFourRoom4104),
            //floor fourroom 4105 patient room
            new Node(nodeNameRoom4105FloorFour, new Edge[]{
        new Edge(9.141, nodeNameHallwayFloorFourB1, 0, Keys.directions_turnLeft),
        new Edge(80.410, nodeNameHallwayFloorFourA, 1, Keys.directions_turnRight)
    },IPFloorFourRoom4105),
            //floor fourroom 4106 patient room
            new Node(nodeNameRoom4106FloorFour, new Edge[]{
        new Edge(14.085, nodeNameHallwayFloorFourB1, 0, Keys.directions_turnRight),
        new Edge(86.1, nodeNameHallwayFloorFourC1, 1, Keys.directions_turnLeft)
    },IPFloorFourRoom4106),
            //floor fourroom 4107 patient room
            new Node(nodeNameRoom4107FloorFour, new Edge[]{
        new Edge(71.335, nodeNameHallwayFloorFourC1, 0, Keys.directions_turnLeft),
        new Edge(20.113, nodeNameHallwayFloorFourB1, 1, Keys.directions_turnRight)
    },IPFloorFourRoom4107),
            //floor fourroom 4108 patient room
            new Node(nodeNameRoom4108FloorFour, new Edge[]{
        new Edge(50, nodeNameHallwayFloorFourC1, 0, Keys.directions_turnLeft),
        new Edge(40, nodeNameHallwayFloorFourB1, 1, Keys.directions_turnRight)
    },IPFloorFourRoom4108),
            //floor fourroom 4109 patient room
            new Node(nodeNameRoom4109FloorFour, new Edge[]{
        new Edge(44.578, nodeNameHallwayFloorFourC1, 0, Keys.directions_turnLeft),
        new Edge(47.842, nodeNameHallwayFloorFourB1, 1, Keys.directions_turnRight)
    },IPFloorFourRoom4109),
            //floor fourroom 4110 patient room
            new Node(nodeNameRoom4110FloorFour, new Edge[]{
        new Edge(35.98, nodeNameHallwayFloorFourC1, 0, Keys.directions_turnLeft),
        new Edge(69.075, nodeNameHallwayFloorFourB1, 1, Keys.directions_turnRight)
    },IPFloorFourRoom4110),
            //floor fourroom 4130 patient room
            new Node(nodeNameRoom4130FloorFour, new Edge[]{
        new Edge(18.275, nodeNameHallwayFloorFourC2, 0, Keys.directions_turnRight),
        new Edge(80.901, nodeNameHallwayFloorFourB2, 1, Keys.directions_turnLeft)
    },IPFloorFourRoom4130),
            //floor fourroom 4131 patient room
            new Node(nodeNameRoom4131FloorFour, new Edge[]{
        new Edge(35.98, nodeNameHallwayFloorFourC2, 0, Keys.directions_turnRight),
        new Edge(69.075, nodeNameHallwayFloorFourB2, 1, Keys.directions_turnLeft)
    },IPFloorFourRoom4131),
            //floor fourroom 4132 patient room
            new Node(nodeNameRoom4132FloorFour, new Edge[]{
        new Edge(44.578, nodeNameHallwayFloorFourC2, 0, Keys.directions_turnRight),
        new Edge(47.842, nodeNameHallwayFloorFourB2, 1, Keys.directions_turnLeft)
    },IPFloorFourRoom4132),
            //floor fourroom 4133 patient room
            new Node(nodeNameRoom4133FloorFour, new Edge[]{
        new Edge(50, nodeNameHallwayFloorFourC2, 0, Keys.directions_turnRight),
        new Edge(40, nodeNameHallwayFloorFourB2, 1, Keys.directions_turnLeft)
    },IPFloorFourRoom4133),
            //floor fourroom 4134 patient room
            new Node(nodeNameRoom4134FloorFour, new Edge[]{
        new Edge(71.335, nodeNameHallwayFloorFourC2, 0, Keys.directions_turnRight),
        new Edge(20.113, nodeNameHallwayFloorFourB2, 1, Keys.directions_turnLeft)
    },IPFloorFourRoom4134),
            //floor fourroom 4135 patient room
            new Node(nodeNameRoom4135FloorFour, new Edge[]{
        new Edge(14.085, nodeNameHallwayFloorFourB2, 0, Keys.directions_turnLeft),
        new Edge(86.1, nodeNameHallwayFloorFourC2, 1, Keys.directions_turnRight)
    },IPFloorFourRoom4135),
            //floor fourroom 4136 patient room
            new Node(nodeNameRoom4105FloorFour, new Edge[]{
        new Edge(9.141, nodeNameHallwayFloorFourB2, 0, Keys.directions_turnRight),
        new Edge(80.410, nodeNameHallwayFloorFourA, 1, Keys.directions_turnLeft)
    },IPFloorFourRoom4136),
            //floor fourroom 4137 patient room
            new Node(nodeNameRoom4104FloorFour, new Edge[]{
        new Edge(18.549, nodeNameHallwayFloorFourB2, 0, Keys.directions_turnRight),
        new Edge(71.002, nodeNameHallwayFloorFourA, 1, Keys.directions_turnLeft)
    },IPFloorFourRoom4137),
            //floor fourroom 4138 patient room
            new Node(nodeNameRoom4138FloorFour, new Edge[]{
        new Edge(36.648, nodeNameHallwayFloorFourB2, 0, Keys.directions_turnRight),
        new Edge(52.903, nodeNameHallwayFloorFourA, 1, Keys.directions_turnLeft)
    },IPFloorFourRoom4138),
            //floor fourroom 4139 patient room
            new Node(nodeNameRoom4102FloorFour, new Edge[]{
        new Edge(56.805, nodeNameHallwayFloorFourB2, 0, Keys.directions_turnRight),
        new Edge(32.746, nodeNameHallwayFloorFourA, 1, Keys.directions_turnLeft)
    },IPFloorFourRoom4139),
            //floorFourRestroom
            new Node(nodeNameRoom4235FloorFour, descriptionRoom4235FloorFour, new Edge[]{
        new Edge(12.719, nodeNameElevatorFloorFour, 0),
        new Edge(12.618, nodeNameDeskFloorFour, 1)
    }),
            

//floor four room 4712, patient room
new Node(nodeNameRoom4712FloorFour, new Edge[]{
        new Edge(23.921, nodeNameHallwayFloorFourC1, 0, Keys.directions_turnRight),
        new Edge(38.225, nodeNameHallwayFloorFourD1, 1, Keys.directions_turnLeft)
    },IPFloorFourRoom4712),



//floor four room 4714, patient room
new Node(nodeNameRoom4714FloorFour, new Edge[]{
        new Edge(45, nodeNameHallwayFloorFourC1, 0, Keys.directions_turnRight),
        new Edge(16, nodeNameHallwayFloorFourD1, 1, Keys.directions_turnLeft)
    },IPFloorFourRoom4714),


//floor four room 4715, patient room
new Node(nodeNameRoom4715FloorFour, new Edge[]{
        new Edge(51, nodeNameHallwayFloorFourC1, 0, Keys.directions_turnRight),
        new Edge(10, nodeNameHallwayFloorFourD1, 1, Keys.directions_turnLeft)
    },IPFloorFourRoom4715),


//floor four room 4717, patient room
new Node(nodeNameRoom4717FloorFour, new Edge[]{
        new Edge(12.596, nodeNameHallwayFloorFourD1, 0, Keys.directions_turnRight),
        new Edge(17.067, nodeNameHallwayFloorFourE1, 1, Keys.directions_turnLeft)
    },IPFloorFourRoom4717),
//floor four room 4718, patient room
new Node(nodeNameRoom4718FloorFour, new Edge[]{
        new Edge(18, nodeNameHallwayFloorFourD1, 0, Keys.directions_turnRight),
        new Edge(12, nodeNameHallwayFloorFourE1, 1, Keys.directions_turnLeft)
    },IPFloorFourRoom4718),
//floor four room 4719, patient room
new Node(nodeNameRoom4719FloorFour, new Edge[]{
        new Edge(3, nodeNameHallwayFloorFourE1, 0, Keys.directions_exitTheRoom)
    },IPFloorFourRoom4719),
//floor four room 4720, patient room
new Node(nodeNameRoom4719FloorFour, new Edge[]{
        new Edge(3, nodeNameHallwayFloorFourE2, 0, Keys.directions_exitTheRoom)
    },IPFloorFourRoom4720),

//floor four room 4721, patient room
new Node(nodeNameRoom4721FloorFour, new Edge[]{
        new Edge(18, nodeNameHallwayFloorFourD2, 0, Keys.directions_turnLeft),
        new Edge(12, nodeNameHallwayFloorFourE2, 1, Keys.directions_turnRight)
    },IPFloorFourRoom4721),

//floor four room 4722, patient room
new Node(nodeNameRoom4717FloorFour, new Edge[]{
        new Edge(12.596, nodeNameHallwayFloorFourD2, 0, Keys.directions_turnLeft),
        new Edge(17.067, nodeNameHallwayFloorFourE2, 1, Keys.directions_turnRight)
    },IPFloorFourRoom4722),




//floor four room 4723, patient room
new Node(nodeNameRoom4723FloorFour, new Edge[]{
        new Edge(1, nodeNameHallwayFloorFourD2, 0, Keys.directions_exitTheRoom)
    },IPFloorFourRoom4723),

//floor four room 4724, patient room
new Node(nodeNameRoom4724FloorFour, new Edge[]{
        new Edge(51, nodeNameHallwayFloorFourC2, 0, Keys.directions_turnLeft),
        new Edge(10, nodeNameHallwayFloorFourD2, 1, Keys.directions_turnRight)
    },IPFloorFourRoom4724),
//floor four room 4725, patient room
new Node(nodeNameRoom4725FloorFour, new Edge[]{
        new Edge(45, nodeNameHallwayFloorFourC2, 0, Keys.directions_turnLeft),
        new Edge(16, nodeNameHallwayFloorFourD2, 1, Keys.directions_turnRight)
    },IPFloorFourRoom4725),
//floor four room 4726, patient room
new Node(nodeNameRoom4726FloorFour, new Edge[]{
        new Edge(23.921, nodeNameHallwayFloorFourC2, 0, Keys.directions_turnLeft),
        new Edge(38.225, nodeNameHallwayFloorFourD2, 1, Keys.directions_turnRight)
    },IPFloorFourRoom4726),

//floor four room 4727, patient room
new Node(nodeNameRoom4727FloorFour, new Edge[]{
        new Edge(12.3, nodeNameHallwayFloorFourC2, 0, Keys.directions_turnLeft),
        new Edge(49.1, nodeNameHallwayFloorFourD2, 1, Keys.directions_turnRight)
    },IPFloorFourRoom4727),

//floor four room 4728, patient room
new Node(nodeNameRoom4728FloorFour, new Edge[]{
        new Edge(1, nodeNameHallwayFloorFourC2, 0, Keys.directions_exitTheRoom),
    },IPFloorFourRoom4728),

            //groundFloorBurnOutpatient
            new Node(nodeNameRoomE00C6FloorGround, descriptionRoomE00C6FloorGround, new Edge[]{
        new Edge(22.543, nodeNameHallwayFloorGroundB, 0, Keys.directions_exitBurnOutpatient + "t" + Keys.directions_turnRight.substring(1) + Keys.directions_followTheLongHallway),
        new Edge(355.749, nodeNameHallwayEastWingFloorGround, 1, Keys.directions_exitBurnOutpatient + "p" + Keys.directions_proceedStraight)
    }),
            //groundFloorPedriaticOutpatient
            new Node(nodeNameRoomE00C7FloorGround, descriptionRoomE00C7FloorGround, new Edge[]{
        new Edge(266.703, nodeNameHallwayFloorGroundB, 0, Keys.directions_exitPediatricOutpatient + "t" + Keys.directions_turnRight.substring(1) + Keys.directions_followTheLongHallway),
        new Edge(99.181, nodeNameHallwayEastWingFloorGround, 1, Keys.directions_exitPediatricOutpatient + "t" + Keys.directions_turnLeft.substring(1) + Keys.directions_followTheHallway)
    }),
            //groundFloorRestroom
            new Node(nodeNameRoomG106FloorGround, descriptionRoomG106FloorGround, new Edge[]{
        new Edge(109.818, nodeNameHallwayFloorGroundA, 0, Keys.directions_exitRestroom + "t" + Keys.directions_turnRight.substring(1) + Keys.directions_passTheElevatorsUntilFrontDoors),
        new Edge(30.576, nodeNameElevatorFloorGround, 1, Keys.directions_exitRestroom + "t" + Keys.directions_turnRight.substring(1)),
        new Edge(47.168, nodeNameHallwayFloorGroundB, 2, Keys.directions_exitRestroom + "t" + Keys.directions_turnLeft.substring(1) + Keys.directions_passTheElevatorsUntilEndOfHallway)
    }),
            //groundFloorCafeteria
            new Node(nodeNameRoomG230NorthFloorGround, descriptionRoomG230NorthFloorGround, new Edge[]{
        new Edge(186.263, nodeNameHallwayFloorGroundB, 0, Keys.directions_exitCafeteria + "t" + Keys.directions_turnLeft.substring(1) + Keys.directions_followTheLongHallway),
        new Edge(208.004, nodeNameHallwayEastWingFloorGround, 1, Keys.directions_exitCafeteria + "t" + Keys.directions_turnRight.substring(1) + Keys.directions_followTheHallway)
    }),
            new Node(nodeNameRoomG230SouthFloorGround, descriptionRoomG230SouthFloorGround, new Edge[]{
        new Edge(146.263, nodeNameHallwayFloorGroundA, 0),
        new Edge(208.004, nodeNameHallwayEastWingFloorGround, 1)
    }),
            //groundFloorOutpatientLab
            new Node(nodeNameRoomG309BFloorGround, descriptionRoomG309BFloorGround, new Edge[]{
        new Edge(70.678, nodeNameHallwayFloorGroundC, 0, Keys.directions_exittheOutpatientLabAndTurnLeftAndContinueStraight)
    }),
            //groundFloorClinicalLab
            new Node(nodeNameRoomG336FloorGround, descriptionRoomG336FloorGround, new Edge[]{
        new Edge(238.684, nodeNameHallwayFloorGroundC, 0, Keys.directions_exitClinicalLabAndTurnLeftAndFollowHallwayUntilIntersection)
    }),
            //groundFloorMedicalRecords
            new Node(nodeNameRoomG453FloorGround, descriptionRoomG453FloorGround, new Edge[]{
        new Edge(30.644, nodeNameHallwayFloorGroundC, 0, Keys.directions_exitMedicalRecordsAndTurnLeftAndContinueStraight)
    }),
            //floorOneReception
            new Node(nodeNameRoomReceptionFloorOne, descriptionRoomReceptionFloorOne, new Edge[]{
        new Edge(5.403, nodeNameHallwayFloorOneA, 0),
        new Edge(12.830, nodeNameHallwayFloorOneB, 1),
        new Edge(16.842, nodeNameElevatorFloorOne, 2)
    }),
            //floorOneSameDayPrep,Holding,Recovery
            new Node(nodeNameRoomS12FloorOne, descriptionRoomS12FloorOne, new Edge[]{
        new Edge(3.613, nodeNameHallwayFloorOneA, 0),
        new Edge(19.166, nodeNameHallwayFloorOneB, 1),
        new Edge(1.615, nodeNameElevatorFloorOne, 2)
    })
    ));

    public static ArrayList<Node> add(ArrayList<Node> myList, Node addThis) {

        String addThisName = addThis.getName();
        for (int index = 0; index < myList.size(); index++) {

            String nodeInMyListName = myList.get(index).getName();

            if ((addThisName.compareToIgnoreCase(nodeInMyListName)) < 0) {
                myList.add(index, addThis);
                return myList;
            }
        }

        myList.add(addThis);
        return myList;
    }

}
