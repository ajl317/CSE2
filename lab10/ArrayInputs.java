//Tony Lonero
//April 3, 2015
//CSE2
//Lab 10
//Array Inputs Java Program
//
//This program will ask the user to enter how big they want an array to be.
//Then it will prompt the user to input values for each position in the array.
//Then it will print out the values.
//
import java.util.Scanner;
//
    public class ArrayInputs {
        public static void main(String [] args) {
        Scanner myScanner = new Scanner (System.in);        //initialize scanner
        System.out.print("Please enter an integer for the size of an array: ");     //prompt user for input
        int size = myScanner.nextInt();       //initialize the integer size
        int [] array1;      //declare array
        array1 = new int [size];        //allocate array
        for (int i = 0; i < size; i++) {
            System.out.print("Please enter a positive integer: ");      //prompt user for input
            array1[i] = Check(myScanner); 
        }
        System.out.println("The array is:");        //print this line
        for (int j = 0; j < size; j++) {
            System.out.println(array1[j]);      //print out the vlaue of the array in the corresponding position
        }
        }
        
        public static int Check(Scanner myScanner) {
            int value = 0;
            while (true) {
                if (myScanner.hasNextInt()) {
                    value = myScanner.nextInt();
                    if (value >= 0) {
                        break;      //break out of while loop
                    }
                    else {
                        System.out.print("Sorry, your input is negative. Try again: ");       //print this line
                    }
                }
                else {
                    System.out.print("Sorry, you did not enter an integer. Try again: ");        //print this line
                    myScanner.next();       //prevent infinite loop
                }
            }
            return value;       //return the integer saved in value
        }
    }   //end of class