package com.company;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class MobilePhone {

    private static Scanner scan=new Scanner(System.in);

    private int myNum;
    private ArrayList<Contact> contacts;

    public MobilePhone(int myNum) {
        this.myNum = myNum;
        contacts=new ArrayList<Contact>();
    }

    public void addContact(){
        System.out.println("What is the Full name of Contact?");
        String FName=scan.nextLine();
        for(int i=0;i<this.contacts.size();i++){
            Contact c=this.contacts.get(i);
            if(c.getFullname().equals(FName)){
                System.out.println("This name already exists!");
                break;
            }

        }
        System.out.println("Enter the number!");
        int num=scan.nextInt();
        scan.nextLine();
        for(int i=0;i<this.contacts.size();i++){
            Contact c=this.contacts.get(i);
            if(c.getNumber()==(num)){
                System.out.println("This number is assigned to "+c.getFullname());
                break;
            }

        }

        contacts.add(Contact.createContact(FName,num));

    }
}
