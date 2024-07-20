package poo.salary_list.application;

import poo.salary_list.entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Employee> employees = new ArrayList<>();

        System.out.println("How many employees will be registered? ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i=0;i<n;i++){
            System.out.println("Id: ");
            int id = sc.nextInt();
            sc.nextLine();
            Employee sameID = employees.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
            if (sameID != null){
                System.out.println("ID already exists!");
                i--;
                continue;
            }
            System.out.println("Name: ");
            String name = sc.nextLine();
            System.out.println("Salary: ");
            double salary = sc.nextDouble();
            sc.nextLine();
            employees.add(new Employee(id, name, salary));
        }

        System.out.println("** Salary Increase ** ");
        System.out.println("ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        Employee foundId = employees.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        if (foundId == null){
            System.out.println("ID does not exist!");
        } else {
            System.out.println("Insert the percentage salary increase: ");
            double increase = sc.nextDouble();

            for (Employee x : employees){
                if (x.getId() == id){
                    x.salaryIncrease(increase);
                }
            }
        }

        System.out.println("List of employees: ");
        for (Employee x : employees){
            System.out.println(x.getId()+", "+ x.name +", "+"R$"+x.getSalary());
        }

        sc.close();
    }
}