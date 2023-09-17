package d15_09_2023;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Unesite podatke za prva dva igraca:");
        Igrac igrac1 = unosIgraca(scanner);
        Igrac igrac2 = unosIgraca(scanner);

        System.out.println("Unesite podatke za prva dva trenera:");
        Trener trener1 = unosTrenera(scanner);
        Trener trener2 = unosTrenera(scanner);

        System.out.println();
        System.out.println("Informacije o igracima:");
        igrac1.stampaj();
        igrac2.stampaj();

        System.out.println();
        System.out.println("Informacije o trenerima:");
        trener1.stampaj();
        trener2.stampaj();
    }

    public static Igrac unosIgraca(Scanner scanner) {
        System.out.print("Ime i prezime: ");
        String imePrezime = scanner.nextLine();
        System.out.print("JMBG: ");
        String jmbg = scanner.nextLine();
        System.out.print("Godina rodjenja: ");
        int godinaRodjenja = scanner.nextInt();
        System.out.print("Broj: ");
        int broj = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Pozicija: ");
        String pozicija = scanner.nextLine();
        System.out.print("Da li je kapiten (Da/Ne): ");
        boolean kapiten = scanner.nextLine().equalsIgnoreCase("Da");

        return new Igrac(imePrezime, jmbg, godinaRodjenja, broj, pozicija, kapiten);
    }

    public static Trener unosTrenera(Scanner scanner) {
        System.out.print("Ime i prezime: ");
        String imePrezime = scanner.nextLine();
        System.out.print("JMBG: ");
        String jmbg = scanner.nextLine();
        System.out.print("Godina rodjenja: ");
        int godinaRodjenja = scanner.nextInt();
        System.out.print("Godine iskustva: ");
        int godineIskustva = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Tip trenera: ");
        String tipTrenera = scanner.nextLine();

        return new Trener(imePrezime, jmbg, godinaRodjenja, godineIskustva, tipTrenera);
    }
}
