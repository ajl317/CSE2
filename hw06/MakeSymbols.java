//Tony Lonero
//March 3, 2015
//CSE2
//HW 06
//Make Symbols Java Program
//
//In this program I will generate a random number.
//If the number is even, I will print out that amount of * characters.
//If the number is odd, I will print out that amount of && characters.
//I will do the printing using do-while loops.
//
import java.lang.Math;  
//define a class
public class MakeSymbols {
    //add main method
    public static void main(String[] args) {
        int i = (int) (Math.random()*101);      //generate random number
        System.out.println("Random number generated: "+ i);     //print random number
        if (i%2 == 0) {
            do {
              System.out.print("*");        //print the star
              i--;      //increment i
            } while (i>=1);     //condition for while loop
        }   //end of if statement
        else {
            do {
               System.out.print("&");       //print the and symbol
               i--;     //increment i
            } while (i>=1);     //condition for while loop
        }   //end of else statement
    }   //end of main method
}   //end of class