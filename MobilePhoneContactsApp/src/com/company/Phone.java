package com.company;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;

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


    public int findContactByName(String contactName){
        for (int i = 0; i < deviceContacts.size(); i++) {
            if (deviceContacts.get(i).getName().toUpperCase().equals(contactName.toUpperCase())) {
                return i;
            }
            }
            return -1;
        }

    public int findContactByNumber(int contactNumber){
        for (int i = 0; i < deviceContacts.size(); i++) {
            if (deviceContacts.get(i).getPhoneNumber()==contactNumber) {
                return i;
            }
        }
        return -1;
    }




    public void removeContact() {
        System.out.println("Press 1 remove the contact name");
        System.out.println("Press 2 to remove the contact number");
        int choice = scanner.nextInt();
        scanner.nextLine();

        if (choice == 1) {
            System.out.println("Enter contact name:");
            String CName = scanner.nextLine();

            int index=findContactByName(CName);

            if(index>=0){
                deviceContacts.remove(index);
                System.out.println("Contact Successfuly removed");
            }
            else{
                System.out.println("Contact name not found.");
            }


        }
        else if(choice==2){
            System.out.println("Enter contact number");
            int CNumber=scanner.nextInt();

            int index=findContactByNumber(CNumber);

            if(index>=0){
                deviceContacts.remove(index);
                System.out.println("Contact Successfuly removed");
            }
            else{
                System.out.println("Contact name not found.");
            }

        }
        else {
            System.out.println("Response not valid.");
        }

    }


    public void updateContact(){

    }

    public void printContacts(){
        System.out.println("Contact List");

        System.out.println("The contacts are");
        for(int i=0;i<deviceContacts.size();i++){
            System.out.println(deviceContacts.get(i).getName()+"-->"+deviceContacts.get(i).getPhoneNumber());
        }
    }


}

