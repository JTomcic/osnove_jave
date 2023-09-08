package d07_09_2023;

import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {
//        Zadatak 5: Kreiranje klase "Oprema"
//Napišite klasu "Oprema" sa atributima: tip (String), marka (String) i cena (double).
//U glavnoj metodi kreirajte 3 objekta ove klase i postavite im vrednosti unosom sa tasture. Ispisati informacije o opremi.
        Scanner s = new Scanner(System.in);

        Oprema planinarenje1 = new Oprema();
        System.out.println("Unesite tip prve opreme: ");
        planinarenje1.tip = s.next();
        System.out.println("Unesite marku: ");
        planinarenje1.marka = s.next();
        System.out.println("Unesite cenu: ");
        planinarenje1.cena = s.nextDouble();
        System.out.println("Tip opreme: " + planinarenje1.tip + ", marka: " + planinarenje1.marka + ", cena: " + planinarenje1.cena + ".");

        Oprema planinarenje2 = new Oprema();
        System.out.println("Unesite tip druge opreme: ");
        planinarenje2.tip = s.next();
        System.out.println("Unesite marku: ");
        planinarenje2.marka = s.next();
        System.out.println("Unesite cenu: ");
        planinarenje2.cena = s.nextDouble();
        System.out.println("Tip opreme: " + planinarenje2.tip + ", marka: " + planinarenje2.marka + ", cena: " + planinarenje2.cena + ".");

        Oprema planinarenje3 = new Oprema();
        System.out.println("Unesite tip trece opreme: ");
        planinarenje3.tip = s.next();
        System.out.println("Unesite marku: ");
        planinarenje3.marka = s.next();
        System.out.println("Unesite cenu: ");
        planinarenje3.cena = s.nextDouble();
        System.out.println("Tip opreme: " + planinarenje3.tip + ", marka: " + planinarenje3.marka + ", cena: " + planinarenje3.cena + ".");


    }
}
