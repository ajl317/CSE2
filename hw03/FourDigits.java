//Tony Lonero
//February 10, 2015
//CSE2
//hw 03
//Four Digits Java Program
//
//Prompt user to enter a double and print out the first 4 digits after the decimal point.
//
    import java.util.Scanner;   //define scanner
        //Define a class
        public class FourDigits {
            public static void main(String[] args) {
                Scanner myScanner;      //declare an instance of the scanner
                myScanner = new Scanner( System.in );       //call the scanner
                System.out.print("Enter a double and I display the four digits to the right of the decimal point: ");       //prompt user for input
                double userInput = myScanner.nextDouble();  //accept user input
                int userInput2 = (int) (userInput*10000);           //cast to an int and multiply by 10,000
                double userInput3 = (double) userInput2/10000;            //cast to an int and divide by 10,000
                int tens,   hundreds,   thousands,  tenThousands;       //define variables
                tens = (int) (userInput3*10)%10;                 //find the digit in the tens place
                hundreds = (int) (userInput3*100)%10;           //find the digit in the hundreds place
                thousands = (int) (userInput3*1000)%10;        //find the digit in the thousands place
                tenThousands = (int) (userInput3*10000)%10;   //find the digit in the ten thousands place
                System.out.println("The four digits are " +tens+hundreds+thousands+tenThousands);        //print out the four digits to the right of the decimal
            }   //end of main method
        }   //end of class