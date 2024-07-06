package poo.estudoVetor2.exerciciosFixacao;

import java.util.Locale;
import java.util.Scanner;

public class Negatives {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("How many number are you gonna enter?");
        int[] vect = new int[sc.nextInt()];

        for(int i=0;i<vect.length;i++){
            System.out.println("Enter a number: ");
            vect[i] = sc.nextInt();
        }

        for (int i : vect) {
            if (i < 0) {
                System.out.println(i);
            }
        }
        sc.close();
    }
}
