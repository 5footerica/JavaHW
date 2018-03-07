// ******************************************************
// Programer: Erica Weems
// Course: CSC110AB
// Assignment: Module 4, HiLoGame.java
// Date: 03/06/18
// Description: HDiamondPrinter.java is a program that draws 
// a a diamond with a length and character input by the user.
// The input length must be positive and odd #, enforced by loop.
// Also gives user option to draw more diamonds.
// ******************************************************
import java.io.IOException;
import java.util.Scanner;
public class DiamondPrinter
{
	public static void main(String args[]) throws IOException
	{
		// set condition for do loop to execute/terminate
		char play = 'y';
		// Great user
		System.out.println("Welcome to the Diamond printing program!");
		do
		{
			int userInput = 1; 
			int space = 1;
			String h;
			String input;
			
			System.out.print("With what character do you want to draw: ");
			Scanner t = new Scanner(System.in);
			h = t.nextLine();
			space = userInput - 1;
			
			// Ask user to input # of rows, if/else for number needing to be
			// odd and greater than 0
			System.out.println("What will be the length of the middle line:");
			Scanner s = new Scanner(System.in);
			userInput = s.nextInt();
			System.out.println("Your Diamond: ");
			// if user input is greater than 0 && odd, begin for loops
			if (userInput > 0 && ((userInput % 2 ) == 1))
			{

				// begin printing first part of diamond based on user input
				for (int i = 1; i < userInput; i += 2)
				{
					for (int j = 0; j < userInput - 1 - i / 2; j++)
					{
						System.out.print(" ");
					}
					for (int j = 0; j < i; j++)
					{
						System.out.print(h);
					}
					System.out.println("");
				}
				// now print second part of diamon
				for (int i = userInput; i > 0; i -= 2)
				{
					for (int j = 0; j < userInput -1 - i / 2; j++)
					{
						System.out.print(" ");
					}
					for (int j = 0; j < i; j++)
					{
						System.out.print(h);
					}
					System.out.print("\n");
				}
				}
			// for when userInput is not odd or positive
			else 
			{
				System.out.println("INVALID INPUT: Integer must be odd and positive");        
			}
			// Ask player if they want to create another diamond
			System.out.println("\n"+"Do you want to display another diamond? ");
			Scanner n = new Scanner(System.in);
			input = n.nextLine();
			// set play based on answer
			play = input.charAt(0);
		// condition to keep loop going/terminate based on var play
		} while (play == 'y' || play == 'Y');
		System.out.println("Program terminating.");
    }
}