package d22_08_2023;

import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {
//        Napisati program koji ucitava RIMSKE brojeva od korisnika
//        i na ekranu ispisuje arapsku vrednost sve dok korisnik ne unese KRAJ..
//        Primer izvrsenja:
//Unesite rimski broj: X
//Arapski: 10
//Unesite rimski broj: C
//Arapski: 50
//Unesite rimski broj: D
//Arapski: 500
//Unesite rimski broj: M
//Arapski: 1000
//Unesite rimski broj: I
//Arapski: 1
//Unesite rimski broj: KRAJ
//Kraj programa.
        Scanner s = new Scanner(System.in);

        System.out.println("Unesite rimski broj: ");
        String unetaVrednost = s.next();

        while (!unetaVrednost.equals("KRAJ")) {
            if (unetaVrednost.equals("I")) {
                System.out.println("Arapski: " + 1);
            } else if (unetaVrednost.equals("V")) {
                System.out.println("Arapski: " + 5);
            } else if (unetaVrednost.equals("X")) {
                System.out.println("Arapski: " + 10);
            } else if (unetaVrednost.equals("L")) {
                System.out.println("Arapski: " + 50);
            } else if (unetaVrednost.equals("C")) {
                System.out.println("Arapski: " + 100);
            } else if (unetaVrednost.equals("D")) {
                System.out.println("Arapski: " + 500);
            } else if (unetaVrednost.equals("M")) {
                System.out.println("Arapski: " + 1000);
            }

            System.out.println("Unesite rimski broj: ");
            unetaVrednost = s.next();
        }
        System.out.println("Kraj programa.");
    }
}
