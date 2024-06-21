package poo.estudoVetor2.exerciciosFixacao;

import java.util.Locale;
import java.util.Scanner;

public class Negativos {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("How many number are you gonna enter?");
        int qtd = sc.nextInt();
        int[] vect = new int[qtd];

        for(int i=0;i<qtd;i++){
            System.out.println("Enter a number: ");
            int num = sc.nextInt();
            vect[i] = num;
        }

        for (int i : vect) {
            if (i < 0) {
                System.out.println(i);
            }
        }
        sc.close();
    }
}
