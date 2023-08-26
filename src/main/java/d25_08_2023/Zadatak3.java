package d25_08_2023;

public class Zadatak3 {
    public static void main(String[] args) {

//        Zadatak
//Napisati metodu koja stampa podatke o korisniku u formatu:
//JMBG: [jmbg]
//Ime: [ime]
//Prezime: [prezime]
//God. rodjenja: [god]
//Aktivan: [true/false]
//Metoda prima jmbg, ime, prezime, god rodjenja i da li je aktivan kao parametre metode. Metoda nista ne vraca.
        stampajKorisnika("3323234443332", "Jovana", "Tomcic", 1992, true);


    }
    public static void stampajKorisnika(String jmbg, String ime, String prezime, int godRodjenja, Boolean aktivan) {
        System.out.println("JMBG: " + jmbg);
        System.out.println("Ime: " + ime);
        System.out.println("Prezime: " + prezime);
        System.out.println("God. rodjenja: " + godRodjenja);
        System.out.println("Aktivan: " + aktivan);
    }
}
