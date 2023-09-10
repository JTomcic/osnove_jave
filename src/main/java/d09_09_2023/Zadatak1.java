package d09_09_2023;

public class Zadatak1 {
    public static void main(String[] args) {
//      Napisati klasu Proizvod koja ima atribute
//naziv proizvoda (String)
//cenu proizvoda (double)
//težinu proizvoda u gramima. (double)
//	i metode:
//stampaj - stampa podatke proizvoda u formatu {{naziv}}, {{cena}}, {{tezina}}
//povecajCenu - koja kao parametar funkcije prima vrednost povećanje za koju treba povećati cenu.
//ova funkcija treba da menja atribut cena i ova funkcija nema povratnu vrednost.
//vratiCenuSaPopustom - koja kao ulazni parametar funkcije dobija popust, a povratnu vrednost je cena proizvoda kada se uračuna popust.
//Ova funkcije ne menja atribut cena. Smatrati da je parametar popust u opsegu od 0 do 100.
//racunajPostarinu - funkcije vraća koliko bi bila postarina da se proizvod šalje preko kurirske sluzbe.
//Funkcija je bez ulaznih parametara, a cena postarine se računa u zavisnosti od tezine:
//za tezinu do 100g, postarina iznosi 200din
//za tezinu od 101g do 500g, postarina iznosi 400din
//za tezinu preko 500g, postarina iznosi 1000din
//
//U glavnom programu kreirati minimum 2 proizvoda i za svaki od njih pozvati svaku od definisanih funkcija.
        Proizvod proizvod1 = new Proizvod();
        proizvod1.naziv = "Nakit";
        proizvod1.cena = 150;
        proizvod1.tezina = 20;

        Proizvod proizvod2 = new Proizvod();
        proizvod2.naziv = "Knjiga";
        proizvod2.cena = 1120;
        proizvod2.tezina = 700;

        proizvod1.stampaj();
        proizvod1.povecajCenu(80);
        System.out.println("Nova cena nakita je: " + proizvod1.vratiCenuSaPopustom(15) + "din");
        System.out.println("Cena postarine iznosi: " + proizvod1.racunajPostarinu() + "g");

        proizvod2.stampaj();
        proizvod2.povecajCenu(350);
        System.out.println("Nova cena nakita je: " + proizvod2.vratiCenuSaPopustom(35) + "din");
        System.out.println("Cena postarine iznosi: " + proizvod2.racunajPostarinu() + "g");
    }
}
