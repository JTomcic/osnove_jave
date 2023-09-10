package d09_09_2023;

public class Proizvod {
    public String naziv;
    public double cena;
    public double tezina;

    public void stampaj() {
        System.out.println("Naziv: {{" + naziv + "}}, cena: {{" + cena + "din}}, tezina: {{" + tezina + "g}}");
    }
    public void povecajCenu(double povecanje) {
        this.cena = this.cena + povecanje;
    }
    public double vratiCenuSaPopustom(double popust) {
        double cenaSaPopustom = 0;
        if (popust < 0) {
            popust = 0;
        } else if (popust > 100) {
            popust = 100;
        }
        cenaSaPopustom = this.cena - (this.cena * popust / 100);
        return cenaSaPopustom;
    }
    public double racunajPostarinu() {
        if (this.tezina <= 100) {
            return 200;
        } else if (this.tezina <= 500) {
            return 400;
        } else {
            return 1000;
        }
    }
}
