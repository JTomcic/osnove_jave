package d12_09_2023;

public class Ugovor {
    private String datum;
    private FizickoLice prodavacNekretnine;
    private FizickoLice kupacNekretnine;
    private int cenaNekretnine;
    private String adresaNekretnine;
    public Ugovor(String datum, FizickoLice prodavacNekretnine, FizickoLice kupacNekretnine,
                       int cenaNekretnine, String adresaNekretnine) {
            this.datum = datum;
            this.prodavacNekretnine = prodavacNekretnine;
            this.kupacNekretnine = kupacNekretnine;
            this.cenaNekretnine = cenaNekretnine;
            this.adresaNekretnine = adresaNekretnine;


    }
    public double procenatZarade() {
        double procenat = 0;
        if (kupacNekretnine.getPodatak() == true) {
            procenat = 0.02;
        } else {
            procenat = 0.03;
        }
        return procenat;
    }
    public double zaradaAgencije() {
        double zarada = 1000 + this.cenaNekretnine * procenatZarade();
        return zarada;
    }
    public void stampaj() {
        System.out.print("Dana " + this.datum + "god sklopljen je ugovor izmedju ");
        this.prodavacNekretnine.stampaj();
        System.out.print(" i ");
        this.kupacNekretnine.stampaj();
        System.out.print(" o kupovini nekretnine " + this.adresaNekretnine + " po ceni od " +
                this.cenaNekretnine + " pri cemu je kupac u obavezi da agenciji isplati novcanu vrednost u iznosu od " + zaradaAgencije());
    }
}
