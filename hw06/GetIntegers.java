//Tony Lonero
//March 3, 2015
//CSE2
//HW 06
//Get Integers Java Program
//
//This program will ask user for 5 integers using a for loop.
//It will notfy users when they input something that is invalid.
//After 5 valid inputs, it will add them all together and display the sum.
//
import java.util.Scanner;   //define scanner
    //Define a class
    public class GetIntegers {
        //add main method
        public static void main(String[] args) {
            Scanner myScanner;      //declare the scanner
            System.out.println("Please enter five non-negative integers: ");        //prompt user for input
            int sum = 0;        //initialize sum variable
            int term = 0;       //initialize term variable
            for (int counter = 1; counter <6; counter++) {
                myScanner = new Scanner( System.in );       //call the scanner
                if (myScanner.hasNextInt()) {
                    term = myScanner.nextInt();     //accept user input
                    if (term >= 0) {
                        sum += term;        //add term variable to the sum variable
                    }   //end of if statement
                    else {
                        System.out.println("Invalid input, please enter again.");       //tell user they had invalid input
                        counter--;      //dont count invalid input as one of the five entries
                    }   //end of else statement
                }   //end of if statement
                else {
                    System.out.println("Invalid input, please enter again.");       //tell user they had invalid input
                    counter--;      //don't count invalid input as one of the five entries
                }   //end of else statement
            }   //end of for loop
            System.out.println("Sum is: "+sum );        //print out sum of the five numbers
        }   //end of main method
    }   //end of class