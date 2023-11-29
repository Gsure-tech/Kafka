package encapsulation;

import com.gsuretech.kafka.kafka.KafkaProducer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;
import java.util.UUID;

public class Encapsulation {

    /**
     * Class, Object, instance variables and constructors
     * A class is where we teach our objects how to behave
     * **/
    public static void main(String[] args) {

        final Logger LOGGER = LoggerFactory.getLogger(KafkaProducer.class);

        Account customer1 = new Account();
        customer1.setFirstName("Alex");
        customer1.setLastName("Benjamin");
        customer1.setIdentityNumber(UUID.randomUUID().toString());
        LOGGER.info("displaying account details for {} " , customer1.getFirstName());

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter Firstname");
        String first = scanner.nextLine();
        System.out.println("Please Enter Surname");
        String surname = scanner.nextLine();
        String nin = UUID.randomUUID().toString();

       // System.out.println("\nFirstname " + customer1.getFirstName()  + "\nSurname " + customer1.getLastName() + "\nIdentity number " + customer1.getIdentityNumber());
        System.out.println("\nFirstname " + first + "\nSurname " + surname + "\nIdentity number " + nin);

    }
}
