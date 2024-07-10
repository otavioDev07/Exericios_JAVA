package poo.estudoVetor2.exerciciosFixacao.heights.application;

import poo.estudoVetor2.exerciciosFixacao.heights.entities.Person;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many people are you gonna type? ");
        int n = sc.nextInt();
        sc.nextLine();

        Person[] people = new Person[n];

        for (int i = 0; i < people.length; i++) {
            System.out.println((i + 1) + "a person data: ");
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Age: ");
            int age = sc.nextInt();
            System.out.print("Height: ");
            double height = sc.nextDouble();
            sc.nextLine(); // Consume the new line after nextDouble()

            people[i] = new Person(name, age, height);
        }

        double sumHeights = 0;
        for (Person person : people) {
            sumHeights += person.height();
        }
        double averageHeight = sumHeights / people.length;
        System.out.printf("Average Height: %.2f%n", averageHeight);

        System.out.println("People under 16: ");
        int underSixteen = 0;
        boolean Sixteen = Boolean.FALSE; // Can be true, false ou null
        for (Person person : people) {
            if (person.age() < 16) {
                System.out.println(person.name());
                underSixteen++;
                Sixteen = true;
            }
        }
        if (Boolean.FALSE.equals(Sixteen)){
            System.out.println("Doesn't have.");
        }
        double percentage = (double) (underSixteen * 100) / people.length;
        System.out.printf("Percentage of people under 16: %.2f%%%n", percentage);

        sc.close();
    }
}
