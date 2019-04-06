package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static Scanner scan=new Scanner(System.in);

    public static void main(String[] args) {
	// write your code here
        Phone LG=new Phone("LG");
        boolean quit=false;
        System.out.println("Welcome to your contacts app");
        printActions();

        while (!quit){
            System.out.println("Enter action number:");
            int action=scan.nextInt();
            scan.nextLine();

            switch (action){
                case 0:
                    System.out.println("See you next time!");;
                    quit=true;
                    break;
                case 1:
                    LG.addNewContact();
                    break;
                case 2:
                    LG.removeContact();
                    break;
                case 3:
                    //updateContact();
                    break;
                case 4:
                    LG.printContacts();
                    break;
                default:
                    System.out.println("Choose a valid option");
                    break;
            }
        }
    }

    public static void printActions(){
        System.out.println("Press 0 to quit");
        System.out.println("Press 1 to add new contact");
        System.out.println("Press 2 to remove a contact");
        System.out.println("Press 3 to update a contact");
        System.out.println("Press 4 to view all contacts");
        System.out.println("Press 5 to Print all the actions.");
    }
   
}
