package poo.fixacaoException.models.entities;

import poo.fixacaoException.models.exceptions.AboveLimit;
import poo.fixacaoException.models.exceptions.NoBalance;

public class Account {
    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    public Account(Integer number, String holder, Double balance, Double withdrawLimit){
        this.number = number;
        this.balance = balance;
        this.holder = holder;
        this.withdrawLimit = withdrawLimit;
    }

    void deposit(Double amount){
        balance += amount;
    }

    public void withdraw(Double amount) throws NoBalance, AboveLimit {
        if (balance == 0) {
            throw new NoBalance("No balance available");
        }
        if (amount > withdrawLimit) {
            throw new AboveLimit("The amount exceeds withdraw limit");
        }
        if (amount > balance) {
            throw new NoBalance("Insufficient balance");
        }

        balance -= amount;
    }

    public Double getBalance() {
        return balance;
    }
}
