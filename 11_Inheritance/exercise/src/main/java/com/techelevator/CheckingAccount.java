package com.techelevator;

public class CheckingAccount extends BankAccount {
    // Contractor for new and existing accounts
    public CheckingAccount(String accountHolderName, String accountNumber) {
        super(accountHolderName, accountNumber);
    }
    public CheckingAccount(String accountHolderName, String accountNumber, int balance){
        super(accountHolderName, accountNumber, balance);
    }
//override method for withdrawal
    @Override
    public int withdraw(int amountToWithdraw) {
        if ((balance - amountToWithdraw) < 0 && (balance - amountToWithdraw) > -100 ){
            balance -= amountToWithdraw+10;
            return  balance;
        }
        else if (balance-amountToWithdraw>0){
            return super.withdraw(amountToWithdraw);
        }
        return balance;
    }
}
