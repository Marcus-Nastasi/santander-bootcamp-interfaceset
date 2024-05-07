package com.santander.interfaceset.searchInSet;

import java.util.Objects;

public class Contact {

    private final String name;
    private int tel;

    public Contact(String name, int tel) {
        this.name = name;
        this.tel = tel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return Objects.equals(name, contact.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return(
            "Contact{" + "name='" + name + '\'' +
            ", tel=" + tel + '}'
        );
    }

    public String getName() {
        return name;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }
}

