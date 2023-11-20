package encapsulation;

public class Account {
    //Instance variables
    //Encapsulation: Hide direct access to your instance variables
    //provide access to them via public methods
    //private is only accessible from within the class it is declared
    private  String firstName;
    private String lastName;
    private String identityNumber;

    //Mutator methods or setter methods to provide values for our instance variable
    //Accessor methods or Getter methods to fetch the value assigned to our instance variable


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getIdentityNumber() {
        return identityNumber;
    }

    public void setIdentityNumber(String identityNumber) {
        this.identityNumber = identityNumber;
    }
}
