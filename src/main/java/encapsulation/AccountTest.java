package encapsulation;

import java.util.Scanner;
import java.util.UUID;

public class AccountTest {
        public static void main(String[] args) {
                Account account = new Account();

                account.setFirstName("Abdulganiyu Abubakar");
                account.setLastName("Abubakar");
                account.setIdentityNumber("23hdjjj3ss");

               // System.out.printf("Firstnamae:  %s\nLastname:%s\nIdentityNumber: %s", account.getFirstName(),account.getLastName(),account.getIdentityNumber());

                Account account1 = new Account();
                Scanner sc = new Scanner(System.in);
                System.out.println( "Enter your Firstname");
                String firstname = sc.nextLine();
                account1.setFirstName(firstname);

                System.out.println("Enter your Lastname");
                String lastname = sc.nextLine();
                account1.setLastName(lastname);

                account.setIdentityNumber(UUID.randomUUID().toString());
                System.out.println("Firstname: " + account1.getFirstName());

        }

}
