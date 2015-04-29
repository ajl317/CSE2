//Tony Lonero
//April 28, 2015
//CSE2
//HW13
//FourDWin Java Program
//
//Create a four dimensional array and perform an assortment of arithmetic operations,
//sorts, and searches.
//
import java.util.Scanner;
import java.util.Random;
public class FourDwin {
    public static void main (String [] args) {
        Scanner myScanner = new Scanner( System.in );       //declare the scanner
        Random rand = new Random();     //declare the random number generator
        int input1 = 0;     //initialize variable
        int input2 = 0;     //initialize variable
        System.out.print("Enter an integer X: ");       //print this line
        while (true) {
            if (myScanner.hasNextInt()) {
                input1 = myScanner.nextInt();       //set value for input 1
                if (input1 > 0) {
                    break;      //break out of while loop
                }       //end of if statement
                else {
                    System.out.println("The input needs to be a positive number. Try again.");      //print the error
                }       //end of else statement
            }       //end of if statement
            else {
                System.out.println("The input needs to be an integer. Try again.");     //print the error
                myScanner.next();
            }       //end of else statement
        }       //end of while loop
        System.out.print("Enter an integer Y, where Y > X: ");      //prompt user for input
        while (true) {
            if (myScanner.hasNextInt()) {
                input2 = myScanner.nextInt();       //set value for input 1
                if (input2 > 0) {
                    if (input2 > input1) {
                        break;      //leave while loop
                    }       //end of if statement
                    else {
                        System.out.println("The second input must be greater than the first input. Try again.");        //print the error
                    }       //end of else statement
                }       //end of if statement
                else {
                    System.out.println("The input needs to be a positive number. Try again.");      //print the error
                }       //end of else statement
            }       //end of if statement
            else {
                System.out.println("The input needs to be an integer. Try again.");     //print the error
                myScanner.next();
            }       //end of else statement
        }       //end of while loop
        double [][][][]array1 = new double [3][][][];       //allocate 4D array
        for (int i = 0; i < 3; i++) {
            int dimension = rand.nextInt(input2 - input1) + input1;     //generate random int between 2 user values
            array1[i] = new double [dimension][][];      //length of next dimension
            for (int j = 0; j < array1[i].length; j++) {
                int dimension2 = rand.nextInt(input2 - input1) + input1;     //generate random int between 2 user values
                array1[i][j] = new double [dimension2][];        //length of next dimension
                for (int k =0; k < array1[i][j].length; k++) {
                    int dimension3 = rand.nextInt(input2 - input1) + input1;     //generate random int between 2 user values
                    array1[i][j][k] = new double [dimension3];       //length of last dimension
                    for (int m = 0; m < array1[i][j][k].length; m++) {
                        double value = rand.nextDouble()*30;        //generates random number between 0 and 30
                        int h = (int) (value*10);
                        double value2 = h/10.0;
                        array1[i][j][k][m] = value2;     //assign each member a value
                    }       //end of for loop
                }       //end of for loop
            }       //end of for loop
        }       //end of for loop
        System.out.println(" ");     //print blank line
        System.out.println("Original Array: ");     //print this line
        printArray(array1);      //call the print method
        System.out.println(" ");     //print blank line
        System.out.println("Sorted Array: ");       //print this line
        printArray(sort3DArray(sort4DArray(array1)));        //print the sorted array by calling three separate methods
        System.out.println("");     //print blank line
        statArray(array1);      //call this method
        
    }       //end of main method
    
    public static void printArray(double [][][][]array1) {
        System.out.println("{");      //print a curly brace
        for (int i = 0; i < 3; i++) {
            System.out.println("       {");      //print a second curly brac
            for (int j = 0; j < array1[i].length; j++) {
                System.out.print("              {");      //print a third curly brace
                for (int k = 0; k < array1[i][j].length; k++) {
                    System.out.print("{");      //print a fourth curly brace
                    for (int m = 0; m < array1[i][j][k].length; m++) {
                        System.out.print(array1[i][j][k][m] + ", ");        //print out the member of the array
                    }       //end of for loop
                    System.out.print("}");      //close curly braces
                }       //end of for loop
                System.out.println("}");      //close curly braces
            }       //end of for loop
            System.out.println("       },");     //close curly braces
        }       //end of for loop
        System.out.print("}");        //close curly braces
    }       //end of method
    
    public static double [][][][] sort3DArray(double[][][][] x) {
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                for (int k = 0; k < x[i][j].length; k++) {
                    for (int l = 0; l < x[i][j][k].length - 1; l++) {
                        int position = l;
                        for (int y = l + 1; y < x[i][j][k].length; y++) {
                            if (x[i][j][k][position] > x[i][j][k][y]) {
                                position = y;       //set new position
                            }       //end of if statement
                        }       //end of for loop
                        if (position != l) {
                        double temp = x[i][j][k][l];        //make this member a temp value
                        x[i][j][k][l] = x[i][j][k][position];       //switch the value in this position
                        x[i][j][k][position] = temp;        //make the final switch
                        }
                    }       //end of for loop
                }       //end of for loop
            }       //end of for loop
        }       //end of for loop
        return x;       //return the sorted array
    }       //end of method
    
    public static double [][][][] sort4DArray(double [][][][] x) {
        for (int i = 0; i < 2; i++) {
            if (x[i + 1].length < x[i].length) {
                double [][][] temp = x[i + 1];
                x[i + 1] = x[i];        //switch values
                x[i] = temp;        //switch values again
            }       //end of if statement
            else if (x[i + 1].length == x[i].length) {
                double min = x[i][0][0][0];     //establish minimmum value
                int position = i;       //define position
                for (int j = i; j <= i + 1; j++) {
                    for (int k = 0; k < x[j].length; k++) {
                        for (int l = 0; l < x[j][k].length; l++) {
                            for (int m = 0; m < x[j][k][l].length; m++) {
                                if (x[j][k][l][m] < min) {
                                    position = j;
                                }       //end of if statement
                            }       //end of for loop
                        }       //end of for loop
                    }       //end of for loop
                    if (position == (i + 1)) {
                        double [][][]temp2 = x[i];       //establish temp
                        x[i] = x[i + 1];        //switch values
                        x[i + 1] = temp2;        //switch values
                    }       //end of if statement
                }       //end of for loop
            }       //end of else if statement
        }       //end of for loop
        return x;       //return the array
    }       //end of method
    
    public static void statArray(double [][][][] x) {
        int counter = 0;        //initialize variable
        double sum = 0;         //initialize variable
        double mean = 0;        //initialize variable
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                for (int k = 0; k < x[i][j].length; k++) {
                    for (int l = 0; l < x[i][j][k].length; l++) {
                        sum += x[i][j][k][l];       //add all members to each other
                        counter++;      //keep track of every member counted
                    }       //end of for loop
                }
            }       //end of for loop
        }       //end of for loop
        mean = sum/counter;
        System.out.println("Members: " + counter);      //print the number of members
        System.out.println("Sum: " + sum);      //print the sum of all members
        System.out.println("Mean: " + mean);    //print the mean of the members
    }       //end of method
    
}       //end of class

