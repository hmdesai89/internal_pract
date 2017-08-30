/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.harsh.oop.model;

/**
 *
 * @author harsh
 */
public class Account {
    
    private int bankId;
    private int acctNumber;
    private String customreName;
    private String acctType;
    private int acctBalance;
    private int stripNumber;
    private int pin;
    private static int accountNumberIncrementor;

    public Account(int bankId, String customreName, String acctType, int acctBalance, int pin) {
        this.bankId = bankId;
        this.customreName = customreName;
        this.acctType = acctType;
        this.acctBalance = acctBalance;
        incrementAccountnumber();
        this.acctNumber = getAccountNumberIncrementor();
        this.pin = pin;
    }
    
    private void incrementAccountnumber() { Account.accountNumberIncrementor++; }
    
    public int generateStripNumber(int stripNumber) {
        
        
    }
    
    

    public int getBankId() {
        return bankId;
    }

    public void setBankId(int bankId) {
        this.bankId = bankId;
    }

    public int getAcctNumber() {
        return acctNumber;
    }

    public void setAcctNumber(int acctNumber) {
        this.acctNumber = acctNumber;
    }

    public String getCustomreName() {
        return customreName;
    }

    public void setCustomreName(String customreName) {
        this.customreName = customreName;
    }

    public String getAcctType() {
        return acctType;
    }

    public void setAcctType(String acctType) {
        this.acctType = acctType;
    }

    public int getAcctBalance() {
        return acctBalance;
    }

    public void setAcctBalance(int acctBalance) {
        this.acctBalance = acctBalance;
    }

    public int getStripNumber() {
        return stripNumber;
    }

    public void setStripNumber(int stripNumber) {
        this.stripNumber = stripNumber;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public static int getAccountNumberIncrementor() {
        return accountNumberIncrementor;
    }

    public static void setAccountNumberIncrementor(int accountNumberIncrementor) {
        Account.accountNumberIncrementor = accountNumberIncrementor;
    }
    
    
}
