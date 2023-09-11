/**
 * A Java Program to take input marks obtained by students and calculate
 * Lowest Marks
 * Highest Marks
 * and Standard Deviation of the marks
 * @author (Simran Kaur)
 * @ID (24297718)
 * @version (v1.0)
 */

import java.util.Scanner;

public class Assignment {

    /* Declaring assignmentName as static global to make it available throughout the class*/
    public static String assignmentName;

    /**Defining main method of the program
     * local variable of type double[]
     */
    public static void main(String[] args) {

        // Creating an array of double data type to store marks of the Students
        double[] marks = new double[30];

        // Calling a static method to input marks of the Student 
        inputData(marks);

        // Displaying the name of the Assignment as well the marks of Student once input is done. 
        System.out.println("The marks of student in Assignment named -- " + assignmentName + " are as follows :");
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }

        // Displaying a Saparation
        System.out.println("--------------------------");

    }

    /** Definition of a method to take input from user against the Assignment name and marks of the user 
     *@param double[] marks
     *@return null
     */
    public static void inputData(double[] marks) {

        // Instantiating Scanner Class from the java.util package to receive input from a user at the runtime 
        Scanner sc = new Scanner(System.in);
        // to accept String input from the user, it refers to the Static Global Variable hence definition of variable is not required 
        assignmentName = sc.next();
        for (int index = 0; index < marks.length; index++) {
            // Refering to the respective Student whose  marks is to be entered.
            System.out.println("Enter marks of Student no. :" + (index + 1));
            // Defining a local variable to store the user input to first validate then assign to the actual index
            double number = 0.0;
            // Assigning the user value to the local variable
            number = sc.nextDouble();
            marks[index] = number;

        }
    }

}
