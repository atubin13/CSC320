import java.util.ArrayList;
import java.util.Scanner;

public class CSC320Mod5CT1 {
    public static void main(String[] args) {
        ArrayList<String> weekDays = new ArrayList<>();
        ArrayList<Integer> tempDays = new ArrayList<>();

        tempDays.add(42); //temperatures for the week
        tempDays.add(32);
        tempDays.add(39);
        tempDays.add(47);
        tempDays.add(42);
        tempDays.add(41);
        tempDays.add(37);

        weekDays.add("Sunday"); //days of the week
        weekDays.add("Monday");
        weekDays.add("Tuesday");
        weekDays.add("Wednesday");
        weekDays.add("Thursday");
        weekDays.add("Friday");
        weekDays.add("Saturday");

        Scanner userInput = new Scanner(System.in);
        boolean invalidInput = true;
        while (invalidInput) {
            invalidInput = false;
            System.out.println("Please enter a day of the week, capitalized, or type 'week' for an average of the weekly temperature: ");
            String wkDay = userInput.nextLine();

            int i = weekDays.indexOf(wkDay);
            if (i != -1) {
                System.out.println("The temperature on " + weekDays.get(i) +
                        " was " + tempDays.get(i) + " degrees fahrenheit.");
            } else if (wkDay.equals("week")) {

                float avgTemp = 0;
                for (Integer tempDay : tempDays) {
                    avgTemp += tempDay;
                }
                avgTemp /= tempDays.size();
                System.out.println("The temperature on " + weekDays.get(0) +
                        " was " + tempDays.get(0) + " degrees fahrenheit.");
                System.out.println("The temperature on " + weekDays.get(1) +
                        " was " + tempDays.get(1) + " degrees fahrenheit.");
                System.out.println("The temperature on " + weekDays.get(2) +
                        " was " + tempDays.get(2) + " degrees fahrenheit.");
                System.out.println("The temperature on " + weekDays.get(3) +
                        " was " + tempDays.get(3) + " degrees fahrenheit.");
                System.out.println("The temperature on " + weekDays.get(4) +
                        " was " + tempDays.get(4) + " degrees fahrenheit.");
                System.out.println("The temperature on " + weekDays.get(5) +
                        " was " + tempDays.get(5) + " degrees fahrenheit.");
                System.out.println("The temperature on " + weekDays.get(6) +
                        " was " + tempDays.get(6) + " degrees fahrenheit.");
                System.out.println("The average weekly temperature was " + avgTemp + " degrees fahrenheit.");
            } else {
                invalidInput = true;
                System.out.println("Please re-enter your day. You entered: ");
                System.out.println(wkDay);
                System.out.println("Which is an invalid entry. ");
                System.out.println("Make sure to capitalize the day or enter 'week' for an average of the weekly temperatures.");
            }
        }
    }
}