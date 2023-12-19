package de.ait.homework48;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BankAccount {
    private static final Logger LOGGER = LoggerFactory.getLogger(BankAccount.class);

     private String accountNumber;
     private String ownerName;
     private double balance;

    public BankAccount(String accountNumber, String ownerName, double balance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public void deposit(double amount){
        if(amount <=0){
            LOGGER.error("The deposit amount {} cannot be negative or equal to 0.", amount);
        }
        else {
            balance = balance + amount;
            LOGGER.info("Owner's account {} has been replenished with {} €", ownerName, amount);
        }
    }

    public void withdraw(double amount){
        if(amount <=0){
            LOGGER.error("The withdrawal amount {} cannot be negative or equal to 0.", amount);
            throw new InsufficientFundsException(balance, amount);
        }

        if(amount > balance){
            LOGGER.error("Insufficient funds. Attempted to withdraw {}. Current balance: {}.", amount, balance);
            throw new InsufficientFundsException(balance, amount);
        }
        else {
            balance = balance - amount;
            LOGGER.info("Withdrawal of {} made from account {}. New balance: {}.", amount, accountNumber, balance);
        }
    }

    public double checkBalance(){
        LOGGER.debug("Account balance {} of the account owner {}", accountNumber, ownerName);
        return balance;
    }

    public double getBalance() {
        return balance;
    }
}
