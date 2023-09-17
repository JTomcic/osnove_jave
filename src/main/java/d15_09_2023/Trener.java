package d15_09_2023;

class Trener extends Osoba {
    private int godineIskustva;
    private String tipTrenera;

    public Trener() {
    }

    public Trener(String imePrezime, String jmbg, int godinaRodjenja, int godineIskustva, String tipTrenera) {
        super(imePrezime, jmbg, godinaRodjenja);
        this.godineIskustva = godineIskustva;
        this.tipTrenera = tipTrenera;
    }
    @Override
    public void stampaj() {
        super.stampaj();
        System.out.println("Godine iskustva: " + godineIskustva);
        System.out.println("Tip trenera: " + tipTrenera);
    }
}
