//Tony Lonero
//February 13, 2015
//CSE2
//Lab 04
//Cookies Java program
//
//This program will prompt the user to input the number of people,
//the number of cookies you are buying, and how many cookie syou want each person to get.
//Then, the program will say whether you have enough cookies,
//and whether the amount is divisible by the number of people.
//
import java.util.Scanner;   //define scanner
    //Define a class
    public class Cookies {
        //Add main method
        public static void main(String[] args) {
            Scanner myScanner;      //declare an instance of the scanner
            int nPeople = 0;         //define a varibale
            int nCookies = 0;       //define a variable
            int nCookiesPerPerson = 0;      //define a variable
            myScanner = new Scanner( System.in );       //call the scanner
            System.out.print("Enter the number of people: ");       //prompt user for input
            if (myScanner.hasNextInt()) {
                nPeople = myScanner.nextInt();      //accept user input
            }
            else {
                System.out.println("You did not enter an integer");     //tell user the error
                return;     //leaves program
            }
            if ( nPeople > 0 ) {
                System.out.print("Enter the number of cookies you are planning to buy: ");      //prompt user for input
            }
            else {
                System.out.println("You did not enter an integer greater than 0");      //tell user the error
                return;     //leaves program
            }
            if (myScanner.hasNextInt()) {
                nCookies = myScanner.nextInt();      //accept user input
            }
            else {
                System.out.println("You did not enter an integer");     //tell user the error
                return;     //leaves program
            }
            if ( nCookies > 0 ) {
                System.out.print("How many cookies do you want each person to get? ");      //prompt user for input
            }
            else {
                System.out.println("You did not enter an integer greater than 0");      //tell user the error
                return;     //leaves program
            }
            if (myScanner.hasNextInt()) {
                nCookiesPerPerson = myScanner.nextInt();      //accept user input
            }
            else {
                System.out.println("You did not enter an integer");     //tell user the error
                return;     //leaves program
            }
            if ( nCookiesPerPerson >= 0 ) {
                if ( (nPeople*nCookiesPerPerson) <= nCookies  &&  nCookies%nPeople < 1) {
                    System.out.println("You have enough cookies for each person and the amount will divide evenly.");            //print result
                }
                    else if ((nPeople*nCookiesPerPerson) <= nCookies  &&  nCookies%nPeople > 0) {
                        System.out.println("You have enough, but they will not divide evenly.");         //print result
                    } 
                    else {
                        System.out.println("You will not have enough cookies. You need to buy at least " +((nPeople*nCookiesPerPerson) - nCookies)+ " more.");        //print result
                    }    
            }
            else {
                System.out.println("You did not enter an integer greater than 0");      //tell user the error
                return;     //leaves program
            }
        }   //end of main method
    }   //end of class