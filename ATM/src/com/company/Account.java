package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Account   {

    private static Scanner scan=new Scanner(System.in);

    private int customerNum;
    private int pinNumber;
    private double CABalance=0;
    private double SABalance=0;

    HashMap<Integer,Integer> CNPN=new HashMap<Integer, Integer>();



    public void getLogIn(){

        CNPN.put(123,123);
        CNPN.put(7429422,3456);


        System.out.println("Welcome to our ATM Customer");
        System.out.println("Enter your customer number Please");
        int CN=scan.nextInt();

        System.out.println("Enter your Pin number please");
        int PN= scan.nextInt();

        boolean CorrectCredentials=false;

        for(Map.Entry<Integer,Integer> data:CNPN.entrySet()){
            if(data.getKey()==CN && data.getKey()==PN){
                CorrectCredentials=true;
                getAccountType();

            }
            else{
                System.out.println("Wrong Customer number and Pin number combination.\nPlease try again");
                getLogIn();
            }

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
                getSaving();
                break;
            case 3:
                System.out.println("Thanks! bye.");
                break;
            default:
                System.out.println("Invalid choice");
                getAccountType();
        }
    }


    public int getCustomerNum() {
        return customerNum;
    }


    public void getSaving() {
        System.out.println("Welcome to your Savings account");
        System.out.println("Press 1 to deposit!");
        System.out.println("Press 2 to Withdraw!");
        System.out.println("press 3 to view balance");
        System.out.println("Press 4 to go back to main menu!");

        int selection = scan.nextInt();

        switch (selection) {
            case 1:
                dSavings();
                getSaving();
                break;
            case 2:
                wSavings();
                getSaving();
                break;
            case 3:
                System.out.println("Your current Savings account balance is " + SABalance);
                getSaving();
                break;
            case 4:
                getLogIn();
                break;

        }
    }

    public void dSavings(){
        System.out.println("How much do you want to deposit?");
        double amount=scan.nextInt();
        SABalance+=amount;
        System.out.println("Your current balance is "+SABalance);

    }

    public void wSavings(){
        System.out.println("How much do you want to withdraw?");
        double amount=scan.nextInt();
        SABalance-=amount;
        System.out.println("Your current balance is "+SABalance);

    };


    public void getChecking(){
        System.out.println("Welcome to your checkings account");
        System.out.println("Press 1 to deposit!");
        System.out.println("Press 2 to Withdraw!");
        System.out.println("press 3 to view balance");
        System.out.println("Press 3 to go back!");

        int selection = scan.nextInt();

        switch (selection){
            case 1:
                dCheckings();
                getChecking();
                break;
            case 2:
                wCheckings();
                getChecking();
                break;
            case 3:
                System.out.println("Your current checking account balance is "+CABalance);
                getChecking();
                break;
            case 4:
                getLogIn();
                break;

                default:
                    System.out.println("Please choose a valid option.");
                    dCheckings();
                    break;

        }
    }

    public void dCheckings(){
        System.out.println("How much do you want to deposit?");
        double amount=scan.nextInt();
        CABalance+=amount;
        System.out.println("Your current balance is "+CABalance);

    }

    public void wCheckings(){
        System.out.println("How much do you want to withdraw?");
        double amount=scan.nextInt();
        CABalance-=amount;
        System.out.println("Your current balance is "+CABalance);

    }

}
