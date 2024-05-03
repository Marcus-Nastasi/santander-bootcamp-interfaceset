package com.santander.interfaceset.searchInSet;

public class Contact {

    private String name;
    private int tel;

    public Contact(String name, int tel) {
        this.name = name;
        this.tel = tel;
    }

    public String getName() {
        return name;
    }

    public int getTel() {
        return tel;
    }

    @Override
    public String toString() {
        return(
            "Contact{" + "name='" + name + '\'' +
            ", tel=" + tel + '}'
        );
    }
}

