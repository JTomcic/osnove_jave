package d07_09_2023;

import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {
//        Zadatak 4: Kreiranje klase "Film"
//Napišite klasu "Film" sa atributima: naslov (String), godinaIzdanja (int) i reziser (String).
//U glavnoj metodi kreirajte 2-3 objekta ove klase i postavite im vrednosti unosom sa tastature. Ispisati informacije o filmovima.
        Scanner s = new Scanner(System.in);
        Film infoFilm1 = new Film();
        System.out.println("Unesite naslov prvog filma: ");
        infoFilm1.naslov = s.next();
        System.out.println("Unesite godinu izdanja filma: ");
        infoFilm1.godinaIzdanja = s.nextInt();
        System.out.println("Unesite rezisera filma: ");
        infoFilm1.reziser = s.next();
        System.out.println("Naslov filma: " + infoFilm1.naslov + ", godina izdanja filma: " + infoFilm1.godinaIzdanja + ", reziser: " + infoFilm1.reziser + ".");

        Film infoFilm2 = new Film();
        System.out.println("Unesite naslov drugog filma: ");
        infoFilm2.naslov = s.next();
        System.out.println("Unesite godinu izdanja filma: ");
        infoFilm2.godinaIzdanja = s.nextInt();
        System.out.println("Unesite rezisera filma: ");
        infoFilm2.reziser = s.next();
        System.out.println("Naslov filma: " + infoFilm2.naslov + ", godina izdanja filma: " + infoFilm2.godinaIzdanja + ", reziser: " + infoFilm2.reziser + ".");

        Film infoFilm3 = new Film();
        System.out.println("Unesite naslov treceg filma: ");
        infoFilm3.naslov = s.next();
        System.out.println("Unesite godinu izdanja filma: ");
        infoFilm3.godinaIzdanja = s.nextInt();
        System.out.println("Unesite rezisera filma: ");
        infoFilm3.reziser = s.next();
        System.out.println("Naslov filma: " + infoFilm3.naslov + ", godina izdanja filma: " + infoFilm3.godinaIzdanja + ", reziser: " + infoFilm3.reziser + ".");







    }
}
