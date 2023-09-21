package d19_09_2023;

import java.util.ArrayList;

public class Korpa {
    private ArrayList<Ambalaza> ambalaze = new ArrayList<>();

    public void dodajAmbalazu(Ambalaza ambalaza) {
        ambalaze.add(ambalaza);
    }

    public void izbaciAmbalazu(String barkod) {
        for (int i = 0; i < ambalaze.size(); i++) {
            if (ambalaze.get(i).getBarkod().equals(barkod)) {
                ambalaze.remove(i);
            }
        }
    }

    private double izracunajCenuSaPopustom(int popust) {
        double ukupnaCena = 0;
        for (int i = 0; i < ambalaze.size(); i++) {
            ukupnaCena += ambalaze.get(i).racunajCenuArtikla();
        }
        return ukupnaCena + (ukupnaCena * popust / 100);
    }

    public double izracunajUkupnuCenu(SuperKartica superKartica) {
        int popust = superKartica.getPopust();
        double cenaSaPopustom = izracunajCenuSaPopustom(popust);
        return cenaSaPopustom;
    }
}
