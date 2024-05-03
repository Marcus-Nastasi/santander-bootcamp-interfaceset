package com.santander.interfaceset;

import com.santander.interfaceset.Ordenation.Store.Product;
import com.santander.interfaceset.Ordenation.Store.ProductStorage;
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

        //    Phonebook phonebook = new Phonebook();
        //    phonebook.addContact("Jasml", 119987554);
        //    phonebook.addContact("Jasml santos", 119987554);
        //    phonebook.addContact("Jasml gabriel", 1144689232);
        //    phonebook.addContact("Jasml nogueira", 113345674);
        //    phonebook.addContact("Jasml santana", 1199890090);

        //    phonebook.showAll();

        //    for(Contact c: phonebook.searchByName("Jasml")) System.out.println("\n"+c);

        //    phonebook.updateNumber("Jasml santana", 1177426778);
        //    phonebook.showAll();

            ProductStorage productStorage = new ProductStorage();
            productStorage.addProduct("a", 1, 6, 99.99);
            productStorage.addProduct("a 2", 6, 6, 99.99);
            productStorage.addProduct("b", 2, 12, 65.99);
            productStorage.addProduct("c", 3, 11, 67.99);
            productStorage.addProduct("d", 4, 32, 8.99);
            productStorage.addProduct("e", 5, 110, 1.99);

            System.out.println("--- search by name ---");
            for(Product p: productStorage.searchByName("a")) System.out.println(p);

            System.out.println("\n--- search by range ---");
            for(Product p: productStorage.searchByPriceRange(2.00, 66.50)) System.out.println(p);

            System.out.println("\n--- search all ---");
            for(Product p: productStorage.getAll()) System.out.println(p);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}

