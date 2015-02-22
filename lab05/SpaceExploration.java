//Tony Lonero
//February 20, 2015
//CSE2
//Lab 05
//Space Exploration Java Program
//
//This program will pick a random year between 2000 and 2010.
//After the year is chosen, the program will print out a significant
//event that happened in the field of space exploration from 2000
//until that year.
//
//Define a class
public class SpaceExploration {
    //Add main method
    public static void main(String[] args) {
        int year = (int) (Math.random()*11) + 2000;          //generate a random year between 2000 and 2010
        System.out.println("Here is a timeline of space exploration events from " +year+ " to 2000.");        //print out this introductary message
        //print statements with what happened in each year
        switch (year) {
            case 2010: System.out.println("2010: SpaceX successfully sends spacecraft to orbit and back.");
            case 2009: System.out.println("2009: N/A");
            case 2008: System.out.println("2008: Kepler launched to study deep space.");
            case 2007: System.out.println("2007: N/A");
            case 2006: System.out.println("2006: Spacecraft returns with collections from a comet.");
            case 2005: System.out.println("2005: Spacecraft collides with comet");
            case 2004: System.out.println("2004: N/A");
            case 2003: System.out.println("2003: Largest infrared telescope released");
            case 2002: System.out.println("2002: N/A");
            case 2001: System.out.println("2001: First spacecraft lands on asteroid.");
            case 2000: System.out.println("2000: First spacecraft orbits an asteroid.");
            break;
        }
        }   //end of main method
    }   //end of class