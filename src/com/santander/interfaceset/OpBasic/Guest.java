package com.santander.interfaceset.OpBasic;

import java.util.Objects;

public class Guest {

    private final String name;
    private final int inviteCode;

    public Guest(String name, int inviteCode) {
        this.name = name;
        this.inviteCode = inviteCode;
    }

    @Override
    public String toString() {
        return(
            "Guest{" + "name='" + name + '\'' +
            ", inviteCode='" + inviteCode + '\'' + '}'
        );
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Guest guest = (Guest) o;
        return inviteCode == guest.inviteCode;
    }

    @Override
    public int hashCode() {
        return Objects.hash(inviteCode);
    }

    public String getName() {
        return name;
    }

    public int getInviteCode() {
        return inviteCode;
    }
}

