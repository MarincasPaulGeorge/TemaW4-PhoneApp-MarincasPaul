package phoneapp;

import java.util.ArrayList;
import java.util.List;

public class Contacts {
//    private List<Contacts> contacts;

    private String idContact;
    private String phoneNumber;
    private String firstName;
    private String lastName;

    public Contacts( String idContact, String phoneNumber, String firstName, String lastName) {
//        this.contacts = contacts;
        this.idContact = idContact;
        this.phoneNumber = phoneNumber;
        this.firstName = firstName;
        this.lastName = lastName;
    }




    public String getIdContact() {
        return idContact;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }


    @Override
    public String toString() {
        return "ID Contact: " + idContact + " Nume: " + firstName + " " + lastName + ", Phone Number: " + phoneNumber;
    }
}
