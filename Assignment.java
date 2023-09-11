/**
 * A Java Program to take input marks obtained by students and calculate
 * Lowest Marks
 * Highest Marks
 * and Standard Deviation of the marks
 * @author (Simran Kaur)
 * @ID (24297718)
 * @version (v1.0)
 */

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

}
