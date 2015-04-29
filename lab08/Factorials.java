//Tony Lonero
//March 20, 2015
//CSE2
//Lab 08
//Factorials Java Program
//
//This program will prompt a user for an input and then calculate the super factorial.
//
import java.util.Scanner;       //define scanner
    //define a class
    public class Factorials {
        public static void main(String[] args) {
            Scanner myScanner;      //declare the scanner
            System.out.print("Please enter a positive integer: ");      //print this line
            int input = 0;      //define input
            while (true) {
                myScanner = new Scanner( System.in );      //call the scanner
                if (myScanner.hasNextInt()) {
                    input = myScanner.nextInt();        //accept the user input
                    break;      //exit the while loop
                }   //end of if statement
                else {
                    System.out.println("Invalid input, enter again!");      //print this line
                }   //end of else statement
            }   //end of while loop
            int total = 0;      //define variable
            int input2 = input;     //new variable for calculation
            for (int i = 1; i <= input2; i++) {
                total +=factorial(i);   //redefine total
            }   //end of for statement
            print(total);     //print the sum function
        }   //end of main method
        
        public static int factorial(int key) {
            int factor = 1;     //define variable
            for (int i = key; i > 0; i--) {
                factor *= i;
            }   //end of for statement
            return factor;      //return integer
        }   //end of method
        
        public static void print(int num) {
            System.out.println("The super factorial is equal to " + num);       //print this line
        }   //end of method
    }   //end of class