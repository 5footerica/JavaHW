// ******************************************************
// Programer: Erica Weems
// Course: CSC110AB
// Assignment: Module 2, ChangeMaker.java
// Date: 01/31/18
// Description: ChangeMaker.java is a program that prompts 
// a user to input int price of an item in increments of 5 cents.
// Cost is between 25 cents and 1 dollar.
// The program then outputs int change due to customer in coins
// nickels, dimes, and quarters.
// Input: Prompts user to price of item.
// Output: Input converted to change due in coins.
// ******************************************************
import java.util.Scanner;

public class ChangeMaker
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
	  System.out.print("Enter price of item (25..100, in 5-cent increments): ");
	  int cents = scan.nextInt();	
	  
	  // initialize values of coins
	  int quarters = 25;
	  int dimes = 10;
	  int nickels = 5;
	  
	  // prints before var cents value is changed
	  System.out.println("You bought an item for " + cents + " cents and gave ");
	  System.out.println("me a dollar, so your change is: ");
	
	  // cents is divided by coin value, largest first, then % is used 
	  // to find remainder of cents after coin value is taken out before
	  // changing cents to this value which is then checked by the next coin value
      int allQuarters = cents / quarters;
	  cents %= quarters;
	  int allDimes = cents / dimes;
	  cents %= dimes;
	  int allNickels = cents / nickels;
	  cents %= nickels;
	
	  System.out.println(allQuarters + " quarters, ");
	  System.out.println(allDimes + " dimes, and ");
	  System.out.println(allNickels + " nickels");
   }
}