package com.example.contactproject;

public class Contact {
    private String name, number;
    public Contact(String name , String number){
        this.name = name ;
        this.number = number;
    }
    public String getName() {
        return name;
    }
    public String getNumber() {
        return number;
    }
}
