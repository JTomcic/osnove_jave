package MiniProjekat;

import java.util.ArrayList;

public class Zadatak2 {
    public static void main(String[] args) {
//        **Zadatak: Simulacija iscrtavanja korisnika na Slacku**
//
//Napišite program koji simulira prikazivanje korisnika na Slacku.
// Prikaz korisnika treba da se izvede tako da prvo budu prikazani aktivni korisnici, a potom neaktivni. Program će čuvati sledeće informacije:
//Niz korisnika - u ovom nizu će biti sačuvani svi korisnici koji imaju pristup Slacku.
//Niz aktivnosti - svaki korisnik će biti označen kao aktivan ili neaktivan.
// Informacije o aktivnostima biće čuvane u nizu gde će za svakog korisnika biti zabeleženo da li je trenutno aktivan ili ne  (true ili false)..
// Naravno, korisnik i njegova aktivnost će biti upareni po istom indeksu.
// To znači da će se za korisnika na poziciji N u nizu "korisnici" čitati aktivnost sa pozicije N u nizu "aktivnosti".

        ArrayList<String> korisnici = new ArrayList<>();
        ArrayList<Boolean> aktivnosti = new ArrayList<>();

        korisnici.add("Pera Peric");
        korisnici.add("Darko Darkovic");
        korisnici.add("Marko Markovic");
        korisnici.add("Stefan Stefanovic");
        korisnici.add("Uros Urosevic");
        korisnici.add("Milan Milanovic");

        aktivnosti.add(true);
        aktivnosti.add(false);
        aktivnosti.add(true);
        aktivnosti.add(true);
        aktivnosti.add(false);
        aktivnosti.add(true);

        for (int i = 0; i < korisnici.size(); i++) {
            if (aktivnosti.get(i)) {
                System.out.println("| slika |o " + korisnici.get(i));
            }
        }
        for (int i = 0; i < korisnici.size(); i++) {
            if (!aktivnosti.get(i)) {
                System.out.println("| slika |x " + korisnici.get(i));
            }
        }


    }
}
