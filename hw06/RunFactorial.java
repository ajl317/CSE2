//Tony Lonero
//March 3, 2015
//CSE2
//HW 06
//Run Factorial Java Program
//
//In this program I will ask the user for an input between 9 and 16.
//If valid, the program will calculate the factorial of the input using a while loop.
//If invalid, the program will tell the user that the inoput is invalid.
//
import java.util.Scanner;        //define scanner
    //define a class
    public class RunFactorial {
        //add main method
        public static void main(String[] args) {
            Scanner myScanner;      //declare the scanner
            System.out.println("Please enter an integer that is between 9 and 16: ");       //prompt user for input
            int input = 0;      //define input
            while (true) {
                myScanner = new Scanner( System.in );       //call the scanner
                if (myScanner.hasNextInt()) {
                    input = myScanner.nextInt();        //accept user input
                      if (input > 8 && input < 17) {
                          System.out.println("Input accepted:");        //tell user they have a valid input
                         break;     //leave while loop
                      }     //end of if statement 
                      else {
                          System.out.println("Invalid input, enter again!");    //tell user they entered an invalid number
                      } //end of else statement
                }   //end of if statement      
                else {
                    System.out.println("Invalid input, enter again!");      //tell user they entered an invalid number
                }   //end of else statement
            }   //end of while loop
            
            
            int product = 1;        //define product variable
            int input2 = input;     //new variable for calculation
            while (input2 >= 1) {
                product *=input2;    //multiply product by input
                input2--;            //decrease input by 1
            }   //end of while loop
            System.out.println(input+"! = "+product);       //print factorial of input
        }   //end of main method
    }   //end of class