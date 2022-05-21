package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class BankCustomer {
    private String name;
    private String address;
    private String phoneNumber;
    private List<Accountable> accounts = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    public Accountable[] getAccounts(){
//        Accountable[] allAccounts = new Accountable[accounts.size()];
//        for (int i = 0; i<accounts.size();i++){
//            allAccounts[i] = accounts.get(i);
//        }

        return accounts.toArray(new Accountable[accounts.size()]);
    }

    public void addAccount(Accountable newAccount) {
    accounts.add(newAccount);
    }


    public boolean isVip(){
        int allAccountsBalance = 0;
        for (Accountable account:accounts){
            allAccountsBalance+=account.getBalance();
        }
        if (allAccountsBalance>=25000){
            return true;
        }
        return false;
    }
}