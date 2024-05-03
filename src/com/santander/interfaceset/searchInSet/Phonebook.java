package com.santander.interfaceset.searchInSet;

import java.util.HashSet;
import java.util.Set;

public class Phonebook {

    private final Set<Contact> contactSet = new HashSet<>();

    public Phonebook() {}

    public void addContact(String name, int tel) {
        this.contactSet.add(new Contact(name, tel));
    }

    public void showAll() throws RuntimeException {
        if(this.contactSet.isEmpty()) throw new RuntimeException("Phonebook is empty.");
        for(Contact c: this.contactSet) System.out.println(c);
    }

    public Set<Contact> searchByName(String name) throws RuntimeException {
        if(this.contactSet.isEmpty()) throw new RuntimeException("Phonebook is empty.");
        Set<Contact> contactsByName = new HashSet<>();
        for(Contact c: this.contactSet) if(c.getName().startsWith(name)) contactsByName.add(c);
        return contactsByName;
    }

    public void updateNumber(String name, int newNumber) {
        if(this.contactSet.isEmpty()) throw new RuntimeException("Phonebook is empty.");
        for(Contact c: this.contactSet) if(c.getName().equalsIgnoreCase(name)) c.setTel(newNumber);
    }
}

