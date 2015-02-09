//Tony Lonero
//February 10, 2015
//CSE2
//hw 03
//Root Java Program
//
//Given user input, generate the cubic root of the number.
//Display the cubic root, and then display that number cubed
//
import java.util.Scanner;   //define a scanner
    //Define a class
    public class Root {
        public static void main(String[] args) {
            Scanner myScanner;      //declare an instance of the scanner
            myScanner = new Scanner( System.in );   //call the scanner
            System.out.print("Enter a double, and I print its cube root: ");        //prompt user for input
            double userNumber = myScanner.nextDouble();     //accept user input
            double guess = userNumber/3;        //define a variable
            double guess2 = ((2*guess*guess*guess+userNumber)/(3*guess*guess)); //define a variable
            double guess3 = ((2*guess2*guess2*guess2+userNumber)/(3*guess2*guess2)); //define a variable
            double guess4 = ((2*guess3*guess3*guess3+userNumber)/(3*guess3*guess3)); //define a variable
            double guess5 = ((2*guess4*guess4*guess4+userNumber)/(3*guess4*guess4)); //define a variable
            double guess6 = ((2*guess5*guess5*guess5+userNumber)/(3*guess5*guess5)); //define a variable
            System.out.println("The cube root is: "+guess6);        //print out the cube root
            System.out.println(guess6 + "*" + guess6 + "*" + guess6 + "=");        //print out the cube root, cubed
            System.out.println(guess6*guess6*guess6);               //print out the guess of the cube, cubed. Should equal user input.
        }   //end of main method
    }   //end of class