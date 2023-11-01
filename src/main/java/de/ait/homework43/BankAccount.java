package de.ait.homework43;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BankAccount {

    private String owner;// владелец аккаунта.
    private double balance; // текущий баланс.

    private static final Logger LOGGER = LoggerFactory.getLogger(BankAccount.class);

    public BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }



     boolean deposit(double amount){
        balance += amount;
        LOGGER.info("Счёт владельца {} пополнен на сумму {}",owner, amount);
        return true;
     }
    /*Увеличьте balance на значение amount.
    Логируйте операцию на уровне INFO, указывая владельца аккаунта и сумму пополнения.*/

    public boolean withdraw(double amount){
        if(amount <= balance){
            balance-= amount;
            LOGGER.info("Успешное снятие. Остаточный баланс на счёте {}",balance);
            return true;

        } else {
            LOGGER.error("На вашем счёте недостаточно средств. Ваш валанс {}",balance );
            return false;
        }

    }
    /*Проверьте, достаточно ли средств на аккаунте. Если не достаточно, залогируйте это как ERROR, указывая владельца аккаунта и требуемую сумму.
    Если средств достаточно, уменьшите balance на amount и логируйте операцию на уровне INFO.*/

    public double checkBalance() {
        LOGGER.debug("{} на вашем счёте баланс {}", owner, balance);
        return balance;
    }
    /*Верните текущий баланс.
    Логируйте запрос баланса на уровне DEBUG, указывая владельца аккаунта.*/

}

