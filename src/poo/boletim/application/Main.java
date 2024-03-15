package poo.boletim.application;

import poo.boletim.entities.Aluno;

import java.util.Scanner;

//Fazer um programa para ler o nome de um aluno e as três notas que ele obteve nos três trimestres do ano
//(primeiro trimestre vale 30 e o segundo e terceiro valem 35 cada). Ao final, mostrar qual a nota final do aluno no
//ano. Dizer também se o aluno está aprovado (PASS) ou não (FAILED) e, em caso negativo, quantos pontos faltam
//para o aluno obter o mínimo para ser aprovado (que é 60% da nota). Você deve criar uma classe Student para
//resolver este problema.

public class Main {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        Aluno student = new Aluno();

        student.name = sc.nextLine();
        student.firstTri = sc.nextDouble();
        student.secondTri = sc.nextDouble();
        student.thirdTri = sc.nextDouble();

        student.sumGrade();
        System.out.printf("FINAL GRADE: %.2f%n", student.finalGrade);

        System.out.println(student.approved());
        if ("FAILED".equals(student.approved())) {
            System.out.println(student.pointsLeft());
        }
        sc.close();
    }
}
