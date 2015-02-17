//Tony Lonero
//February 17, 2015
//CSE2
//HW 04
//Which Number Java Program
//
//This program will prompt the user to think of a number bewteen 1 and 10.
//After a series of questions are asked, the program will print the number
//that the user was thinking of.
//
import java.util.Scanner;   //define a scanner
    //Define a class
    public class WhichNumber {
        //Add main method
        public static void main(String[] args) {
            Scanner myScanner;      //declare an instance of the scanner
            myScanner = new Scanner( System.in );   //call the scanner
            String response = "";       //initialize variable
            String response2 = "";      //initialize variable
            String response3 = "";      //initialize variable
            String response4 = "";      //initialize variable
            System.out.println("Think of a number between 1 and 10 inclusive.");        //prompt user to think of a number
            System.out.print("Is your number even? ");  //print this question
            
            if (myScanner.hasNext("Y") || myScanner.hasNext("y") || myScanner.hasNext("N") || myScanner.hasNext("n")) {
                response = myScanner.next();
            }
            else {
                System.out.println("Sorry, this is not a valid input. ");   //tell user that they entered an invalid input
                return;     //leaves the program
            }
            if (response.equals("Y") || response.equals("y")) {
                System.out.print("Is it divisible by 3? ");         //print this question
                if (myScanner.hasNext("Y") || myScanner.hasNext("y") || myScanner.hasNext("N") || myScanner.hasNext("n")) {
                    response2 = myScanner.next();
                }
                else {
                    System.out.println("Sorry, this is not a valid input. ");   //tell user that they entered an invalid input
                    return;     //leaves the program
                }
                if (response2.equals("Y") || response2.equals("y")) {
                    System.out.println("6 ");         //print the answer
                    return;     //leaves the program
                }
                else {
                    System.out.print("Is it divisible by 4? ");     //print this question
                }
                if (myScanner.hasNext("Y") || myScanner.hasNext("y") || myScanner.hasNext("N") || myScanner.hasNext("n")) {
                    response3 = myScanner.next();
                }
                else {
                    System.out.println("Sorry, this is not a valid input. ");   //tell user that they entered an invalid input
                    return;     //leaves the program
                }
                if (response3.equals("Y") || response3.equals("y")) {
                    System.out.println("Is the number divided by 4 greater than 1? ");         //print this question
                        if (myScanner.hasNext("Y") || myScanner.hasNext("y") || myScanner.hasNext("N") || myScanner.hasNext("n")) {
                        response4 = myScanner.next();
                        }
                        else {
                        System.out.println("Sorry, this is not a valid input. ");   //tell user that they entered an invalid input
                        return;     //leaves the program
                        }
                        if (response4.equals("Y") || response4.equals("y")) {
                        System.out.println("8 ");         //print this question
                        return;     //leaves the program
                        }
                        else {
                        System.out.println("4 ");     //print this question
                        return;     //leaves the program
                        }
                }
                else {
                    System.out.print("Is it divisible by 5? ");     //print this question
                        if (myScanner.hasNext("Y") || myScanner.hasNext("y") || myScanner.hasNext("N") || myScanner.hasNext("n")) {
                        response4 = myScanner.next();
                        }
                        else {
                        System.out.println("Sorry, this is not a valid input. ");   //tell user that they entered an invalid input
                        return;     //leaves the program
                        }
                        if (response4.equals("Y") || response4.equals("y")) {
                        System.out.println("10 ");         //print this question
                        return;     //ends the program
                        }
                        else {
                        System.out.println("2 ");     //print this question
                        return;     //ends the program
                        }
                }
            }
            else {
                System.out.print("Is it divisible by 3? ");     //print this question
                if (myScanner.hasNext("Y") || myScanner.hasNext("y") || myScanner.hasNext("N") || myScanner.hasNext("n")) {
                    response2 = myScanner.next();
                }
                else {
                    System.out.println("Sorry, this is not a valid input. ");   //tell user that they entered an invalid input
                    return;     //leaves the program
                }
                if (response2.equals("Y") || response2.equals("y")) {
                    System.out.println("When divided by 3, is the result greater than 1? ");         //print this question
                    if (myScanner.hasNext("Y") || myScanner.hasNext("y") || myScanner.hasNext("N") || myScanner.hasNext("n")) {
                    response3 = myScanner.next();
                    }
                    else {
                    System.out.println("Sorry, this is not a valid input. ");   //tell user that they entered an invalid input
                    return;     //leaves the program
                    }
                    if (response3.equals("Y") || response3.equals("y")) {
                        System.out.println("9 ");         //print this answer
                        return;     //ends the program
                    }
                    else {
                        System.out.println("3 ");     //print this answer
                        return;     //ends the program
                    }
                }
                else {
                    System.out.print("Is it greater than 6? ");     //print this question
                    if (myScanner.hasNext("Y") || myScanner.hasNext("y") || myScanner.hasNext("N") || myScanner.hasNext("n")) {
                    response3 = myScanner.next();
                    }
                    else {
                    System.out.println("Sorry, this is not a valid input. ");   //tell user that they entered an invalid input
                    return;     //leaves the program
                    }
                    if (response3.equals("Y") || response3.equals("y")) {
                        System.out.println("7 ");         //print this answer
                        return;     //ends the program
                    }
                    else {
                        System.out.print("Is it less than 3? ");     //print this question
                        if (myScanner.hasNext("Y") || myScanner.hasNext("y") || myScanner.hasNext("N") || myScanner.hasNext("n")) {
                        response4 = myScanner.next();
                        }
                        else {
                        System.out.println("Sorry, this is not a valid input. ");   //tell user that they entered an invalid input
                        return;     //leaves the program
                        }
                        if (response4.equals("Y") || response4.equals("y")) {
                        System.out.println("1 ");         //print this answer
                        return;     //ends the program
                        }
                        else {
                        System.out.println("5 ");     //print this answer
                        return;     //ends the program
                        }
                    }
                }
            }
        }   //end of main method
    }   //end of class