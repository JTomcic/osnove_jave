package d11_09_2023;

public class Autor {
    private String imeIPrezime;

    public Autor() {

    }
    public Autor(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;

    }
    public String getImeIPrezime() {
        return this.imeIPrezime;
    }
    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public void stampaj() {
        System.out.println(this.imeIPrezime);
    }
}
