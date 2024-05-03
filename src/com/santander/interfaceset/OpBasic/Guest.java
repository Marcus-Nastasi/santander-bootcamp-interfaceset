package com.santander.interfaceset.OpBasic;

public class Guest {

    private String name;
    private String inviteCode;

    public Guest(String name, String inviteCode) {
        this.name = name;
        this.inviteCode = inviteCode;
    }

    public String getName() {
        return name;
    }

    public String getInviteCode() {
        return inviteCode;
    }

    @Override
    public String toString() {
        return(
            "Guest{" + "name='" + name + '\'' +
            ", inviteCode='" + inviteCode + '\'' + '}'
        );
    }
}

