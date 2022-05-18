package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class BankCustomer implements Accountable {
    private String name;
    private String address;
    private String phoneNumber;
    private List<Accountable> accounts = new ArrayList<Accountable>();

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
        return (Accountable[]) accounts.toArray();
    }
    public void addAccount(Accountable newAccount){
        accounts.add(newAccount);
    }

    @Override
    public int getBalance() {
        int balance = 0;
        for (Accountable i:getAccounts()) {
            balance+= Integer.valueOf(String.valueOf(i));
        }
        return balance;
    }
    public boolean isVip(){
        if (getBalance()>=25000){
            return true;
        }
        return false;
    }
}
