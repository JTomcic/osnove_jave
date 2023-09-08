package d07_09_2023;

public class Zadatak1 {
    public static void main(String[] args) {
//         Zadatak 1: Kreiranje klase "Student"
//Napišite klasu "Student" koja ima sledeće atribute: ime (String), brojIndeksa (int) i fakultet (String).
//Kreirajte 2-3 objekta ove klase u glavnoj metodi i postavite im vrednosti. Ispisati informacije o studentima.

        Student informacije1 = new Student();
        informacije1.ime = "Jovana";
        informacije1.brojIndeksa = 195;
        informacije1.fakultet = "Filozofski fakultet";

        Student informacije2 = new Student();
        informacije2.ime = "Milica";
        informacije2.brojIndeksa = 200;
        informacije2.fakultet = "Arhitektonski fakultet";

        Student informacije3 = new Student();
        informacije3.ime = "Jelena";
        informacije3.brojIndeksa = 205;
        informacije3.fakultet = "Fakultet dramskih umetnosti";

        System.out.println("Ime: " + informacije1.ime + ", broj indeksa: " + informacije1.brojIndeksa + ", fakultet: " + informacije1.fakultet + ".");
        System.out.println("Ime: " + informacije2.ime + ", broj indeksa: " + informacije2.brojIndeksa + ", fakultet: " + informacije2.fakultet + ".");
        System.out.println("Ime: " + informacije3.ime + ", broj indeksa: " + informacije3.brojIndeksa + ", fakultet: " + informacije3.fakultet + ".");
    }
}
