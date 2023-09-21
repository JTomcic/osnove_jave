package d19_09_2023;

public class Tetrapak extends Ambalaza {
    private boolean reciklabilan;
    private double osnovnaCena;

    public Tetrapak(String barkod, String nazivArtikla, double netoTezina, double brutoTezina, boolean reciklabilan, double osnovnaCena) {
        super(barkod, nazivArtikla, netoTezina, brutoTezina);
        this.reciklabilan = reciklabilan;
        this.osnovnaCena = osnovnaCena;
    }

    public boolean isReciklabilan() {
        return this.reciklabilan;
    }

    public void setReciklabilan(boolean reciklabilan) {
        this.reciklabilan = reciklabilan;
    }

    public double getOsnovnaCena() {
        return this.osnovnaCena;
    }

    public void setOsnovnaCena(double osnovnaCena) {
        this.osnovnaCena = osnovnaCena;
    }

    @Override
    public double racunajCenuArtikla() {
        if (this.reciklabilan) {
            return racunajTezinuPakovanja() * 1.5 + this.osnovnaCena;
        } else {
            return this.osnovnaCena;
        }
    }

    @Override
    public void stampaj() {
        System.out.println("Barkod: " + getBarkod());
        System.out.println("Naziv artikla: " + getNazivArtikla());
        System.out.println("Neto tezina: " + getNetoTezina());
        System.out.println("Bruto tezina: " + getBrutoTezina());
        System.out.println("Reciklabilan: " + reciklabilan);
        System.out.println("Osnovna cena: " + osnovnaCena);
    }
}
