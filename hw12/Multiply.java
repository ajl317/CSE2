//Tony Lonero
//April 21, 2015
//CSE2
//HW12
//Multiply Java Program
//
//This program will generate two random matrices.
//It will then multiply the two matrices, if possible, and display the product
//
import java.util.Scanner;
import java.util.Random;
public class Multiply {
    public static int [][]randomMatrix(int width, int height) {
        Random rand = new Random();     //declare a new random generator
        int [][]array = new int [height][width];     //allocate new array
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                int value = rand.nextInt(21) - 10;      //generate a random number between -10 and 10
                array[i][j] = value;        //assign a value to a specific element
            }       //end of for loop
        }       //end of for loop
        return array;       //return the array
    }       //end of method
    
    public static void printMatrix(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j]+ " ");     //print the element in the array
            }       //end of for loop
            System.out.println("");     //go to the next line
        }       //end of for loop
    }       //end of method
    
    public static int [][]matrixMultiply(int[][] array1, int[][] array2) {
        if (array1[0].length != array2.length) {
            System.out.println("Matrices cannot be multiplied.");       //print the error message
            return null;        //return null
        }       //end of if statement
        System.out.println("The dimension of the product matrix is "+ array1.length+ " x "+ array2[0].length);      //print out the dimension of the product matrix
        int [][] product = new int [array1.length][array2[0].length];       //allocate new array 
        for (int i = 0; i < array1.length; i++){
            for (int j = 0; j < array2[1].length; j++) {
                for (int n = 0; n < array1[0].length; n++) {
                    product[i][j] += array1[i][n]*array2[n][j];     //finds the product of the two matrices
                    }       //end of foor loop
                }       //end of for loop
            }       //end of for loop
            return product;     //return matrix
    }       //end of method
    
    public static void main (String [] args ) {
        Scanner myScanner = new Scanner (System.in);        //declare scanner
        int width1;     //declare a variable
        int width2;     //declare a variable
        int height1;    //declare a variable
        int height2;    //declare a variable
        while (true) {
            System.out.println("Enter the first width as an integer: ");        //print this line
            if (myScanner.hasNextInt()) {
                width1 = myScanner.nextInt();       //assign value to width 1
                if (width1 > 0) {
                    break;      //leave while loop
                }       //end of if statement
                else {
                    System.out.println("The value is not greater than 0, try again.");      //print this line
                }       //end of else statement
            }       //end of if statement
            else {
                System.out.println("Integer not entered, try again.");      //print this line
                myScanner.next();       //prevent infinite loop
            }       //end of else statement
        }       //end of while loop
        while (true) {
            System.out.println("Enter the second width as an integer: ");        //print this line
            if (myScanner.hasNextInt()) {
                width2 = myScanner.nextInt();       //assign value to width 2
                if (width2 > 0) {
                    break;      //leave while loop
                }       //end of if statement
                else {
                    System.out.println("The value is not greater than 0, try again.");      //print this line
                }       //end of else statement
            }       //end of if statement
            else {
                System.out.println("Integer not entered, try again.");      //print this line
                myScanner.next();       //prevent infinite loop
            }       //end of else statement
        }       //end of while loop
        while (true) {
            System.out.println("Enter the first height as an integer: ");        //print this line
            if (myScanner.hasNextInt()) {
                height1 = myScanner.nextInt();       //assign value to width 1
                if (height1 > 0) {
                    break;      //leave while loop
                }       //end of if statement
                else {
                    System.out.println("The value is not greater than 0, try again.");      //print this line
                }       //end of else statement
            }       //end of if statement
            else {
                System.out.println("Integer not entered, try again.");      //print this line
                myScanner.next();       //prevent infinite loop
            }       //end of else statement
        }       //end of while loop
        while (true) {
            System.out.println("Enter the second height as an integer: ");        //print this line
            if (myScanner.hasNextInt()) {
                height2 = myScanner.nextInt();       //assign value to width 1
                if (height2 > 0) {
                    if (height2 == width1){
                        break;      //leave while loop
                    }       //end of if statement
                    else {
                        System.out.println("Height 2 must equal Width 1 in order to multiply, try again.");     //print the error
                    }       //end of else statement
                }       //end of if statement
                else {
                    System.out.println("The value is not greater than 0, try again.");      //print this line
                }       //end of else statement
            }       //end of if statement
            else {
                System.out.println("Integer not entered, try again.");      //print this line
                myScanner.next();       //prevent infinite loop
            }       //end of else statement
        }       //end of while loop
        int [][]matrix = new int [height1][width1];     //allocate new matrix
        int [][]matrix2 = new int [height2][width2];     //allocate new matrix
        int [][]matrix3 = new int [width2][height1];     //allocate new matrix
        matrix = randomMatrix(width1, height1);     //generate new matrix
        matrix2 = randomMatrix(width2, height2);        //generate new matrix
        System.out.println("The first matrix is: ");        //print this line
        printMatrix(matrix);        //call this method
        System.out.println("The second matrix is: ");        //print this line
        printMatrix(matrix2);        //call this method
        matrix3 = matrixMultiply(matrix, matrix2);      //generate the product of the two matrices
        System.out.println("The product of the two matrices is: ");     //print this line
        printMatrix(matrix3);       //call this method
    }       //end of main method
}       //end of class