package com.company;

public class Contact {

    private String Fullname;
    private int Number;

    public Contact(String fullname, int number) {
        Fullname = fullname;
        Number = number;
    }

    public static void say(){
        System.out.println("hi");
    }

    public String getFullname() {
        return Fullname;
    }

    public void setFullname(String fullname) {
        Fullname = fullname;
    }

    public int getNumber() {
        return Number;
    }

    public void setNumber(int number) {
        Number = number;
    }

    public static Contact createContact(String fullname, int Number){
        return new Contact(fullname,Number);
    }
}
