/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author navdishbatra
 */
public class Account {
    private String routingNumber;
    private String accountNumber;
    private String bank;
    private int accountBalance;
    private Date createdOn;
    
    public Account(){
        this.createdOn = new Date();
    }

    public String getRoutingNumber() {
        return routingNumber;
    }

    public void setRoutingNumber(String routingNumber) {
        this.routingNumber = routingNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bankName) {
        this.bank = bankName;
    }

    public int getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(int balance) {
        this.accountBalance = balance;
    }

    public Date getCreatedOn() {
        return createdOn;
    }
    @Override
    public String toString(){
        return bank;
    }
}
