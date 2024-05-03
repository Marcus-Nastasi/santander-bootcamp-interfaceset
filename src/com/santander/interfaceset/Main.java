package com.santander.interfaceset;

import com.santander.interfaceset.OpBasic.GuestsCollection;
import com.santander.interfaceset.searchInSet.Contact;
import com.santander.interfaceset.searchInSet.Phonebook;

public class Main {
    public static void main(String[] args) {
        try {
        //    GuestsCollection guestsCollection = new GuestsCollection();
        //    guestsCollection.addGuest("Logan", 1123);
        //    guestsCollection.addGuest("Xandy", 4468);
        //    guestsCollection.addGuest("Melina", 9000);
        //    guestsCollection.addGuest("Ally", 4466);
        //    guestsCollection.addGuest("Ally", 4466);

        //    System.out.println(guestsCollection.countGuests());
        //    guestsCollection.showAll();
        //    System.out.println("\n--- removed logan ---");
        //    guestsCollection.removeGuestById(1123);
        //    guestsCollection.countGuests();
        //    guestsCollection.showAll();

            Phonebook phonebook = new Phonebook();
            phonebook.addContact("Jasml", 119987554);
            phonebook.addContact("Jasml santos", 119987554);
            phonebook.addContact("Jasml gabriel", 1144689232);
            phonebook.addContact("Jasml nogueira", 113345674);
            phonebook.addContact("Jasml santana", 1199890090);

            phonebook.showAll();

            for(Contact c: phonebook.searchByName("Jasml")) System.out.println("\n"+c);

            phonebook.updateNumber("Jasml santana", 1177426778);
            phonebook.showAll();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}

