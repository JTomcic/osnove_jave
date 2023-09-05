package MiniProjekat;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
//        **Zadatak: Simulacija skidanja tekstualnog fajla**
//Napišite program koji simulira proces skidanja tekstualnog fajla.
// Skidanje fajla se obavlja u paketima od po 5 karaktera. Pretpostavljamo da korisnik unosi podatke u skladu sa sledećim zahtevima:
//
//Korisnik unosi veličinu fajla u bajtovima, pri čemu svaki karakter zauzima 1 bajt.
//Ako broj karaktera u fajlu nije deljiv sa 5, poslednji paket će sadržati manje od 5 karaktera.
//Korisnik će biti upitan za podatke svakog paketa kroz for petlju.
// Nakon unosa svakog paketa, program treba da prikaže procenat trenutno skinutog fajla. Na programu je da odredi koliko paketa je potrebno za ceo fajl.
//Na kraju programa, ispišite sadržaj celog fajla.


        Scanner s = new Scanner(System.in);
        System.out.println("Unesite veličinu fajla: ");
        int velicinaFajla = s.nextInt();
        double brojIteracija = velicinaFajla / 5.0;
        String sadrzajFajla = "";
        double procenat = 0;

        for (int i = 0; i < brojIteracija; i++) {
            System.out.println("Unesite paket: ");
            String paket = s.next();
            sadrzajFajla = sadrzajFajla + paket;
            procenat = (sadrzajFajla.length() * 100) / velicinaFajla;
            System.out.println("Skinuto " + procenat + "%");
        }
        System.out.println("Sadržaj fajla je: " + sadrzajFajla);
    }
}
