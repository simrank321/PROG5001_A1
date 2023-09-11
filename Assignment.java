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

        //In order to find Highest and Lowest Marks we need to sort the list, hence calling static sort method of this class
        sort(marks);

        //Displaying Lowest and Marks Obtained by Students
        System.out.println("The Lowest marks is : " + marks[0]);
        System.out.println("The Highest marks is : " + marks[marks.length - 1]);

        //Displaying the Standard Deviation by calling the respective method
        System.out.println("The Standard Deviation is : " + calcSD(marks));

    }

    /** Definition of a method to take input from user against the Assignment name and marks of the user 
     *@param double[] marks
     *@return null
     */
    public static void inputData(double[] marks) {

        // Instantiating Scanner Class from the java.util package to receive input from a user at the runtime 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter title of the Assignment");
        // to accept String input from the user, it refers to the Static Global Variable hence definition of variable is not required 
        assignmentName = sc.next();
        System.out.println("Now Please Enter the Marks of the Students");
        for (int index = 0; index < marks.length; index++) {
            // Refering to the respective Student whose  marks is to be entered.
            System.out.println("Enter marks of Student no. :" + (index + 1));
            // Defining a local variable to store the user input to first validate then assign to the actual index
            double number = 0.0;
            // A flag boolean to evaluate whether the input is correct or not
            boolean check = false;
            /** Defining a do-while loop to first input a value from the user, 
            check whether the input is valid, if not then redirecting to the 
            loop unless the desired value is entered */
            do {
                // Assigning the user value to the local variable
                number = sc.nextDouble();
                // calling the checkValidity method with the input value to check if its correct or not, if correct returns true, else returns false
                check = checkValidity(number);
                // repeating the loop until the correct value is entered            
            } while (check != true);
            // once input is validated, assigning it to the respective index
            marks[index] = number;

        }
    }

    /** Definition of a method to check whether the marks being entered is a valid entry or not 
     *@param marks   
     *@return boolean true or false for entry is correct or not
     */
    public static boolean checkValidity(double mark) {
        if (mark < 0 || mark > 30) {
            // Displaying error in the input and a hint for the correct value
            System.out.println("Entry is Invalid: Please Input a valid Number (Marks can be between 0 - 30.0)");
            return false;
        } else {
            return true;
        }
    }

    /** Definition of the method which sorts the given input 
     *@param double[] marks
     *@return null
     */
    public static void sort(double[] marks) {
        System.out.println("sorting the input marks:");
        // Declaring and initializing a temporary variable to store a value and use it to interchange when required
        double temp = 0.0;
        //using nested for loop to compare value and sort the array
        for (int i = 0; i < marks.length; i++) {
            for (int j = i + 1; j < marks.length; j++) {
                if (marks[i] > marks[j]) {
                    temp = marks[i];
                    marks[i] = marks[j];
                    marks[j] = temp;
                }
            }
        }
    }

    /** Definition of the method to calculate mean of the marks 
    @param double[] marks
    @return double mean
    */
    public static double calcMean(double[] marks) {
        System.out.println("Calculating Mean:");
        double sum = 0.0;
        for (int index = 0; index < marks.length; index++) {
            sum = sum + marks[index];
        }
        System.out.println("The mean is : " + sum / marks.length);
        return sum / marks.length;
    }

    /** Method Definition for calculation of Standard Deviation of the Input Data
     *@param double[] marks
     *return double standardDeviation
     */
    public static double calcSD(double[] marks) {
        System.out.println("Calculating Standard Deviation");
        double mean = calcMean(marks);
        // A local variable to store square of the sum of diff between each marks and mean
        double temp = 0.0;
        //Refering to java.lang.Math.pow(a,b) function get square of the diffference
        for (double mark: marks) {
            temp = temp + Math.pow(mark - mean, 2);
        }
        //Refering to java.lang.Math.sqrt() function get square root of the temp value and return the Standard Deviation
        return Math.sqrt(temp / marks.length);
    }

}
