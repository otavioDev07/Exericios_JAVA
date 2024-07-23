package poo.matriz.exercice_matriz;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt(); //line
        int n = sc.nextInt(); //column

        int[][] mat = new int[m][n];

        System.out.println("Enter the numbers: ");

        for (int i=0;i<mat.length;i++){
            for (int j=0;j<mat[i].length;j++){
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("What number do you wanna find?");
        int x = sc.nextInt();

        for (int i=0;i<mat.length;i++){
            for (int j=0;j<mat[i].length;j++){
                if (mat[i][j] == x){
                    System.out.println("Position "+i+", "+j+":");

                    if (j != 0){
                        System.out.println("Left: "+ mat[i][j-1]);
                    }
                    if (j != mat[i].length-1){
                        System.out.println("Right: "+ mat[i][j+1]);
                    }
                    if (i != 0){
                        System.out.println("Up: "+ mat[i-1][j]);
                    }
                    if (i != mat[i].length-1){
                        System.out.println("Down: "+ mat[i+1][j]);
                    }
                }
            }
        }
    }
}
