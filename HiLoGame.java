// ******************************************************
// Programer: Erica Weems
// Course: CSC110AB
// Assignment: Module 4, HiLoGame.java
// Date: 03/06/18
// Description: HiLoGame.java is a program that selects 
// a random number that user must guess. A new number is selected
// for each new game using Random Class.
// For each guess, the program will respond if input was higer/lower
// than the chosen number and the range. If player chooses outside of
// range, they'l receive an error message. If in range, the range will
// become narrower and guess count increases.
// Once correctly guess, outputs message and number of guesses.
// ******************************************************
import java.util.Random;
import java.util.Scanner;
import java.io.IOException;

public class HiLoGame
{
	// create class and throw clause
    public static void main(String[] args) throws IOException
    {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        // Initiate beginning range, guess, tries, and set range for Random class
        int minNum = 1;
        int maxNum = 100;
        int ranNum = random.nextInt(maxNum - minNum + 1) + minNum;
        int guess = 0;
        int nonGuess = 0;
        int tries = 1;      
 		// Let player know that the # is between 1 and 100
        System.out.println("Welcome to HiLo! In this game, " +
        					"you must guess a randomly chosen number. "+
        					"The number is between " + minNum + 
        					" and "+ maxNum + ", good luck!");
        					
 		// begin do while loop
        do
        {
        	// each iteration increments tries, minNum/maxNum also update
            System.out.print("Guess " + tries + ": Enter a number between "
            					+ minNum + " and " + maxNum + " ");
            guess = scan.nextInt();
            // if/else for if number is out of range
            if (guess > maxNum)
            {
                System.out.println("Out of range, too high!");
                nonGuess++;
            }
            else if (guess < minNum)
            {
                System.out.println("Out of range, too low!");   
                nonGuess++;
            }
            else {
            	// Let's player know if too high, updates maxNum/range to guess in
            	tries++;
            	if (guess > ranNum)
				{
                	maxNum = guess;
                	System.out.println(guess + " is too high");
            	}
            	// Let's player know if too low, updates minNum/range to guess in
     	       else if (guess < ranNum)
     	       {
        	        minNum = guess;
            	    System.out.println(guess + " is too low");
            	}
            	else
            	{
                	System.out.println(guess + " is correct");
            	}
            }
			// condition to end loop
        } while (guess != ranNum);
        
		// Tells player how many tries it took them to guess, -1 to make accurate
        System.out.println("it took you " + (tries - 1) + 
        					" valid guesses to find the number");
        System.out.println("You had " + nonGuess + " out of range guess");
    }
}