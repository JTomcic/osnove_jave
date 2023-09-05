package MiniProjekat;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {
//        **Zadatak: Generisanje Random Passworda sa Specijalnim Karakterom**
//
//Napišite program koji simulira automatsko generisanje random passworda.
// Korisnik će uneti željenu dužinu passworda, a program će kreirati i ispisati password koji zadovoljava te parametre.
// Ovaj zadatak zahteva implementaciju različitih metoda za generisanje karaktera i passworda.
//generisiRandomKarakter: Ova metoda generiše i vraća random karakter.
// Metoda koristi niz stringova sa elementima koji predstavljaju mala slova, velika slova i brojeve (niz je sa fiksnim vrednostima).
//Random bira jedan element iz niza i vraća ga kao povreatnu vrednost (string). Ova metoda nema ulazne parametre.
//generisiRandomSpecijalanKarakter: Ova metoda generiše i vraća random specijalan karakter.
// Metoda koristi niz stringova sa elementima `@`, `#`, `&`, `*` i `!` (niz je sa fiksnim vrednostima).
// Random bira jedan element iz niza i vraća ga kao string. Ova metoda nema ulazne parametre.
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite duzinu passworda: ");
        int duzinaPassworda = s.nextInt();
        System.out.println("Da li želite da sadrži specijalan karakter: ");
        boolean passwordSadrziSpecijalneKaraktere = s.nextBoolean();
        String password = "";
        int brojIteracija = duzinaPassworda;

        if (passwordSadrziSpecijalneKaraktere) {
            brojIteracija = brojIteracija - 1;
        }

        for (int i = 0; i < brojIteracija; i++) {
            password = password + generisiRandomKarakter();
        }

        if (passwordSadrziSpecijalneKaraktere) {
            password = password + generisiRandomSpecijalanKarakter();
        }

        System.out.println("Generisan password: " + password);
    }
    public static String generisiRandomKarakter() {
        ArrayList<String> karakteri = new ArrayList<>();
        karakteri.add("A");
        karakteri.add("B");
        karakteri.add("C");
        karakteri.add("D");
        karakteri.add("E");
        karakteri.add("F");
        karakteri.add("G");
        karakteri.add("H");
        karakteri.add("I");
        karakteri.add("J");
        karakteri.add("a");
        karakteri.add("b");
        karakteri.add("c");
        karakteri.add("d");
        karakteri.add("e");
        karakteri.add("f");
        karakteri.add("g");
        karakteri.add("h");
        karakteri.add("i");
        karakteri.add("j");
        karakteri.add("0");
        karakteri.add("1");
        karakteri.add("2");
        karakteri.add("3");
        karakteri.add("4");
        karakteri.add("5");
        karakteri.add("6");
        karakteri.add("7");
        karakteri.add("8");
        karakteri.add("9");

        Random rand = new Random();
        int randomIndex = rand.nextInt(karakteri.size());
        return karakteri.get(randomIndex);
    }
    public static String generisiRandomSpecijalanKarakter() {
        ArrayList<String> specijalaniKarakteri = new ArrayList<>();
        specijalaniKarakteri.add("@");
        specijalaniKarakteri.add("#");
        specijalaniKarakteri.add("&");
        specijalaniKarakteri.add("*");
        specijalaniKarakteri.add("!");

        Random rand = new Random();
        int randomIndex = rand.nextInt(specijalaniKarakteri.size());
        return specijalaniKarakteri.get(randomIndex);
    }

}
