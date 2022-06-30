package com.Sharad;

import java.util.ArrayList;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayList<BankAccount> arr = new ArrayList<>();

        BankAccount bank = new BankAccount();

        System.out.println("Please enter the number of Depositors");

        bank.setDepositors(input.nextInt());

        System.out.println("Nice! Now please proceed to enter the information of Depositors in the order given below:");
        System.out.println("Name Address Balance(if new then Balance =0) AccountType ");

        for(int a =1000;a<1000+bank.getTotalDepositors();a++){

            arr.add(new BankAccount(a,input.next(), input.next(),input.nextInt(),input.next()));
        }

        System.out.println("The Account number has been generated for every account\n!!PLEASE REMEMBER YOUR ACCOUNT NUMBER!!");
        System.out.println(arr.toString());
        System.out.println("");

        System.out.println("Thank you!\nHere's our menu:");

        while(true) {

            System.out.println("Enter 1 to add balance:\nEnter 2 to Withdraw balance:\nEnter 3 to modify Address:\nEnter 4 to modify name:\nEnter 5 to print your info:\nEnter 6 to exit:");

            int choice = input.nextInt();

           if(choice==6)
               break;
           else if(choice ==1){

               System.out.println("Enter your Generated Account number(Ex.1000) and balance to add in this format:\nGeneratedAccountNumber BalanceToAdd");
               bank.addBalance(arr,input.nextInt(),input.nextInt());
               System.out.println("");
           }
           else if(choice == 2){

               System.out.println("Enter your Generated Account number(Ex.1000) and balance to Withdraw in this format:\nGeneratedAccountNumber BalanceToWithdraw");
               bank.withdrawBalance(arr,input.nextInt(),input.nextInt());
               System.out.println("");
           }
           else if(choice == 3){
               System.out.println("Enter your Generated Account number(Ex.1000) and New Address in this format:\nGeneratedAccountNumber NewAddress");
               bank.addressModify(arr,input.nextInt(),input.next());
               System.out.println("");
           }
           else if(choice ==4){
               System.out.println("Enter your Generated Account number(Ex.1000) and New Name in this format:\nGeneratedAccountNumber NewName");
               bank.nameModify(arr,input.nextInt(), input.next());
               System.out.println("");
           }
           else if(choice == 5) {
               System.out.println("Enter your Generated Account number(Ex.1000) to print your Account info:");
               System.out.println(bank.userInfo(arr, input.nextInt()));
               System.out.println("");
           }


        }

        System.out.println("Good bye");

    }

}