import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CSC320Mod3CT1 {
    public static void main(String[] args) {
        String a;

        //Do/While loop to continue or exit the program
        do {

            Scanner userInput = new Scanner(System.in); //Create the Scanner object

            //User Input
            System.out.println("Please enter your weekly income: ");
            int income = Integer.parseInt(userInput.nextLine());

            //If-else structure
            double withholding;
            Locale locale = new Locale.Builder().setLanguage("en").setRegion("US").build();
            NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale);

            if (income < 500) {
                withholding = income * .10;
            } else if (income < 1500) {
                withholding = income * .15;
            } else if (income < 2500) {
                withholding = income * .20;
            } else {
                withholding = income * .30;
            }

            //Output Tax Withholding
            System.out.println("Your withholding is: " + currencyFormatter.format(withholding));

            //Operator to Continue or Quit
            System.out.println("Would you like to enter another income? (Y/N) ");
            a = userInput.nextLine();

        } while (a.equalsIgnoreCase("y"));
        System.out.println("Thank you, goodbye!");
    }

}
