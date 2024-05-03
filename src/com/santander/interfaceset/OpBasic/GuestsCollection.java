package com.santander.interfaceset.OpBasic;

import java.util.HashSet;
import java.util.Set;

public class GuestsCollection {

    private final Set<Guest> guestSet = new HashSet<>();

    public GuestsCollection() {}

    public void addGuest(String name, int id) {
        this.guestSet.add(new Guest(name, id));
    }

    public void removeGuestById(int id) throws RuntimeException {
        if(this.guestSet.isEmpty()) throw new RuntimeException("Guests list empty.");
        for(Guest g: this.guestSet) {
            if(g.getInviteCode() == id) this.guestSet.remove(g);
            break;
        }
    }

    public int countGuests() {
        return this.guestSet.size();
    }

    public void showAll() throws RuntimeException {
        if(this.guestSet.isEmpty()) throw new RuntimeException("Guests list empty.");
        for(Guest g: this.guestSet) System.out.println(g);
    }
}

