package poo.funcionario.application;

import poo.funcionario.entities.Employee;

import java.util.Scanner;

//Fazer um programa para ler os dados de um funcionário (nome, salário bruto e imposto). Em
//seguida, mostrar os dados do funcionário (nome e salário líquido). Em seguida, aumentar o
//salário do funcionário com base em uma porcentagem dada (somente o salário bruto é
//afetado pela porcentagem) e mostrar novamente os dados do funcionário. Use a classe
//projetada abaixo.

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee worker = new Employee();

        // Coleta de dados
        System.out.println("Enter employee details: ");
        System.out.println("Name: ");
        worker.name = sc.nextLine();

        System.out.println("Gross Salary: ");
        worker.grossSalary = sc.nextDouble();

        System.out.println("Tax: ");
        worker.tax = sc.nextDouble();

        System.out.println();
        System.out.println("Employee: " + worker);
        System.out.println();
        System.out.println("Which percentage to increase salary? ");
        worker.increaseSalary(sc.nextDouble());

        System.out.println();
        System.out.println("Updated data: " + worker);
        sc.close();
    }
}
