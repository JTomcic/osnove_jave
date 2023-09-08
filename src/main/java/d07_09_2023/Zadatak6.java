package d07_09_2023;

import java.util.Scanner;

public class Zadatak6 {
    public static void main(String[] args) {
//         Zadatak 6: Upravljanje Flotom Vozila - Rešite Poslovni Problem
//Pretvorite se u softverskog arhitektu koji će rešiti konkretan poslovni problem.
//Radite za kompaniju za dostavu koja se suočava sa sve većim izazovima u upravljanju svojom flotom vozila.
//Vaš zadatak je da razvijete softver za efikasno praćenje i upravljanje resursima kompanije.
//
//Kompanija ima vozila, vozače, rute za dostavu i potrebu da prati status svake dostave.
//Vaš cilj je da identifikujete potrebne klase za rešavanje ovog problema.
//
//**Scenario:**
//
//Kompanija poseduje različite vrste vozila, svako vozilo ima svoje karakteristike, uključujući marku, model, registarski broj i godinu proizvodnje.
//Vozači su takođe deo flote i svaki vozač ima svoje lične informacije, uključujući ime, prezime, JMBG, broj vozačke dozvole i datum isteka vozačke dozvole.
//
//Dostave se odvijaju duž različitih ruta, a svaka ruta ima svoju polaznu tačku, odredište, dužinu rute (u kilometrima) i očekivano vreme putovanja.
//Vaš zadatak je da definišete potrebne klase za praćenje i upravljanje ovim resursima kako biste pomogli kompaniji da optimizuje svoje poslovanje.
//
//Kroz analizu ovog scenarija, razmislite koje klase su potrebne da biste efikasno rešili problem upravljanja vozilima, vozačima, rutama i dostavama.
// Kreirajte klase sa odgovarajućim atributima kako biste omogućili upravljanje ovim resursima i u glavnom programu kreirajte objekte.
        Scanner s = new Scanner(System.in);
        Vozilo infoVozilo = new Vozilo();
        Vozaci infoVozaci = new Vozaci();
        Rute infoRute = new Rute();

        System.out.println("Unesite informacije o vozilu: ");
        System.out.println("Unesite marku vozila: ");
        infoVozilo.marka = s.next();
        System.out.println("Unesite model vozila: ");
        infoVozilo.model = s.next();
        System.out.println("Unesite registarski broj vozila: ");
        infoVozilo.registarskiBroj = s.next();
        System.out.println("Unesite godinju proizvodnje vozila: ");
        infoVozilo.godinaProizvodnje = s.nextInt();

        System.out.println("Unesite informacije o vozacu: ");
        System.out.println("Unesite ime vozaca: ");
        infoVozaci.ime = s.next();
        System.out.println("Unesite prezime vozaca: ");
        infoVozaci.prezime = s.next();
        System.out.println("Unesite JMBG vozaca: ");
        infoVozaci.jbmg = s.next();
        System.out.println("Unesite broj vozacke dozvole vozaca: ");
        infoVozaci.brojVozackeDozvole = s.nextInt();
        System.out.println("Unesite datum isteka vozacke dozvole: ");
        infoVozaci.datumIstekaVozackeDozvole = s.next();

        System.out.println("Unesite informacije o rutama dostave: ");
        System.out.println("Unesite polaznu tacku: ");
        infoRute.polaznaTacka = s.next();
        System.out.println("Unesite odrediste: ");
        infoRute.odrediste = s.next();
        System.out.println("Unesite duzinu rute: ");
        infoRute.duzinaRute = s.nextInt();
        System.out.println("Unesite ocekivano vreme putovanja: ");
        infoRute.ocekivanoVremePutovanja = s.next();

        System.out.println("Informacije o vozilu: " + "marka " + infoVozilo.marka + ", model " + infoVozilo.model +
                           ", registarski broj vozila " + infoVozilo.registarskiBroj + ", godina proizvodnje vozila " +
                           infoVozilo.godinaProizvodnje + ". " + "Informacije o vozacu: " + "ime vozaca " + infoVozaci.ime
                           + ", prezime vozaca " + infoVozaci.prezime + ", JMBG vozaca " + infoVozaci.jbmg + ", " +
                           "broj vozacke dozvole: " + infoVozaci.brojVozackeDozvole + ", datum isteka vozacke dozvole: "
                           + infoVozaci.datumIstekaVozackeDozvole + ". " + "Informacije o rutama dostave: " +
                           "polazna tacka " + infoRute.polaznaTacka + ", odrediste " + infoRute.odrediste +
                           ", duzina rute " + infoRute.duzinaRute + ", ocekivano vreme putovanja " + infoRute.ocekivanoVremePutovanja + ".");
    }
}
