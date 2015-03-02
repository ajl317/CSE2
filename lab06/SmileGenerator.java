//Tony Lonero
//February 27, 2015
//CSE2
//Lab 06
//Smile Generator java Program
//
//This program will print smiley faces using all different kinds of loops.
//
import java.lang.Math;
// define a class
public class SmileGenerator {
    //add main method
    public static void main(String[] args) {
        for (int counter = 1; counter <6; counter++) {  //set up for loop
            System.out.print( ":) " );      //print smiley
        }   //end of for loop
        System.out.println("");     //print new line
        int counter2 = 1;       //initialize counter
        while (counter2 < 6) {
            System.out.print( ":) ");       //print smiley
            counter2++;   //increment counter
        }   //end of while loop
        System.out.println("");     //print new line
        int counter3 = 1;       //initialize counter
        do {
            System.out.print(":) ");        //print smiley
            counter3++;     //increment counter
        }       //end of do statement
        while (counter3 < 6);       //while part of do statement
        System.out.println("");     //print new line
        System.out.println("");     //print new line
        
        
        int counter4 = (int) (Math.random()*100) + 1;       //generate random number
        while (counter4 <= 100) {
            System.out.print(":) ");        //print smiley
            counter4++;     //increment counter
        }   //end of while loop
        System.out.println("");     //print new line
        System.out.println("");     //print new line
        
        
        int counter5 = (int) (Math.random()*100) +1;        //generate random number
        int smileyLimit = counter5;     //initialize smiley limit
        while (counter5 <=100){
            if (counter5 == (30 + smileyLimit) || counter5 == (60 + smileyLimit) || counter5 == (90 + smileyLimit)) {
                System.out.println("");     //print new line
            }   //end of if statement
            System.out.print(":) ");        //print smiley
            counter5++;     //increment counter
        }   //end of while loop
        System.out.println("");     //print new line
        System.out.println("");     //print new line
        
        
        int counter6 = (int) (Math.random()*10) +1;     //generate random number
        String smiley = ":) ";      //define string
        while (counter6 <=10) {
            System.out.println(smiley);       //print smiley
            counter6++;     //increment counter
            smiley = smiley + ":) ";        //add an additional smiley for every line
        }   //end of while loop
    }   //end of main method
}   //end of class