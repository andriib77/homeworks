package de.ait.homework48;

public class InsufficientFundsException extends RuntimeException {
    private double currentBalance;
    private double requestedAmount;

    public InsufficientFundsException(double currentBalance, double requestedAmount) {
        super("Insufficient funds. Current balance: " + currentBalance + ", Requested amount: " + requestedAmount);
        this.currentBalance = currentBalance;
        this.requestedAmount = requestedAmount;
    }
    public double getCurrentBalance() {
        return currentBalance;
    }

    public double getRequestedAmount() {
        return requestedAmount;
    }
}
