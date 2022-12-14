package com.techelevator;

public class SavingsAccount extends BankAccount{

    //Constructor for new and existing saving accounts
    public SavingsAccount(String accountHolderName, String accountNumber) {
        super(accountHolderName, accountNumber);
    }
    public SavingsAccount(String accountHolderName, String accountNumber, int balance) {
        super(accountHolderName, accountNumber, balance);
    }
// override for additional $2 fee for withdraws under $150
    @Override
    public int withdraw(int amountToWithdraw) {
        int balance = this.getBalance();
        if (balance-amountToWithdraw < 150 && (balance- (amountToWithdraw +2)) >= 0){
            amountToWithdraw+=2;
            return  super.withdraw(amountToWithdraw);
        }
        else if (balance-amountToWithdraw >= 150){
            return super.withdraw(amountToWithdraw);
        }

        return this.getBalance();
    }
}
