//Tony Lonero
//April 7, 2015
//CSE2
//HW 10
//Elimination Java Program
//
//This program will make an array with 10 random numbers.
//Then it will make a new array of length 9, by deleting one position in the original array.
//Next, it will make a new array by deleting elements of a specific value in the original array.
//
import java.util.Scanner;
import java.util.Random;
public class RemoveElements{
  public static void main(String [] arg){
	Scanner scan=new Scanner(System.in);
int num[]=new int[10];
int newArray1[];
int newArray2[];
int index,target;
	String answer="";
	do{
  	System.out.print("Random input 10 ints [0-9]");
  	num = randomInput();
  	String out = "The original array is:";
  	out += listArray(num);
  	System.out.println(out);
 
  	System.out.print("Enter the index ");
  	index = scan.nextInt();
  	newArray1 = delete(num,index);
  	String out1="The output array is ";
  	out1+=listArray(newArray1); //return a string of the form "{2, 3, -9}"  
  	System.out.println(out1);
 
      System.out.print("Enter the target value ");
  	target = scan.nextInt();
  	newArray2 = remove(num,target);
  	String out2="The output array is ";
  	out2+=listArray(newArray2); //return a string of the form "{2, 3, -9}"  
  	System.out.println(out2);
  	 
  	System.out.print("Go again? Enter 'y' or 'Y', anything else to quit-");
  	answer=scan.next();
	}while(answer.equals("Y") || answer.equals("y"));
  }
 
  public static String listArray(int num[]){
	String out="{";
	for(int j=0;j<num.length;j++){
  	if(j>0){
    	out+=", ";
  	}
  	out+=num[j];
	}
	out+="} ";
	return out;
  }
  
  public static int[] randomInput() {
    int [] array = new int [10];      //make an array of size 10
    for (int i = 0; i < 10; i++) {
        Random randomGenerator = new Random();      //create object
        int randomInt = randomGenerator.nextInt(10);    //generate random int between 0 and 10
        array [i] = randomInt;      //assign random numbers to the array
    }
    return array;       //return array
  }
  
  public static int[] delete(int [] list, int pos) {
      int length = (list.length -1);        //initialize length
      int [] array = new int [length];      //set array to length of variable length
      if (pos>length || pos<0) {
          System.out.println("The index is not valid.");        //print this error
          array = list;     //default output is original array
      }
      else {
          for (int i = 0; i<length; i++) {
              if (i >= pos) {
                  array [i] = list [i + 1];     //element i in the new array is the element in the following postion in original array
              }
              else {
                  array [i] = list [i];         //element i in the new array is the same element as in the original array
              }
          }
      }
      return array;     //return the new array
  }
  
  public static int[] remove(int [] list, int target) {
      int [] array = new int [10];      //declare and allocate the array
      array = list;         //copy original array 
      for (int i = 0; i < array.length; i++) {
          if (array [i] == target) {        //find position where element equals the target
              array = delete(array, i);     //use previous method to remove element
              i--;          //due to the new array, we need to recheck the position that was just checked bc the value of it changed
          }
      }
      if (array.length < list.length ) {
          System.out.println("Element " + target+ " has been found.");      //print this line out
      }
      if (array.length == list.length ) {
          System.out.println("Element " + target+ " has not been found.");      //print this line out
      }
      return array;     //return the new array
  }
}   //end of class
