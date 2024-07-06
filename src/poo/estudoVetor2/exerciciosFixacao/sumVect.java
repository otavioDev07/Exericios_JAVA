package poo.estudoVetor2.exerciciosFixacao;

import java.util.Locale;
import java.util.Scanner;

public class sumVect {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers are you gonna enter?");
        double[] vect = new double[sc.nextInt()];

        for (int i=0;i<vect.length;i++){
            vect[i] = sc.nextInt();
        }

        System.out.println("NUMBERS: ");
        for (double i : vect){
            System.out.println(i);
        }

        double sum = 0;
        for (double i : vect) {
            sum += i;
        }
        double avg  = sum / vect.length;

        System.out.println("SUM: " + sum);
        System.out.println("AVERAGE: " + avg);
    }

}
