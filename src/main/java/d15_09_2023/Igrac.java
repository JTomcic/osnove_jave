package d15_09_2023;

class Igrac extends Osoba {
    private int broj;
    private String pozicija;
    private boolean kapiten;

    public Igrac() {
    }

    public Igrac(String imePrezime, String jmbg, int godinaRodjenja, int broj, String pozicija, boolean kapiten) {
        super(imePrezime, jmbg, godinaRodjenja);
        this.broj = broj;
        this.pozicija = pozicija;
        this.kapiten = kapiten;
    }

    public int getBroj() {
        return this.broj;
    }

    public void setBroj(int broj) {
        this.broj = broj;
    }

    @Override
    public void stampaj() {
        super.stampaj();
        System.out.println("Broj: " + this.broj);
        System.out.println("Pozicija: " + this.pozicija);
        System.out.println("Kapiten: ");
        if (this.kapiten) {
            System.out.print("Da");
        } else {
            System.out.print("Ne");
        };
    }
}