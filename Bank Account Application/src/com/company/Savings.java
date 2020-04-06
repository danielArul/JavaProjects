package com.company;

public class Savings extends Account{

    int safetyDepositBoxID;
    int safetyDepositBoxKey;


    public Savings(String name, String SSN, double initDeposit){
        super(name,SSN,initDeposit);
        super.accountNumber= 1+ accountNumber;
        setSafetyDepositBox();
    }

    @Override
    public void setRate() {
        rate = getBaseRate()- 0.25;
    }

    private void setSafetyDepositBox(){
        safetyDepositBoxID = (int) (Math.random()* 1000);

        safetyDepositBoxKey = (int) (Math.random() * 10000);
    }

    @Override
    public void showInfo() {
        System.out.println("Account type: Savings Account");
        super.showInfo();
        System.out.println("Your savings account features"
        +"\nSafety Deposit Box ID "+safetyDepositBoxID
        +"\nSafety Deposit Box Key: "+safetyDepositBoxKey);

    }
}
