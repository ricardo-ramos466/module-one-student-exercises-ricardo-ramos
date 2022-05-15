package com.techelevator;

public class BankAccount {
    private String accountHolderName;
    private String accountNumber;
    private int balance;
    // Constructor for new accounts and existing accounts
    public BankAccount(String accountHolderName, String accountNumber){
        this.accountHolderName =  accountHolderName;
        this.accountNumber = accountNumber;

    }
    public BankAccount(String accountHolderName, String accountNumber, int balance ){
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }
    // Method to deposit and withdraw
    public int deposit(int amountToDeposit ){
        balance = getBalance() + amountToDeposit;
        return getBalance();
    }
    public int withdraw(int amountToWithdraw){
        balance = getBalance() - amountToWithdraw;
        return getBalance();
    }
    // Getters
    public String getAccountHolderName() {
        return accountHolderName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }
}
