// ******************************************************
// Programer: Erica Weems
// Course: CSC110AB
// Assignment: Module 2, TempConverter.java
// Date: 01/30/18
// Description: TempConverter.java is a program that prompts 
// a user to input a number in Fahrenheit as a whole number.
// The program then outputs this number converted to its
// value in Celsius, to at least one decimal point.
// Input: Prompts user to input int number of Fahrenheit.
// Output: Input converted to Celsius to at least one decimal.
// ******************************************************
import java.util.Scanner;

public class TempConverter
{
   public static void main(String[] args)
   {
      float degreesF;
      float degreesC;
      
      // Prompt user for int input, assigns input to degreesF
      Scanner keyboard = new Scanner(System.in);
      System.out.println("Enter a Fahrenheit temperature: ");
      degreesF = keyboard.nextFloat();
      
      // converts degreesF to Celsius and assigns to degreesC 
      degreesC = 5 * (degreesF - 32)/9;
      
      // outputs Fahrenheit in whole integer and the converted Celsius float
      System.out.println((int)degreesF + " Fahrenheit is " + 
                         degreesC + " degrees Celsius.");
   }
}