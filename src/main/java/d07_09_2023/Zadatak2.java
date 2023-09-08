package d07_09_2023;

public class Zadatak2 {
    public static void main(String[] args) {
//         Zadatak 2: Kreiranje klase "Automobil"
//Napišite klasu "Automobil" sa atributima: marka (String), model (String) i godinaProizvodnje (int).
//U glavnoj metodi kreirajte 2-3 objekta ove klase i postavite im vrednosti. Ispisati informacije o automobilima.
        Automobil autoInfo1 = new Automobil();
        autoInfo1.marka = "BMW";
        autoInfo1.model = "X6";
        autoInfo1.godinaProizvodnje = 2015;

        Automobil autoInfo2 = new Automobil();
        autoInfo2.marka = "Fiat";
        autoInfo2.model = "500";
        autoInfo2.godinaProizvodnje = 2007;

        Automobil autoInfo3 = new Automobil();
        autoInfo3.marka = "Audi";
        autoInfo3.model = "A2";
        autoInfo3.godinaProizvodnje = 2016;

        System.out.println("Marka automobila: " + autoInfo1.marka + ", model: " + autoInfo1.model + ", godina proizvodnje: " + autoInfo1.godinaProizvodnje + ".");
        System.out.println("Marka automobila: " + autoInfo2.marka + ", model: " + autoInfo2.model + ", godina proizvodnje: " + autoInfo2.godinaProizvodnje + ".");
        System.out.println("Marka automobila: " + autoInfo3.marka + ", model: " + autoInfo3.model + ", godina proizvodnje: " + autoInfo3.godinaProizvodnje + ".");
    }
}
