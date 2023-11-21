package encapsulation;

public class AccountTest {
        public static void main(String[] args) {
                Account account = new Account();

                account.setFirstName("Abdulganiyu Abubakar");
                account.setLastName("Abubakar");
                account.setIdentityNumber("23hdjjj3ss");

                System.out.printf("Firstnamae:  %s\nLastname:%s\nIdentityNumber: %s", account.getFirstName(),account.getLastName(),account.getIdentityNumber());

        }

}
