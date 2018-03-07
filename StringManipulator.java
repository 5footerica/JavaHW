// ******************************************************
// Programer: Erica Weems
// Course: CSC110AB
// Assignment: Module 2, StringManipulator.java
// Date: 01/31/18
// Description: StringManipulator.java is a program that prompts 
// a user to input String favorite city.
// The program then outputs information about the string
// or outputs the string after manipulation.
// Input: Prompts user to input favorite city.
// Output: Number of characters in name, name in upper/lowercase
// and the first letter of string.
// ******************************************************
import java.util.Scanner;

public class StringManipulator
{
   public static void main(String[] args)
   {
      String favCity;
      
      // Prompt user for String input, assigns input to favCity
      Scanner keyboard = new Scanner(System.in);
      System.out.println("Enter the name of a city: ");
      favCity = keyboard.nextLine();
      
      // takes user input, out puts length, as upper/lowercase and the 1st letter
      System.out.println("Number of characters: " + favCity.length());
      System.out.println("Using all upper case: " + favCity.toUpperCase());
      System.out.println("Using all lower case:" + favCity.toLowerCase());
      System.out.println("First character is: " + favCity.charAt(0));
   }
}