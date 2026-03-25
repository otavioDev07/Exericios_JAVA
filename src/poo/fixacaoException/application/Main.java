package poo.fixacaoException.application;

import poo.fixacaoException.models.entities.Account;
import poo.fixacaoException.models.exceptions.AboveLimit;
import poo.fixacaoException.models.exceptions.NoBalance;

public class Main {
    public static void main(String[] args) {

        Account acc = new Account(8021, "Bob Brown", 500.0, 300.0);

        System.out.println("=== Saque válido ===");
        try {
            acc.withdraw(100.0);
            System.out.println("New balance: " + acc.getBalance());
        } catch (NoBalance | AboveLimit e) {
            System.out.println("Withdraw error: " + e.getMessage());
        }

        System.out.println("\n=== Saque acima do limite ===");
        try {
            acc.withdraw(400.0);
            System.out.println("New balance: " + acc.getBalance());
        } catch (NoBalance | AboveLimit e) {
            System.out.println("Withdraw error: " + e.getMessage());
        }

        System.out.println("\n=== Saque sem saldo ===");
        Account acc2 = new Account(9000, "Teste", 0.0, 300.0);

        try {
            acc2.withdraw(50.0);
            System.out.println("New balance: " + acc2.getBalance());
        } catch (NoBalance | AboveLimit e) {
            System.out.println("Withdraw error: " + e.getMessage());
        }
    }
}