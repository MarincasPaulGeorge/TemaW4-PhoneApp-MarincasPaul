package phoneapp;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Samsung galaxyS6 = new Samsung("GalaxyS6", "Black", "Plastic", 8);
        Samsung galaxyA52 = new Samsung("GalaxyA52", "Blue", "Metal", 7);
        Samsung iphone11 = new Samsung("iPhone11", "Black", "Plastic", 6);
        Samsung iphone15 = new Samsung("iPhone15", "Blue", "Metal", 6);
        Contacts contact1 = new Contacts("1", "0735627387", "Paul", "Marincas");
        Contacts contact2 = new Contacts("2", "0738217387", "Raul", "Andrei");
        Message message1 = new Message("Primul mesaj");
        Message message2 = new Message("Al 2-lea mesaj");


        System.out.println("Model is: " + galaxyS6.getModel() + " Color: " + galaxyS6.getColor() + " Material: " + galaxyS6.getMaterial() +
                " BatteryLife: " + galaxyS6.getBatteryLife());
        System.out.println("Model is: " + galaxyA52.getModel() + " Color: " + galaxyA52.getColor() + " Material: " + galaxyA52.getMaterial() +
                " BatteryLife: " + galaxyA52.getBatteryLife());
        System.out.println("Model is: " + iphone15.getModel() + " Color: " + iphone15.getColor() + " Material: " + iphone15.getMaterial() +
                " BatteryLife: " + iphone15.getBatteryLife());
        System.out.println("Model is: " + iphone11.getModel() + " Color: " + iphone11.getColor() + " Material: " + iphone11.getMaterial() +
                " BatteryLife: " + iphone11.getBatteryLife());




        List<Contacts> contactsList = new ArrayList<>();
        contactsList.add(contact1);
        contactsList.add(contact2);

//        for ( Contacts contact : contactsList){
//            System.out.println("Primul contact: " + contact1 + " Al 2-lea contact: " + contact2);
//
        for (Contacts contact : contactsList) {
            System.out.println("ID Contact: " + contact.getIdContact() +
                    " Phone Number: " + contact.getPhoneNumber() +
                    ", First Name: " + contact.getFirstName() +
                    ", Last Name: " + contact.getLastName());
        }


        List<Message> messageList = new ArrayList<>();
        messageList.add(message1);
        messageList.add(message2);

        for (Message message : messageList){
            System.out.println(message.getGetMessage());
        }



    }


}
