//Tony Lonero
//February 6, 2015
//CSE2
//Lab 03
//Big Mac Java Program
//
//This program will allow users to input the amount of big macs they will purchase,
//as well as the sales tax for their particular state.
//It will compute the total cost of the transaction and display
//how much the final cost is with the sales tax taken into account.
//
    import java.util.Scanner;   //define scanner
        //Define a class
        public class BigMac {
            //Add main method
            public static void main(String[] args) {
                Scanner myScanner;      //declare an instance of the scanner
                myScanner = new Scanner( System.in );       //call the scanner
                System.out.print("Enter the number of Big Macs (an integer > 0): ");    //prompt the user for input data
                int nBigMacs = myScanner.nextInt();     //accept user input
                System.out.print("Enter the cost per Big Mac as a double (in the form xx.xx): " );  //prompt the user for the cost of a Big Mac
                double bigMac$ = myScanner.nextDouble();    //accept user input
                System.out.print("Enter the percent tax as a whole number (xx): ");     //prompt user for input
                double taxRate = myScanner.nextDouble();    //accept user input
                taxRate/=100;   //transform tax rate into a percentage
                double cost$;   //define a variable
                int dollars,    //whole dollar amount of cost
                dimes, pennies; //for storing digits to the right of the decimal point for the cost$
                cost$ = nBigMacs*bigMac$*(1+taxRate);   //final cost of the purchase
                dollars = (int) cost$;  //get the whole amount, dropping decimal fraction
                dimes = (int) (cost$*10)%10;    //get dimes amount
                pennies = (int) (cost$*100)%10; //get the pennies amount
                System.out.println("The total cost of " +nBigMacs
                +" BigMacs, at $"+bigMac$ +" per bigMac, with a " +
                "sales tax of "+ (int)(taxRate*100) + "%, is $" +dollars+'.'+dimes+pennies);        //final print statement
            }   //end of main method
        }   //end of class