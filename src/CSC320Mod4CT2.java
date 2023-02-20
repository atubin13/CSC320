import java.util.Scanner;

public class CSC320Mod4CT2 {
    public static void main(String[] args) {
        //initialize variable a for do loop
        String a;

        //Create the Scanner object
        Scanner userInput = new Scanner(System.in);

        //do-while loop to end program
        do {
            //initialize math variables
            int count;
            float average;
            float sum = 0;
            float max = Integer.MIN_VALUE;
            float min = Integer.MAX_VALUE;

            //Input from user to set count as number of grades
            System.out.println("Enter the number of grades you wish to calculate: ");
            count = Integer.parseInt(userInput.nextLine());

            for (int i = 0; i < count; i++) {
                System.out.println("Enter grade no. " + (i + 1) + ": ");
                float grade = Float.parseFloat(userInput.nextLine());
                sum += grade;
                if (grade < min) {
                    min = grade;
                }
                if (grade > max) {
                    max = grade;
                }
            }

            //Math for average must be outside the for loop to calculate properly
            //I found this out the hard way
            average = sum / count;

            //outputs average, max, and min
            System.out.println("The average grade is " + average + "%");
            System.out.println("The highest grade is " + max + "%");
            System.out.println("The lowest grade is " + min + "%");

            //Operator to Continue or Quit
            System.out.println("Would you like to enter another set of grades? (Y/N) ");
            a = userInput.nextLine();
        } while (a.equalsIgnoreCase("y"));
        System.out.println("Thank you, goodbye!");
    }
}
