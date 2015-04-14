//Tony Lonero
//April 10, 2015
//CSE2
//Lab 11
//Search Java Program
//
//This program will make two different arrays.
//Using a linear search, it will find the maximum of the first array.
//Using a binary search, it will find a specific element in the second array.
//
import java.util.Scanner;
import java.util.Random;
public class Search{
    public static void main(String [] args) {
      int [] array1 = new int[50];   //create an array with 50 elements
      int [] array2 = new int[50];   //create a second array with 50 elements
      Random randomGenerator = new Random();  //declare a new random generator
      for (int i = 0; i < 50; i++) {
        int randomInt = randomGenerator.nextInt(101);   //generate a random int between 0 and 100
        array1 [i] = randomInt;     //declare what element i is
      } //end of for loop
      int min = array1 [0];   //declare min
      int max = array1 [0];   //declare max
      for (int i = 0; i < 50; i++) {
        if (array1 [i] < min) {
          min = array1 [i];   //set new min
        } //end of if statement
        if (array1 [i] > max) {
          max = array1 [i];   //set new max
        }   //end of if statement
      } //end of foor loop
      System.out.println("The minimum of array1 is " + min);    //print the min
      System.out.println("The maximum of array1 is " + max);    //print the max
      for (int i = 0; i < 50; i++) {
        int randomInt = randomGenerator.nextInt(101);   //generate a random number between 0 and 100
        if (i == 0) {
          array2 [i] = randomInt;
        }   //end of if statement
        else {
        array2 [i] = (randomInt + array2[i - 1]);        //declare what element i is
        }   //end of else statement
      }   //end of for loop
      System.out.println("The minimum of array2 is " + array2 [0]);   //print out the min
      System.out.println("The maximum of array2 is " + array2 [49]);    //print out the max 
      System.out.print("Enter an integer greater than or equal to 0: ");    //prompt the user for input
      Scanner myScanner = new Scanner (System.in);    //declare the scanner
      int target = 0;   //declare a variable
      if (!myScanner.hasNextInt()) {
        System.out.println("You did not enter an integer.");   //show user the eror
        System.exit(1);   //exit the program
      }   //end of if statement
      else {
        target = myScanner.nextInt();   //declare the integer target
        if (target < 0) {
          System.out.println("You did not enter a positive intger.");    //tell user their error
        }   //end of if statement
      }   //end of else statement
      int Low = 0;    //set low 
      int High = 49;   //set max
      int middle = (Low + High)/2;    //find the middle
      while (Low <= High) {
        if (array2 [middle] < target) {
          Low = middle +1;    //set new low
          middle = (Low + High)/2;    //find new middle
        }   //end of if statement
        else if ( array2 [middle] == target) {
          System.out.println(target + " was found at location " + (middle +1) + ".");   //print out that the value was found
          System.exit(1);   //exit program
        }   //end of else if statement
        else {
          High = middle - 1;    //set new high;
          middle = (Low + High)/2;    //find new middle
        }   //end of else statement
      }   //end of while loop
      if (Low > High ) {
        System.out.println("Target was not found in the list.");    //tell user that the target is not in the list
        System.out.println("The number below the target was " + array2 [middle + 1]);    //print this line
        System.out.println("The number above the target was " + array2 [middle]);   //print this line
      }   //end of if statement
    }   //end of main method
}   //end of class