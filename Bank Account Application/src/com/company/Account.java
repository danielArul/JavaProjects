package com.company;

import java.util.Random;

public abstract class Account implements IBaseRate {

    //List common properties for savings and checkings account
    String name;
    String SSN;
    double balance;

    static int index=10000;
    String accountNumber;
    double rate;

    public Account(String name, String SSN, double initDeposit){
        this.name=name;
        this.SSN=SSN;
        this.balance=initDeposit;
        this.accountNumber=setAccountNumber();

        setRate();
    }

    public abstract void setRate();

    private String setAccountNumber(){
        String lastTwoNums= SSN.substring(SSN.length()-2,SSN.length());

        int threeRandomNumbers= (int) (Math.random() * 1000);
        return lastTwoNums + (index++) + threeRandomNumbers;
    }



    public void compound(){
        double accruedInterest = balance * (rate/100);
        System.out.println("accrued Interest: " + accruedInterest);
        balance=balance+accruedInterest;
        printBalance();
    }

    //Constructor to set base prperties and initialise the account
    public void deposit(double amount){
        balance+=amount;
        System.out.println("Depositing $"+amount);
    }

    public void withdraw(double amount){
        balance-=amount;
        System.out.println("Withdrawing $"+amount);
    }

    public void transfer(String toWhere, double amount){
        balance-=amount;
        System.out.println("Transfering $"+ amount + " to " +toWhere);
    }

    public void printBalance(){
        System.out.println("Your balance is now $"+balance);
    }


    //List of common methods
    public void showInfo(){
        System.out.println("Name: "+name
        + "\nAccountNumber: "+accountNumber+
        "\nBalance: "+balance+
                "\nRate: " + rate +"%");
    }
}

