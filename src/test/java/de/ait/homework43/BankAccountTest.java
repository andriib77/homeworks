package de.ait.homework43;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    BankAccount bankAccount;

    @BeforeEach
    void setUp() {
        bankAccount = new BankAccount("Anton", 1000);
    }

    @Test
    void depositSuccess() {
        Assertions.assertTrue(bankAccount.deposit(200.0));
    }

    @Test
    void withdrawSuccess() {
        Assertions.assertTrue(bankAccount.withdraw(900));
    }
    @Test
    void withdrawFail() {
        Assertions.assertFalse(bankAccount.withdraw(1100));
    }

    @Test
    void checkBalance() {Assertions.assertEquals(1000.0, bankAccount.checkBalance());


    }
}