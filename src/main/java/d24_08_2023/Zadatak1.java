package d24_08_2023;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
//      1. Zadatak
//Napisati program koji u sebi ima definisan niz od 10 broja (brojevi su proizvoljni)
// i koji menja vrednost elementa na pozciji K. K i novu vrednost unosi korisnik.
//Primer:
//Unesite pozicjiu od 0 do 9: 3
//Unesite novu vrednost: 11
//Element na 3. poziciji treba na kraju da ima vrednost 11 u vasem programu.

        ArrayList<Integer> broj = new ArrayList<>();

        broj.add(1);
        broj.add(2);
        broj.add(3);
        broj.add(4);
        broj.add(5);
        broj.add(6);
        broj.add(7);
        broj.add(8);
        broj.add(9);
        broj.add(10);

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite poziciju od 0 do 9: ");
        int k = s.nextInt();

        System.out.println("Unesite novu vrednost: ");
        int novaVrednost = s.nextInt();

        broj.set(k, novaVrednost);

        System.out.println("Element na " + k + ". poziciji ima vrednost " + novaVrednost + ".");





    }
}
