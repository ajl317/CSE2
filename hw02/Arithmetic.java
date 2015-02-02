//Tony Lonero
//February 3, 2015
//CSE2
//HW 02
//Arithmetic Java Program
//
//This program will compute various values of a transaction that occurs at Walmart.
//It will compute, and also print, the total cost and sales tax of each item.
//Also, it will compute and print the total overall cost and the toal overall sales tax.
//Lastly, it will compute and print the total cost of the entire transaction.
//
//  Define a class
public class Arithmetic {
    //Add main method.
    public static void main(String[] args) {
        //input variables
        int nSocks=3;               //Number of pairs of socks
        double sockCost$=2.58;      //Cost per pair of socks
        int nGlasses=6;             //Number of drinking glasses
        double glassCost$=2.29;     //Cost per glass
        int nEnvelopes=1;           //Number of boxes of envelopes
        double envelopeCost$=3.25;  //Cost per box of envelopes
        double taxPercent=0.06;     //Sales tax percentage in PA
        
        //Create variables for the total cost of each specific item.
        double totalSockCost,       //Total cost of socks
        totalGlassCost,             //Total cost of glasses
        totalEnvelopeCost;          //Total cost of envelopes
        totalSockCost=nSocks*sockCost$;             //Gives total cost of socks
        totalGlassCost=nGlasses*glassCost$;         //Gives total cost of glasses
        totalEnvelopeCost=nEnvelopes*envelopeCost$;  //Gives total cost of envelopes
        //Create variables for the total sales tax of each specific item.
        double totalSockTax,    totalGlassTax,  totalEnvelopeTax;       //Total tax for socks, glasses, and envelopes
        totalSockTax=totalSockCost*taxPercent;          //Gives total tax on socks
        totalGlassTax=totalGlassCost*taxPercent;        //Gives total tax on glasses
        totalEnvelopeTax=totalEnvelopeCost*taxPercent;   //Gives total tax on envelopes
        //Round variables to the hundredths place.
        float totalSockTax2= (float) Math.round(totalSockTax*100)/100;
        float totalGlassTax2= (float) Math.round(totalGlassTax*100)/100;
        float totalEnvelopeTax2= (float) Math.round(totalEnvelopeTax*100)/100;
        //Create variables for the total overall cost and overall tax.
        double totalOverallCost,    totalOverallTax;    //define overall cost and overall tax
        totalOverallCost=totalSockCost+totalGlassCost+totalEnvelopeCost;    //Gives total overall cost
        totalOverallTax=totalSockTax2+totalGlassTax2+totalEnvelopeTax2;        //Gives total overall tax
        float totalOverallTax2= (float) Math.round(totalOverallTax*100)/100;    //round to the hundredths place
        //Create variable for total transaction cost
        double totalTransactionCost;                            //define total transaction cost
        totalTransactionCost=totalOverallCost+totalOverallTax;  //Gives final cost
        float totalTransactionCost2= (float) Math.round(totalTransactionCost*100)/100; //round to the hundredths place
        //Print out the wanted values.
        System.out.println("The cost of the socks was $"+totalSockCost);
        System.out.println("The cost of the glasses was $"+totalGlassCost);
        System.out.println("The cost of the envelopes was $"+totalEnvelopeCost);
        System.out.println("The tax on the socks was $"+totalSockTax2);
        System.out.println("The tax on the glasses was $"+totalGlassTax2);
        System.out.println("The tax on the envelopes was $"+totalEnvelopeTax2);
        System.out.println("The total overall cost before tax was $"+totalOverallCost);
        System.out.println("The total sales tax was $"+totalOverallTax2);
        System.out.println("The final cost of the transaction was $"+totalTransactionCost2);
    }   //End of main.
}   //End of class.