import java.util.ArrayList;
import java.util.Scanner;

class ContactList {

    public static <PersonalContact> void main(String[] args) {

        ArrayList<PersonalContact> personalList = new ArrayList<PersonalContact>();

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter ContactId : ");
        String contactId = input.nextLine();
        System.out.println("Please enter First Name : ");
        String firstName = input.nextLine();
        System.out.println("Please enter Last Name : ");
        String lastName = input.nextLine();
        System.out.println("Please enter Address : ");
        String address = input.nextLine();
        System.out.println("Please enter Phone Number : ");
        String phoneNumber = input.nextLine();
        System.out.println("Please enter Email Address : ");
        String emailAddress = input.nextLine();
        System.out.println("Please enter Birthday: ");
        String dateofBirth = input.nextLine();

    }

}