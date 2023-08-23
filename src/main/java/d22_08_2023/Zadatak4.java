package d22_08_2023;

import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {
//        Napisati program koji od korisnika ucitava brojeve sve dok ne unesu bar dve dvojke ili tri jedinice.
//Primer izvrsenja 1:
//Unesite broj:1
//Unesite broj:2
//Unesite broj:0
//Unesite broj:2
//Kraj programa.
//(Objasnjenje: Kraj jer je uneto dve dvojke)
//
//Primer izvrsenja 1:
//Unesite broj:1
//Unesite broj:2
//Unesite broj:1
//Unesite broj:3
//Unesite broj:1
//Kraj programa.
//(Objasnjenje: Kraj jer je uneto tri jedinice)
        Scanner s = new Scanner(System.in);
        boolean hasError = false;
        int counterJedinica = 0;
        int counterDvojki = 0;
        String errorMessage = "";

        while (!hasError) {
            System.out.println("Unesite broj: ");
            int unetiBroj = s.nextInt();

            if (unetiBroj == 1) {
                counterJedinica++;
            }
            if (counterJedinica == 3) {
                hasError = true;
                errorMessage = "(Objasnjenje: Kraj jer je uneto tri jedinice)";
            }
            if (unetiBroj == 2) {
                counterDvojki++;
            }
            if (counterDvojki == 2) {
                hasError = true;
                errorMessage = "(Objasnjenje: Kraj jer je uneto dve dvojke)";
            }
        }

        System.out.println("Kraj programa.");
        System.out.println(errorMessage);
    }
}
