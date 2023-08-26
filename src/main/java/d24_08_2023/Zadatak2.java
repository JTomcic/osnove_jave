package d24_08_2023;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak2 {

    public static void main(String[] args) {

//2. Zadatak
//Napisati program koji ucitava N brojeva i smesta ih u niz.
// Zatim, iz niza, broji koliko je parnih brojeva uneto. brojeve unosi korisnik.
//Unesite N: 5
//Unesite broj: 1
//Unesite broj: 3
//Unesite broj: 4
//Unesite broj: 7
//Unesite broj: 8
//U nizu ima 2 parna broja.
        ArrayList<Integer> nizBrojeva = new ArrayList<>();

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite N: ");
        int n = s.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Unesite broj: ");
            int broj = s.nextInt();
            nizBrojeva.add(broj);
        }
        int counterParnihBrojeva = 0;
        for (int i = 0; i < nizBrojeva.size(); i++) {
            if (nizBrojeva.get(i) % 2 == 0) {
                counterParnihBrojeva++;
            }
        }
        System.out.println("U nizu ima " +  counterParnihBrojeva +  " parna broja.");
    }
}
