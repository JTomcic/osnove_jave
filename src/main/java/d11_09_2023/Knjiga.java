package d11_09_2023;

public class Knjiga {
    private int isbn;
    private String naziv;
    private int godinaIzdanja;
    private Autor autor;

    public Knjiga() {

    }
    public Knjiga(int isbn, String naziv, int godinaIzdanja, Autor autor) {
        this.isbn = isbn;
        this.naziv = naziv;
        this.godinaIzdanja = godinaIzdanja;
        this.autor = autor;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getGodinaIzdanja() {
        return godinaIzdanja;
    }

    public void setGodinaIzdanja(int godinaIzdanja) {
        this.godinaIzdanja = godinaIzdanja;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public void stampaj() {
        System.out.println(isbn);
        System.out.println(naziv + " - " + godinaIzdanja);
        System.out.println(this.autor.getImeIPrezime());
this.autor.stampaj();
    }
}