//Tony Lonero
//February 24, 2015
//CSE2
//Hw 05
//ToHex Java Program
//
//Convert three decimal integers into hexadecimal numbers.
//Print out a string of all three numbers converted at the end.
//
import java.util.Scanner;       //define a scanner
//Define a class
public class ToHex {
    //Add main method
    public static void main(String[] args) {
        Scanner myScanner;      //declare an instance of the scanner
        myScanner = new Scanner( System.in );   //call the scanner
        System.out.println("Please enter three numbers representing RGB values:");      //prompt user for input
        int digitR = 0;     //define int
        int digitG = 0;     //define int
        int digitB = 0;     //define int
        if (myScanner.hasNextInt()) {
            digitR = myScanner.nextInt();     //assign input to digit R
            if (digitR < 0 || digitR > 255) {
                System.out.println("You need to enter a value between 0 and 255.");
                return;     //leaves program
            }
        }
        else {
            System.out.println("Your input must consist of integers.");        //tell user they entered an invalid input
            return;     //leaves program
        }
        if (myScanner.hasNextInt()) {
            digitG = myScanner.nextInt();     //assign input to digit G
            if (digitG < 0 || digitG > 255) {
                System.out.println("You need to enter a value between 0 and 255.");
                return;     //leaves program
            }
        }
        else {
            System.out.println("Your input must consist of integers.");        //tell user they entered an invalid input
            return;     //leaves program
        }
        if (myScanner.hasNextInt()) {
            digitB = myScanner.nextInt();     //assign input to digit B
            if (digitB < 0 || digitB > 255) {
                System.out.println("You need to enter a value between 0 and 255.");
                return;     //leaves program
            }
        }
        else {
            System.out.println("Your input must consist of integers.");        //tell user they entered an invalid input
            return;     //leaves program
        }
        int bit1 = (int) digitR/16;       //define bit1
        String firstDigit = "";         //define string
        switch (bit1) {
            case 0: firstDigit = "0";
            break;
            case 1: firstDigit = "1";
            break;
            case 2: firstDigit = "2";
            break;
            case 3: firstDigit = "3";
            break;
            case 4: firstDigit = "4";
            break;
            case 5: firstDigit = "5";
            break;
            case 6: firstDigit = "6";
            break;
            case 7: firstDigit = "7";
            break;
            case 8: firstDigit = "8";
            break;
            case 9: firstDigit = "9";
            break;
            case 10: firstDigit = "A";
            break;
            case 11: firstDigit = "B";
            break;
            case 12: firstDigit =" C";
            break;
            case 13: firstDigit = "D";
            break;
            case 14: firstDigit = "E";
            break;
            case 15: firstDigit = "F";
            break;
        }
        int bit2 = (int) digitR%16;       //define bit2
        String secondDigit = "";        //define string
            switch (bit2) {
            case 0: secondDigit = "0";
            break;
            case 1: secondDigit = "1";
            break;
            case 2: secondDigit = "2";
            break;
            case 3: secondDigit = "3";
            break;
            case 4: secondDigit = "4";
            break;
            case 5: secondDigit = "5";
            break;
            case 6: secondDigit = "6";
            break;
            case 7: secondDigit = "7";
            break;
            case 8: secondDigit = "8";
            break;
            case 9: secondDigit = "9";
            break;
            case 10: secondDigit = "A";
            break;
            case 11: secondDigit = "B";
            break;
            case 12: secondDigit =" C";
            break;
            case 13: secondDigit = "D";
            break;
            case 14: secondDigit = "E";
            break;
            case 15: secondDigit = "F";
            break;
        }
        int bit3 = (int) digitG/16;       //define bit3
        String thirdDigit = "";         //define string
        switch (bit3) {
            case 0: thirdDigit = "0";
            break;
            case 1: thirdDigit = "1";
            break;
            case 2: thirdDigit = "2";
            break;
            case 3: thirdDigit = "3";
            break;
            case 4: thirdDigit = "4";
            break;
            case 5: thirdDigit = "5";
            break;
            case 6: thirdDigit = "6";
            break;
            case 7: thirdDigit = "7";
            break;
            case 8: thirdDigit = "8";
            break;
            case 9: thirdDigit = "9";
            break;
            case 10: thirdDigit = "A";
            break;
            case 11: thirdDigit = "B";
            break;
            case 12: thirdDigit =" C";
            break;
            case 13: thirdDigit = "D";
            break;
            case 14: thirdDigit = "E";
            break;
            case 15: thirdDigit = "F";
            break;
        }
        int bit4 = (int) digitG%16;       //define bit4
        String fourthDigit = "";        //define string
            switch (bit4) {
            case 0: fourthDigit = "0";
            break;
            case 1: fourthDigit = "1";
            break;
            case 2: fourthDigit = "2";
            break;
            case 3: fourthDigit = "3";
            break;
            case 4: fourthDigit = "4";
            break;
            case 5: fourthDigit = "5";
            break;
            case 6: fourthDigit = "6";
            break;
            case 7: fourthDigit = "7";
            break;
            case 8: fourthDigit = "8";
            break;
            case 9: fourthDigit = "9";
            break;
            case 10: fourthDigit = "A";
            break;
            case 11: fourthDigit = "B";
            break;
            case 12: fourthDigit =" C";
            break;
            case 13: fourthDigit = "D";
            break;
            case 14: fourthDigit = "E";
            break;
            case 15: fourthDigit = "F";
            break;
        }
        int bit5 = (int) digitB/16;       //define bit5
        String fifthDigit = "";         //define string
        switch (bit5) {
            case 0: fifthDigit = "0";
            break;
            case 1: fifthDigit = "1";
            break;
            case 2: fifthDigit = "2";
            break;
            case 3: fifthDigit = "3";
            break;
            case 4: fifthDigit = "4";
            break;
            case 5: fifthDigit = "5";
            break;
            case 6: fifthDigit = "6";
            break;
            case 7: fifthDigit = "7";
            break;
            case 8: fifthDigit = "8";
            break;
            case 9: fifthDigit = "9";
            break;
            case 10: fifthDigit = "A";
            break;
            case 11: fifthDigit = "B";
            break;
            case 12: fifthDigit =" C";
            break;
            case 13: fifthDigit = "D";
            break;
            case 14: fifthDigit = "E";
            break;
            case 15: fifthDigit = "F";
            break;
        }
        int bit6 = (int) digitB%16;       //define bit6
        String sixthDigit = "";        //define string
            switch (bit6) {
            case 0: sixthDigit = "0";
            break;
            case 1: sixthDigit = "1";
            break;
            case 2: sixthDigit = "2";
            break;
            case 3: sixthDigit = "3";
            break;
            case 4: sixthDigit = "4";
            break;
            case 5: sixthDigit = "5";
            break;
            case 6: sixthDigit = "6";
            break;
            case 7: sixthDigit = "7";
            break;
            case 8: sixthDigit = "8";
            break;
            case 9: sixthDigit = "9";
            break;
            case 10: sixthDigit = "A";
            break;
            case 11: sixthDigit = "B";
            break;
            case 12: sixthDigit =" C";
            break;
            case 13: sixthDigit = "D";
            break;
            case 14: sixthDigit = "E";
            break;
            case 15: sixthDigit = "F";
            break;
        }
        String lastNumber = firstDigit+secondDigit+thirdDigit+fourthDigit+fifthDigit+sixthDigit;        //define string
        System.out.println("The decimal numbers R:"+digitR+", G:"+digitG+", B:"+digitB+", are represented in hexadecimal as: "+lastNumber);      //final print statement
    }   //end of main method
}   //end of class