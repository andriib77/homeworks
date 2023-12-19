package de.ait.homework48;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.rmi.server.RemoteServer;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {
    BankAccount bankAccount;

    @BeforeEach
    void setUp() {
        bankAccount = new BankAccount("123456", "John Doe", 100.0);

    }

    @Test
    void deposit() {
        bankAccount.deposit(50.0);
        assertEquals(150.0, bankAccount.getBalance(), 0.001);
    }

    @Test
    void testDepositPositiveAmount() {
        bankAccount.deposit(50.0);
        assertEquals(50.0, bankAccount.getBalance(), 0.001);
        verify(logger).info("Owner's account {} has been replenished with {} €", bankAccount.getOwnerName(), 50.0);
    }

    @Test
    void testDepositPositiveAmount() {
        bankAccount.deposit(50.0);
        assertEquals(150.0, bankAccount.getBalance(), 0.001);
        RemoteServer logger;
        assertEquals("INFO: Owner's account John Doe has been replenished with 50.0 €\n", logger.getLog());
    }

    @Test
    void testDepositZeroAmount() {
        bankAccount.deposit(0.0);
        assertEquals(100.0, bankAccount.getBalance(), 0.001); // No change in balance
        assertEquals("ERROR: The deposit amount 0.0 cannot be negative or equal to 0.\n", logger.getLog());
    }

    @Test
    void testDepositNegativeAmount() {
        bankAccount.deposit(-50.0);
        assertEquals(100.0, bankAccount.getBalance(), 0.001); // No change in balance
        assertEquals("ERROR: The deposit amount -50.0 cannot be negative or equal to 0.\n", logger.getLog());
    }

    public void testWithdrawInsufficientFunds() {
        BankAccount account = new BankAccount("123456", "John Doe", 50.0);
        assertThrows(InsufficientFundsException.class, () -> account.withdraw(100.0));
        assertEquals(50.0, account.getBalance(), 0.001);
    }

    @Test
    void checkBalance() {

    }
}