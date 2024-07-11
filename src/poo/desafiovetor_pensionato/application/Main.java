package poo.desafiovetor_pensionato.application;

import poo.desafiovetor_pensionato.entities.Rent;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rent[] rooms = new Rent[10];

        System.out.println("How many rooms will be rent (max 10)?  ");
        int numbersRent = sc.nextInt();
        sc.nextLine();
        for (int i=0;i<numbersRent;i++){
            System.out.println("Rent #"+(i+1));
            System.out.println("Name: ");
            String name = sc.nextLine();

            System.out.println("E-mail: ");
            String email = sc.nextLine();

            System.out.println("Number of room: ");
            int room = sc.nextInt();
            sc.nextLine();

            rooms[room] = new Rent(name, email, room);
        }

        System.out.println("Busy rooms: ");
        for (Rent room : rooms) {
            if (room != null) {
                System.out.println(room.room() + ": " + room.name() + ", " + room.email());
            }
        }

        sc.close();
    }
}
