package d12_09_2023;

public class FizickoLice {
    private String punoIme;
    private int brojLk;
    private String jmbg;
    private boolean podatak;
    public FizickoLice(String punoIme, int brojLk, String jmbg, boolean podatak) {
        this.punoIme = punoIme;
        this.brojLk = brojLk;
        this.jmbg = jmbg;
        this.podatak = podatak;
    }
    public String getPunoIme() {
        return this.punoIme;
    }
    public void setPunoIme(String punoIme) {
        this.punoIme = punoIme;
    }
    public int getBrojLk() {
        return this.brojLk;
    }
    public void setBrojLk(int brojLk) {
        this.brojLk = brojLk;
    }
    public String getJmbg() {
        return this.jmbg;
    }
    public boolean getPodatak() {
        return this.podatak;
    }
    public void setPodatak(boolean podatak) {
        this.podatak = podatak;
    }
    public void stampaj() {
        System.out.print(this.punoIme + " " + this.brojLk);
    }
}
