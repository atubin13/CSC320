import java.util.Scanner; //Import Scanner Class

public class CSC320Mod2CTMPG {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in); //Create the Scanner object

        //Inputs
        System.out.println("Please enter your vehicle's brand: ");
        String brand = userInput.nextLine();
        System.out.println("Please enter your vehicle's model ");
        String model = userInput.nextLine();
        System.out.println("Please enter your vehicle's starting odometer reading: ");
        Integer startOdometer = Integer.valueOf(userInput.nextLine());
        System.out.println("Please enter your vehicle's ending odometer reading: ");
        Integer endOdometer = Integer.valueOf(userInput.nextLine());
        System.out.println("Please enter your vehicle's fuel consumption in gallons: ");
        Integer gasUsed = Integer.valueOf(userInput.nextLine());

        //MPG math
        int MPG = (endOdometer - startOdometer) / gasUsed;

        //Outputs
        System.out.println("Your vehicle's brand is: " + brand);
        System.out.println("Your vehicle's model is: " + model);
        System.out.println("Your vehicle's starting odometer reading was: " + startOdometer);
        System.out.println("Your vehicle's ending odometer reading was: " + endOdometer);
        System.out.println("Your vehicle used " + gasUsed + " gallons of gas.");
        System.out.println("Your MPG was: " + MPG);
    }
}
