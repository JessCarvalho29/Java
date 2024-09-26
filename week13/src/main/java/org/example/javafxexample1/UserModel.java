package org.example.javafxexample1;

public class UserModel {

    private String name;
    private String contact;
    private String country;
    private String gender;

    public UserModel(String name, String contact, String country, String genterText) {
        this.name = name;
        this.contact = contact;
        this.country = country;
        this.gender = genterText;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
