package d25_08_2023;

public class Zadatak4 {
    // Metoda prima dva parametra N i karakter za stampu. Metoda stampa N karaktera.
    // Ako se za N prosledi 5 i za karakter prosledi npr kosa crta (/) stampa se
    // / / / / /
    // Napomena: Metoda nista ne vraca.
    public static void main(String[] args) {
        stampaKarakterNPuta(5, "/");
    }


    public static void stampaKarakterNPuta(int n, String karakter) {
        String rezultatZaStampu = "";
        for (int i = 0; i < n; i++) {
            rezultatZaStampu = rezultatZaStampu + karakter;
        }

        System.out.println(rezultatZaStampu);
    }
}
