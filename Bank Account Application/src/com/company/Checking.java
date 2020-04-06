package com.company;

public class Checking extends Account {
    //List properties specific to the checking account
    int debitCardNumber;
    int debitCardPin;

    public Checking(String name, String SSN, double initDeposit){
        super(name,SSN,initDeposit);
        super.accountNumber="2"+accountNumber;
        setDebitCard();

    }

    @Override
    public void showInfo() {
        System.out.println("Account type: Checking Account"
        +"\nDebit Card Number:"+ debitCardNumber+
                "\nDebit Card Pin"+ debitCardPin);
        super.showInfo();

    }

    @Override
    public void setRate() {
        rate = getBaseRate() * .15;
    }


    private void setDebitCard(){
        debitCardNumber = (int) (Math.random()*(Math.pow(10,12)));
        debitCardPin =(int) (Math.random() * Math.pow(10,4)) ;
        System.out.println("Card:" + this.debitCardNumber);
        System.out.println("Pin:"+this.debitCardPin);
    }

    //Contructor to initialise the checking account properties



}
