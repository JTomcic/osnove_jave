package d11_09_2023;

public class FacebookPost {
    private String opis;
    private Korisnik korisnik;
    public FacebookPost(String opis,Korisnik korisnik) {
        this.opis = opis;
        this.korisnik = korisnik;
    }
    public void stampaj() {
        System.out.println(korisnik.getIme() + " " + korisnik.getPrezime());
        System.out.println(this.opis);
        }
    }

