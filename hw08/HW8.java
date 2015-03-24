//Tony Lonero
//March 24, 2015
//CSE2
//HW 08
//Game Java Program
//
//This program will uses a series of methods to create a game.
//
import java.util.Scanner;       //define scanner
import java.lang.Math;          //access the random number generator
    //define a class
    public class HW8 {
        //method for the giant
         public static void giant() {
        System.out.println("                                 ---------                    ");
        System.out.println("                                |  /    \\|                   ");
        System.out.println("                      ZZZZZH    |    O    |    HZZZZZ             ");
        System.out.println("                           H     -----------   H              ");
        System.out.println("                      ZZZZZHHHHHHHHHHHHHHHHHHHHHZZZZZ                   ");
        System.out.println("                           H    HHHHHHHHHHH    H                      ");
        System.out.println("                      ZZZZZH    HHHHHHHHHHH    HZZZZZ               ");
        System.out.println("                                HHHHHHHHHHH                   ");
        System.out.println("                                HHH     HHH                   ");
        System.out.println("                               HHH       HHH                   ");
        }       //end of giant method
    
        //method for the cave
         public static void cave() {
        System.out.println("                              *****   * * * * * * * *        ");
        System.out.println("                         ***         ***                      ");
        System.out.println("                      ***               ***                   ");
        System.out.println("                 |    ***               ***                   ");
        System.out.println("                 |    ***               ***                   ");
        System.out.println("             O __|__  ***               ***                   ");
        System.out.println("           ******l    ***               ***                   ");
        System.out.println("            * *       ***               ***                   ");
        System.out.println("           *   *      ********************* * * * * * *       ");
        }       //end of the cave method
    
        //method for the boxes
        public static void box() {
       System.out.println("                      *********************     *********************    *********************             ");
        System.out.println("                     ***               ***     ***               ***    ***               ***              ");
        System.out.println("                     ***       1       ***     ***       2       ***    ***       3       ***              ");
        System.out.println("                     ***               ***     ***               ***    ***               ***              ");
        System.out.println("                     *********************     *********************    *********************               "); 
        }       //end of the boxes method
    
        //method for getting input
        public static String getInput(Scanner scan, String string) {
            String response = "";       //initialize response string
            response = scan.next();      //redfine response string
            if (response.equals("C") || response.equals("c")) {
                return string;      //return the string
            }   //end of if statement
            else {
                System.out.println("Yea right LOSER!");     //print the insult
                System.exit(1);     //quit the program
            }   //end of the else statement
            return string;      //return the string
        }       //end of the get Input method   

        //method for getting a different input
        public static String getInput(Scanner scan, String string, int trial) {
            for (int x = 0; x < trial; x++) {
            
            String response2 = "";      //define response2 string
            response2 = scan.next();     //redefine the response string
            if (response2.equals("A") || response2.equals("a")) {
                int random1 = (int) (Math.random()*2);     //generate an integer 0 or 1
                if (random1 == 1) {
                    System.out.println("Critical Hit!");        //print this line
                    if (x < 9) {
                        System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'e' to Escape, ANYTHING else is to YIELD");      //print this line
                    }   //end of if statement
                }   //end of if statement
                else {
                    System.out.println("Gosh! How can you miss it!");       //print this line
                    x--;    //don't add a hit on a miss
                    System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'e' to Escape, ANYTHING else is to YIELD");      //print this line
                }   //end of else statement
            }   //end of if statement
            else if (response2.equals("E") || response2.equals("e")) {
                int random2 = (int) (Math.random()*11);   //generate an integer 0-10
                if (random2 == 10){
                    System.out.println("Successful Escape!");       //print this line
                    break;      //leave the while loop
                }   //end of if statement
                else {
                    System.out.println("Escape Unsuccessful!");     //print this line
                    x--;        //don't add a hit on an unsuccessful escape
                    System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'e' to Escape, ANYTHING else is to YIELD");      //print this line
                }   //end of else statement
            }   //end of if statement
            else {
                System.out.println("Executed by the GIANT! Game Over!");        //print this line
                System.exit(1);     //quit the program
            }   //end of else statement
            }   //end of for statement
            return string;      //return the string
        }       //end of the new get Input method
        
        //method for getting the last input
        public static String getInput(Scanner scan) {
            int chest = 0;      //define chest
            chest = scan.nextInt();     //redefine chest
            switch (chest) {
                case 1:
                    System.out.println("You win a trip to Disney World!");       //print this line
                    break;
                case 2:
                    System.out.println("You get a 4.0 GPA!");        //print this line
                    break;
                case 3:
                    System.out.println("You win nothing. Don't be so greedy. Fight for your country, not yourself.");        //print this line
                    break;
                 default:
                 System.out.println("A Wrong Number! You get nothing! Better restart the game LOL!!!");     //print this line
                 System.exit(1);    //quit the program
                 break;         //not sure if this is needed but it seems right
            }
            String done = "Deuces.";     //define string
            return done;
        }       //end of the last get input method
        
        
        //main method
        public static void main(String[] args) {
        char option;
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to MG's adventure world. Now your journey begins. Good luck!");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        String input = getInput(scan, "Cc");
        System.out.println("You are in a dead valley.");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        input = getInput(scan, "Cc");
        System.out.println("You walked and walked and walked and you saw a cave!");
        cave();
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        input = getInput(scan, "Cc");
        System.out.println("You entered a cave!");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        input = getInput(scan, "Cc");
        System.out.println("Unfortunately, you ran into a GIANT!");
        giant();
        System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'e' to Escape, ANYTHING else is to YIELD");
        input = getInput(scan, "AaEe", 10);
        System.out.println("Congratulations! You SURVIVED! Get your REWARD!");
        System.out.println("There are three 3 tressure box in front of you! Enter the box number you want to open!");
        box();
        input = getInput(scan);
        System.out.println("Hero! Have a good day!");
        }       //end of main method


    }       //end of class