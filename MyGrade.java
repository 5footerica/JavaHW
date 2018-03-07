// ******************************************************
// Programer: Erica Weems
// Course: CSC110AB
// Assignment: Module , myGrade.java
// Date: 02/13/18
// Description: MyGrade.java is a program that prompts 
// a user to input their scores for programming assignments, 
// MPL assignments, and Final Exam sores (all intergers). Program
// will output specific errors depending on why input is invalid.
// After outputting error message, program will terminate.
// If input is valid, program will calculate final grade, rounded
// up to whole % and their letter grade, along with a support message. 
// If Final Exam is less than 60%, user will automatically receive failing grade. 
// ******************************************************
import java.util.Scanner;

public class MyGrade 
{
   public static void main(String[] args)
   {
    System.out.println("MyGrade will help you determine your overall grade! ");
    
    // initialize vars for scoring/calculations
    double progAssign;
    double mplAssign;
    double finalExam;
    double weightProg;
    double weightMPL;
    double weightExam;
    double finalGrade;
    char letterGrade;
   
    // Have user input scores, kick back error if out of range, weight scores
    Scanner keyboard = new Scanner(System.in);
    
    System.out.print("Enter programming assignments average in percent: ");
    progAssign = keyboard.nextDouble();
    if (progAssign < 0 || progAssign >100)
    {
        System.out.println("The percentage entered for Programming Assignments " +
                           "must be between 0 and 100, inclusive. ");
        System.out.println("MyGrade is now terminating.");
    	return;
    } 
    else
    weightProg = progAssign * 40;
    
    System.out.print("Enter MPL assignments average in percent: ");
    mplAssign = keyboard.nextDouble();
    if (mplAssign < 0 || mplAssign >100)
    {
        System.out.print("The percentage entered for MPL Assignments " +
                         "must be between 0 and 100, inclusive. ");
        System.out.println("MyGrade is now terminating.");
    	return;
    }
    else
    weightMPL = mplAssign * 20;
    
    System.out.print("Enter Final Exam average in percent: ");
    finalExam = keyboard.nextDouble();
    if (finalExam < 0 || finalExam >100)
    {
        System.out.print("The percentage entered for Final Exam " +
                         "must be between 0 and 100, inclusive. ");
        System.out.println("MyGrade is now terminating.");
    	return;
    }
    else
    weightExam = finalExam * 60;
    
    // take user input and weight scores to calculate overall grade
    finalGrade = (int)((weightProg + weightMPL + weightExam)/100);

    // print out results to 1 decimal precision, set field width
    System.out.printf("The number of Programming Assignment" +
                       " points earned:%6.1f\n", progAssign);
    System.out.printf("The number of MPL Homework points earned:%16.1f\n", mplAssign);
    System.out.printf("The number of Final Exam points earned:%18.1f\n", finalExam);
    System.out.printf("The total number of points earned:%23.1f\n", finalGrade);
    
    // assigne letterGrade based on overall grade percentage via finalGrade
    // fail no matter what if Final Exam score was less than 60
    if (finalExam < 60)
    {
         letterGrade = 'E';
    }
    else 
    {
        if (finalGrade >= 90)
        {
             letterGrade = 'A';
        }
        else if (finalGrade >= 80)
        {
             letterGrade = 'B';
        }
        else if (finalGrade >= 70)
        {
             letterGrade = 'C';
        }
        else if (finalGrade >= 60)
        {
             letterGrade = 'D';
        }
        else
        {
             letterGrade = 'F';
        }
    }
    
    System.out.println("Student letter grade: " + letterGrade);
    
    // switch statement to determine which support message prints based on letterGrade
    switch (letterGrade)
    {
        case 'A':
            System.out.println("Great job! You will have no problem in CSC205.");
            break;
        case 'B':
            System.out.println("Good job! You should have little trouble in CSC205.");
            break;
        case 'C':
            System.out.println("Ok, you passed, but you may be challenged in CSC205.");
            break;
        case 'D':
            System.out.println("When you retake this course, you will " +
                               "be able to do much better.");
            break;
        case 'F':
            System.out.println("You did not put forth enough effort to" +
                                " pass this course.");
            break;
        case 'E':
            System.out.println("You did not score enough points on the Final " +
                               "Exam to pass this course.");
            break;
    }
    
    System.out.println("MyGrade now terminating. ");
    return;
   
   }
}