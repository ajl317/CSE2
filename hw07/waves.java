//Tony Lonero
//March 17, 2015
//CSE2
//HW 07
//Waves Java Program
//
//This program will prompt uthe user for an input between 0 and 30,
//and then print out a wave like pattern of the number entered.
//This will be executed with for, while, and do while loops.
//
import java.util.Scanner;       //define scanner
    //define a class
    public class waves {
        //add main method
        public static void main(String[] args) {
            Scanner myScanner;      //decalre the scanner
            System.out.print("Enter a number between 1 and 30: ");      //prompt user for input
            int input = 0;      //define input
            while (true) {
                myScanner = new Scanner( System.in );       //call the scanner
                if (myScanner.hasNextInt()) {
                    input = myScanner.nextInt();        //accept user input
                    if (input > 0 && input < 31) {
                        break;      //leave while loop
                    }       //end of if statement
                    else {
                        System.out.println("Invalid input, try again.");
                    }   //end of else statement
                }       //end of if statement
                else {
                    System.out.println("Invalid input, try again.");
                }   //end of else statement
            }       //end of while loop
            
            System.out.println("FOR LOOP:");        //print this line
            for (int x = 1; x <= input; x++) {
                if (x%2==0) {
                    for (int counter = 1; counter <= x; counter++) {
                        for (int counter2 = 1; counter2 < counter; counter2++){
                            System.out.print(x);      //print x
                        }   //end of for loop
                        System.out.println(x);      //print x
                    }   //end of for loop
                }       //end of if statement
                else {
                    for (int counter = 1; counter <=x; counter++) {
                        for (int counter2 = x; counter2 > counter;  counter2--) {
                            System.out.print(x);    //print x
                        }   //end of for loop
                        System.out.println(x);      //print x
                    }   //end of for loop
                }   //end of else statement
            }   //end of for loop
            System.out.println("");     //print blank line
            System.out.println("");     //print blank line
            System.out.println("WHILE LOOP:");      //print this line
            int x = 1;      //define int x
            while (x <= input) {
                if (x%2==0){
                    int counter = 1;        //initialize counter
                    while (counter <= x) {
                        int counter2 = 1;       //initialize counter
                        while (counter2 < counter) {
                            System.out.print(x);    //print x
                            counter2++;
                        }   //end of while loop
                        System.out.println(x);      //print x
                        counter++;    //increment counter
                    }   //end of while loop
                }   //end of if statement
                else {
                    int counter = 1;        //initialize counter
                    while (counter <= x) {
                        int counter2 = x;   //initialize counter 2
                        while (counter2 > counter) {
                            System.out.print(x);    //print x
                            counter2--;     //increment counter2
                        }   //end of while loop
                        System.out.println(x);      //print x
                        counter++;        //increment counter
                    }   //end of while loop
                }   //end of else statement
                x++;    //increment x
            }   //end of while loop
            System.out.println("");     //print blank line
            System.out.println("");     //print blank line
            System.out.println("DO-WHILE LOOP:");      //print this line
            x = 1;      //initialize int x
            do {
                if (x%2==0){
                    int counter = 1;        //initialize counter
                    do {
                        int counter2 = 1;       //initialize counter 2
                        do{
                            counter2++;     //increment counter
                            if (counter2 == (counter + 1)) {
                                System.out.print("");   //print nothing
                            }   //end of if statement
                            else {
                                System.out.print(x);    //print x
                            }   //end of else statement
                        } while (counter2 < counter);   //end of while loop
                        System.out.println(x);      //print x
                        counter++;      //increment counter
                    } while (counter <= x);      //end of do while loop
                }   //end of if statement
                else {
                    int counter = 1;        //initialize counter
                    do {
                        int counter2 = x;       //initialize counter 2
                        do {
                            counter2--;     //increment counter
                            if (counter2 == (x - 1)) {
                                System.out.print("");       //print nothing
                            }   //end of if statement
                            else {
                                System.out.print(x);    //print x
                            }   //end of else statement
                        } while (counter2 >= counter);       //end of while loop
                        System.out.println(x);  //print x
                        counter++;      //increment counter
                    } while (counter <= x);     //end of while loop
                }   //end of else statement
                x++;        //increment counter
            } while (x <= input);        //end of do-while loop
        }   //end of main method
    }   //end of class