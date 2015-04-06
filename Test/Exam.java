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
    public class Exam {
        public static void main(String [] args) {
        for (int i = 6; i>0; i--) {
            if (i>2) {
                for (int k = i-1; k>1; k--) {
                    for (int j = 1; j<k; j++) {
                        System.out.print(i);
                    }
                    System.out.println("");
                }
            }
            else {
                System.out.println(i);
            }
        }
    }   //end of class
    }