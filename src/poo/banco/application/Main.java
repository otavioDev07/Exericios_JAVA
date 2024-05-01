package poo.banco.application;

import poo.banco.entitie.Account;

import java.util.Scanner;

//Em um banco, para se cadastrar uma conta bancária, é necessário informar o número da conta, o nome do
//titular da conta, e o valor de depósito inicial que o titular depositou ao abrir a conta. Este valor de depósito
//inicial, entretanto, é opcional, ou seja: se o titular não tiver dinheiro a depositar no momento de abrir sua
//conta, o depósito inicial não será feito e o saldo inicial da conta será, naturalmente, zero.
// Importante: uma vez que uma conta bancária foi aberta, o número da conta nunca poderá ser alterado.
// o nome do titular pode ser alterado (pois uma pessoa pode mudar de nome por ocasião de casamento, por exemplo).
// Por fim, o saldo da conta nao pode ser alterado livremente. É preciso haver um mecanismo para proteger isso.
// O saldo só aumenta por meio de depósitos, e só diminui por meio de saques. Para cada saque realizado,
// o banco cobra uma taxa de $ 5.00. Nota: a conta pode ficar com saldo negativo se o saldo não for
// suficiente para realizar o saque e/ou pagar a taxa.
// Você deve fazer um programa que realize o cadastro de uma conta, dando opção para que seja ou não
// informado o valor de depósito inicial. Em seguida, realizar um depósito e depois um saque, sempre
// mostrando os dados da conta após cada operação.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- Registration ---");

        System.out.println("Enter account number: ");
        String acNum = sc.nextLine();

        System.out.println("Enter account holder: ");
        String acHolder = sc.nextLine();

        System.out.println("Is there an initial deposit? (y/n): ");
        char response = sc.next().charAt(0);

        Account account;
        if (response == 'y'){
            System.out.println("Enter initial deposit value: ");
            Double value = sc.nextDouble();
            account = new Account(acHolder, acNum, value);
        } else {
            account = new Account(acHolder, acNum);
        }

        System.out.println("Account data: \n" + account);

        System.out.println("Enter a deposit value: ");
        Double deposit = sc.nextDouble();
        account.deposit(deposit);

        System.out.println("Updated account data: \n" + account);

        System.out.println("Enter a withdraw value: ");
        Double withdraw = sc.nextDouble();
        account.withdraw(withdraw);

        System.out.println("Updated account data: \n" + account);

        sc.close();
    }
}
