package challenge;

import java.math.BigDecimal;

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
    public BigDecimal deposit(int amountToDeposit ){
        balance += amountToDeposit;
        return getBalance();
    }
    public BigDecimal withdraw(int amountToWithdraw){
        balance -=amountToWithdraw;
        return getBalance();
    }
    // Getters
    public String getAccountHolderName() {
        return accountHolderName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public BigDecimal getBalance() {
        return new BigDecimal(balance);
    }
}
