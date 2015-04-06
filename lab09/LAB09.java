//Tony Lonero
//March 27, 2015
//CSE2
//Lab 09
//Methods Java Program
//
//This program will generate random 10 word sentences.
//The words will be chosen from different methods.
//Each method will randomly choose a word of a particular part of speech.
//
import java.util.Scanner;
import java.util.Random;
//
    public class LAB09 {
        public static String adjective() {
            Random randomGenerator = new Random();      //create object
            int randomInt = randomGenerator.nextInt(10);    //generate random int between 0 and 10
            String word1 = "";      //initialize string
            switch (randomInt) {
                case 0:
                    word1 += "fat ";     //add this word to the existing string
                    break;
                case 1:
                    word1 += "lazy ";    //add this word to the existing string
                    break;
                case 2:
                    word1 += "ignorant ";     //add this word to the existing string
                    break;
                case 3:
                    word1 += "obese ";    //add this word to the existing string
                    break;
                case 4:
                    word1 += "old ";     //add this word to the existing string
                    break;
                case 5:
                    word1 += "angry ";    //add this word to the existing string
                    break;
                case 6:
                    word1 += "plump ";     //add this word to the existing string
                    break;
                case 7:
                    word1 += "elephantine ";    //add this word to the existing string
                    break;
                case 8:
                    word1 += "burly ";     //add this word to the existing string
                    break;
                case 9:
                    word1 += "chunky ";    //add this word to the existing string
                    break;
            }
            return word1;       //return the word chosen
        }
        
        public static String subject() {
            Random randomGenerator = new Random();      //create object
            int randomInt = randomGenerator.nextInt(10);    //generate random int between 0 and 10
            String word2 = "";      //initialize string
            switch (randomInt) {
                case 0:
                    word2 += "cat ";     //add this word to the existing string
                    break;
                case 1:
                    word2 += "dog ";    //add this word to the existing string
                    break;
                case 2:
                    word2 += "mouse ";     //add this word to the existing string
                    break;
                case 3:
                    word2 += "rat ";    //add this word to the existing string
                    break;
                case 4:
                    word2 += "rabbit ";     //add this word to the existing string
                    break;
                case 5:
                    word2 += "spider ";    //add this word to the existing string
                    break;
                case 6:
                    word2 += "fox ";     //add this word to the existing string
                    break;
                case 7:
                    word2 += "moose ";    //add this word to the existing string
                    break;
                case 8:
                    word2 += "lizard ";     //add this word to the existing string
                    break;
                case 9:
                    word2 += "chimp ";    //add this word to the existing string
                    break;
            }
            return word2;       //return the word chosen
        }
        
        public static String verb() {
            Random randomGenerator = new Random();      //create object
            int randomInt = randomGenerator.nextInt(10);    //generate random int between 0 and 10
            String word3 = "";      //initialize string
            switch (randomInt) {
                case 0:
                    word3 += "hopped ";     //add this word to the existing string
                    break;
                case 1:
                    word3 += "jumped ";    //add this word to the existing string
                    break;
                case 2:
                    word3 += "kicked ";     //add this word to the existing string
                    break;
                case 3:
                    word3 += "pushed ";    //add this word to the existing string
                    break;
                case 4:
                    word3 += "threw ";     //add this word to the existing string
                    break;
                case 5:
                    word3 += "destroyed ";    //add this word to the existing string
                    break;
                case 6:
                    word3 += "ruined ";     //add this word to the existing string
                    break;
                case 7:
                    word3 += "obliterated ";    //add this word to the existing string
                    break;
                case 8:
                    word3 += "demolished ";     //add this word to the existing string
                    break;
                case 9:
                    word3 += "scared ";    //add this word to the existing string
                    break;
            }
            return word3;       //return the word chosen
        }
        
        public static String object() {
            Random randomGenerator = new Random();      //create object
            int randomInt = randomGenerator.nextInt(10);    //generate random int between 0 and 10
            String word4 = "";      //initialize string
            switch (randomInt) {
                case 0:
                    word4 += "boy.";     //add this word to the existing string
                    break;
                case 1:
                    word4 += "girl.";    //add this word to the existing string
                    break;
                case 2:
                    word4 += "lad.";     //add this word to the existing string
                    break;
                case 3:
                    word4 += "lassie.";    //add this word to the existing string
                    break;
                case 4:
                    word4 += "cowboy.";     //add this word to the existing string
                    break;
                case 5:
                    word4 += "mother.";    //add this word to the existing string
                    break;
                case 6:
                    word4 += "father.";     //add this word to the existing string
                    break;
                case 7:
                    word4 += "teacher.";    //add this word to the existing string
                    break;
                case 8:
                    word4 += "neighbor.";     //add this word to the existing string
                    break;
                case 9:
                    word4 += "puppy.";    //add this word to the existing string
                    break;
            }
            return word4;       //return the word chosen
        }
        
        public static void main (String [] args) {
            Scanner myScanner;      //define the scanner
            myScanner = new Scanner (System.in);    //call the scanner
            while (true) {
            String output = "The ";   //initialize string
            output += adjective();      //add to string
            output += adjective();      //add to string
            output += subject();        //add to string
            output += verb();           //add to string
            output += "the ";           //add to string
            output += adjective();      //add to string
            output += object();         //add to string
            System.out.println(output);     //print out the final sentence
            System.out.print("Enter 0 to quit, or 1 to go again: ");        //prompt user for input
            int input = myScanner.nextInt();        //assign input to a variable
            if (input == 0) {
                break;      //exit while loop and end program
            }
            else if (input == 1) {
                System.out.println("Let's go again!");      //print out this sentence
            }
            else {
                break;      //exit while loop and end program
            }
            }
        }
    }   //end of class