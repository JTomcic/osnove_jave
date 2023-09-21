package d19_09_2023;

public class StaklenaAmbalaza extends Ambalaza {
    private double kaucija;
    private boolean placanjeKaucije;
    private double osnovnaCena;

    public StaklenaAmbalaza(String barkod, String nazivArtikla, double netoTezina, double brutoTezina, double kaucija, boolean placanjeKaucije, double osnovnaCena) {
        super(barkod, nazivArtikla, netoTezina, brutoTezina);
        this.kaucija = kaucija;
        this.placanjeKaucije = placanjeKaucije;
        this.osnovnaCena = osnovnaCena;
    }

    public double getKaucija() {
        return kaucija;
    }

    public void setKaucija(double kaucija) {
        this.kaucija = kaucija;
    }

    public boolean getPlacanjeKaucije() {
        return placanjeKaucije;
    }
    public void setPlacanjeKaucije(boolean placanjeKaucije) {
        this.placanjeKaucije = placanjeKaucije;
    }

    public double getOsnovnaCena() {
        return osnovnaCena;
    }

    public void setOsnovnaCena(double osnovnaCena) {
        this.osnovnaCena = osnovnaCena;
    }

    @Override
    public double racunajCenuArtikla() {
        if (placanjeKaucije) {
            return osnovnaCena * 1.2 + kaucija;
        } else {
            return osnovnaCena * 1.2;
        }
    }

    @Override
    public void stampaj() {
        System.out.println("Barkod: " + getBarkod());
        System.out.println("Naziv artikla: " + getNazivArtikla());
        System.out.println("Neto tezina: " + getNetoTezina());
        System.out.println("Bruto tezina: " + getBrutoTezina());
        System.out.println("Kaucija: " + kaucija);
        System.out.println("Placanje kaucije: " + placanjeKaucije);
        System.out.println("Osnovna cena: " + osnovnaCena);
    }
}
