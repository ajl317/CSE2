//Tony Lonero
//February 10, 2015
//CSE2
//hw 03
//Bicycle Java Program
//
//Given user input of seconds and number of counts,
//print out the distance in miles, time in minutes,
//and average miles per hour.
//
import java.util.Scanner;   //define a scanner
    //Define a class
    public class Bicycle {
        public static void main(String[] args) {
            Scanner myScanner;      //declare an instance of the scanner
            myScanner = new Scanner( System.in );   //call the scanner
            System.out.print("Enter the number of seconds: ");      //prompt user to enter the number of seconds
            int nSeconds = myScanner.nextInt();     //accept user input
            System.out.print("Enter the number of counts: ");        //prompt user to enter the number of counts
            int nCounts = myScanner.nextInt();      //accept user input
            double WheelDiameter=27.0,      //Wheel diameter
            PI=3.14159,                     //value of pi
            feetPerMile=5280,               //feet in a mile
            inchesPerFoot=12,               //inches in a foot
            secondsPerMinute=60,            //seconds in a minute
            minutesPerHour=60;              //minutes in an hour
            double totalDistance,           //define a variable
            totalMinutes,                   //define a variable
            avgMPH;                         //define a variable
            totalDistance=nCounts*WheelDiameter*PI/inchesPerFoot/feetPerMile;           //gives distance in miles
            float totalDistance2= (float) Math.round(totalDistance*100)/100;            //round answer
            totalMinutes=nSeconds/secondsPerMinute;         //compute total minutes
            float totalMinutes2= (float) Math.round(totalMinutes*100)/100;      //round answer
            avgMPH=totalDistance/(nSeconds/secondsPerMinute/minutesPerHour);      //gives average MPH
            float avgMPH2= (float) Math.round(avgMPH*100)/100;      //round answer
            
            System.out.println("The distance was "+totalDistance2+" miles and took "+totalMinutes2+ " minutes");        //prints out the distance in miles and time in minutes.
            System.out.println("The average MPH was "+avgMPH2);                   //prints out the average miles per hour
        }   //end of main method
    }   //end of class