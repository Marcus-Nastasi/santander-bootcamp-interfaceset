package com.santander.interfaceset;

import com.santander.interfaceset.OpBasic.GuestsCollection;

public class Main {
    public static void main(String[] args) {
        try {
            GuestsCollection guestsCollection = new GuestsCollection();
            guestsCollection.addGuest("Logan", 1123);
            guestsCollection.addGuest("Xandy", 4468);
            guestsCollection.addGuest("Melina", 9000);
            guestsCollection.addGuest("Ally", 4466);

            System.out.println(guestsCollection.countGuests());
            guestsCollection.showAll();
            System.out.println("\n--- removed logan ---");
            guestsCollection.removeGuestById(1123);
            guestsCollection.countGuests();
            guestsCollection.showAll();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}

