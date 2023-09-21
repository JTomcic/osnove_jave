package d19_09_2023;

public class Zadatak1 {
    public static void main(String[] args) {
        Tetrapak tetrapak1 = new Tetrapak("328232-2823", "Sok od narandže", 0.5, 1.0, true, 2.0);
        Tetrapak tetrapak2 = new Tetrapak("123456-7891", "Sok od jabuke", 0.3, 0.8, false, 1.5);
        StaklenaAmbalaza flasa1 = new StaklenaAmbalaza("123456-7890", "Mineralna voda", 0.75, 1.2, 0.5, true, 1.5);
        StaklenaAmbalaza flasa2 = new StaklenaAmbalaza("987654-3210", "Gazirani sok", 0.6, 1.1, 0.25, false, 2.0);

        System.out.println("Podaci za Tetrapak 1:");
        tetrapak1.stampaj();

        System.out.println();
        System.out.println("Podaci za Tetrapak 2:");
        tetrapak2.stampaj();

        System.out.println();
        System.out.println("Podaci za Staklena Flasa 1:");
        flasa1.stampaj();

        System.out.println();
        System.out.println("Podaci za Staklena Flasa 2:");
        flasa2.stampaj();

        Korpa korpa = new Korpa();
        korpa.dodajAmbalazu(tetrapak1);
        korpa.dodajAmbalazu(tetrapak2);
        korpa.dodajAmbalazu(flasa1);
        korpa.dodajAmbalazu(flasa2);

        SuperKartica kartica = new SuperKartica("1234-5678-9012-3456", "Marko Markovic", 10);

        double ukupnaCena = korpa.izracunajUkupnuCenu(kartica);

        System.out.println();
        System.out.println("Ukupna cena sa popustom: " + ukupnaCena);
    }
}
