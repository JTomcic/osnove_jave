package d25_08_2023;

public class Zadatak2 {
    public static void main(String[] args) {
// Napisati funkciju koja za dva jednocifrena broja koja su ulazni parametri funkcije vraca novu vrednost
// koja se formira kao na primeru. METODA NISTA NE STAMPA.
// ako je prvi broj =2, a drugi =3 vraca novu vrednost 23.
// ako je prvi broj =6, a drugi =2 vraca novu vrednost 62.
        System.out.println("ako je prvi broj =" + 2 + ", a drugi =" + 3 + " vraca novu vrednost " + spajanjeBrojeva(2, 3) + ".");
        System.out.println("ako je prvi broj =" + 6 + ", a drugi =" + 2 + " vraca novu vrednost " + spajanjeBrojeva(6, 2) + ".");
        spajanjeBrojeva(6, 2);
    }
    public static int spajanjeBrojeva (int a, int b) {
        int novaVrednost = a * 10 + b;
        return novaVrednost;
    }
}
