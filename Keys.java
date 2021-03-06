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
                            return Keys.directions_exitTheReceptionArea+" and t" +Keys.directions_turnRight.substring(1)+". "+Keys.directions_continueStraightPassingByAClusterOfElevatorsTheElevatorsAreUpAheadNextToTheWindows;
                        } else if (preNode.equals(Keys.nodeNameHallwayFloorTwoE)) {
                            //contiue striaght, pass the elevators, take the leftmost door.
                            return Keys.directions_continueStraightPassingByAClusterOfElevatorsTheElevatorsAreUpAheadNextToTheWindows;
                        }
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
                        if (preNode.equals(Keys.nodeNameHallwayFloorTwoF1)) {                      
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
                            return "Error: This should never happen. You done made a boo boo."; //more efficient to go F3--> F1 than all the way around
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
                 if (node.equals(Keys.nodeNameHallwayFloorThreeA)) {
                    if (postNode.equals(Keys.nodeNameHallwayFloorThreeE)) {
                        if (preNode.equals(Keys.nodeNameHallwayFloorThreeB)) {
                            return Keys.directions_turnRight+". "+Keys.directions_continueStraight+" and g"+Keys.directions_goThroughDoorway.substring(1)+". "+Keys.directions_turnRight+". "+Keys.directions_continueStraight;
                        } else if (preNode.equals(Keys.nodeNameHallwayFloorThreeC1)) {
                            return Keys.directions_continueStraight+". "+Keys.directions_goThroughDoorway+". "+Keys.directions_turnRight+". "+Keys.directions_continueStraight;
                        }
                    } else if (postNode.equals(Keys.nodeNameHallwayFloorThreeB)) {
                        if (preNode.equals(Keys.nodeNameHallwayFloorThreeE)) {
                            return Keys.directions_turnLeft;
                        } else if (preNode.equals(Keys.nodeNameHallwayFloorThreeC1)) {
                            return Keys.directions_turnRight;
                        }
                    } else if (postNode.equals(Keys.nodeNameHallwayFloorThreeC1)) {
                        if (preNode.equals(Keys.nodeNameHallwayFloorThreeB)) {
                            return Keys.directions_turnLeft+" and c" +Keys.directions_continueStraight.substring(1)+". "+Keys.directions_makeALeftAtTheEndOfTheHallway+". "+Keys.directions_makeARightAtTheFirstIntersection+" and c" +Keys.directions_continueStraight.substring(1)+Keys.directions_makeARightAtTheNextIntersection;
                        } else if (preNode.equals(Keys.nodeNameHallwayFloorThreeE)) {
                            return Keys.directions_continueStraight+". "+Keys.directions_makeALeftAtTheEndOfTheHallway+". "+Keys.directions_makeARightAtTheFirstIntersection+" and c" +Keys.directions_continueStraight.substring(1)+Keys.directions_makeARightAtTheNextIntersection;
                        }
                    }
                }
                
                //node B = no hard code logic b/c it only goes to A and other rooms? 
                if(node.equals(Keys.nodeNameHallwayFloorThreeC1)){
                    if(postNode.equals(Keys.nodeNameHallwayFloorThreeA)){
                        if(preNode.equals(Keys.nodeNameHallwayFloorThreeC2)){
                            return Keys.directions_turnRight+". "+Keys.directions_continueStraight+" and m"+Keys.directions_makeARightAtTheEndOfTheHallway+" and c" +Keys.directions_continueStraight.substring(1)+". "+Keys.directions_makeALeftAtTheFirstIntersection+" and c"+Keys.directions_continueStraight.substring(1)+". "+Keys.directions_makeALeftAtTheFirstIntersection+" and c"+Keys.directions_continueStraight.substring(1)+". "+Keys.directions_makeARightAtTheEndOfTheHallway+" and c"+Keys.directions_continueStraight.substring(1);
                        } else if(preNode.equals(Keys.nodeNameHallwayFloorThreeD1)){
                            return Keys.directions_continueStraight+" and m"+Keys.directions_makeARightAtTheEndOfTheHallway+" and c" +Keys.directions_continueStraight.substring(1)+". "+Keys.directions_makeALeftAtTheFirstIntersection+" and c"+Keys.directions_continueStraight.substring(1)+". "+Keys.directions_makeALeftAtTheFirstIntersection+" and c"+Keys.directions_continueStraight.substring(1)+". "+Keys.directions_makeARightAtTheEndOfTheHallway+" and c"+Keys.directions_continueStraight.substring(1);
                        }   
                    } else if(postNode.equals(Keys.nodeNameHallwayFloorThreeC2)){
                        if(preNode.equals(Keys.nodeNameHallwayFloorThreeA)){
                            return Keys.directions_turnLeft;
                        } else if(preNode.equals(Keys.nodeNameHallwayFloorThreeD1)){
                            return Keys.directions_turnRight;
                        }
                    } else if(postNode.equals(Keys.nodeNameHallwayFloorThreeD1)){
                        if(preNode.equals(Keys.nodeNameHallwayFloorThreeA)){
                            return Keys.directions_continueStraight;
                        } else if(preNode.equals(Keys.nodeNameHallwayFloorThreeC2)){
                            return Keys.directions_turnLeft;
                        }
                    }
                }

                //hard code logic for node C2 maybe not necessary? 
                if(node.equals(Keys.nodeNameHallwayFloorThreeC2)){
                    if(postNode.equals(Keys.nodeNameHallwayFloorThreeC1)){
                        if(preNode.equals(Keys.nodeNameHallwayFloorThreeD2)){
                            return Keys.directions_turnLeft;
                        }
                    } else if(postNode.equals(Keys.nodeNameHallwayFloorThreeD2)){
                        if(preNode.equals(Keys.nodeNameHallwayFloorThreeC1)){
                            return Keys.directions_turnRight;
                        }
                    }
                }

                //not necessary?
                if(node.equals(Keys.nodeNameHallwayFloorThreeD1)){
                    if(postNode.equals(Keys.nodeNameHallwayFloorThreeC1)){
                        if(preNode.equals(Keys.nodeNameHallwayFloorThreeD2)){
                            return Keys.directions_turnRight;
                        }
                    } else if(postNode.equals(Keys.nodeNameHallwayFloorThreeD2)){
                        if(preNode.equals(Keys.nodeNameHallwayFloorThreeC1)){
                            return Keys.directions_turnLeft;
                        }
                    }
                }

                //not necessary?
                if(node.equals(Keys.nodeNameHallwayFloorThreeD2)){
                    if(postNode.equals(Keys.nodeNameHallwayFloorThreeC2)){
                        if(preNode.equals(Keys.nodeNameHallwayFloorThreeD1)){
                            return Keys.directions_turnLeft;
                        }
                    } else if(postNode.equals(Keys.nodeNameHallwayFloorThreeD1)){
                        if(preNode.equals(Keys.nodeNameHallwayFloorThreeC2)){
                            return Keys.directions_turnRight;
                        }
                    }
                }
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
                if (node.equals(Keys.nodeNameHallwayEastWingFloorGround)) {
                    if (postNode.equals(Keys.nodeNameHallwayFloorGroundA)) {
                        if (preNode.equals(Keys.nodeNameHallwayFloorGroundB)) {
                            return "Error: Should never happen";
                        } else if (preNode.equals(Keys.nodeNameElevatorEastWingFloorGround)) {
                            return Keys.directions_turnRight+" and c"+Keys.directions_continueDownTheHallway.substring(1);
                        }
                        else {
                            return Keys.directions_turnLeft+" and c"+Keys.directions_continueDownTheHallway.substring(1);
                        }
                    } else if (postNode.equals(Keys.nodeNameHallwayFloorGroundB)) {
                        if (preNode.equals(Keys.nodeNameHallwayFloorGroundA)) {
                            return "Error: Should never happen";
                        } else if (preNode.equals(Keys.nodeNameElevatorEastWingFloorGround)) {
                            return Keys.directions_turnLeft+" and c"+Keys.directions_continueStraightPassingAFirstSetOfElevators+". "+Keys.directions_enterTheSecondSetOfElevators;
                        }
                        else {
                            return Keys.directions_turnRight+" and c"+Keys.directions_continueDownTheHallway.substring(1);
                        }
                    } else if (postNode.equals(Keys.nodeNameElevatorEastWingFloorGround)) {
                        if (preNode.equals(Keys.nodeNameHallwayFloorGroundB)) {
                            return Keys.directions_turnRight+". "+Keys.directions_enterTheElevators;
                        } else if (preNode.equals(Keys.nodeNameHallwayFloorGroundA)) {
                            return Keys.directions_turnLeft+". "+Keys.directions_enterTheElevators;
                        }
                    }
                }
                if (node.equals(Keys.nodeNameHallwayFloorGroundA)) {
                    /*if (postNode.equals(Keys.nodeNameElevatorFloorGround)) {
                        if (preNode.equals(Keys.nodeNameHallwayFloorGroundB)) {
                            return "Error: Should never happen";
                        }  redundant! else if (preNode.equals(Keys.nodeNameHallwayEastWingFloorGround)) {
                            return Keys.directions_turnRight+" and c"+Keys.directions_continueStraight.substring(1)+Keys.directions_enterTheFirstSetOfElevators; //to the end of the hallway
                        }
                    } else if (postNode.equals(Keys.nodeNameHallwayFloorGroundB)) {
                        if (preNode.equals(Keys.nodeNameElevatorFloorGround)) {
                            return "Error: Should never happen";
                        } else if (preNode.equals(Keys.nodeNameHallwayEastWingFloorGround)) {
                            return Keys.directions_turnRight+" and c"+Keys.directions_continueDownTheHallway.substring(1);
                        }
                    }  don't need this!
                    else if (postNode.equals(Keys.nodeNameElevatorFloorGround)) { //this part needs to change anyway
                        if (preNode.equals(Keys.nodeNameHallwayFloorGroundB)) {
                            return Keys.directions_turnRight+". "+Keys.directions_enterTheFirstSetOfElevators;
                        } else if (preNode.equals(Keys.nodeNameHallwayFloorGroundA)) {
                            return Keys.directions_turnLeft+". "+Keys.directions_enterTheFirstSetOfElevators;
                        }
                    }*/
                }
                if (node.equals(Keys.nodeNameHallwayFloorGroundB)) {
                    if (postNode.equals(Keys.nodeNameHallwayFloorGroundA)) {
                        if (preNode.equals(Keys.nodeNameHallwayEastWingFloorGround)) {
                            return Keys.directions_turnLeft+". "+Keys.directions_continueStraightToTheEndOfTheHallwayPassingTheElevators;
                        } else if (preNode.equals(Keys.nodeNameElevatorFloorGround)) {
                            return "Error: should never happen";
                        }
                        else if (preNode.equals(nodeNameHallwayFloorGroundC)) {
                            return Keys.directions_turnRight+". "+Keys.directions_continueStraightToTheEndOfTheHallwayPassingTheElevators;
                        }
                    } else if (postNode.equals(Keys.nodeNameHallwayFloorGroundC)) {
                        if (preNode.equals(Keys.nodeNameHallwayFloorGroundA)) {
                            return Keys.directions_turnLeft+" and c"+Keys.directions_continueStraight.substring(1);
                        } else if (preNode.equals(Keys.nodeNameHallwayEastWingFloorGround)) {
                            return Keys.directions_continueStraight;
                        }
                        else if (preNode.equals(Keys.nodeNameElevatorFloorGround)) {
                            //TODO how do you know from which elevator they enter/exit? 
                            return "TODO have not figured this out yet";
                        }
                    } else if (postNode.equals(Keys.nodeNameElevatorFloorGround)) {
                        if (preNode.equals(Keys.nodeNameHallwayFloorGroundA)) {
                            return "Error: should never happen";
                        } else if (preNode.equals(Keys.nodeNameHallwayEastWingFloorGround)) {
                            return Keys.directions_turnLeft+" and c"+Keys.directions_continueStraightPassingAFirstSetOfElevators.substring(1)+". "+Keys.directions_enterTheSecondSetOfElevators;
                        }
                        else if (preNode.equals(Keys.nodeNameHallwayFloorGroundC)) {
                            //TODO how do you know from which elevator they enter/exit? 
                            return Keys.directions_turnRight+" and c"+Keys.directions_continueStraightPassingAFirstSetOfElevators.substring(1)+". "+Keys.directions_enterTheSecondSetOfElevators;
                        }
                    }
                }
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
    final public static String  directions_continueStraightToTheEndOfTheHallwayPassingTheElevators = "Continue straight to the end of the hallway, passing the elevators";
    final public static String directions_continueStraightPassingAFirstSetOfElevators = "Continue straight, passing a first set of elevators";
    final public static String directions_passTheElevatorsUntilFrontDoors = "Pass the elevators, and continue until the front doors";
    final public static String directions_enterTheSecondSetOfElevators = "Enter the SECOND set of elevators. (There should only be two elevators, one across from the other.)";
    final public static String directions_enterTheFirstSetOfElevators = "Enter the FIRST set of elevators. (There should only be two elevators, one across from the other.)";
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

    //second floor directions
    final public static String directions_continueStraightPassingByAClusterOfElevatorsTheElevatorsAreUpAheadNextToTheWindows = "Continue straight, passing by a cluster of elevators. The elevators are up ahead, next to the windows.";
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
    final public static String directions_yourDestinationIsOnYourRight = "yourDestinationIsOnYourRight";
    final public static String directions_yourDestinationIsOnYourLeft = "yourDestinationIsOnYourLeft";
    
    
    //third floor directions
    final public static String directions_goAroundDesk = "Walk around the desk";
    final public static String directions_goThroughDoorway = "Go through the doorway";
    final public static String directions_makeALeftAtTheIntersection = "Make a left at the intersection";
    

    //fourth floor directions
    final public static String directions_passThroughTheArchwayAndContinueStraightPassTheEleveatorsThereShouldBeTwoHallwaysInFrontOfYou = "Pass through the archway and continue straight. Pass the eleveators. There should be two hallways in front ofY you";
    final public static String directions_goThroughTheLeftDoorway = "Go through the left doorway";
    final public static String directions_goThroughTheRightDoorway = "Go through the right doorway";
    
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
     final public static String nodeNameRoom2144AFloorTwo =  "room2144AFloorTwo";
     final public static String nodeNameRoom2101FloorTwo =  "room2101FloorTwo";
     final public static String nodeNameRoom2102FloorTwo=  "room2102FloorTwo";
     final public static String nodeNameRoom2103FloorTwo= "room2103FloorTwo";
     final public static String nodeNameRoom2104FloorTwo=  "room2104FloorTwo";
     final public static String nodeNameRoom2105FloorTwo=  "room2105FloorTwo";
     final public static String nodeNameRoom2106FloorTwo=  "room2106FloorTwo";
     final public static String nodeNameRoom2107FloorTwo=  "room2107FloorTwo";
     final public static String nodeNameRoom2108AND2109AND2110AFloorTwo= "room2108AND2109AND2110AFloorTwo";
     final public static String nodeNameRoom2110FloorTwo=  "room2110FloorTwo";
     final public static String nodeNameRoom2111FloorTwo=  "room2111FloorTwo";
     final public static String nodeNameRoom2112FloorTwo=  "room2112FloorTwo";
     final public static String nodeNameRoom2154FloorTwo =  "room2154FloorTwo";
     final public static String nodeNameRoom2143FloorTwo =   "room2143FloorTwo";
     final public static String nodeNameRoom2142FloorTwo =  "room2142FloorTwo";
     final public static String nodeNameRoom2155FloorTwo = "room2155FloorTwo";
     final public static String nodeNameRoom2712FloorTwo=  "room2712FloorTwo";
     final public static String nodeNameRoom2711FloorTwo=  "room2711FloorTwo";
     final public static String nodeNameRoom2714FloorTwo=  "room2714FloorTwo";
     final public static String nodeNameRoom2715FloorTwo=  "room2715FloorTwo";
     final public static String nodeNameRoom2716FloorTwo=  "room2716FloorTwo";
     final public static String nodeNameRoom2717FloorTwo=  "room2717FloorTwo";
     final public static String nodeNameRoom2718FloorTwo=  "room2718FloorTwo";
     final public static String nodeNameRoom2719FloorTwo=  "room2719FloorTwo";
     final public static String nodeNameRoom2720FloorTwo=  "room2720FloorTwo";
     final public static String nodeNameRoom2721FloorTwo=  "room2721FloorTwo";
     final public static String nodeNameRoom2722FloorTwo=  "room2722FloorTwo";
     final public static String nodeNameRoom2723FloorTwo=  "room2723FloorTwo";
     final public static String nodeNameRoom2724FloorTwo=  "room2724FloorTwo";
     final public static String nodeNameRoom2725FloorTwo=  "room2725FloorTwo";
     final public static String nodeNameRoom2726FloorTwo=  "room2726FloorTwo";
     final public static String nodeNameRoom2727FloorTwo=  "room2727FloorTwo";
     final public static String nodeNameRoom2729FloorTwo=  "room2729FloorTwo";
     final public static String nodeNameRoom2730FloorTwo=  "room2730FloorTwo";



     final public static String nodeNameRoom2116FloorTwo=  "room2116FloorTwo";
     final public static String nodeNameRoom2117FloorTwo=  "room2117FloorTwo";
     final public static String nodeNameRoom2118FloorTwo=  "room2118FloorTwo";
     final public static String nodeNameRoom2119FloorTwo=  "room2119FloorTwo";
     final public static String nodeNameRoom2120FloorTwo=  "room2120FloorTwo";
     final public static String nodeNameRoom2121FloorTwo=  "room2121FloorTwo";
     final public static String nodeNameRoom2122FloorTwo=  "room2122FloorTwo";
     final public static String nodeNameRoom2123FloorTwo=  "room2123FloorTwo";
     final public static String nodeNameRoom2124FloorTwo=  "room2124FloorTwo";
     final public static String nodeNameRoom2125FloorTwo=  "room2125FloorTwo";
     final public static String nodeNameRoom2126FloorTwo=  "room2126FloorTwo";

     final public static String nodeNameRoom2777FloorTwo=  "room2777FloorTwo";
     final public static String nodeNameRoom2183FloorTwo = "room2183FloorTwo";
     final public static String nodeNameRoom2780FloorTwo = "room2780FloorTwo";
     final public static String nodeNameRoom2325FloorTwo = "room2325FloorTwo";
    final public static String nodeNameRoom2324FloorTwo = "room2324FloorTwo";
    final public static String nodeNameRoom2323FloorTwo = "room2323FloorTwo";
    final public static String nodeNameRoom2322FloorTwo = "room2322FloorTwo";
    final public static String nodeNameRoom2321FloorTwo = "room2321FloorTwo";
    final public static String nodeNameRoom2320FloorTwo = "room2320FloorTwo";
    final public static String nodeNameRoom2319FloorTwo = "room2319FloorTwo";
    final public static String nodeNameRoom2318FloorTwo = "room2318FloorTwo";
    final public static String nodeNameRoom2317FloorTwo = "room2317FloorTwo";
    final public static String nodeNameRoom2316FloorTwo = "room2316FloorTwo";
    final public static String nodeNameRoom2315FloorTwo = "room2315FloorTwo";

    final public static String nodeNameRoom2301FloorTwo = "room2301FloorTwo";
    final public static String nodeNameRoom2302FloorTwo = "room2302FloorTwo"; 
    final public static String nodeNameRoom2303FloorTwo = "room2303FloorTwo";
    final public static String nodeNameRoom2304FloorTwo = "room2304FloorTwo";
    final public static String nodeNameRoom2305FloorTwo = "room2305FloorTwo";
    final public static String nodeNameRoom2306FloorTwo = "room2306FloorTwo";
    final public static String nodeNameRoom2307FloorTwo = "room2307FloorTwo";
    final public static String nodeNameRoom2308FloorTwo = "room2308FloorTwo";
    final public static String nodeNameRoom2309FloorTwo = "room2309FloorTwo";
    final public static String nodeNameRoom2310FloorTwo = "room2310FloorTwo";
    final public static String nodeNameRoom2311FloorTwo = "room2311FloorTwo";
    final public static String nodeNameRoom2314FloorTwo = "room2314FloorTwo";


    final public static String nodeNameRoom2402FloorTwo = "room2402FloorTwo";
    final public static String nodeNameRoom2403FloorTwo = "room2403FloorTwo";
    final public static String nodeNameRoom2430AND2433AND2434FloorTwo= "room2430AND2433AND2434FloorTwo";

    final public static String nodeNameRoom2401FloorTwo = "room2401FloorTwo";
    final public static String nodeNameRoom2404FloorTwo = "room2404FloorTwo";
    final public static String nodeNameRoom2405FloorTwo = "room2405FloorTwo";
    final public static String nodeNameRoom2406FloorTwo = "room2406FloorTwo";
    final public static String nodeNameRoom2407FloorTwo = "room2407FloorTwo";
    final public static String nodeNameRoom2411FloorTwo = "room2411FloorTwo";
    final public static String nodeNameRoom2409FloorTwo = "room2409FloorTwo";
    final public static String nodeNameRoom2412FloorTwo = "room2412FloorTwo";
    final public static String nodeNameRoom2414FloorTwo = "room2414FloorTwo";
    final public static String nodeNameRoom2408FloorTwo = "room2408FloorTwo";
    final public static String nodeNameRoom2410FloorTwo = "room2410FloorTwo";




    final public static String nodeNameRoom2415FloorTwo = "room2415FloorTwo";
    final public static String nodeNameRoom2416FloorTwo = "room2416FloorTwo";
    
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
    
    //FLOOR THREE 
    //node names + descriptions
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
    //rooms
    //CLUSTER: room 3010, 3148, 3149, 3152, 3153, 3155(3155-A, 3155-B; IDK THERES DOUBLE OF 3154, 3102, 3103
    final public static String nodeNameRoom3010AND3148AND3149AND3152AND3153AND3155FloorThree = "room3010AND3148AND3149AND3152AND3153AND3155FloorThree";
    final public static ArrayList<String> descriptionRoom3010AND3148AND3149AND3152AND3153AND3155FloorThree = new ArrayList<>(Arrays.asList(
            "3010",
            //missing 3102, on blueprint twice
            //missing 3103, on blueprint twice
            "3148",
            "3149",
            "3152",
            "3153",
            //missing 3154(BR), on blueprint twice
            "3155",
            "3155A",//small room
            "3155-A",//small room
            "3155B",//small room
            "3155-B"//small room
    ));
    //room 3063
    final public static String nodeNameRoom3063FloorThree = "room3063FloorThree";
    final public static ArrayList<String> descriptionRoom3063FloorThree = new ArrayList<>(Arrays.asList(
            "3063"
    ));
    //room 3063A
    final public static String nodeNameRoom3063AFloorThree = "room3063AFloorThree";
    final public static ArrayList<String> descriptionRoom3063AFloorThree = new ArrayList<>(Arrays.asList(
            "3063A"
    ));
    //room 3064
    final public static String nodeNameRoom3064FloorThree = "room3064FloorThree";
    final public static ArrayList<String> descriptionRoom3064FloorThree = new ArrayList<>(Arrays.asList(
            "3064"
    ));
    //room 3064A
    final public static String nodeNameRoom3064AFloorThree = "room3064AFloorThree";
    final public static ArrayList<String> descriptionRoom3064AFloorThree = new ArrayList<>(Arrays.asList(
            "3064A"
    ));
    //room 3101
    final public static String nodeNameRoom3101FloorThree = "room3101FloorThree";
    final public static ArrayList<String> descriptionRoom3101FloorThree = new ArrayList<>(Arrays.asList(
            "3101"
    ));
    //room 3102
    final public static String nodeNameRoom3102FloorThree = "room3102FloorThree";
    final public static ArrayList<String> descriptionRoom3102FloorThree = new ArrayList<>(Arrays.asList(
            "3102"
    ));
    //room 3103, 3103-A, 3103-B
    final public static String nodeNameRoom3103FloorThree = "room3103FloorThree";
    final public static ArrayList<String> descriptionRoom3103FloorThree = new ArrayList<>(Arrays.asList(
            "3103",
            "3103-A",
            "3103-B"
    ));
    //room 3104
    final public static String nodeNameRoom3104FloorThree = "room3104FloorThree";
    final public static ArrayList<String> descriptionRoom3104FloorThree = new ArrayList<>(Arrays.asList(
            "3104"
    ));
    //room 3105
    final public static String nodeNameRoom3105FloorThree = "room3105FloorThree";
    final public static ArrayList<String> descriptionRoom3105FloorThree = new ArrayList<>(Arrays.asList(
            "3105"
    ));
    //room 3106
    final public static String nodeNameRoom3106FloorThree = "room3106FloorThree";
    final public static ArrayList<String> descriptionRoom3106FloorThree = new ArrayList<>(Arrays.asList(
            "3106"
    ));
    //room 3107
    final public static String nodeNameRoom3107FloorThree = "room3107FloorThree";
    final public static ArrayList<String> descriptionRoom3107FloorThree = new ArrayList<>(Arrays.asList(
            "3107",
            "3107-A"
    ));
    //room 3108
    final public static String nodeNameRoom3108FloorThree = "room3108FloorThree";
    final public static ArrayList<String> descriptionRoom3108FloorThree = new ArrayList<>(Arrays.asList(
            "3108"
    ));
    //room 3109
    final public static String nodeNameRoom3109FloorThree = "room3109FloorThree";
    final public static ArrayList<String> descriptionRoom3109FloorThree = new ArrayList<>(Arrays.asList(
            "3109"
    ));
    //room 3110
    final public static String nodeNameRoom3110FloorThree = "room3110FloorThree";
    final public static ArrayList<String> descriptionRoom3110FloorThree = new ArrayList<>(Arrays.asList(
            "3110"
    ));
    //room 3111
    final public static String nodeNameRoom3111FloorThree = "room3111FloorThree";
    final public static ArrayList<String> descriptionRoom3111FloorThree = new ArrayList<>(Arrays.asList(
            "3111"
    ));
    //room 3112 - is this even a room?
    final public static String nodeNameRoom3112FloorThree = "room3112FloorThree";
    final public static ArrayList<String> descriptionRoom3112FloorThree = new ArrayList<>(Arrays.asList(
            "3112"
    ));
    //room 3114 - is this even a room?
    final public static String nodeNameRoom3114FloorThree = "room3114FloorThree";
    final public static ArrayList<String> descriptionRoom3114FloorThree = new ArrayList<>(Arrays.asList(
            "3114"
    ));
    //room 3115 - is this even a room?
    final public static String nodeNameRoom3115FloorThree = "room3115FloorThree";
    final public static ArrayList<String> descriptionRoom3115FloorThree = new ArrayList<>(Arrays.asList(
            "3115"
    ));
    //room 3116 - is this even a room?
    final public static String nodeNameRoom3116FloorThree = "room3116FloorThree";
    final public static ArrayList<String> descriptionRoom3116FloorThree = new ArrayList<>(Arrays.asList(
            "3116"
    ));
    //room 3117
    final public static String nodeNameRoom3117FloorThree = "room3117FloorThree";
    final public static ArrayList<String> descriptionRoom3117FloorThree = new ArrayList<>(Arrays.asList(
            "3117"
    ));
    //room 3118
    final public static String nodeNameRoom3118FloorThree = "room3118FloorThree";
    final public static ArrayList<String> descriptionRoom3118FloorThree = new ArrayList<>(Arrays.asList(
            "3118"
    ));
    //room 3119
    final public static String nodeNameRoom3119FloorThree = "room3119FloorThree";
    final public static ArrayList<String> descriptionRoom3119FloorThree = new ArrayList<>(Arrays.asList(
            "3119"
    ));
    //room 3120 and 3121 and 3121-A
    final public static String nodeNameRoom3120AND3121AND3121AFloorThree = "room3120AND3121AND3121A";
    final public static ArrayList<String> descriptionRoom3120AND3121AND3121AFloorThree = new ArrayList<>(Arrays.asList(
            "3120",
            "3121",
            "3121A",
            "3121-A"
    ));
    //room 3122 and 3124 and 3122-A and 3124-A
    final public static String nodeNameRoom3122AND3124FloorThree = "room3122AND3124";
    final public static ArrayList<String> descriptionRoom3122AND3124 = new ArrayList<>(Arrays.asList(
            "3122",
            "3122A",
            "3122-A",
            "3124",
            "3124A",
            "3124-A"
    ));
    //room 3123 - is this even a room?
    final public static String nodeNameRoom3123FloorThree = "room3123FloorThree";
    final public static ArrayList<String> descriptionRoom3123FloorThree = new ArrayList<>(Arrays.asList(
            "3123"
    ));
    //CLUSTER: room 3125, 3126, 3127, 3129, 3130, 3130A, ALSO IDK THERES DOUBLE OF 3110
    final public static String nodeNameRoom3125AND3126AND3127AND3129AND3130AND3130AAND3134FloorThree = "room3125AND3126AND3127AND3129AND3130AND3130AAND3134FloorThree";
    final public static ArrayList<String> descriptionRoom3125AND3126AND3127AND3129AND3130AND3130AAND3134FloorThree = new ArrayList<>(Arrays.asList(
            //missing 3110, on blueprint twice
            "3125",
            "3126",
            "3127",
            "3129",
            "3130",
            "3130A",
            "3132",//small room or shower?
            "3134"
    ));
    //room 3128
    final public static String nodeNameRoom3128FloorThree = "room3128FloorThree";
    final public static ArrayList<String> descriptionRoom3128FloorThree = new ArrayList<>(Arrays.asList(
            "3128"
    ));
    //room 3131 and room 3133 (BR)
    final public static String nodeNameRoom3131FloorThree = "room3131FloorThree";
    final public static ArrayList<String> descriptionRoom3131FloorThree = new ArrayList<>(Arrays.asList(
            "3131",
            "3133"//BR
    ));
    //room 3141
    final public static String nodeNameRoom3141FloorThree = "room3141FloorThree";
    final public static ArrayList<String> descriptionRoom3141FloorThree = new ArrayList<>(Arrays.asList(
            "3141"
    ));
    //room 3142 and room 3144 (BR)
    //3143 on blueprints twice
    final public static String nodeNameRoom3142FloorThree = "room3142FloorThree";
    final public static ArrayList<String> descriptionRoom3142FloorThree = new ArrayList<>(Arrays.asList(
            "3142",
            "3144"//BR
    ));
    //room 3143 and 3145 
    final public static String nodeNameRoom3143AND3145FloorThree = "room3143AND3145FloorThree";
    final public static ArrayList<String> descriptionRoom3143AND3145FloorThree = new ArrayList<>(Arrays.asList(
            "3143",
            "3145",
            "3145A",//BR
            "3145-A"//BR
    ));
    //room 3146
    final public static String nodeNameRoom3146FloorThree = "room3146FloorThree";
    final public static ArrayList<String> descriptionRoom3146FloorThree = new ArrayList<>(Arrays.asList(
            "3146"
    ));
    //room 3147
    final public static String nodeNameRoom3147FloorThree = "room3147FloorThree";
    final public static ArrayList<String> descriptionRoom3147FloorThree = new ArrayList<>(Arrays.asList(
            "3147"
    ));
    //room 3154
    final public static String nodeNameRoom3154FloorThree = "room3154FloorThree";
    final public static ArrayList<String> descriptionRoom3154FloorThree = new ArrayList<>(Arrays.asList(
            "3154"
    ));
    //room 3156
    final public static String nodeNameRoom3156FloorThree = "room3156FloorThree";
    final public static ArrayList<String> descriptionRoom3156FloorThree = new ArrayList<>(Arrays.asList(
            "3156"
    ));
    //room 3161
    final public static String nodeNameRoom3161FloorThree = "room3161FloorThree";
    final public static ArrayList<String> descriptionRoom3161FloorThree = new ArrayList<>(Arrays.asList(
            "3161",
            "3161A",//BR
            "3161-A",//BR
            "3161B",//small room
            "3161-B"//small room
    ));
    //room 3164
    final public static String nodeNameRoom3164FloorThree = "room3164FloorThree";
    final public static ArrayList<String> descriptionRoom3164FloorThree = new ArrayList<>(Arrays.asList(
            "3164",
            "3164A",//BR
            "3164-A",//BR
            "3164B",//small room
            "3161-B"//small room
    ));
    //room 3165
    final public static String nodeNameRoom3165FloorThree = "room3165FloorThree";
    final public static ArrayList<String> descriptionRoom3165FloorThree = new ArrayList<>(Arrays.asList(
            "3165",
            "3165A",//BR
            "3165-A",//BR
            "3165B",//small room
            "3165-B"//small room
    ));
    //room 3166
    final public static String nodeNameRoom3166FloorThree = "room3166FloorThree";
    final public static ArrayList<String> descriptionRoom3166FloorThree = new ArrayList<>(Arrays.asList(
            "3166",
            "3166A",//BR
            "3166-A",//BR
            "3166B",//small room
            "3166-B"//small room
    ));
    //room 3167
    final public static String nodeNameRoom3167FloorThree = "room3167FloorThree";
    final public static ArrayList<String> descriptionRoom3167FloorThree = new ArrayList<>(Arrays.asList(
            "3167",
            "3167A",//BR
            "3167-A",//BR
            "3167B",//small room
            "3167-B"//small room
    ));
    //room 3168
    final public static String nodeNameRoom3168FloorThree = "room3168FloorThree";
    final public static ArrayList<String> descriptionRoom3168FloorThree = new ArrayList<>(Arrays.asList(
            "3168"
    ));
    //room 3169
    final public static String nodeNameRoom3169FloorThree = "room3169FloorThree";
    final public static ArrayList<String> descriptionRoom3169FloorThree = new ArrayList<>(Arrays.asList(
            "3169",
            "3169A",//BR
            "3169-A",//BR
            "3169B",//small room
            "3169-B"//small room
    ));
    //room 3174
    final public static String nodeNameRoom3174FloorThree = "room3174FloorThree";
    final public static ArrayList<String> descriptionRoom3174FloorThree = new ArrayList<>(Arrays.asList(
            "3174",
            "3174A",//BR
            "3174-A"//BR
    ));
    //room 3301B
    final public static String nodeNameRoom3301BFloorThree = "room3301BFloorThree";
    final public static ArrayList<String> descriptionRoom3301BFloorThree = new ArrayList<>(Arrays.asList(
            "3301B"
    ));
    //room 3301C
    final public static String nodeNameRoom3301CFloorThree = "room3301CFloorThree";
    final public static ArrayList<String> descriptionRoom3301CFloorThree = new ArrayList<>(Arrays.asList(
            "3301C"
    ));
    //room 3301D(BR)
    final public static String nodeNameRoom3301DFloorThree = "room3301DFloorThree";
    final public static ArrayList<String> descriptionRoom3301DFloorThree = new ArrayList<>(Arrays.asList(
            "3301D",
            "bathroom"
    ));
    //room 3301E
    final public static String nodeNameRoom3301EFloorThree = "room3301EFloorThree";
    final public static ArrayList<String> descriptionRoom3301EFloorThree = new ArrayList<>(Arrays.asList(
            "3301E",
            "3350-C"//BR
    ));
    //room 3301F - is this even a room?
    final public static String nodeNameRoom3301FFloorThree = "room3301FFloorThree";
    final public static ArrayList<String> descriptionRoom3301FFloorThree = new ArrayList<>(Arrays.asList(
            "3301F"
    ));
    //room 3706 - is this even a room?
    final public static String nodeNameRoom3706FloorThree = "room3706FloorThree";
    final public static ArrayList<String> descriptionRoom3706FloorThree = new ArrayList<>(Arrays.asList(
            "3706"
    ));
    //room 3707
    final public static String nodeNameRoom3707FloorThree = "room3707FloorThree";
    final public static ArrayList<String> descriptionRoom3707FloorThree = new ArrayList<>(Arrays.asList(
            "3707"
    ));
    //room 3708
    final public static String nodeNameRoom3708FloorThree = "room3708FloorThree";
    final public static ArrayList<String> descriptionRoom3708FloorThree = new ArrayList<>(Arrays.asList(
            "3708"
    ));
    //CLUSTER: room 3709, 3710, 3711(BR), 3712, 3713, 3714
    final public static String nodeNameRoom3709AND3710AND3711AND3712AND3713AND3714FloorThree = "room3709AND3710AND3711AND3712AND3713AND3714FloorThree";
    final public static ArrayList<String> descriptionRoom3709AND3710AND3711AND3712AND3713AND3714FloorThree = new ArrayList<>(Arrays.asList(
            "3709",
            "3710",
            "3711",//BR to 3710
            "3712",
            "3713",
            "3714"
    ));
    //room 3715
    final public static String nodeNameRoom3715FloorThree = "room3715FloorThree";
    final public static ArrayList<String> descriptionRoom3715FloorThree = new ArrayList<>(Arrays.asList(
            "3715"
    ));
    //room 3716
    final public static String nodeNameRoom3716FloorThree = "room3716FloorThree";
    final public static ArrayList<String> descriptionRoom3716FloorThree = new ArrayList<>(Arrays.asList(
            "3716"
    ));
    //room 3717
    final public static String nodeNameRoom3717FloorThree = "room3717FloorThree";
    final public static ArrayList<String> descriptionRoom3717FloorThree = new ArrayList<>(Arrays.asList(
            "3717"
    ));
    //room 3718
    final public static String nodeNameRoom3718FloorThree = "room3718FloorThree";
    final public static ArrayList<String> descriptionRoom3718FloorThree = new ArrayList<>(Arrays.asList(
            "3718",
            "3718A",//BR
            "3718-A"//BR
    ));
    //room 3719
    final public static String nodeNameRoom3719FloorThree = "room3719FloorThree";
    final public static ArrayList<String> descriptionRoom3719FloorThree = new ArrayList<>(Arrays.asList(
            "3719",
            "3719A",//BR
            "3719-A"//BR
    ));
    //room 3720
    final public static String nodeNameRoom3720FloorThree = "room3720FloorThree";
    final public static ArrayList<String> descriptionRoom3720FloorThree = new ArrayList<>(Arrays.asList(
            "3720",
            "3720A",//BR
            "3720-A"//BR
    ));
    //room 3721
    final public static String nodeNameRoom3721FloorThree = "room3721FloorThree";
    final public static ArrayList<String> descriptionRoom3721FloorThree = new ArrayList<>(Arrays.asList(
            "3721",
            "3721A",//BR
            "3721-A"//BR
    ));
    //room 3722
    final public static String nodeNameRoom3722FloorThree = "room3722FloorThree";
    final public static ArrayList<String> descriptionRoom3722FloorThree = new ArrayList<>(Arrays.asList(
            "3722",
            "3722A",//BR
            "3722-A"//BR
    ));
    //room 3723
    final public static String nodeNameRoom3723FloorThree = "room3723FloorThree";
    final public static ArrayList<String> descriptionRoom3723FloorThree = new ArrayList<>(Arrays.asList(
            "3723",
            "3723A",//BR
            "3723-A"//BR
    ));
    //room 3724
    final public static String nodeNameRoom3724FloorThree = "room3724FloorThree";
    final public static ArrayList<String> descriptionRoom3724FloorThree = new ArrayList<>(Arrays.asList(
            "3724",
            "3724A",//BR
            "3724-A"//BR
    ));
    //room 3725
    final public static String nodeNameRoom3725FloorThree = "room3725FloorThree";
    final public static ArrayList<String> descriptionRoom3725FloorThree = new ArrayList<>(Arrays.asList(
            "3725",
            "3725A",//BR
            "3725-A"//BR
    ));
    //room 3726
    final public static String nodeNameRoom3726FloorThree = "room3726FloorThree";
    final public static ArrayList<String> descriptionRoom3726FloorThree = new ArrayList<>(Arrays.asList(
            "3726",
            "3726A",//BR
            "3726-A"//BR
    ));
    //room 3727
    final public static String nodeNameRoom3727FloorThree = "room3727FloorThree";
    final public static ArrayList<String> descriptionRoom3727FloorThree = new ArrayList<>(Arrays.asList(
            "3727",
            "3727A",//BR
            "3727-A",//BR
            "3727B",//shower?
            "3727-B"//shower?
    ));
    //room 3730 - is this even a room?
    final public static String nodeNameRoom3730FloorThree = "room3730FloorThree";
    final public static ArrayList<String> descriptionRoom3730FloorThree = new ArrayList<>(Arrays.asList(
            "3730"
    ));
    //room 3731 - shower?
    final public static String nodeNameRoom3731FloorThree = "room3731FloorThree";
    final public static ArrayList<String> descriptionRoom3731FloorThree = new ArrayList<>(Arrays.asList(
            "3731"
    ));
    //room 3732 - shower?
    final public static String nodeNameRoom3732FloorThree = "room3732FloorThree";
    final public static ArrayList<String> descriptionRoom3732FloorThree = new ArrayList<>(Arrays.asList(
            "3732"
    ));
    //room 3733
    final public static String nodeNameRoom3733FloorThree = "room3733FloorThree";
    final public static ArrayList<String> descriptionRoom3733FloorThree = new ArrayList<>(Arrays.asList(
            "3733"
    ));
    //room 3734 - is this even a room?
    final public static String nodeNameRoom3734FloorThree = "room3734FloorThree";
    final public static ArrayList<String> descriptionRoom3734FloorThree = new ArrayList<>(Arrays.asList(
            "3734"
    ));
    //room 3735 - is this even a room?
    final public static String nodeNameRoom3735FloorThree = "room3735FloorThree";
    final public static ArrayList<String> descriptionRoom3735FloorThree = new ArrayList<>(Arrays.asList(
            "3735"
    ));
    //room 3736
    final public static String nodeNameRoom3736FloorThree = "room3736FloorThree";
    final public static ArrayList<String> descriptionRoom3736FloorThree = new ArrayList<>(Arrays.asList(
            "3736"
    ));
    //room 3737
    final public static String nodeNameRoom3737FloorThree = "room3737FloorThree";
    final public static ArrayList<String> descriptionRoom3737FloorThree = new ArrayList<>(Arrays.asList(
            "3737"
    ));
    //room 3738 and 3739 
    final public static String nodeNameRoom3738FloorThree = "room3738FloorThree";
    final public static ArrayList<String> descriptionRoom3738FloorThree = new ArrayList<>(Arrays.asList(
            "3738",
            "3739"//BR
    ));




    //floor four names
    //nodes
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
    //rooms
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
    //end floor four IPs

   
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

    final public static String nodeNameRoom1234FloorOne = "room1234FloorOne";
    final public static ArrayList<String> descriptionRoom1211FloorOne = new ArrayList<>(Arrays.asList(
        "parent icu",
        "parent lounge",
        "1211"
    ));

    final public static String nodeNameRoom1233FloorOne = "room1233FloorOne";
    final public static ArrayList<String> descriptionRoom1214FloorOne = new ArrayList<>(Arrays.asList(
        "mens bathroom ",
        "men's bathroom ",
        "bathroom",
        "mens restroom",
        "men's restroom",
        "restroom"
    ));

    final public static String nodeNameRoom1232FloorOne = "room1232FloorOne";
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

    final public static String nodeNameRoom1750FloorOne = "room1750FloorOne";
    final public static ArrayList<String> descriptionRoom1730AFloorOne = new ArrayList<>(Arrays.asList(
        "radiation oncology waiting room"
    ));

    //floorTwo
    final public static String nodeNameRoom2350AFloorTwo = "room2350AFloorTwo";
    final public static ArrayList<String> descriptionRoom2350AFloorTwo = new ArrayList<>(Arrays.asList(
        "phones",
        "phone"
    ));

    //floorThree
    //GO OVER!
    //final public static String nodeNameRoom3301DFloorThree = "room3301DFloorThree";
    //final public static ArrayList<String> descriptionRoom3301DFloorThree = new ArrayList<>(Arrays.asList(
        //"restroom 3",
        //"bathroom 3"
    //));

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
    final public static ArrayList<Node> listOfRooms = new ArrayList<>(Arrays.asList(
            
            
        new Node("entranceEmergencyRoomFloorOne", "entrance by ER", new Edge[]{
            new Edge(66.002, nodeNameHallwayFloorOneC, 0),
            new Edge(42.661, nodeNameHallwayFloorOneD, 1)
        }),
            
        new Node("entranceRadiationOncologyFloorOne", "entrance by radiation oncology", new Edge[]{
            new Edge(6.836, nodeNameHallwayFloorOneF, 0)
        }),
            




//groundFloorParkingValidation
        new Node(nodeNameParkingValidationFloorGround, descriptionParkingValidationFloorGround, new Edge[]{
            new Edge(44.291, nodeNameHallwayFloorGroundA, 0, Keys.directions_facingAwayFromPV + "t" + Keys.directions_turnLeft.substring(1)),
            new Edge(40.912, nodeNameElevatorFloorGround, 1, Keys.directions_facingAwayFromPV + "t" + Keys.directions_turnRight.substring(1) + ". Walk straight and " + "e" + Keys.directions_enterTheFirstSetOfElevators.substring(1)),
            new Edge(112.693, nodeNameHallwayFloorGroundB, 2, Keys.directions_facingAwayFromPV + "t" + Keys.directions_turnRight.substring(1) + "." + Keys.directions_continueStraightPassingAFirstSetOfElevators + Keys.directions_followTheHallway)
        }),
        //FLOOR ONE
        //EastWingFloorOne 117
        new Node("room117eastwingFloorOne", descriptionRoom117EastWingFloorOne, new Edge[]{
            new Edge(18.00, nodeNameElevatorEastWingFloorOne, 0)
        }),
        //waiting area for exam rooms
        new Node("room1172FloorOne", "exam room waiting room", new Edge[]{
            new Edge(18.440, nodeNameHallwayFloorOneF, 0),
            new Edge(53.927, nodeNameHallwayFloorOneC, 1)
        }),
        
        //EastWingFloorOneRoom121
        new Node("room121eastWingFloorOne", descriptionRoom121EastWingFloorOne, new Edge[]{
            new Edge(18.905, nodeNameElevatorEastWingFloorOne, 0)
        }),
       
        
        //floorOneWomensRestroom
        new Node("room1232FloorOne", descriptionRoom1215FloorOne, new Edge[]{
            new Edge(13.622, nodeNameHallwayFloorOneD, 0),
            new Edge(3.223, nodeNameHallwayFloorOneE, 1)
        }),
        //floorOneMensRestroom
        new Node("room1233FloorOne", descriptionRoom1214FloorOne, new Edge[]{
            new Edge(12.014, nodeNameHallwayFloorOneD, 0),
            new Edge(5.025, nodeNameHallwayFloorOneE, 1)
        }),
         //floorOneParentLounge
        new Node("room1234FloorOne", descriptionRoom1211FloorOne, new Edge[]{
            new Edge(5.467, nodeNameHallwayFloorOneD, 0),
            new Edge(8.678, nodeNameHallwayFloorOneE, 1)
        }),
        
        //floorOneWomensRestroom
        new Node("room1318FloorOne", descriptionRoom1318FloorOne, new Edge[]{
            new Edge(18.669, nodeNameHallwayFloorOneA, 0),
            new Edge(18.962, nodeNameHallwayFloorOneB, 1),
            new Edge(1.391, nodeNameElevatorFloorOne, 2)
        }),
        //floorOneMensRestroom
        new Node("room1319FloorOne", descriptionRoom1319FloorOne, new Edge[]{
            new Edge(12.276, nodeNameHallwayFloorOneA, 0),
            new Edge(25.671, nodeNameHallwayFloorOneB, 1),
            new Edge(2.616, nodeNameElevatorFloorOne, 2)
        }),
        //floorOneSameDayWaitingArea
        new Node("room1323FloorOne", descriptionRoom1323FloorOne, new Edge[]{
            new Edge(4.976, nodeNameHallwayFloorOneA, 0),
            new Edge(35.844, nodeNameHallwayFloorOneB, 1),
            new Edge(12.932, nodeNameElevatorFloorOne, 2)
        }),
        //floorOneChapel
        new Node("room1308FloorOne", descriptionRoom1398FloorOne, new Edge[]{
            new Edge(10.916, nodeNameHallwayFloorOneG, 0)
        }),
        //EastWingFloorOneRoom144
        new Node("room144EastWingFloorOne", descriptionRoom144EastWingFloorOne, new Edge[]{
            new Edge(5.908, nodeNameElevatorEastWingFloorOne, 0)
        }),
        //floorOneICUWaiting
        new Node("room1607FloorOne", descriptionRoom1607FloorOne, new Edge[]{
            new Edge(1.662, nodeNameHallwayFloorOneE, 0)
        }),
        //floorOneERWaitingRoom
        new Node("room1611FloorOne", "ER waiting room", new Edge[]{
            new Edge(64.149, nodeNameHallwayFloorOneC, 0),
            new Edge(40.808, nodeNameHallwayFloorOneD, 1)
        }),
        //floorOnePediatricWaitingRoom
        new Node("room1619FloorOne", "Pediatric waiting room", new Edge[]{
            new Edge(79.743, nodeNameHallwayFloorOneC, 0),
            new Edge(59.402, nodeNameHallwayFloorOneD, 1)
        }),
        //floorOneRadiationOncologyWaitingRoom
        new Node("room1750FloorOne", "radiation oncology waiting area", new Edge[]{
            new Edge(28.394, nodeNameHallwayFloorOneF, 0)
        }),
        //END FLOOR ONE - START FLOOR TWO
        //EastWingFloorTwo 201
        new Node(nodeNameRoom201EastWingFloorTwo, descriptionRoom201EastWingFloorTwo, new Edge[]{
            new Edge(9.150, nodeNameElevatorEastWingFloorTwo,0, Keys.directions_exitTheRoom+" and t"+Keys.directions_turnRight.substring(1)+". "+Keys.directions_enterTheElevators+", on your right.")
        }),
        
        //patient room
        new Node(nodeNameRoom2101FloorTwo, new Edge[]{
            new Edge(41.457, nodeNameHallwayFloorTwoE, 0,Keys.directions_exitTheRoom+ ", t"+Keys.directions_turnRight.substring(1)+", and c"+Keys.directions_continueStraight.substring(1)),
            new Edge(22.805, nodeNameHallwayFloorTwoF3, 1,Keys.directions_exitTheRoom+ " and t"+Keys.directions_turnLeft.substring(1)+", continuing down the hallway")
        }),
        //patient room
        new Node(nodeNameRoom2102FloorTwo, new Edge[]{
            new Edge(57.9, nodeNameHallwayFloorTwoE, 0, Keys.directions_exitTheRoom+ ", t"+Keys.directions_turnRight.substring(1)+", and c"+Keys.directions_continueStraight.substring(1)),
            new Edge(22.995, nodeNameHallwayFloorTwoF3, 1,Keys.directions_exitTheRoom+ " and t"+Keys.directions_turnLeft.substring(1)+", continuing down the hallway")
        }),
        //patient room
        new Node(nodeNameRoom2103FloorTwo, new Edge[]{
            new Edge(84, nodeNameHallwayFloorTwoE, 0,Keys.directions_exitTheRoom+ " and t"+Keys.directions_turnRight.substring(1)+", continuing down the hallway"),
            new Edge(16.464, nodeNameHallwayFloorTwoF3, 1,Keys.directions_exitTheRoom+ ", t"+Keys.directions_turnLeft.substring(1)+", and c"+Keys.directions_continueStraight.substring(1))
        }),
        //patient room
        new Node(nodeNameRoom2104FloorTwo, new Edge[]{
            new Edge(55.875 + 40, nodeNameHallwayFloorTwoE, 0,Keys.directions_exitTheRoom+ " and t"+Keys.directions_turnRight.substring(1)+", continuing down the hallway"),
            new Edge(12.396, nodeNameHallwayFloorTwoF3, 1, Keys.directions_exitTheRoom),
            new Edge(56.112+44.097, nodeNameHallwayFloorTwoG,2, Keys.directions_exitTheRoom+ " and t"+Keys.directions_turnLeft.substring(1)+", continuing down the hallway")
        }),
        //patient room
        new Node(nodeNameRoom2105FloorTwo, new Edge[]{
            new Edge(55.9 + 37, nodeNameHallwayFloorTwoG, 0,Keys.directions_exitTheRoom+ " and t"+Keys.directions_turnLeft.substring(1)+", continuing down the hallway" ),
            new Edge(15.528, nodeNameHallwayFloorTwoF3, 1, Keys.directions_exitTheRoom+ ", t"+Keys.directions_turnRight.substring(1)+", and c"+Keys.directions_continueStraight.substring(1))
        }),
        //patient room
        new Node(nodeNameRoom2106FloorTwo, new Edge[]{
            new Edge(55.828 + 20.724, nodeNameHallwayFloorTwoG, 0, Keys.directions_exitTheRoom+ " and t"+Keys.directions_turnLeft.substring(1)+", continuing down the hallway" ),
            new Edge(23.132, nodeNameHallwayFloorTwoF3, 1, Keys.directions_exitTheRoom+ ", t"+Keys.directions_turnRight.substring(1)+", and c"+Keys.directions_continueStraight.substring(1))
        }),
        //patient room
        new Node(nodeNameRoom2107FloorTwo, new Edge[]{
            new Edge(56.632, nodeNameHallwayFloorTwoG, 0, Keys.directions_exitTheRoom+ " and t"+Keys.directions_turnLeft.substring(1)+", continuing down the hallway" ),
            new Edge(37.5, nodeNameHallwayFloorTwoF3, 1, Keys.directions_exitTheRoom+ ", t"+Keys.directions_turnRight.substring(1)+", and c"+Keys.directions_continueStraight.substring(1))
        }),
        //HEY, nodes 2108 and 2109 are connected to 2110A
        new Node(nodeNameRoom2108AND2109AND2110AFloorTwo, new Edge[]{
            new Edge(52.5, nodeNameHallwayFloorTwoG, 0, Keys.directions_exitTheRoom+ " and t"+Keys.directions_turnLeft.substring(1)+", continuing down the hallway" ),
            new Edge(37.5, nodeNameHallwayFloorTwoF3, 1, Keys.directions_exitTheRoom+ ", t"+Keys.directions_turnRight.substring(1)+", and c"+Keys.directions_continueStraight.substring(1))
        }),
        //patient room
        new Node(nodeNameRoom2110FloorTwo, new Edge[]{
            new Edge(41.493, nodeNameHallwayFloorTwoG, 0, Keys.directions_exitTheRoom+ ", t"+Keys.directions_turnLeft.substring(1)+",and c"+Keys.directions_continueStraight ),
            new Edge(44.734 + 3, nodeNameHallwayFloorTwoF3, 1, Keys.directions_exitTheRoom+ " and t"+Keys.directions_turnRight.substring(1)+", continuing down the hallway")
        }),
        //patient room
        new Node(nodeNameRoom2111FloorTwo, new Edge[]{
            new Edge(34.469, nodeNameHallwayFloorTwoG, 0, Keys.directions_exitTheRoom+ ", t"+Keys.directions_turnLeft.substring(1)+",and c"+Keys.directions_continueStraight ),
            new Edge(41.092 + 16.5, nodeNameHallwayFloorTwoF3, 1, Keys.directions_exitTheRoom+ " and t"+Keys.directions_turnRight.substring(1)+", continuing down the hallway")
        }),
        //patient room
        new Node(nodeNameRoom2112FloorTwo, new Edge[]{
            new Edge(15.573, nodeNameHallwayFloorTwoG, 0, Keys.directions_exitTheRoom+ ", t"+Keys.directions_turnLeft.substring(1)+",and c"+Keys.directions_continueStraight),
            new Edge(30.255 + 45, nodeNameHallwayFloorTwoF3, 1, Keys.directions_exitTheRoom+ " and t"+Keys.directions_turnRight.substring(1)+", continuing down the hallway")
        }),
        //patient room
        new Node(nodeNameRoom2116FloorTwo, new Edge[]{
            new Edge(21.521 + 24.245, nodeNameHallwayFloorTwoA, 0, Keys.directions_exitTheRoom+", t"+Keys.directions_turnLeft.substring(1)+", and  c"+Keys.directions_continueStraight.substring(1)),
            new Edge(71, nodeNameHallwayFloorTwoF2, 1,Keys.directions_exitTheRoom+", t"+Keys.directions_turnRight.substring(1)+", and  c"+Keys.directions_continueStraight.substring(1))
        }),
        //patient room
        new Node(nodeNameRoom2117FloorTwo, new Edge[]{
            new Edge(46.451 + 24.245, nodeNameHallwayFloorTwoA, 0,Keys.directions_exitTheRoom+", t"+Keys.directions_turnLeft.substring(1)+", and  c"+Keys.directions_continueStraight.substring(1)),
            new Edge(56.611, nodeNameHallwayFloorTwoF2, 1,Keys.directions_exitTheRoom+", t"+Keys.directions_turnRight.substring(1)+", and  c"+Keys.directions_continueStraight.substring(1))
        }),
        //patient room
        new Node(nodeNameRoom2118FloorTwo, new Edge[]{
            new Edge(57.109 + 24.245, nodeNameHallwayFloorTwoA, 0,Keys.directions_exitTheRoom+", t"+Keys.directions_turnLeft.substring(1)+", and  c"+Keys.directions_continueStraight.substring(1)),
            new Edge(34.5, nodeNameHallwayFloorTwoF2, 1,Keys.directions_exitTheRoom+", t"+Keys.directions_turnRight.substring(1)+", and  c"+Keys.directions_continueStraight.substring(1))
        }),
        //patient room
        new Node(nodeNameRoom2119FloorTwo, new Edge[]{
            new Edge(64.243 + 24.245, nodeNameHallwayFloorTwoA, 0,Keys.directions_exitTheRoom+", t"+Keys.directions_turnLeft.substring(1)+", and  c"+Keys.directions_continueStraight.substring(1)),
            new Edge(26.589, nodeNameHallwayFloorTwoF2, 1,Keys.directions_exitTheRoom+", t"+Keys.directions_turnRight.substring(1)+", and  c"+Keys.directions_continueStraight.substring(1))
        }),
        //patient room
        new Node(nodeNameRoom2120FloorTwo, new Edge[]{
            new Edge(82 + 24.245, nodeNameHallwayFloorTwoA, 0,Keys.directions_exitTheRoom+", t"+Keys.directions_turnLeft.substring(1)+", and  c"+Keys.directions_continueStraight.substring(1)),
            new Edge(14, nodeNameHallwayFloorTwoF2, 1,Keys.directions_exitTheRoom+", t"+Keys.directions_turnRight.substring(1)+", and  c"+Keys.directions_continueStraight.substring(1))
        }),
        //patient lounge
        new Node(nodeNameRoom2121FloorTwo, new Edge[]{
            new Edge(85.269, nodeNameHallwayFloorTwoH2, 0),
            new Edge(9.088, nodeNameHallwayFloorTwoF2, 1)
        }),
        //patient room
        new Node(nodeNameRoom2122FloorTwo, new Edge[]{
            new Edge(72.741, nodeNameHallwayFloorTwoH2, 0, Keys.directions_exitTheRoom+", t"+Keys.directions_turnRight.substring(1)+", and c"+Keys.directions_continueStraight.substring(1)),
            new Edge(16, nodeNameHallwayFloorTwoF2, 1 , Keys.directions_exitTheRoom+" and t"+Keys.directions_turnLeft.substring(1)), 
            
        }),
        //patient room
        new Node(nodeNameRoom2123FloorTwo, new Edge[]{
            new Edge(56.907, nodeNameHallwayFloorTwoH2, 0,Keys.directions_exitTheRoom+", t"+Keys.directions_turnRight.substring(1)+", and c"+Keys.directions_continueStraight.substring(1)),
            new Edge(29.728, nodeNameHallwayFloorTwoF2, 1,Keys.directions_exitTheRoom+", t"+Keys.directions_turnLeft.substring(1)+", and c"+Keys.directions_continueStraight.substring(1))
        }),
        //patient room
        new Node(nodeNameRoom2124FloorTwo, new Edge[]{
            new Edge(45.893, nodeNameHallwayFloorTwoH2, 0,Keys.directions_exitTheRoom+", t"+Keys.directions_turnRight.substring(1)+", and c"+Keys.directions_continueStraight.substring(1)),
            new Edge(40.468, nodeNameHallwayFloorTwoF2, 1,Keys.directions_exitTheRoom+", t"+Keys.directions_turnLeft.substring(1)+", and c"+Keys.directions_continueStraight.substring(1))
        }),
        //patient room
        new Node(nodeNameRoom2125FloorTwo, new Edge[]{
            new Edge(33.55, nodeNameHallwayFloorTwoH2, 0,Keys.directions_exitTheRoom+", t"+Keys.directions_turnRight.substring(1)+", and c"+Keys.directions_continueStraight.substring(1)),
            new Edge(53.33, nodeNameHallwayFloorTwoF2, 1,Keys.directions_exitTheRoom+", t"+Keys.directions_turnLeft.substring(1)+", and c"+Keys.directions_continueStraight.substring(1))
        }),
        //patient room
        new Node(nodeNameRoom2126FloorTwo, new Edge[]{
            new Edge(12.478, nodeNameHallwayFloorTwoH2, 0,Keys.directions_exitTheRoom+", t"+Keys.directions_turnRight.substring(1)+", and c"+Keys.directions_continueStraight.substring(1)),
            new Edge(76.409, nodeNameHallwayFloorTwoF2, 1,Keys.directions_exitTheRoom+", t"+Keys.directions_turnLeft.substring(1)+", and c"+Keys.directions_continueStraight.substring(1))
        }),
        //floor tworoom 2142 office             
        new Node(nodeNameRoom2142FloorTwo, new Edge[]{
            new Edge(2, nodeNameHallwayFloorTwoE, 0),
            new Edge(37, nodeNameHallwayFloorTwoF1, 1)
        }),
        //floor tworoom 2143  Burn rehabilitation office             
        new Node(nodeNameRoom2143FloorTwo, new Edge[]{
            new Edge(18.741, nodeNameHallwayFloorTwoE, 0, Keys.directions_turnRight),
            new Edge(28, nodeNameHallwayFloorTwoF1, 1)
        }),
        //floor tworoom 2144 patient room Burn rehabilitation office             
        new Node(nodeNameRoom2144AFloorTwo, new Edge[]{
            new Edge(1.041, nodeNameHallwayFloorTwoE, 0),
            new Edge(41.457 + 22.805, nodeNameHallwayFloorTwoF3, 1)
        }),
        //floor tworoom 2154, Office, need to look up who is in here             
        new Node(nodeNameRoom2154FloorTwo, new Edge[]{
            new Edge(1.041 + 2.969, nodeNameHallwayFloorTwoE, 0),
            new Edge(41.457 + 22.805 - 2.969, nodeNameHallwayFloorTwoF3, 1)
        }),
        //BICU treatment!!!
        new Node(nodeNameRoom2155FloorTwo, new Edge[]{
            new Edge(13.5, nodeNameHallwayFloorTwoG, 0),
            new Edge(24.7, nodeNameHallwayFloorTwoF3, 1),
            new Edge(13.299, nodeNameHallwayFloorTwoF1, 2)
        }),
        //treatment!!! room.
        new Node(nodeNameRoom2183FloorTwo, new Edge[]{
            new Edge(35.678, nodeNameHallwayFloorTwoH2, 0),
            new Edge(49.302, nodeNameHallwayFloorTwoF2, 1),}),
        //patient room
        new Node(nodeNameRoom2301FloorTwo, new Edge[]{
            new Edge(41.833, nodeNameHallwayFloorTwoB2, 0),}),
        //patient room
        new Node(nodeNameRoom2302FloorTwo, new Edge[]{
            new Edge(24.904, nodeNameHallwayFloorTwoB2, 0),}),
        //patient room
        new Node(nodeNameRoom2303FloorTwo, new Edge[]{
            new Edge(19.078, nodeNameHallwayFloorTwoB2, 0),}),
        //patient room
        new Node(nodeNameRoom2304FloorTwo, new Edge[]{
            new Edge(4, nodeNameHallwayFloorTwoB2, 0),}),//patient room
        new Node(nodeNameRoom2305FloorTwo, new Edge[]{
            new Edge(4, nodeNameHallwayFloorTwoB2, 0),
            new Edge(68.209 + 16.332, nodeNameHallwayFloorTwoC, 1)
        }),
        //patient room
        new Node(nodeNameRoom2306FloorTwo, new Edge[]{
            new Edge(14.479, nodeNameHallwayFloorTwoB2, 0),
            new Edge(50.620 + 16.332, nodeNameHallwayFloorTwoC, 1)
        }),
        //patient room
        new Node(nodeNameRoom2307FloorTwo, new Edge[]{
            new Edge(20.193, nodeNameHallwayFloorTwoB2, 0),
            new Edge(44.280 + 16.332, nodeNameHallwayFloorTwoC, 1)
        }),
        //patient room
        new Node(nodeNameRoom2308FloorTwo, new Edge[]{
            new Edge(36.669, nodeNameHallwayFloorTwoB2, 0),
            new Edge(27.385 + 16.332, nodeNameHallwayFloorTwoC, 1)
        }),
        //patient room
        new Node(nodeNameRoom2309FloorTwo, new Edge[]{
            new Edge(43.368, nodeNameHallwayFloorTwoB2, 0),
            new Edge(21.077 + 16.332, nodeNameHallwayFloorTwoC, 1)
        }),
        //patient room
        new Node(nodeNameRoom2310FloorTwo, new Edge[]{
            new Edge(60.207, nodeNameHallwayFloorTwoB2, 0),
            new Edge(12.030 + 16.332, nodeNameHallwayFloorTwoC, 1)
        }),
        //physical therapy room
        new Node(nodeNameRoom2311FloorTwo, new Edge[]{
            new Edge(72.346, nodeNameHallwayFloorTwoB2, 0),
            new Edge(7.811 + 16.332, nodeNameHallwayFloorTwoC, 1)
        }),
        //physical therapy room
        new Node(nodeNameRoom2314FloorTwo, new Edge[]{
            new Edge(50 + 25.29 + 79.016 + 82.817 - 9.262, nodeNameHallwayFloorTwoD, 0),
            new Edge(9.262, nodeNameHallwayFloorTwoC, 1)
        }),
        //treatment room
        new Node(nodeNameRoom2315FloorTwo, new Edge[]{
            new Edge(19, nodeNameHallwayFloorTwoC, 0),
            new Edge(50 + 25.29 + 79.016 + 82.817 - 19, nodeNameHallwayFloorTwoD, 1),
        }),
        //patient room
        new Node(nodeNameRoom2316FloorTwo, new Edge[]{
            new Edge(1.25, nodeNameHallwayFloorTwoC, 0),
            new Edge(67.571, nodeNameHallwayFloorTwoB1, 1),
        }),
        //patient room
        new Node(nodeNameRoom2317FloorTwo, new Edge[]{
            new Edge(4, nodeNameHallwayFloorTwoC, 0),
            new Edge(61.116, nodeNameHallwayFloorTwoB1, 1),
        }),
        //patient room
        new Node(nodeNameRoom2318FloorTwo, new Edge[]{
            new Edge(20.740, nodeNameHallwayFloorTwoC, 0),
            new Edge(43.613, nodeNameHallwayFloorTwoB1, 1),
        }),
        //patient room
        new Node(nodeNameRoom2319FloorTwo, new Edge[]{
            new Edge(24.673, nodeNameHallwayFloorTwoC, 0),
            new Edge(36.958, nodeNameHallwayFloorTwoB1, 1),
        }),
        //patient room
        new Node(nodeNameRoom2320FloorTwo, new Edge[]{
            new Edge(43.507, nodeNameHallwayFloorTwoC, 0),
            new Edge(20.5, nodeNameHallwayFloorTwoB1, 1),
        }),
        //patient room
        new Node(nodeNameRoom2321FloorTwo, new Edge[]{
            new Edge(50.592, nodeNameHallwayFloorTwoC, 0),
            new Edge(18.638, nodeNameHallwayFloorTwoB1, 1),
        }),
        //patient room
        new Node(nodeNameRoom2322FloorTwo, new Edge[]{
            new Edge(66.198, nodeNameHallwayFloorTwoC, 0),
            new Edge(5, nodeNameHallwayFloorTwoB1, 1),
        }),
        //patient room
        new Node(nodeNameRoom2323FloorTwo, new Edge[]{
            new Edge(78.755, nodeNameHallwayFloorTwoA, 0),
            new Edge(5, nodeNameHallwayFloorTwoB1, 1),
        }),
        //patient room
        new Node(nodeNameRoom2324FloorTwo, new Edge[]{
            new Edge(60.947, nodeNameHallwayFloorTwoA, 0),
            new Edge(18.379, nodeNameHallwayFloorTwoB1, 1),
        }),
        //patient room
        new Node(nodeNameRoom2325FloorTwo, new Edge[]{
            new Edge(54.757, nodeNameHallwayFloorTwoA, 0),
            new Edge(24.608, nodeNameHallwayFloorTwoB1, 1),
        }),
        //floorTwoPhones
        new Node(nodeNameRoom2350AFloorTwo, descriptionRoom2350AFloorTwo, new Edge[]{
            new Edge(9.679, nodeNameElevatorFloorTwo, 0),
            new Edge(9.581, nodeNameHallwayFloorTwoA, 1)
        }),
        //THERAPY room
        new Node(nodeNameRoom2401FloorTwo, new Edge[]{
            new Edge(52.960, nodeNameHallwayFloorTwoA, 0),
            new Edge(31.519, nodeNameHallwayFloorTwoD, 1),
        }),
        //patient room
        new Node(nodeNameRoom2402FloorTwo, new Edge[]{
            new Edge(73.322, nodeNameHallwayFloorTwoA, 0),
            new Edge(14.097, nodeNameHallwayFloorTwoD, 1),
        }),
        //patient room
        new Node(nodeNameRoom2403FloorTwo, new Edge[]{
            new Edge(50 + 25.29 + 79.016 + 82.817 - 5.332, nodeNameHallwayFloorTwoC, 0),
            new Edge(5.332, nodeNameHallwayFloorTwoD, 1),
        }),
        //patient room
        new Node(nodeNameRoom2404FloorTwo, new Edge[]{
            new Edge(71.371, nodeNameHallwayFloorTwoD, 0, Keys.directions_turnLeft + ". " + Keys.directions_yourDestinationIsOnYourLeft),
        }),
        //patient room
        new Node(nodeNameRoom2405FloorTwo, new Edge[]{
            new Edge(88.707, nodeNameHallwayFloorTwoD, 0, Keys.directions_turnLeft + ". " + Keys.directions_yourDestinationIsOnYourLeft),
        }),
        //patient room
        new Node(nodeNameRoom2406FloorTwo, new Edge[]{
            new Edge(95.335, nodeNameHallwayFloorTwoD, 0, Keys.directions_turnLeft + ". " + Keys.directions_yourDestinationIsOnYourLeft),
        }),
        //patient room
        new Node(nodeNameRoom2407FloorTwo, new Edge[]{
            new Edge(112.691, nodeNameHallwayFloorTwoD, 0, Keys.directions_turnLeft + ". " + Keys.directions_yourDestinationIsOnYourLeft),
        }),
        //patient room
        new Node(nodeNameRoom2408FloorTwo, new Edge[]{
            new Edge(119.733, nodeNameHallwayFloorTwoD, 0, Keys.directions_turnLeft + ". " + Keys.directions_yourDestinationIsOnYourLeft),
        }),
        //patient room
        new Node(nodeNameRoom2409FloorTwo, new Edge[]{
            new Edge(113.103, nodeNameHallwayFloorTwoD, 0, Keys.directions_turnLeft + ". " + Keys.directions_yourDestinationIsOnYourRight),
        }),
        //patient room
        new Node(nodeNameRoom2410FloorTwo, new Edge[]{
            new Edge(95.609, nodeNameHallwayFloorTwoD, 0, Keys.directions_turnLeft + ". " + Keys.directions_yourDestinationIsOnYourRight),
        }),
        //patient room
        new Node(nodeNameRoom2411FloorTwo, new Edge[]{
            new Edge(89.316, nodeNameHallwayFloorTwoD, 0, Keys.directions_turnLeft + ". " + Keys.directions_yourDestinationIsOnYourRight),
        }),
        //patient room
        new Node(nodeNameRoom2412FloorTwo, new Edge[]{
            new Edge(75.477, nodeNameHallwayFloorTwoD, 0, Keys.directions_turnLeft + ". " + Keys.directions_yourDestinationIsOnYourRight),
        }),
        //patient room
        new Node(nodeNameRoom2414FloorTwo, new Edge[]{
            new Edge(63.073, nodeNameHallwayFloorTwoD, 0, Keys.directions_turnLeft + ". " + Keys.directions_yourDestinationIsOnYourRight),
        }),
        //patient room
        new Node(nodeNameRoom2415FloorTwo, new Edge[]{
            new Edge(25.616, nodeNameHallwayFloorTwoD, 0, Keys.directions_turnLeft + ". " + Keys.directions_yourDestinationIsOnYourRight),
        }),
        //patient room
        new Node(nodeNameRoom2416FloorTwo, new Edge[]{
            new Edge(22, nodeNameHallwayFloorTwoD, 0, Keys.directions_turnLeft + ". " + Keys.directions_yourDestinationIsOnYourRight),
        }),
        //TODO start at 2414
        //office and phys. office and consult room
        new Node(nodeNameRoom2430AND2433AND2434FloorTwo, new Edge[]{
            new Edge(37.857, nodeNameHallwayFloorTwoA, 0),
            new Edge(49.526, nodeNameHallwayFloorTwoD, 1),
        }),
        //patientRoom
        new Node(nodeNameRoom2711FloorTwo, new Edge[]{
            new Edge(9, nodeNameHallwayFloorTwoH1, 0),
            new Edge(52.235, nodeNameHallwayFloorTwoG, 1)
        }),
        //patientRoom
        new Node(nodeNameRoom2712FloorTwo, new Edge[]{
            new Edge(11, nodeNameHallwayFloorTwoH1, 0),
            new Edge(57.539, nodeNameHallwayFloorTwoI1, 1)
        }),
        //patientRoom
        new Node(nodeNameRoom2714FloorTwo, new Edge[]{
            new Edge(37.121, nodeNameHallwayFloorTwoH1, 0),
            new Edge(34.937, nodeNameHallwayFloorTwoI1, 1)
        }),
        //patientRoom
        new Node(nodeNameRoom2715FloorTwo, new Edge[]{
            new Edge(37.683, nodeNameHallwayFloorTwoH1, 0),
            new Edge(22.879, nodeNameHallwayFloorTwoI1, 1)
        }),
        //patientRoom
        new Node(nodeNameRoom2716FloorTwo, new Edge[]{
            new Edge(55.981, nodeNameHallwayFloorTwoH1, 0),
            new Edge(10.842, nodeNameHallwayFloorTwoI1, 1)
        }),
        //patientRoom
        new Node(nodeNameRoom2717FloorTwo, new Edge[]{
            new Edge(55.981, nodeNameHallwayFloorTwoH1, 0)
        }),
        //patientRoom
        new Node(nodeNameRoom2718FloorTwo, new Edge[]{
            new Edge(15.8, nodeNameHallwayFloorTwoI1, 0),
            new Edge(18, nodeNameHallwayFloorTwoJ1, 1)
        }),
        //patientRoom
        new Node(nodeNameRoom2719FloorTwo, new Edge[]{
            new Edge(24, nodeNameHallwayFloorTwoI1, 0),
            new Edge(9, nodeNameHallwayFloorTwoJ1, 1)
        }),
        //patientRoom
        new Node(nodeNameRoom2720FloorTwo, new Edge[]{
            new Edge(8.931, nodeNameHallwayFloorTwoJ1, 0)
        }),
        //patientRoom
        new Node(nodeNameRoom2721FloorTwo, new Edge[]{
            new Edge(8.931, nodeNameHallwayFloorTwoJ2, 0)
        }),
        //patientRoom
        new Node(nodeNameRoom2722FloorTwo, new Edge[]{
            new Edge(24, nodeNameHallwayFloorTwoI2, 0),
            new Edge(9, nodeNameHallwayFloorTwoJ2, 1)
        }),
        //patientRoom
        new Node(nodeNameRoom2723FloorTwo, new Edge[]{
            new Edge(15.8, nodeNameHallwayFloorTwoI2, 0),
            new Edge(18, nodeNameHallwayFloorTwoJ2, 1)
        }),
        //patientRoom
        new Node(nodeNameRoom2724FloorTwo, new Edge[]{
            new Edge(55.981, nodeNameHallwayFloorTwoH2, 0)
        }),
        //patientRoom
        new Node(nodeNameRoom2725FloorTwo, new Edge[]{
            new Edge(55.981, nodeNameHallwayFloorTwoH2, 0),
            new Edge(10.842, nodeNameHallwayFloorTwoI2, 1)
        }),
        //patientRoom
        new Node(nodeNameRoom2726FloorTwo, new Edge[]{
            new Edge(37.683, nodeNameHallwayFloorTwoH2, 0),
            new Edge(22.879, nodeNameHallwayFloorTwoI2, 1)
        }),
        //patientRoom
        new Node(nodeNameRoom2727FloorTwo, new Edge[]{
            new Edge(37.121, nodeNameHallwayFloorTwoH1, 0),
            new Edge(34.937, nodeNameHallwayFloorTwoI1, 1)
        }),
        //patientRoom
        new Node(nodeNameRoom2729FloorTwo, new Edge[]{
            new Edge(11, nodeNameHallwayFloorTwoH2, 0),
            new Edge(57.539, nodeNameHallwayFloorTwoI2, 1)
        }),
        //patientRoom
        new Node(nodeNameRoom2730FloorTwo, new Edge[]{
            new Edge(9, nodeNameHallwayFloorTwoH2, 0),
            new Edge(52.235 + 38.158, nodeNameHallwayFloorTwoF2, 1)
        }),
        //pateint lounge
        new Node(nodeNameRoom2777FloorTwo, new Edge[]{
            new Edge(12.633, nodeNameHallwayFloorTwoH2, 0),
            new Edge(52.235, nodeNameHallwayFloorTwoF2, 1)
        }),
        //medical room
        new Node(nodeNameRoom2780FloorTwo, new Edge[]{
            new Edge(2.4, nodeNameHallwayFloorTwoI1, 0),
            new Edge(17.127, nodeNameHallwayFloorTwoI2, 1)
        }),
        //EastWingFloorTwo 244
        new Node(nodeNameRoom244EastWingFloorTwo, descriptionRoom244EastWingFloorTwo, new Edge[]{
            new Edge(10.765, nodeNameElevatorEastWingFloorTwo, 0)
        }),
        //END FLOOR TWO - START FLOOR THREE  
        //EastWingFloorThree 302
        new Node(nodeNameRoom302EastWingFloorThree, descriptionRoom302EastWingFloorThree, new Edge[]{
            new Edge(36.983, nodeNameElevatorEastWingFloorThree, 0)
        }),
        //EastWingFloorThree 306
        new Node(nodeNameRoom306EastWingFloorThree, descriptionRoom306EastWingFloorThree, new Edge[]{
            new Edge(68.945, nodeNameElevatorEastWingFloorThree, 0)
        }),
        //room 3063
        new Node(nodeNameRoom3063FloorThree, descriptionRoom3063FloorThree, new Edge[]{
                new Edge(14.004+24.402+57.044+24.153+55.879, nodeNameHallwayFloorThreeC1, 0),
                new Edge(72.113, nodeNameHallwayFloorThreeA, 1)
        }),
        //room 3063A
        new Node(nodeNameRoom3063AFloorThree, descriptionRoom3063AFloorThree, new Edge[]{
                new Edge(24.402+57.044+24.153+55.879, nodeNameHallwayFloorThreeC1, 0),
                new Edge(85.404, nodeNameHallwayFloorThreeA, 1)
        }),
        //room 3064
        new Node(nodeNameRoom3064FloorThree, descriptionRoom3064FloorThree, new Edge[]{
                new Edge(25.564+24.402+57.044+24.153+55.879, nodeNameHallwayFloorThreeC1, 0),
                new Edge(63.330, nodeNameHallwayFloorThreeA, 1)
        }),
        //room 3064A
        new Node(nodeNameRoom3064AFloorThree, descriptionRoom3064AFloorThree, new Edge[]{
                new Edge(21.332+24.402+57.044+24.153+55.879, nodeNameHallwayFloorThreeC1, 0),
                new Edge(67.562, nodeNameHallwayFloorThreeA, 1)
        }),
        //EastWingFloorThree 307
        new Node(nodeNameRoom307EastWingFloorThree, descriptionRoom307EastWingFloorThree, new Edge[]{
            new Edge(69.945, nodeNameElevatorEastWingFloorThree, 0)
        }),
        //EastwingFloorThree 308
        new Node(nodeNameRoom308EastWingFloorThree, descriptionRoom308EastWingFloorThree, new Edge[]{
            new Edge(69.00, nodeNameElevatorEastWingFloorThree, 0)
        }),
        //GO OVER!!
        //floorThreeRestroom
        //new Node(nodeNameRoom3301DFloorThree, descriptionRoom3301DFloorThree, new Edge[]{
            //new Edge(5.543, nodeNameElevatorFloorThree, 0),
            //new Edge(22.173, nodeNameHallwayFloorThreeE, 1)
        //}),
        //CLUSTER: room 3010, 3148, 3149, 3152, 3153, 3155(3155-A, 3155-B; IDK THERES DOUBLE OF 3154, 3102, 3103
        //go over 
        new Node(nodeNameRoom3010AND3148AND3149AND3152AND3153AND3155FloorThree, descriptionRoom3010AND3148AND3149AND3152AND3153AND3155FloorThree, new Edge[]{
                new Edge(17.371+36.115, nodeNameHallwayFloorThreeE, 0), //measured from 3010
                new Edge(34.994, nodeNameHallwayFloorThreeA, 1) //measured from 3148
        }),
        //room 3101
        //TWO ENTRANCES, go over
        new Node(nodeNameRoom3101FloorThree, descriptionRoom3101FloorThree, new Edge[]{
                new Edge(9.082+21.728, nodeNameHallwayFloorThreeB, 0)
        }),
        //room 3102
        new Node(nodeNameRoom3102FloorThree, descriptionRoom3102FloorThree, new Edge[]{
                new Edge(6.118+58.306, nodeNameHallwayFloorThreeB, 0)
        }),
        //room 3103, 3103-A, 3103-B
        new Node(nodeNameRoom3103FloorThree, descriptionRoom3103FloorThree, new Edge[]{
                new Edge(58.306, nodeNameHallwayFloorThreeB, 0)
        }),
        //room 3104
        new Node(nodeNameRoom3104FloorThree, descriptionRoom3104FloorThree, new Edge[]{
                new Edge(58.306, nodeNameHallwayFloorThreeB, 0)
        }),
        //room 3105
        new Node(nodeNameRoom3105FloorThree, descriptionRoom3105FloorThree, new Edge[]{
                new Edge(9.354+11.313+58.306, nodeNameHallwayFloorThreeB, 0)
        }),
        //room 3106
        new Node(nodeNameRoom3106FloorThree, descriptionRoom3106FloorThree, new Edge[]{
                new Edge(11.313+58.306, nodeNameHallwayFloorThreeB, 0)
        }),
        //room 3107
        new Node(nodeNameRoom3107FloorThree, descriptionRoom3107FloorThree, new Edge[]{
                new Edge(14.378+3.515+58.306, nodeNameHallwayFloorThreeB, 0)
        }),
        //room 3108
        new Node(nodeNameRoom3108FloorThree, descriptionRoom3108FloorThree, new Edge[]{
                new Edge(4.258+14.749+50.460, nodeNameHallwayFloorThreeB, 0)
        }),
        //room 3109
        new Node(nodeNameRoom3109FloorThree, descriptionRoom3109FloorThree, new Edge[]{
                new Edge(35.094, nodeNameHallwayFloorThreeB, 0)
        }),
        //room 3110
        new Node(nodeNameRoom3110FloorThree, descriptionRoom3110FloorThree, new Edge[]{
                new Edge(19.823, nodeNameHallwayFloorThreeB, 0)
        }),
        //room 3111
        new Node(nodeNameRoom3111FloorThree, descriptionRoom3111FloorThree, new Edge[]{
                new Edge(7.820, nodeNameHallwayFloorThreeB, 0)
        }),
        //room 3112     
        new Node(nodeNameRoom3112FloorThree, descriptionRoom3112FloorThree, new Edge[]{
                new Edge(3.019, nodeNameHallwayFloorThreeB, 0)
        }),
        //room 3114
        new Node(nodeNameRoom3114FloorThree, descriptionRoom3114FloorThree, new Edge[]{
                new Edge(6.409+21.728, nodeNameHallwayFloorThreeB, 0)
        }),
        //room 3115
        new Node(nodeNameRoom3115FloorThree, descriptionRoom3115FloorThree, new Edge[]{
                new Edge(37.382, nodeNameHallwayFloorThreeB, 0)
        }),
        //room 3116
        new Node(nodeNameRoom3116FloorThree, descriptionRoom3116FloorThree, new Edge[]{
                new Edge(3.095+50.583, nodeNameHallwayFloorThreeB, 0)
        }),
        //room 3117
        new Node(nodeNameRoom3117FloorThree, descriptionRoom3117FloorThree, new Edge[]{
                new Edge(3.514, nodeNameHallwayFloorThreeB, 0),
                new Edge(26.999, nodeNameHallwayFloorThreeA, 1)
        }),
        //room 3118
        new Node(nodeNameRoom3118FloorThree, descriptionRoom3118FloorThree, new Edge[]{
                new Edge(2.468, nodeNameHallwayFloorThreeB, 0)
        }),
        //room 3119
        new Node(nodeNameRoom3119FloorThree, descriptionRoom3119FloorThree, new Edge[]{
                new Edge(21.158, nodeNameHallwayFloorThreeB, 0)
        }),
        //room 3120 and 3121 and 3121-A
        new Node(nodeNameRoom3120AND3121AND3121AFloorThree, descriptionRoom3120AND3121AND3121AFloorThree, new Edge[]{
                new Edge(8.023+32.968+85.701, nodeNameHallwayFloorThreeA, 0),
                new Edge(54.052+31.602+47.888, nodeNameHallwayFloorThreeC1, 1)
        }),
        //room 3122 and 3124 and 3122-A and 3124-A
        //go over 
        new Node(nodeNameRoom3122AND3124FloorThree, descriptionRoom3122AND3124, new Edge[]{
                new Edge(10.394+37.147+32.468+88.645, nodeNameHallwayFloorThreeA, 0), //measured from 3122 door
                new Edge(10.394+27.751+31.602+47.888, nodeNameHallwayFloorThreeC1, 1)
        }),
        //room 3123
        new Node(nodeNameRoom3123FloorThree, descriptionRoom3123FloorThree, new Edge[]{
                new Edge(45.093+32.468+88.595, nodeNameHallwayFloorThreeA, 0),
                new Edge(19.793+31.800+47.639, nodeNameHallwayFloorThreeC1, 1)
        }),
        //CLUSTER: room 3125, 3126, 3127, 3129, 3130, 3130A, ALSO IDK THERES DOUBLE OF 3110
        //go over - TWO DOORWAYS
        new Node(nodeNameRoom3125AND3126AND3127AND3129AND3130AND3130AAND3134FloorThree, descriptionRoom3125AND3126AND3127AND3129AND3130AND3130AAND3134FloorThree, new Edge[]{
                new Edge(40.660+24.178+88.595, nodeNameHallwayFloorThreeA,0),//measured from 3130
                new Edge(3.638+55.879, nodeNameHallwayFloorThreeC1, 1)//measured from 3129
        }),
        //room 3128
        new Node(nodeNameRoom3128FloorThree, descriptionRoom3128FloorThree, new Edge[]{
                new Edge(51.375, nodeNameHallwayFloorThreeC1, 0),
                new Edge(4.463+24.128+57.044+24.178+88.645, nodeNameHallwayFloorThreeA,1)
        }),
        //room 3131 and room 3133 (BR)
        new Node(nodeNameRoom3131FloorThree, descriptionRoom3131FloorThree, new Edge[]{
                new Edge(53.183+24.178+88.896, nodeNameHallwayFloorThreeA, 0),
                new Edge(3.860+24.178+55.879, nodeNameHallwayFloorThreeC1, 1)
        }),
        //room 3141
        new Node(nodeNameRoom3141FloorThree, descriptionRoom3141FloorThree, new Edge[]{
                new Edge(44.842, nodeNameHallwayFloorThreeA, 0),
                new Edge(43.802+24.178+57.044+24.128+55.879, nodeNameHallwayFloorThreeC1, 1)
        }),
        //room 3142 and room 3144 (BR)
        new Node(nodeNameRoom3142FloorThree, descriptionRoom3142FloorThree, new Edge[]{
                new Edge(40.412, nodeNameHallwayFloorThreeA, 0),
                new Edge(48.233+24.178+57.044+24.128+55.879, nodeNameHallwayFloorThreeC1, 1)
        }),
        //room 3143 and 3145 
        new Node(nodeNameRoom3143AND3145FloorThree, descriptionRoom3143AND3145FloorThree, new Edge[]{
                new Edge(24.326, nodeNameHallwayFloorThreeA, 0),
                new Edge(64.319+24.178+57.044+24.128+55.879, nodeNameHallwayFloorThreeC1, 1)
        }),
        //room 3146    
        new Node(nodeNameRoom3146FloorThree, descriptionRoom3146FloorThree, new Edge[]{
                new Edge(11.136, nodeNameHallwayFloorThreeA, 0),
                new Edge(77.509+24.178+57.044+24.128+55.879, nodeNameHallwayFloorThreeC1, 1)
        }),
        //room 3147
        new Node(nodeNameRoom3147FloorThree, descriptionRoom3147FloorThree, new Edge[]{
                new Edge(2.994, nodeNameHallwayFloorThreeA, 0),
                new Edge(85.182+24.178+57.044+24.128+55.879, nodeNameHallwayFloorThreeC1, 1)
        }),
        //room 3154
        new Node(nodeNameRoom3154FloorThree, descriptionRoom3154FloorThree, new Edge[]{
                new Edge(38.012, nodeNameHallwayFloorThreeA, 0),
                new Edge(42.789+16.474+38.260, nodeNameHallwayFloorThreeE, 1)
        }),
        //room 3156
        new Node(nodeNameRoom3156FloorThree, descriptionRoom3156FloorThree, new Edge[]{
                new Edge(24.326, nodeNameHallwayFloorThreeA, 0),
                new Edge(64.319+24.178+57.044+24.128+55.879, nodeNameHallwayFloorThreeC1, 1)
        }),	
        //room 3161 
        new Node(nodeNameRoom3161FloorThree, descriptionRoom3161FloorThree, new Edge[]{
                new Edge(79.167+7.968+37.492, nodeNameHallwayFloorThreeB, 0)
        }),
        //room 3164	
        new Node(nodeNameRoom3164FloorThree, descriptionRoom3164FloorThree, new Edge[]{
                new Edge(63.008+7.968+37.492, nodeNameHallwayFloorThreeB, 0)
        }),
        //room 3165	
        new Node(nodeNameRoom3165FloorThree, descriptionRoom3165FloorThree, new Edge[]{
                new Edge(51.079+7.968+37.492, nodeNameHallwayFloorThreeB, 0)
        }),
        //room 3166
        new Node(nodeNameRoom3166FloorThree, descriptionRoom3166FloorThree, new Edge[]{
                new Edge(31.233+7.968+37.492, nodeNameHallwayFloorThreeB, 0)
        }),
        //room 3167	
        new Node(nodeNameRoom3167FloorThree, descriptionRoom3167FloorThree, new Edge[]{
                new Edge(12.274+7.968+37.492, nodeNameHallwayFloorThreeB, 0)
        }),
        //room 3169	
        new Node(nodeNameRoom3169FloorThree, descriptionRoom3169FloorThree, new Edge[]{
                new Edge(7.968+37.492, nodeNameHallwayFloorThreeB, 0)
        }),
        //room 3174
        new Node("nodeNameRoom3174FloorThree", new Edge[]{
            new Edge(33.288, nodeNameHallwayFloorThreeA, 0, Keys.directions_turnLeft),
            new Edge(86.065, nodeNameHallwayFloorThreeE, 1, "Turn Right & continue straight. Make a right towards the elevators. Continue straight towards the lobby.")
        }),
        //room 3452A
        new Node("nodeNameRoom3452AFloorThree", new Edge[]{
            new Edge(27.723+61.749, nodeNameHallwayFloorThreeA, 0, "Turn left and continue to the end of the hall. Then turn left."),
            new Edge(31.458+47.522, nodeNameHallwayFloorThreeE, 1, "Turn left and continue to the end of the hall. Then turn right towards the elevators. Continue straight towards the lobby.")
        }),
        //room 3452B
        new Node("nodeNameRoom3452BFloorThree", new Edge[]{
            new Edge(27.723+61.749, nodeNameHallwayFloorThreeA, 0, "Exit from door away from the lobby. Turn right and continue to the end of the hall. Then turn left."),
            new Edge(31.602, nodeNameHallwayFloorThreeE, 1, "Exit and turn right elevators and head towards the lobby.")
        }),
        //EastWingFloorThree 332
        new Node(nodeNameRoom332EastWingFloorThree, descriptionRoom332EastWingFloorThree, new Edge[]{
            new Edge(225.769, nodeNameElevatorEastWingFloorThree, 0)
        }),
        //FLOOR FOUR START
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
            new Edge(56.805, nodeNameHallwayFloorFourB1, 0, Keys.directions_turnLeft, addArrays(IPFloorFourRoom4102,
                            IPFloorFourRoom4103, IPFloorFourRoom4104, IPFloorFourRoom4105)),
            new Edge(32.746, nodeNameHallwayFloorFourA, 1, Keys.directions_turnRight, addArrays(IPFloorFourRoom4102, IPFloorFourRoom4153A))

        }),
        //floor fourroom 4103 patient room
        new Node(nodeNameRoom4103FloorFour, new Edge[]{
            new Edge(36.648, nodeNameHallwayFloorFourB1, 0, Keys.directions_turnLeft, addArrays(IPFloorFourRoom4103, IPFloorFourRoom4104, IPFloorFourRoom4105)),
            new Edge(52.903, nodeNameHallwayFloorFourA, 1, Keys.directions_turnRight, addArrays(IPFloorFourRoom4103, IPFloorFourRoom4102, IPFloorFourRoom4153A))
        }),
        //floor fourroom 4104 patient room
        new Node(nodeNameRoom4104FloorFour, new Edge[]{
            new Edge(18.549, nodeNameHallwayFloorFourB1, 0, Keys.directions_turnLeft, addArrays(IPFloorFourRoom4104, IPFloorFourRoom4105)),
            new Edge(71.002, nodeNameHallwayFloorFourA, 1, Keys.directions_turnRight, addArrays(IPFloorFourRoom4104,
                            IPFloorFourRoom4103, IPFloorFourRoom4102, IPFloorFourRoom4153A))
        }),
        //floor fourroom 4105 patient room
        new Node(nodeNameRoom4105FloorFour, new Edge[]{
            new Edge(9.141, nodeNameHallwayFloorFourB1, 0, Keys.directions_turnLeft, IPFloorFourRoom4105),
            new Edge(80.410, nodeNameHallwayFloorFourA, 1, Keys.directions_turnRight, addArrays(IPFloorFourRoom4105,
                            IPFloorFourRoom4104, IPFloorFourRoom4103, IPFloorFourRoom4102, IPFloorFourRoom4153A))
        }),
        //floor fourroom 4106 patient room
        new Node(nodeNameRoom4106FloorFour, new Edge[]{
            new Edge(14.085, nodeNameHallwayFloorFourB1, 0, Keys.directions_turnRight, addArrays(IPFloorFourRoom4106, IPFloorFourRoom4105)),
            new Edge(86.1, nodeNameHallwayFloorFourC1, 1, Keys.directions_turnLeft, addArrays(IPFloorFourRoom4106, IPFloorFourRoom4107,
                            IPFloorFourRoom4108, IPFloorFourRoom4109, IPFloorFourRoom4110, IPFloorFourRoom4112))
        }),
        //floor fourroom 4107 patient room
        new Node(nodeNameRoom4107FloorFour, new Edge[]{
            new Edge(71.335, nodeNameHallwayFloorFourC1, 0, Keys.directions_turnLeft, addArrays(IPFloorFourRoom4107, IPFloorFourRoom4108,
                            IPFloorFourRoom4109, IPFloorFourRoom4110, IPFloorFourRoom4112)),
            new Edge(20.113, nodeNameHallwayFloorFourB1, 1, Keys.directions_turnRight, addArrays(IPFloorFourRoom4107, IPFloorFourRoom4106))
        }),
        //floor fourroom 4108 patient room
        new Node(nodeNameRoom4108FloorFour, new Edge[]{
            new Edge(50, nodeNameHallwayFloorFourC1, 0, Keys.directions_turnLeft, addArrays(IPFloorFourRoom4108, IPFloorFourRoom4109, IPFloorFourRoom4110, IPFloorFourRoom4112)),
            new Edge(40, nodeNameHallwayFloorFourB1, 1, Keys.directions_turnRight, addArrays(IPFloorFourRoom4108, IPFloorFourRoom4107, IPFloorFourRoom4106))
        }),
        //floor fourroom 4109 patient room
        new Node(nodeNameRoom4109FloorFour, new Edge[]{
            new Edge(44.578, nodeNameHallwayFloorFourC1, 0, Keys.directions_turnLeft, addArrays(IPFloorFourRoom4109, IPFloorFourRoom4110, IPFloorFourRoom4112)),
            new Edge(47.842, nodeNameHallwayFloorFourB1, 1, Keys.directions_turnRight, addArrays(IPFloorFourRoom4109, IPFloorFourRoom4108, IPFloorFourRoom4107,
                            IPFloorFourRoom4106))
        }),
        //floor fourroom 4110 patient room
        new Node(nodeNameRoom4110FloorFour, new Edge[]{
            new Edge(35.98, nodeNameHallwayFloorFourC1, 0, Keys.directions_turnLeft, addArrays(IPFloorFourRoom4110, IPFloorFourRoom4112)),
            new Edge(69.075, nodeNameHallwayFloorFourB1, 1, Keys.directions_turnRight, addArrays(IPFloorFourRoom4110, IPFloorFourRoom4109,
                            IPFloorFourRoom4108, IPFloorFourRoom4107, IPFloorFourRoom4106))
        }),
        //floor fourroom 4112 patient room probably
        new Node("nodeNameRoom4112", new Edge[]{
            new Edge(1, nodeNameHallwayFloorFourC1, 0, Keys.directions_exitTheRoom)
        }),
        //floor fourroom 4130 patient room
        new Node(nodeNameRoom4130FloorFour, new Edge[]{
            new Edge(18.275, nodeNameHallwayFloorFourC2, 0, Keys.directions_turnRight, addArrays(IPFloorFourRoom4130, IPFloorFourRoom4728)),
            new Edge(80.901, nodeNameHallwayFloorFourB2, 1, Keys.directions_turnLeft, addArrays(IPFloorFourRoom4130, IPFloorFourRoom4131, IPFloorFourRoom4132,
                            IPFloorFourRoom4133, IPFloorFourRoom4134, IPFloorFourRoom4135))
        }),
        //floor fourroom 4131 patient room
        new Node(nodeNameRoom4131FloorFour, new Edge[]{
            new Edge(35.98, nodeNameHallwayFloorFourC2, 0, Keys.directions_turnRight, addArrays(IPFloorFourRoom4131, IPFloorFourRoom4130,
                            IPFloorFourRoom4728)),
            new Edge(69.075, nodeNameHallwayFloorFourB2, 1, Keys.directions_turnLeft, addArrays(IPFloorFourRoom4131, IPFloorFourRoom4132,
                            IPFloorFourRoom4133, IPFloorFourRoom4134, IPFloorFourRoom4135))
        }),
        //floor fourroom 4132 patient room
        new Node(nodeNameRoom4132FloorFour, new Edge[]{
            new Edge(44.578, nodeNameHallwayFloorFourC2, 0, Keys.directions_turnRight, addArrays(IPFloorFourRoom4132, IPFloorFourRoom4131, IPFloorFourRoom4130,
                            IPFloorFourRoom4728)),
            new Edge(47.842, nodeNameHallwayFloorFourB2, 1, Keys.directions_turnLeft, addArrays(IPFloorFourRoom4132, IPFloorFourRoom4133,
                            IPFloorFourRoom4134, IPFloorFourRoom4135))
        }),
        //floor fourroom 4133 patient room
        new Node(nodeNameRoom4133FloorFour, new Edge[]{
            new Edge(50, nodeNameHallwayFloorFourC2, 0, Keys.directions_turnRight, addArrays(IPFloorFourRoom4133, IPFloorFourRoom4132,
                            IPFloorFourRoom4131, IPFloorFourRoom4130, IPFloorFourRoom4728)),
            new Edge(40, nodeNameHallwayFloorFourB2, 1, Keys.directions_turnLeft, addArrays(IPFloorFourRoom4133, IPFloorFourRoom4134,
                            IPFloorFourRoom4135))
        }),
        //floor fourroom 4134 patient room
        new Node(nodeNameRoom4134FloorFour, new Edge[]{
            new Edge(71.335, nodeNameHallwayFloorFourC2, 0, Keys.directions_turnRight, addArrays(IPFloorFourRoom4134, IPFloorFourRoom4133,
                            IPFloorFourRoom4132, IPFloorFourRoom4131, IPFloorFourRoom4130, IPFloorFourRoom4728)),
            new Edge(20.113, nodeNameHallwayFloorFourB2, 1, Keys.directions_turnLeft, addArrays(IPFloorFourRoom4134, IPFloorFourRoom4135))
        }),
        //floor fourroom 4135 patient room
        new Node(nodeNameRoom4135FloorFour, new Edge[]{
            new Edge(14.085, nodeNameHallwayFloorFourB2, 0, Keys.directions_turnLeft, IPFloorFourRoom4135),
            new Edge(86.1, nodeNameHallwayFloorFourC2, 1, Keys.directions_turnRight, addArrays(IPFloorFourRoom4135, IPFloorFourRoom4134,
                            IPFloorFourRoom4133, IPFloorFourRoom4132, IPFloorFourRoom4131, IPFloorFourRoom4130, IPFloorFourRoom4728))
        }),
        //floor fourroom 4136 patient room
        new Node(nodeNameRoom4136FloorFour, new Edge[]{
            new Edge(9.141, nodeNameHallwayFloorFourB2, 0, Keys.directions_turnRight, IPFloorFourRoom4136),
            new Edge(80.410, nodeNameHallwayFloorFourA, 1, Keys.directions_turnLeft, addArrays(IPFloorFourRoom4136, IPFloorFourRoom4137,
                            IPFloorFourRoom4138, IPFloorFourRoom4139, IPFloorFourRoom4143A, IPFloorFourRoom4141A))
        }),
        //floor fourroom 4137 patient room
        new Node(nodeNameRoom4137FloorFour, new Edge[]{
            new Edge(18.549, nodeNameHallwayFloorFourB2, 0, Keys.directions_turnRight, addArrays(IPFloorFourRoom4137, IPFloorFourRoom4136)),
            new Edge(71.002, nodeNameHallwayFloorFourA, 1, Keys.directions_turnLeft, addArrays(IPFloorFourRoom4137, IPFloorFourRoom4138,
                            IPFloorFourRoom4139, IPFloorFourRoom4141A, IPFloorFourRoom4143A))
        }),
        //floor fourroom 4138 patient room
        new Node(nodeNameRoom4138FloorFour, new Edge[]{
            new Edge(36.648, nodeNameHallwayFloorFourB2, 0, Keys.directions_turnRight, addArrays(IPFloorFourRoom4138, IPFloorFourRoom4137,
                            IPFloorFourRoom4136)),
            new Edge(52.903, nodeNameHallwayFloorFourA, 1, Keys.directions_turnLeft, addArrays(IPFloorFourRoom4138, IPFloorFourRoom4139,
                            IPFloorFourRoom4141A, IPFloorFourRoom4143A))
        }),
        //floor four room 4139 patient room
        new Node(nodeNameRoom4139FloorFour, new Edge[]{
            new Edge(51.236, nodeNameHallwayFloorFourB2, 0, Keys.directions_turnRight, addArrays(IPFloorFourRoom4139, IPFloorFourRoom4138,
                            IPFloorFourRoom4137, IPFloorFourRoom4136)),
            new Edge(43.432, nodeNameHallwayFloorFourA, 1, Keys.directions_turnLeft, addArrays(IPFloorFourRoom4139, IPFloorFourRoom4141A,
                            IPFloorFourRoom4143A))
        }),
        //floor four room 4163 patient room
        new Node("nodeNameRoom4163FloorFour", new Edge[]{
            new Edge(36.141, nodeNameHallwayFloorFourB2, 0, Keys.directions_turnRight),
            new Edge(66.552, nodeNameHallwayFloorFourC2, 1, Keys.directions_turnLeft)
        }),
        //floorFourRestroom
        new Node("nodeNameRoom4172FloorFour", new Edge[]{
            new Edge(80.127, nodeNameHallwayFloorFourB1, 0, Keys.directions_turnRight),
            new Edge(19.470, nodeNameHallwayFloorFourC1, 1, Keys.directions_turnLeft)
        }),
        //floorFourRestroom
        new Node(nodeNameRoom4235FloorFour, descriptionRoom4235FloorFour, new Edge[]{
            new Edge(12.719, nodeNameElevatorFloorFour, 0),
            new Edge(12.618, nodeNameDeskFloorFour, 1)
        }),
        //floor four room 4712, patient room
        new Node(nodeNameRoom4712FloorFour, new Edge[]{
            new Edge(23.921, nodeNameHallwayFloorFourC1, 0, Keys.directions_turnRight,addArrays(IPFloorFourRoom4712,IPFloorFourRoom4112)),
            new Edge(38.225, nodeNameHallwayFloorFourD1, 1, Keys.directions_turnLeft,addArrays(IPFloorFourRoom4712,IPFloorFourRoom4714,
                    IPFloorFourRoom4715))
        }),

        //floor four room 4714, patient room
        new Node(nodeNameRoom4714FloorFour, new Edge[]{
            new Edge(45, nodeNameHallwayFloorFourC1, 0, Keys.directions_turnRight,addArrays(IPFloorFourRoom4714,IPFloorFourRoom4712,
                    IPFloorFourRoom4112)),
            new Edge(16, nodeNameHallwayFloorFourD1, 1, Keys.directions_turnLeft, addArrays(IPFloorFourRoom4714,IPFloorFourRoom4715))
        }),

        //floor four room 4715, patient room
        new Node(nodeNameRoom4715FloorFour, new Edge[]{
            new Edge(51, nodeNameHallwayFloorFourC1, 0, Keys.directions_turnRight,addArrays(IPFloorFourRoom4715,IPFloorFourRoom4714,
                    IPFloorFourRoom4712,IPFloorFourRoom4112)),
            new Edge(10, nodeNameHallwayFloorFourD1, 1, Keys.directions_turnLeft,IPFloorFourRoom4715)
        }),
        
        //floor four room 4717, patient room
        new Node(nodeNameRoom4717FloorFour, new Edge[]{
            new Edge(12.596, nodeNameHallwayFloorFourD1, 0, Keys.directions_turnRight,IPFloorFourRoom4717),
            new Edge(17.067, nodeNameHallwayFloorFourE1, 1, Keys.directions_turnLeft,addArrays(IPFloorFourRoom4717,IPFloorFourRoom4718,
                    IPFloorFourRoom4719))
        }),
        
        //floor four room 4718, patient room
        new Node(nodeNameRoom4718FloorFour, new Edge[]{
            new Edge(18, nodeNameHallwayFloorFourD1, 0, Keys.directions_turnRight,addArrays(IPFloorFourRoom4718,IPFloorFourRoom4717)),
            new Edge(12, nodeNameHallwayFloorFourE1, 1, Keys.directions_turnLeft,addArrays(IPFloorFourRoom4718,IPFloorFourRoom4719))
        }),
        
        //floor four room 4719, patient room
        new Node(nodeNameRoom4719FloorFour, new Edge[]{
            new Edge(3, nodeNameHallwayFloorFourE1, 0, Keys.directions_exitTheRoom,IPFloorFourRoom4719)
        }),
        
        //floor four room 4720, patient room
        new Node(nodeNameRoom4719FloorFour, new Edge[]{
            new Edge(3, nodeNameHallwayFloorFourE2, 0, Keys.directions_exitTheRoom,IPFloorFourRoom4720)
        }),
        
        //floor four room 4721, patient room
        new Node(nodeNameRoom4721FloorFour, new Edge[]{
            new Edge(18, nodeNameHallwayFloorFourD2, 0, Keys.directions_turnLeft,addArrays(IPFloorFourRoom4721,IPFloorFourRoom4722)),
            new Edge(12, nodeNameHallwayFloorFourE2, 1, Keys.directions_turnRight,addArrays(IPFloorFourRoom4721,IPFloorFourRoom4720))
        }),
        
        //floor four room 4722, patient room
        new Node(nodeNameRoom4717FloorFour, new Edge[]{
            new Edge(12.596, nodeNameHallwayFloorFourD2, 0, Keys.directions_turnLeft,addArrays(IPFloorFourRoom4722)),
            new Edge(17.067, nodeNameHallwayFloorFourE2, 1, Keys.directions_turnRight,addArrays(IPFloorFourRoom4722,IPFloorFourRoom4721,
                    IPFloorFourRoom4720))
        }),
        
        //floor four room 4723, patient room
        new Node(nodeNameRoom4723FloorFour, new Edge[]{
            new Edge(1, nodeNameHallwayFloorFourD2, 0, Keys.directions_exitTheRoom,IPFloorFourRoom4723)
        }),
        
        //floor four room 4724, patient room
        new Node(nodeNameRoom4724FloorFour, new Edge[]{
            new Edge(51, nodeNameHallwayFloorFourC2, 0, Keys.directions_turnLeft,addArrays(IPFloorFourRoom4724,IPFloorFourRoom4725,
                    IPFloorFourRoom4726,IPFloorFourRoom4727)),
            new Edge(10, nodeNameHallwayFloorFourD2, 1, Keys.directions_turnRight,addArrays(IPFloorFourRoom4724,IPFloorFourRoom4723))
        }),
        
        //floor four room 4725, patient room
        new Node(nodeNameRoom4725FloorFour, new Edge[]{
            new Edge(45, nodeNameHallwayFloorFourC2, 0, Keys.directions_turnLeft,addArrays(IPFloorFourRoom4725,IPFloorFourRoom4726,
                    IPFloorFourRoom4727)),
            new Edge(16, nodeNameHallwayFloorFourD2, 1, Keys.directions_turnRight,addArrays(IPFloorFourRoom4725,IPFloorFourRoom4724,
                    IPFloorFourRoom4723))
        }),
        
        //floor four room 4726, patient room
        new Node(nodeNameRoom4726FloorFour, new Edge[]{
            new Edge(23.921, nodeNameHallwayFloorFourC2, 0, Keys.directions_turnLeft, addArrays(IPFloorFourRoom4726,IPFloorFourRoom4727)),
            new Edge(38.225, nodeNameHallwayFloorFourD2, 1, Keys.directions_turnRight, addArrays(IPFloorFourRoom4726,IPFloorFourRoom4725,
                    IPFloorFourRoom4724,IPFloorFourRoom4723))
        }),
        
        //floor four room 4727, patient room
        new Node(nodeNameRoom4727FloorFour, new Edge[]{
            new Edge(12.3, nodeNameHallwayFloorFourC2, 0, Keys.directions_turnLeft,IPFloorFourRoom4727),
            new Edge(49.1, nodeNameHallwayFloorFourD2, 1, Keys.directions_turnRight,addArrays(IPFloorFourRoom4727,IPFloorFourRoom4726,IPFloorFourRoom4725,
                    IPFloorFourRoom4724,IPFloorFourRoom4723))
        }),
        
        //floor four room 4728, patient room
        new Node(nodeNameRoom4728FloorFour, new Edge[]{
            new Edge(1, nodeNameHallwayFloorFourC2, 0, Keys.directions_exitTheRoom,IPFloorFourRoom4728)
        }),

        //FLOOR GROUND
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
            new Edge(47.168, nodeNameHallwayFloorGroundB, 2, Keys.directions_exitRestroom + "t" + Keys.directions_turnLeft.substring(1) + Keys.directions_continueStraightPassingAFirstSetOfElevators)
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
            new Edge(9.794, nodeNameHallwayFloorOneA, 0),
            new Edge(27.696, nodeNameHallwayFloorOneB, 1),
            new Edge(6.178, nodeNameElevatorFloorOne, 2)
        }),
        //floorOneSameDayPrep,Holding,Recovery
        new Node(nodeNameRoomS12FloorOne, descriptionRoomS12FloorOne, new Edge[]{
            new Edge(3.446, nodeNameHallwayFloorOneA, 0),
            new Edge(32.656, nodeNameHallwayFloorOneB, 1),
            new Edge(9.947, nodeNameElevatorFloorOne, 2)
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
    public static ArrayList<String> addArrays(ArrayList<String> ... args){
        ArrayList<String> refined = new ArrayList<String>();
        for (ArrayList<String> d: args){
            refined.addAll(d);
        }
        return refined;
    }

}
