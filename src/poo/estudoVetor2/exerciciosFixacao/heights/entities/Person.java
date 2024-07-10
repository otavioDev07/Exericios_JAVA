package poo.estudoVetor2.exerciciosFixacao.heights.entities;

public class Person {
    private String name;
    private int age;
    private double height;

    public Person(String name, int age, double height){
        this.name = name;
        this.age = age;
        this.height = height;
    }
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
