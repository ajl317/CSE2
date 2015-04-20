//Tony Lonero
//April 17, 2015
//CSE2
//Lab12
//Matrices Java Program
//
//Ths program will generate 3 matrices; A, B, and C.
//It will then attempt to add A and B and A and C.
//
import java.util.Random;
public class Matrices {
    public static int [][]increasingMatrix(int width, int height, boolean format) {
        int counter = 1;        //define counter
        int [][]array;      //define array
        if (format) {
            array = new int [height][width];        //allocate array
            for (int i = 0; i < height; i++) {
                for (int j = 0; j < width; j++) {
                    array[i][j] = counter;      //establish a value in a 2 dimensional array
                    counter++;      //add one to the counter
                }       //end of for loop
            }       //end of for loop
        }       //end of if statement
        else {
            array = new int[width][height];      //allocate array
            for (int i = 0; i < height; i++) {
                for (int j = 0; j < width; j++) {
                    array[j][i] = counter;      //establish a value in a 2 dimensional array
                    counter++;      //add one to the counter
                }       //end of for loop
            }       //end of for loop
        }       //end of else statement
        return array;       //return the output
    }       //end of method
    
    public static void printMatrix(int[][] array, boolean format) {
        if (format) {
            for (int i = 0; i < array.length; i++){
                for (int j = 0; j < array[0].length; j++) {
                    System.out.print(array[i][j]+ " ");      //print this element
                }       //end of for loop
                System.out.println("");     //go to the next line
            }       //end of for loop
        }       //end of if statement
        else {
            for (int i = 0; i < array[0].length; i++){
                for (int j = 0; j < array.length; j++) {
                    System.out.print(array[j][i]+ " ");      //print this element
                }       //end of for loop
                System.out.println("");     //go to the next line
            }       //end of for loop
        }       //end of else statement
    }       //end of method
    
    public static int [][]translate(int[][] array) {
        int [][]array1 = new int [array[0].length][array.length];       //generate new array
        for (int i = 0; i < array[0].length; i++) {
            for (int j = 0; j < array.length; j++) {
                array1[i][j] = array[j][i];     //swap elements
            }       //end of for loop
        }       //end of for loop
        return array1;      //return the array
    }       //end of method
    
    public static int [][]addMatrix(int[][] a, boolean formata, int[][] b, boolean formatb) {
        if (!formata) {
            a = translate(a);       //call the translate method
        }       //end of if statement
        if (!formatb) {
            b = translate(b);       //call the translate method
        }       //end of if statement
        if (a.length == b.length && a[0].length == b[0].length) {
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[0].length; j++) {
                    a[i][j] = (a[i][j] + b[i][j]);      //add the two elements together
                }       //end of for loop
            }       //end of for loop
            return a;       //return the array
        }       //end of if statement
        else {
            System.out.println("The arrays cannot be added!");      //tell user that the arrays cannot be added
            return null;        //return  null
        }       //end of else statement
    }       //end of method
    
    public static void main(String [] args) {
        Random randomGenerator = new Random();  //declare a new random generator
        int width1 = randomGenerator.nextInt(10) + 1;   //generate a random int between 1 and 10
        int width2 = randomGenerator.nextInt(10) + 1;   //generate a random int between 1 and 10
        int height1 = randomGenerator.nextInt(10) + 1;   //generate a random int between 1 and 10
        int height2 = randomGenerator.nextInt(10) + 1;   //generate a random int between 1 and 10
        int [][] arrayA = new int [height1][width1];        //allocate array
        int [][] arrayB = new int [width1][height1];        //allocate array
        int [][] arrayC = new int [height2][width2];        //allocate array
        int [][] arrayD = new int [height1][width1];        //allocate array
        System.out.println("Generating a matrix with width "+ width1+ " and height "+ height1+ ":");       //print this line
        arrayA = increasingMatrix(width1, height1, true);       //create arrayA using method
        printMatrix(arrayA, true);       //print the matrix
        System.out.println("Generating a matrix with width "+ width1+ " and height "+ height1+ ":");       //print this line
        arrayB = increasingMatrix(width1, height1, false);       //create arrayA using method
        printMatrix(arrayB, false);       //print the matrix
        System.out.println("Generating a matrix with width "+ width2+ " and height "+ height2+ ":");       //print this line
        arrayC = increasingMatrix(width2, height2, true);       //create arrayA using method
        printMatrix(arrayC, true);       //print the matrix
        System.out.println("Adding two matrices.");     //print this line
        printMatrix(addMatrix(arrayA, true, arrayB, false), true);      //print the sum of the matrices
        arrayD = addMatrix(arrayA, true, arrayC, true);     //create array D using method
        if (arrayD != null) {
            printMatrix(arrayD, true);      //print the matrix
        }       //end of if statement
    }       //end of main method
    
}       //end of class