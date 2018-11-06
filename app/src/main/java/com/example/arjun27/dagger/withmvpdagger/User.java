package com.example.arjun27.dagger.withmvpdagger;

public class User {
    public User(String firstName, String lastname) {
        this.firstName = firstName;
        this.lastname = lastname;
    }

    private int id;
    private String firstName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    private String lastname;
}
