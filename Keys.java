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
    final public static String directions_exitClinicalLabAndTurnLeftAndFollowHallwayUntilIntersection= "Exit the clinical lab and turn left. Follow the hallway until you reach the intersection.";
    final public static String directions_exitMedicalRecordsAndTurnLeftAndContinueStraight = "Exit the medical records and turn left. Continue straight.";
    
    //fourth floor directions
    final public static String directions_passThroughTheArchwayAndContinueStraightPassTheEleveatorsThereShouldBeTwoHallwaysInFrontOfYou = "Pass through the archway and continue straight. Pass the eleveators. There should be two hallways in front ofY you";
    final public static String directions_goThroughTheLeftDoorway = "Go through the left doorway";
    final public static String directions_goThroughTheRightDoorway = "Go through the right doorway";
    
    final public static String directions_turnLeft = "Turn left";
    final public static String directions_turnRight = "Turn Right";
    final public static String directions_walkStraight = "Walk straight";
    final public static String directions_proceedStraight = "Proceed straight";
    
    
    
    
    
    
    
    
    //floor ground
    //names
    final public static String nodeNameHallwayFloorGroundA = "hallwayFloorGroundA";
    final public static String nodeNameHallwayFloorGroundB = "hallwayFloorGroundB";
    final public static String nodeNameHallwayFloorGroundC = "hallwayFloorGroundC";
    final public static String nodeNameHallwayEastWingFloorGround = "eastWingFloorGround";
    final public static String nodeNameElevatorFloorGround = "elevatorFloorGround";
    final public static String nodeNameElevatorEastWingFloorGround = "elevatorEastWingFloorGround";
    //descriptions
    final public static ArrayList<String> descriptionEastWingFloorGround  = new ArrayList<>(Arrays.asList(
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
    final public static String nodeNameDeskFloorTwo = "deskFloorTwo";
    final public static ArrayList<String> descriptionDeskFloorTwo  = new ArrayList<>(Arrays.asList(
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
    final public static String nodeNameDeskFloorThree = "deskFloorThree";
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
    final public static String nodeNameRoomG230SouthFloorGround = "roomG320SouthFloorGround";
    final public static ArrayList<String> descriptionRoomG230SouthFloorGround = new ArrayList<>(Arrays.asList(
            "cafeteria, south exit",
            "food",
            "cafe",
            "G320"
    ));
    final public static String nodeNameRoomE00C6FloorGround = "roomE00C6FloorGround";
    final public static ArrayList<String> descriptionRoomE00C6FloorGround = new ArrayList<>(Arrays.asList(
            "burn",
            "burn outpatient",
            "E00C6"
    ));final public static String nodeNameRoomE00C7FloorGround = "roomE00C7FloorGround";
    final public static ArrayList<String> descriptionRoomE00C7FloorGround = new ArrayList<>(Arrays.asList(
            "pediatric",
            "pediatric outpatient",
            "E00C7"
    )); final public static String nodeNameRoomG03EastWingFloorGround = "roomG03EastWingFloorGround";
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
    final public static String nodeNameRoom117EastWingFloorOne = "room117EastWingFloorOne";
    final public static ArrayList<String> descriptionRoom117EastWingFloorOne = new ArrayList<>(Arrays.asList(
            "Saint Barnabas OBGYN Health Center",
            "The Fibroid center"
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
            new Node(nodeNameParkingValidationFloorGround,descriptionParkingValidationFloorGround, new Edge[]{
                new Edge(44.291, nodeNameHallwayFloorGroundA, 0, Keys.directions_facingAwayFromPV+"t"+Keys.directions_turnLeft.substring(1)),
                new Edge(40.912, nodeNameElevatorFloorGround, 1, Keys.directions_facingAwayFromPV+"t"+Keys.directions_turnRight.substring(1)+". Walk straight and "+"e"+Keys.directions_enterTheFirstClusterOfElevators.substring(1)),
                new Edge(112.693, nodeNameHallwayFloorGroundB, 2, Keys.directions_facingAwayFromPV+"t"+Keys.directions_turnRight.substring(1)+"."+Keys.directions_passTheElevatorsUntilEndOfHallway+Keys.directions_followTheHallway)
            }),
              //EastWingFloorOne 117
            new Node(nodeNameRoom117EastWingFloorOne,descriptionRoom117EastWingFloorOne, new Edge[]{
                new Edge (18.00, nodeNameElevatorEastWingFloorOne,0) 
            }),
            //floorOneParentLounge
            new Node(nodeNameRoom1211FloorOne, descriptionRoom1211FloorOne, new Edge[]{
                new Edge(4.708,nodeNameHallwayFloorOneD, 0),
                new Edge(5.991,nodeNameHallwayFloorOneE,1)
            }),
             //floorOneMensRestroom
            new Node(nodeNameRoom1214FloorOne,descriptionRoom1214FloorOne, new Edge[]{
                new Edge(7.594,nodeNameHallwayFloorOneD, 0),
                new Edge(3.254,nodeNameHallwayFloorOneE,1)
            }),
             //floorOneWomensRestroom
            new Node(nodeNameRoom1215FloorOne,descriptionRoom1215FloorOne, new Edge[]{
                new Edge(8.569,nodeNameHallwayFloorOneD, 0),
                new Edge(2.190,nodeNameHallwayFloorOneE,1)
            }),
             //EastWingFloorOneRoom121
            new Node(nodeNameRoom121EastWingFloorOne,descriptionRoom121EastWingFloorOne, new Edge[]{
                new Edge (18.905, nodeNameElevatorEastWingFloorOne,0)
            }),
            //floorOneWomensRestroom
            new Node(nodeNameRoom1318FloorOne, descriptionRoom1318FloorOne, new Edge[]{
                new Edge(11.753,nodeNameHallwayFloorOneA, 0),
                new Edge(10.504,nodeNameHallwayFloorOneB,1),
                new Edge(0.461,nodeNameElevatorFloorOne,2)
            }),
            //floorOneMensRestroom
            new Node(nodeNameRoom1319FloorOne,descriptionRoom1319FloorOne, new Edge[]{
                new Edge(8.760,nodeNameHallwayFloorOneA, 0),
                new Edge(12.830,nodeNameHallwayFloorOneB,1),
                new Edge(1.832,nodeNameElevatorFloorOne,2)
            }),
               //floorOneSameDayWaitingArea
            new Node(nodeNameRoom1323FloorOne,descriptionRoom1323FloorOne, new Edge[]{
                new Edge(3.020,nodeNameHallwayFloorOneA, 0),
                new Edge(19.226,nodeNameHallwayFloorOneB,1),
                new Edge(7.880,nodeNameElevatorFloorOne,2)
            }),
                //floorOneChapel
            new Node(nodeNameRoom1398FloorOne,descriptionRoom1398FloorOne, new Edge[]{
                new Edge(8.180,nodeNameHallwayFloorOneG, 0)
            }),
              //EastWingFloorOneRoom144
            new Node(nodeNameRoom144EastWingFloorOne,descriptionRoom144EastWingFloorOne, new Edge[]{
                new Edge(5.908, nodeNameElevatorEastWingFloorOne, 0)
            }),
            //floorOneICUWaiting
            new Node(nodeNameRoom1607FloorOne, descriptionRoom1607FloorOne, new Edge[]{
                new Edge(1.725,nodeNameHallwayFloorOneE,1)
            }),
             //floorOneRadiation
            new Node(nodeNameRoom1730AFloorOne,descriptionRoom1730AFloorOne, new Edge[]{
                new Edge(19.059,nodeNameHallwayFloorOneF, 0)
            }),
            //EastWingFloorTwo 201
            new Node(nodeNameRoom201EastWingFloorTwo,descriptionRoom201EastWingFloorTwo, new Edge[]{
                new Edge (9.150, nodeNameElevatorEastWingFloorTwo,0)
            }), 
           //floorTwoPhones
            new Node(nodeNameRoom2350AFloorTwo, descriptionRoom2350AFloorTwo, new Edge[]{
                new Edge(9.679, nodeNameElevatorFloorTwo,0),
                new Edge(9.581, nodeNameDeskFloorTwo, 1)    
            }), 
           //EastWingFloorTwo 244
            new Node(nodeNameRoom244EastWingFloorTwo,descriptionRoom244EastWingFloorTwo,new Edge[]{
                new Edge (10.765, nodeNameElevatorEastWingFloorTwo,0)
            }),
            //EastWingFloorThree 302
            new Node(nodeNameRoom302EastWingFloorThree,descriptionRoom302EastWingFloorThree, new Edge[]{
                new Edge (36.983, nodeNameElevatorEastWingFloorThree,0)
            }),
            //EastWingFloorThree 306
            new Node(nodeNameRoom306EastWingFloorThree, descriptionRoom306EastWingFloorThree, new Edge[]{
                new Edge (68.945, nodeNameElevatorEastWingFloorThree, 0)
            }), 
            //EastWingFloorThree 307
            new Node(nodeNameRoom307EastWingFloorThree, descriptionRoom307EastWingFloorThree, new Edge[]{
                new Edge(69.945, nodeNameElevatorEastWingFloorThree,0)
            }),
            //EastwingFloorThree 308
            new Node(nodeNameRoom308EastWingFloorThree, descriptionRoom308EastWingFloorThree,new Edge[]{
                new Edge (69.00, nodeNameElevatorEastWingFloorThree, 0)
            }),
            //floorThreeRestroom
            new Node(nodeNameRoom3301DFloorThree, descriptionRoom3301DFloorThree, new Edge[]{
                new Edge(5.543, nodeNameElevatorFloorThree,0),
                new Edge(22.173, nodeNameDeskFloorThree,1)
            }),
            //EastWingFloorThree 332
            new Node(nodeNameRoom332EastWingFloorThree,descriptionRoom332EastWingFloorThree, new Edge[]{
                new Edge (225.769, nodeNameElevatorEastWingFloorThree, 0)
            }),
            //EastWingFloorFour 402
            new Node(nodeNameRoom402EastWingFloorFour, descriptionRoom402EastWingFloorFour, new Edge[]{
                new Edge(69.698, nodeNameElevatorEastWingFloorFour, 0)
            }),
            //EastWingFloorFour 403
            new Node(nodeNameRoom403EastWingFloorFour, descriptionRoom403EastWingFloorFour, new Edge[]{
                new Edge(92.583, nodeNameElevatorEastWingFloorFour, 0)
            }),
           //floorFourRestroom
            new Node(nodeNameRoom4235FloorFour,descriptionRoom4235FloorFour, new Edge[]{
                new Edge(12.719, nodeNameElevatorFloorFour,0),
                new Edge(12.618, nodeNameDeskFloorFour, 1)
            }),
           //groundFloorBurnOutpatient
            new Node(nodeNameRoomE00C6FloorGround, descriptionRoomE00C6FloorGround, new Edge[]{
                new Edge(22.543, nodeNameHallwayFloorGroundB, 0, Keys.directions_exitBurnOutpatient + "t" + Keys.directions_turnRight.substring(1)+Keys.directions_followTheLongHallway),
                new Edge(355.749, nodeNameHallwayEastWingFloorGround, 1, Keys.directions_exitBurnOutpatient + "p" + Keys.directions_proceedStraight )
            }),
            //groundFloorPedriaticOutpatient
            new Node(nodeNameRoomE00C7FloorGround, descriptionRoomE00C7FloorGround, new Edge[]{
                new Edge(266.703, nodeNameHallwayFloorGroundB, 0, Keys.directions_exitPediatricOutpatient + "t" + Keys.directions_turnRight.substring(1)+Keys.directions_followTheLongHallway),
                new Edge(99.181, nodeNameHallwayEastWingFloorGround, 1, Keys.directions_exitPediatricOutpatient + "t" + Keys.directions_turnLeft.substring(1)+Keys.directions_followTheHallway)
            }),
            //groundFloorRestroom
            new Node(nodeNameRoomG106FloorGround, descriptionRoomG106FloorGround, new Edge[]{
                new Edge(109.818, nodeNameHallwayFloorGroundA, 0, Keys.directions_exitRestroom+"t" + Keys.directions_turnRight.substring(1)+Keys.directions_passTheElevatorsUntilFrontDoors),
                new Edge(30.576, nodeNameElevatorFloorGround, 1, Keys.directions_exitRestroom+"t" + Keys.directions_turnRight.substring(1)),
                new Edge(47.168, nodeNameHallwayFloorGroundB, 2, Keys.directions_exitRestroom+"t"+ Keys.directions_turnLeft.substring(1)+Keys.directions_passTheElevatorsUntilEndOfHallway)
            }),
           //groundFloorCafeteria
            new Node(nodeNameRoomG230NorthFloorGround, descriptionRoomG230NorthFloorGround, new Edge[]{
                new Edge(186.263, nodeNameHallwayFloorGroundB, 0, Keys.directions_exitCafeteria+"t"+ Keys.directions_turnLeft.substring(1)+Keys.directions_followTheLongHallway),
                new Edge(208.004, nodeNameHallwayEastWingFloorGround, 1,Keys.directions_exitCafeteria+"t" + Keys.directions_turnRight.substring(1)+Keys.directions_followTheHallway)
            }),
            new Node(nodeNameRoomG230SouthFloorGround, descriptionRoomG230SouthFloorGround, new Edge[]{
                new Edge(146.263, nodeNameHallwayFloorGroundA, 0),
                new Edge(208.004, nodeNameHallwayEastWingFloorGround, 1)
            }),
            
           //groundFloorOutpatientLab
            new Node(nodeNameRoomG309BFloorGround,descriptionRoomG309BFloorGround, new Edge[]{
                new Edge(70.678, nodeNameHallwayFloorGroundC, 0, Keys.directions_exittheOutpatientLabAndTurnLeftAndContinueStraight)
            }),
            //groundFloorClinicalLab
            new Node(nodeNameRoomG336FloorGround,descriptionRoomG336FloorGround, new Edge[]{
                new Edge(238.684, nodeNameHallwayFloorGroundC, 0, Keys.directions_exitClinicalLabAndTurnLeftAndFollowHallwayUntilIntersection)
            }),
         //groundFloorMedicalRecords
            new Node(nodeNameRoomG453FloorGround, descriptionRoomG453FloorGround, new Edge[]{
                new Edge(30.644, nodeNameHallwayFloorGroundC, 0, Keys.directions_exitMedicalRecordsAndTurnLeftAndContinueStraight)
            }),
        //floorOneReception
            new Node(nodeNameRoomReceptionFloorOne,descriptionRoomReceptionFloorOne, new Edge[]{
                new Edge(5.403,nodeNameHallwayFloorOneA, 0),
                new Edge(12.830,nodeNameHallwayFloorOneB,1),
                new Edge(16.842,nodeNameElevatorFloorOne,2)
            }),
           //floorOneSameDayPrep,Holding,Recovery
            new Node(nodeNameRoomS12FloorOne, descriptionRoomS12FloorOne,new Edge[]{
                new Edge(3.613,nodeNameHallwayFloorOneA, 0),
                new Edge(19.166,nodeNameHallwayFloorOneB,1),
                new Edge(1.615,nodeNameElevatorFloorOne,2)
            })   
    ));
   
    
     
    public static ArrayList<Node> add(ArrayList<Node> myList, Node addThis) 
     {


         String addThisName = addThis.getName();
             for(int index = 0; index < myList.size(); index++){

                 String nodeInMyListName = myList.get(index).getName();

                 if((addThisName.compareToIgnoreCase(nodeInMyListName)) < 0){
                                         myList.add(index, addThis);
                                         return myList;
                                 }   	
         }

         myList.add(addThis);
         return myList;
     }

}
