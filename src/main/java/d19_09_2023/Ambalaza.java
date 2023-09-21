package d19_09_2023;

public abstract class Ambalaza {
    private String barkod;
    private String nazivArtikla;
    private double netoTezina;
    private double brutoTezina;

    public Ambalaza() {
    }

    public Ambalaza(String barkod, String nazivArtikla, double netoTezina, double brutoTezina) {
        this.barkod = barkod;
        this.nazivArtikla = nazivArtikla;
        this.netoTezina = netoTezina;
        this.brutoTezina = brutoTezina;
    }

    public String getBarkod() {
        return barkod;
    }
    public void setBarkod(String barkod) {
        this.barkod = barkod;
    }

    public String getNazivArtikla() {
        return nazivArtikla;
    }

    public void setNazivArtikla(String nazivArtikla) {
        this.nazivArtikla = nazivArtikla;
    }

    public double getNetoTezina() {
        return netoTezina;
    }

    public void setNetoTezina(double netoTezina) {
        this.netoTezina = netoTezina;
    }

    public double getBrutoTezina() {
        return this.brutoTezina;
    }

    public void setBrutoTezina(double brutoTezina) {
        this.brutoTezina = brutoTezina;
    }

    public double racunajTezinuPakovanja() {
        return this.brutoTezina - this.netoTezina;
    }

    public abstract double racunajCenuArtikla();

    public abstract void stampaj();
}
