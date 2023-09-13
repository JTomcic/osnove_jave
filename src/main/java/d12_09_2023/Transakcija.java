package d12_09_2023;

public class Transakcija {
    private int id;
    private Racun racunPrimaoca;
    private Racun racunUplatioca;

    public Transakcija(int id, Racun racunPrimaoca, Racun racunUplatioca) {
        this.id = id;
        this.racunPrimaoca = racunPrimaoca;
        this.racunUplatioca = racunUplatioca;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Racun getRacunPrimaoca() {
        return racunPrimaoca;
    }
    public void setRacunPrimaoca(Racun racunPrimaoca) {
        this.racunPrimaoca = racunPrimaoca;
    }
    public Racun getRacunUplatioca() {
        return racunUplatioca;
    }
    public void setRacunUplatioca(Racun racunUplatioca) {
        this.racunUplatioca = racunUplatioca;
    }
    public double provizijaTransakcije(double iznosTransakcije) {
        if (iznosTransakcije > 4500) {
            return iznosTransakcije / 100;
        } else {
            return 45;
        }
    }

    public void izvrsenjeTransakcije(double iznosTransakcije) {
        this.racunPrimaoca.uplatiNaRacun(iznosTransakcije);
        this.racunUplatioca.skiniSaRacuna(iznosTransakcije + this.provizijaTransakcije(iznosTransakcije));
    }

    public void stampaj() {
        System.out.println("ID tranaskcije: " + this.id);
        System.out.println("Racun sa: " + this.racunUplatioca.getImeIPrezime() + " - " + this.racunUplatioca.getBrojRacuna());
        System.out.println("Racun na: " + this.racunPrimaoca.getImeIPrezime() + " - " + this.racunPrimaoca.getBrojRacuna());
    }
}
