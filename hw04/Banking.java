//Tony Lonero
//February 17, 2015
//CSE2
//HW 04
//Banking Java Program
//
//Generate a random number between 1,000 and 5,000
//Ask the user if they want to view their balance,
//Withdraw money, or deposit money.
//Based on what they choose, compute the remaining balance
//and display it to the user at the end.
//
import java.util.Scanner;       //define a scaner
import java.util.Random;        //define a random number generator
//Define a class
public class Banking {
    //Add main method
    public static void main(String[] args) {
        Scanner myScanner;      //declare an instance of the scanner
        myScanner = new Scanner( System.in );   //call the scanner
        int min = 1000;     //establish minimum
        int max = 5000;     //establish maximum
        Random r = new Random();    //initialize random number
        int initial = r.nextInt(max - min + 1) + min;       //generate random number
        String response = "";       //initialize variable
        int response2 = 0;      //initialize variable
        System.out.println("Your initial balance is $" +initial);       //print beginning balance
        System.out.print("Do you want to deposit money, withdraw money, or view your balance? (Enter d, w, or v) ");   //ask user what they want to do
        if (myScanner.hasNext("w") || myScanner.hasNext("d") || myScanner.hasNext("v")) {
            response = myScanner.next();
        }
        else {
            System.out.println("This is not a valid response. ");       //tell user their response is not valid
            return;     //leaves program
        }
        switch (response){
            case "w" :
                System.out.print("How much would you like to withdraw? (Enter an int) ");     //ask user question
                if (myScanner.hasNextInt()) {
                    response2 = myScanner.nextInt();      //accept user input
                }
                else {
                    System.out.print("This is not a valid response. ");     //tell user their response is not valid
                    return;     //leaves program
                }
                if (response2 <= initial  &&  response2 >= 0) {
                    System.out.println("Your new balance is $" +(initial - response2));    //print new balance
                }
                else {
                    System.out.println("This is not a valid input.");       //tell the user their response is not valid
                }
                break;  //finish case
            case "d" :
                System.out.println("How much would you like to deposit? (Enter an int) ");      //ask user question
                if (myScanner.hasNextInt()) {
                    response2 = myScanner.nextInt();      //accept user input
                }
                else {
                    System.out.print("This is not a valid response. ");     //tell user their response is not valid
                    return;     //leaves program
                }
                if (response2 >= 0) {
                    System.out.println("Your new balance is $" +(initial + response2));     //print out new balance
                }
                else {
                    System.out.println("You cannot deposit a negative amount of money.");    //tell user their response is not valid
                }
                break;  //finish case
            case "v" :
                System.out.println("Your balance remains $" +initial);           //print balance
                break;  //finish case
        }
    }   //end of main method
}       //end of class