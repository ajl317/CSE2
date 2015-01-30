//Tony Lonero
//January 30, 2015
//CSE2
//Lab 02
//Cyclometer Java Program
//
//Record two types of data. The time elapsed in seconds and the number of rotations of the front wheel during that time.
//Given time and raotation count for two trips the program will
//print the number of minutes, the the number of counts, the distance of each trip, and the combined distance
//
//  define a class
public class  Cyclometer {
    //main method required for every Java program
    public static void main(String[] args) {
        //our input data.
        int secsTrip1=480;  //number of seconds in trip 1
        int secsTrip2=3220; //number of seconds in trip 2
        int countsTrip1=1561;   //number of rotations in trip 1
        int countsTrip2=9037;   //number of rotations in trip 2
        //our intermediate variables and output data
        double WheelDiameter=27.0,  //the diamater of the wheel
        PI=3.14159,     //The numerical value of pi
        feetPerMile=5280,   //Number of feet in a mile
        inchesPerFoot=12,   //Number of inches in a foot
        secondsPerMinute=60;    //Number of seconds in a minute
        double distanceTrip1, distanceTrip2, totalDistance; //define these 3 variables
        //print out the numbers that are stored in the variables
        System.out.println("Trip 1 took "+
            (secsTrip1/secondsPerMinute) +" minutes and had "+
            countsTrip1+" counts. ");    //print out how long trip 1 took and how many counts it had
        System.out.println("Trip 2 took "+
        (secsTrip2/secondsPerMinute) +" minutes and had "+
        countsTrip2+" counts.");        //print out how long trip 2 took and how many counts it had 
    //run the calculations; store the values
        distanceTrip1=countsTrip1*WheelDiameter*PI;
        //above gives distance in inches
        //(for each count, a rotation of the wheel travels
        //the diameter in inches times PI)
        distanceTrip1/=inchesPerFoot*feetPerMile;   //Gives distance in miles
        distanceTrip2=countsTrip2*WheelDiameter*PI/inchesPerFoot/feetPerMile;   //gives distance in miles
        totalDistance=distanceTrip1+distanceTrip2;  //initialize total distance variable
        //print out the output data.
    System.out.println("Trip 1 was "+distanceTrip1+" miles");
    System.out.println("Trip 2 was "+distanceTrip2+" miles");
    System.out.println("The total distance was "+totalDistance+" miles");
        
    }   //end of main 
}   //end of class
    
