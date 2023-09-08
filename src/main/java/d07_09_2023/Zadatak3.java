package d07_09_2023;

public class Zadatak3 {
    public static void main(String[] args) {
//         Zadatak 3: Kreiranje klase "Proizvod"
//Napišite klasu "Proizvod" sa atributima: naziv (String) i cena (double).
//U glavnoj metodi kreirajte 3 objekta ove klase i postavite im vrednosti. Ispisati informacije o proizvodima.
        Proizvod infoProizvod1 = new Proizvod();
        infoProizvod1.naziv = "Parfem";
        infoProizvod1.cena = 100.5;

        Proizvod infoProizvod2 = new Proizvod();
        infoProizvod2.naziv = "Torba";
        infoProizvod2.cena = 90.5;

        Proizvod infoProizvod3 = new Proizvod();
        infoProizvod3.naziv = "Cipele";
        infoProizvod3.cena = 150.5;

        System.out.println("Naziv proizvoda: " + infoProizvod1.naziv + ", cena: " + infoProizvod1.cena + ".");
        System.out.println("Naziv proizvoda: " + infoProizvod2.naziv + ", cena: " + infoProizvod2.cena + ".");
        System.out.println("Naziv proizvoda: " + infoProizvod3.naziv + ", cena: " + infoProizvod3.cena + ".");
    }
}
