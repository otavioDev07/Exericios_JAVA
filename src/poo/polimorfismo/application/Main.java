package poo.polimorfismo.application;

import poo.polimorfismo.entities.Employee;
import poo.polimorfismo.entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> listEmp = new ArrayList<>();
        listEmp.add(new Employee("Alex", 50, 20.00));
        listEmp.add(new OutsourcedEmployee("Bob", 100, 15.00, 200.00));
        listEmp.add(new Employee("Maria", 60, 20.00));

        System.out.println("Payments:\n");
        for (Employee i : listEmp){
            System.out.println(i.getName() + " - $ " + i.payment() + "\n");
        }

    }
}
