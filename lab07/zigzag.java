//Tony Lonero
//March 6, 2015
//CSE2
//Lab 07
//Zigzag Java Program
//
//This program will prompt user to input an integer between 3 and 33.
//If a valid input is entered, the prgram will display a zigzag pattern based of the integer entered.
//If there is an invalid input, it will tell the user to try again.
//
import java.util.Scanner;   //define scanner
    //define a class
    public class zigzag {
        public static void main(String[] args) {
            while (true) {
            Scanner myScanner;      //decalre the scanner
            System.out.print("Enter a number between 3 and 33: ");      //prompt user for input
            int nStars = 0;      //define input
            while (true) {
                myScanner = new Scanner( System.in );       //call the scanner
                if (myScanner.hasNextInt()) {
                    nStars = myScanner.nextInt();        //accept user input
                    if (nStars > 2 && nStars < 34) {
                        break;      //leave while loop
                    }       //end of if statement
                    else {
                        System.out.println("Invalid input, try again.");
                    }   //end of else statement
                }       //end of if statement
                else {
                    System.out.println("Invalid input, try again.");
                }   //end of else statement
            }       //end of while loop
            
            for (int counter = 1; counter <= nStars; counter++) {
                System.out.print("*");      //print a star
            }   //end of for loop
            System.out.println("");  //print blank line
            for (int counter = 1; counter <= (nStars - 1); counter++) {
                for (int counter2 = 1; counter2 <= counter; counter2++) {
                    System.out.print(" ");   //print space
                }   //end of for loop
                System.out.println("*");  //print star
            }   //end of for loop
            for (int counter = 1; counter <= nStars; counter++) {
                System.out.print("*");      //print a star
            }   //end of for loop
            System.out.println("");     //print blank line
            System.out.print("Enter y or Y to go again: ");     //prompt user for input
            String response = myScanner.next();     //initialize string
            if (response.equals("y") || response.equals("Y")) {
                continue;
            }   //end of if statement
            else {
                break;
            }       //end of else statement
            }       //end of while loop 
        }   //end of main method
    }   //end of class