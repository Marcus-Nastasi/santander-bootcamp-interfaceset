package com.santander.interfaceset;

import com.santander.interfaceset.OpBasic.GuestsCollection;
import com.santander.interfaceset.Ordenation.College.StudentsManager;
import com.santander.interfaceset.Ordenation.Store.Product;
import com.santander.interfaceset.Ordenation.Store.ProductStorage;
import com.santander.interfaceset.searchInSet.Contact;
import com.santander.interfaceset.searchInSet.Phonebook;

public class Main {
    public static void main(String[] args) {
        try {
            testGuest();
            testPhonebook();
            testStore();
            testStudent();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    public static void testGuest() {
        GuestsCollection guestsCollection = new GuestsCollection();
        guestsCollection.addGuest("Logan", 1123);
        guestsCollection.addGuest("Xandy", 4468);
        guestsCollection.addGuest("Melina", 9000);
        guestsCollection.addGuest("Ally", 4466);
        guestsCollection.addGuest("Ally", 4466);

        System.out.println("\n--- counting guests... ---\n" + guestsCollection.countGuests());
        System.out.println("\n--- show all guests ---\n");
        guestsCollection.showAll();
        System.out.println("\n--- removed logan ---");
        guestsCollection.removeGuestById(1123);
        System.out.println("\n--- counting guests... ---\n" + guestsCollection.countGuests());
        guestsCollection.countGuests();
        System.out.println("\n--- show all guests ---\n");
        guestsCollection.showAll();
    }

    public static void testPhonebook() {
        Phonebook phonebook = new Phonebook();
        phonebook.addContact("Jasml", 119987554);
        phonebook.addContact("Jasml santos", 119987554);
        phonebook.addContact("Jasml gabriel", 1144689232);
        phonebook.addContact("Jasml nogueira", 113345674);
        phonebook.addContact("Jasml santana", 1199890090);

        System.out.println("\n--- show all phonebook ---");
        phonebook.showAll();

        System.out.println("\n--- search by name phonebook");
        for (Contact c : phonebook.searchByName("Jasml")) System.out.println("\n" + c);

        System.out.println("\n--- show all after Jasml's out phonebook ---");
        phonebook.updateNumber("Jasml santana", 1177426778);
        phonebook.showAll();
    }

    public static void testStore() {
        ProductStorage productStorage = new ProductStorage();
        productStorage.addProduct("a", 1, 6, 99.99);
        productStorage.addProduct("a 2", 6, 6, 99.99);
        productStorage.addProduct("b", 2, 12, 65.99);
        productStorage.addProduct("c", 3, 11, 67.99);
        productStorage.addProduct("d", 4, 32, 8.99);
        productStorage.addProduct("e", 5, 110, 1.99);

        System.out.println("\n--- search by name ---");
        for (Product p : productStorage.searchByName("a")) System.out.println(p);

        System.out.println("\n--- search by range ---");
        for (Product p : productStorage.searchByPriceRange(2.00, 66.50)) System.out.println(p);

        System.out.println("\n--- search all ---");
        for (Product p : productStorage.getAll()) System.out.println(p);
    }

    public static void testStudent() {
        StudentsManager studentsManager = new StudentsManager();
        System.out.println("---- show all students ----");
        //studentsManager.showAll();

        studentsManager.addStudent("Marc 1", 122, 9.7);
        studentsManager.addStudent("Marc 2", 120, 7.7);
        studentsManager.addStudent("Jeff", 123, 2.2);
        studentsManager.addStudent("Enzo", 124, 6.3);
        studentsManager.showAll();
        System.out.println("\n--- search by name ---");
        System.out.println(studentsManager.searchByName("Marc"));
        System.out.println("\n--- search by grade range ---");
        System.out.println(studentsManager.searchByGradeRange(3.0, 10.0));
    }
}


