/***********************************************************************************************************************
 * @file   PredictGPA.java
 * @brief  This program helps people to predict their GPA based on courses taken and grades received
 * @author Heba Beshai
 * @date   February 6, 2016
 **********************************************************************************************************************/
import java.util.Scanner;
public class PredictGPA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Define Variables to be Used in this program
        int courses, number;
        double  sum;
        int counter = 1;
        int hours;
        double point;
        int totalhours;
        totalhours = 0;
        sum = 0; point = 0; hours = 0;

        String grade;

        // Ask the user to enter the data needed by the program
        System.out.println("How many courses are you taking?");
        courses = input.nextInt();

        // Do the needed calculations, use 1 or more variables to store your results
        while (counter <= courses) {
            System.out.println("Enter the number of hours for course " + counter + ":");
            hours = input.nextInt();
            System.out.println();

            System.out.println("What is your grade for course " + counter + ":");
            grade = input.next();
            if (grade.equals("A")) {
                point = 4;
            }
            if (grade.equals("A-")) {
                point = 3.7;
            }
            if (grade.equals("B+")) {
                point = 3.3;
            }
            if (grade.equals("B")) {
                point = 3;
            }
            if (grade.equals("B-")) {
                point = 2.7;
            }
            if (grade.equals("C+")) {
                point = 2.3;
            }
            if (grade.equals("C")) {
                point = 2;
            }
            if (grade.equals("C-")) {
                point = 1.7;
            }
            if (grade.equals("D+")) {
                point = 1.3;
            }
            if (grade.equals("D")) {
                point = 1;
            }
            if (grade.equals("D-")) {
                point = 0.7;
            }
            if (grade.equals("F")) {
               point = 0;
            }

            sum = (sum + (point * hours));
            totalhours = totalhours + hours;



            // Print the results to the screen
            counter++;

        }
        System.out.printf("Your gpa is %.2f", sum/totalhours);


    }
}