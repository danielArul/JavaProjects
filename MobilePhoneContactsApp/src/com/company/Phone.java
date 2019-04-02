package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Phone {
    private static Scanner scanner=new Scanner(System.in);

    private String deviceName;
    private ArrayList<Contact> deviceContacts;

    public Phone(String deviceName) {
        this.deviceName = deviceName;
        this.deviceContacts = new ArrayList<Contact>();
    }

    public boolean findContact(String contactName){
        for(Contact contact: deviceContacts){
            if(contact.getName().equals(contactName)){
                return true;
            }
        }
        return false;
    }

    public void addNewContact(){
        System.out.println("Enter Contact name");
        String contactName=scanner.nextLine();
        System.out.println("Enter Phone number");
        int contactNumber=scanner.nextInt();
        scanner.nextLine();

        Contact newContact= Contact.createContact(contactName,contactNumber);
        if(findContact(newContact.getName())){
            System.out.println("Contact already exists.");
        }
        else {
            deviceContacts.add(newContact);
            System.out.println("Contact added to device.");
        }
    }

}
