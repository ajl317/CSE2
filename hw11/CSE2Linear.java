//Tony Lonero
//April 14, 2015
//CSE2
//HW11
//Search Java Program
//
//This program will prompt the user to input values for an array.
//Then it will ask the user for a specific value and perform a binary
//search to find the value.
//Next, the program will scramble the array.
//Ask for a new value to find.
//And perform a linear search to find the value.
//
import java.util.Scanner;
import java.util.Random;
public class CSE2Linear {
    public static void main(String [] args) {
        Scanner myScanner = new Scanner (System.in);        //declare the scanner
        int [] array1 = new int[15];        //define new array
        System.out.println("Enter 15 integers for final grades in CSE2:");      //prompt user for input
        array1 = values();      //call the values method
        System.out.println("The grades, sorted, are: ");        //print this line
        print(array1);      //call the print function
        System.out.println("");     //print blank line
        System.out.print("Enter a grade to search for: ");      //prompt user for input
        int target = myScanner.nextInt();      //assign the value for target
        binary(array1, target);     //call the binary method
        System.out.println("Scrambled: ");      //print this line
        int [] array2 = new int[15];        //define new array
        array2 = scramble(array1);      //call the scramble method
        print(array2);      //call the print function
        System.out.println(" ");        //print a blank line
        System.out.print("Enter a grade to search for: ");      //prompt user for input
        int target2 = myScanner.nextInt();      //assign the value for target2
        linear(array2, target2);        //call the linear method
    }       //end of main method
    
    public static int[] values() {
        int [] array1 = new int[15];        //create new array
        for (int i = 0; i < 15; i++) {
            while (true) {
                Scanner myScanner = new Scanner (System.in);        //declare the scanner
                if (myScanner.hasNextInt()) {
                    int input = myScanner.nextInt();        //declare variable
                    if (input >=0 && input <=100) {
                        if (i == 0) {
                            array1[i] = input;      //assign element i
                            break;
                        }   //end of if statement
                        else {
                            if (input > array1[i -1] ) {
                                array1[i] = input;      //assign element i
                                break;
                            }       //end of if statement
                            else {
                                System.out.println("Invalid input, try again.");        //tell user their error
                            }       //end of else statement
                        }       //end of else statement
                    }       //end of if statement
                    else {
                        System.out.println("Invalid input, try again.");        //tell user their error
                    }   //end of else statement
                }       //end of if statement
                else {
                    System.out.println("Invalid input, try again.");        //tell user their input was invalid
                }   //end of else statement
            }   //end of while loop
        }   //end of for loop
        return array1;      //return the created array
    }       //end of method
    
    public static void print(int [] array1) {
        for (int i = 0; i < 15; i++) {
            System.out.print(array1[i] + " ");      //print out the array in a list
        }       //end of for loop
    }   //end of method
    
    public static void binary(int [] array1, int target) {
        int Low = 0;        //set low
        int High = 14;      //set high
        int middle = (Low + High)/2;        //find the middle
        int iteration = 0;      //set a counter
        while (Low <= High) {
            iteration++;        //add one to the counter
            if (array1 [middle] < target) {
                Low = middle + 1;       //set new low
                middle = (Low + High)/2;        //find new middle
            }       //end of if statement
            else if (array1 [middle] == target) {
                System.out.println(target + " was found in the list with " + iteration + " iterations.");       //print this line
                break;      //leave the while loop
            }       //end of else if statement
            else {
                High = middle - 1;      //set new high
                middle = (Low + High)/2;        //find new middle
            }       //end of else statement
        }   //end of while loop
        if (Low > High) {
            System.out.println(target + " was not found in the list with " + iteration + " iterations.");        //print this line
        }       //end of if statement
    }       //end of method
    
    public static int[] scramble(int [] array2 ) {
        Random randomGenerator = new Random();      //declare a new random generator
        for (int i = array2.length - 1; i > 0; i--) {
            int index = randomGenerator.nextInt(i + 1);     //generate random number
            int a = array2[index];      //assign new value
            array2[index] = array2[i];      //put in the element at i in for the element at the index value
            array2[i] = a;      //swap the values
        }       //end of for loop
        return array2;      //return the array
    }       //end of method
    
    public static void linear(int [] array2, int target2) {
        boolean found = false;      //set boolean to false
        for (int i = 0; i < 15; i++) {
            if (array2[i] == target2) {
                System.out.println(target2 + " was found in the list with " + (i+1) + " iterations.");       //print this line
                found = true;       //change boolean to true
                break;      //leave for loop
            }       //end of if statement
        }       //end of for loop
        if (found != true) {
            System.out.println(target2 + " was not found in the list with 15 iterations.");     //print this line
        }       //end of if statement
    }       //end of method
    
}   //end of class