package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ATM_Menu extends Account {

    int x=0;
    Scanner scan= new Scanner(System.in);

    HashMap<Integer,Integer> CNPN=new HashMap<Integer, Integer>();

    public void getLogIn(){
        CNPN.put(123,123);
        CNPN.put(7429422,3456);

        System.out.println("Welcome Dear Customer");
        System.out.println("Enter your customer number Please");
        int CN=scan.nextInt();

        System.out.println("Enter your Pin number please");
        int PN= scan.nextInt();

        for(Map.Entry<Integer,Integer> data:CNPN.entrySet()){
            if(data.getKey()==CN && data.getKey()==PN){
                System.out.println("right");
                getAccountType();

            }

        }
        if(x==0) {
            System.out.println("Wrong number");
        }

    }

    public void getAccountType(){
        System.out.println("Select the account you want to Access");
        System.out.println("Type 1 to go to your Checkings account");
        System.out.println("Type 2 to go to your Savings account");
        System.out.println("Type 3 to quit.");

        int selection = scan.nextInt();

        switch (selection){
            case 1:
                getChecking();
                break;
            case 2:
                //getSaving();
                break;
            case 3:
                System.out.println("Thanks! bye.");
                break;
            default:
                System.out.println("Invalid choice");
                getAccountType();
        }
    }
}


