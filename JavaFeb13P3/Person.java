// Person.java
// Represents a Person with first name, last name, and an Address

public class Person {
    private String firstName;
    private String lastName;
    private Address address;

    // Constructor
    public Person(String firstName, String lastName, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    // toString method (Fixed to include full address)
    public String toString() {
        return lastName + " " + firstName + ", " + address.toString();
    }
}
