package com.company;

import java.util.Scanner;

public class Account {

    private static Scanner scan=new Scanner(System.in);

    private int customerNum;
    private int pinNumber;
    private double CABalance=0;
    private double SABalance=0;

    public int getCustomerNum() {
        return customerNum;
    }

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
                ATM_Menu acc=new ATM_Menu();
                acc.getLogIn();
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


    public void setCustomerNum(int customerNum) {
        this.customerNum = customerNum;
    }

    public int getPinNumber() {
        return pinNumber;
    }

    public void setPinNumber(int pinNumber) {
        this.pinNumber = pinNumber;
    }

    public double getCABalance() {
        return CABalance;
    }

    public void setCABalance(double CABalance) {
        this.CABalance = CABalance;
    }

    public double getSABalance() {
        return SABalance;
    }

    public void setSABalance(double SABalance) {
        this.SABalance = SABalance;
    }
}
