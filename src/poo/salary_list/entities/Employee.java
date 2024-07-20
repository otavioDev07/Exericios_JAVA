package poo.salary_list.entities;

public class Employee {
    private final int id;
    public String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void salaryIncrease(double value){
        salary += salary*value/100;
    }

    public double getSalary() {
        return salary;
    }
}
