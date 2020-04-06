package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here


        Account richard=new Checking("Richard", "23413213", 40000);
        Account tom=new Checking("Tom", "23490154", 342434);
        Account jerry=new Checking("Jerry", "748291", 42300);

        Account Paul=new Savings("Paul", "23413213", 40000);
        Account Daniel=new Savings("Daniel", "23490154", 342434);
        Account Cindy=new Savings("Cindy", "748291", 42300);

        tom.showInfo();
        Cindy.showInfo();

        tom.deposit(5000);
        tom.withdraw(400);
        tom.transfer("Brokerage",3000);

    }
}
