package com.Sharad;

import java.util.ArrayList;

public class BankAccount {

    private String name;

    private String Address;

    private int balance;

    private String type;

    private int totalDepositors;

    public int generatedAccountNumber;


    public BankAccount(int generatedAccountNumber,String name,String Address,int balance,String type){
        this.name = name;
        this.Address = Address;
        this.balance = balance;
        this.type = type;
        this.generatedAccountNumber = generatedAccountNumber;
    }

    public BankAccount(){};

    public int getTotalDepositors() {
        return totalDepositors;
    }


    public void setDepositors(int depositors) {
        this.totalDepositors = depositors;
    }

    public String toString(){
        return "BA" + generatedAccountNumber + " " + name + " " + Address + " " + balance + " " + type + "\n";
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void addBalance(ArrayList<BankAccount> arr,int generatedAccountNumber, int bal){
        int flag =0;
        for(BankAccount value : arr){
            if(value.generatedAccountNumber == generatedAccountNumber) {
                value.balance += bal;
                System.out.println("Deposited successfully");
                flag =1;
            }
        }
        if(flag ==0)
            System.out.println("Wrong Account Number!");
    }

    public void withdrawBalance(ArrayList<BankAccount> arr,int generatedAccountNumber,int bal){
        int flag =0;
        for(BankAccount value : arr){
            if(value.generatedAccountNumber == generatedAccountNumber){
                if(bal<value.balance) {
                    value.balance -= bal;
                    System.out.println("Withdraw successful");
                    flag =1;
                }
                else {
                    System.out.println("Not Enough Balance! Withdraw Unsuccessful");
                    flag = 1;
                }

            }

        }
        if(flag ==0)
            System.out.println("Wrong Account Number!");
    }

    public void addressModify(ArrayList<BankAccount> arr,int generatedAccountNumber,String address){
        int flag=0;
        for(BankAccount value : arr){
            if(value.generatedAccountNumber == generatedAccountNumber){
                value.Address = address;
                System.out.println("Address updated successfully");
                flag =1;
            }
        }
        if(flag ==0)
            System.out.println("Wrong Account Number!");
    }

    public String userInfo(ArrayList<BankAccount> arr,int generatedAccountNumber){
        for(BankAccount value : arr){
            if(value.generatedAccountNumber == generatedAccountNumber)
                return value.generatedAccountNumber + " " + value.name + " " + value.Address + " " + value.balance + " " + value.type;
        }

        return "Could not find the Account::Account number is invalid!!";
    }

    public void nameModify(ArrayList<BankAccount> arr,int generatedAccountNumber,String name){
        int flag =0;
        for(BankAccount value : arr){
            if(value.generatedAccountNumber == generatedAccountNumber) {
                value.name = name;
                System.out.println("Name updated successfully");
                flag = 1;
            }
        }
        if(flag==0)
            System.out.println("Wrong Account number!");
    }


}
