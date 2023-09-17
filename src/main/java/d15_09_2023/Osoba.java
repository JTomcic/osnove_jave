package d15_09_2023;
class Osoba {
    private String imePrezime;
    private String jmbg;
    private int godinaRodjenja;

    public Osoba() {
    }

    public Osoba(String imePrezime, String jmbg, int godinaRodjenja) {
        this.imePrezime = imePrezime;
        this.jmbg = jmbg;
        this.godinaRodjenja = godinaRodjenja;
    }

    public String getImePrezime() {
        return imePrezime;
    }

    public void setImePrezime(String imePrezime) {
        this.imePrezime = imePrezime;
    }

    public String getJmbg() {
        return jmbg;
    }

    public void setJmbg(String jmbg) {
        this.jmbg = jmbg;
    }

    public void stampaj() {
        System.out.println("(" + this.imePrezime + "), (" + this.jmbg + "), (" + this.godinaRodjenja + ")");
    }
}

