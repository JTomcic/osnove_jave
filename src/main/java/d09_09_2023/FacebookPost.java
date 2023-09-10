package d09_09_2023;

public class FacebookPost {
    public String korisnik1;
    public String korisnik2;
    public String tekstObjave;
    public int brojLajkova;
    public int brojDeljenja;

    public void like() {
        this.brojLajkova = this.brojLajkova + 1;
    }
    public void dislike() {
        this.brojLajkova = this.brojLajkova - 1;
        if (brojLajkova < 0) {
            brojLajkova = 0;
        }
    }
    public void share() {
        this.brojDeljenja = this.brojDeljenja + 1;
    }
    public void stampaj() {
        System.out.println(this.korisnik1 + ">>>" + this.korisnik2);
        System.out.println(this.tekstObjave);
        System.out.println("Likes " + brojLajkova + " | Shares " + brojDeljenja);
    }
}
