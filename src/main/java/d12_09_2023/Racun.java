package d12_09_2023;

public class Racun {
    private String brojRacuna;
    private String imeIPrezime;
    private double stanjeNaRacunu;

    public Racun(String brojRacuna, String imeIPrezime, double stanjeNaRacunu) {
        this.brojRacuna = brojRacuna;
        this.imeIPrezime = imeIPrezime;
        this.stanjeNaRacunu = stanjeNaRacunu;
    }
    public String getBrojRacuna() {
        return brojRacuna;
    }
    public void setBrojRacuna(String brojRacuna) {
        this.brojRacuna = brojRacuna;
    }
    public String getImeIPrezime() {
        return imeIPrezime;
    }
    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }
    public double getStanjeNaRacunu() {
        return stanjeNaRacunu;
    }
    public void uplatiNaRacun(double uplata) {
        this.stanjeNaRacunu = this.stanjeNaRacunu + uplata;
    }
    public void skiniSaRacuna(double isplata) {
        this.stanjeNaRacunu = this.stanjeNaRacunu - isplata;
    }
    public void stampaj() {
        System.out.println(this.imeIPrezime + " - " + this.brojRacuna);
        System.out.println("Stanje na racunu je " + this.stanjeNaRacunu + "rsd");
    }
}
