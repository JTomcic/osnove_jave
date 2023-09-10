package d09_09_2023;

public class Zadatak2 {
    public static void main(String[] args) {
//        2.Kreirati klasu FacebookPost koja ima:
//   Od atributa:
//ime i prezime korisnika koji je objavio post
//ime i prezime korisnika na kom je profilu objavljen post (posto na fejsbuku mozete da postavite objavu na tudjem profilu)
//tekst objave
//broj lajkova
//broj deljenja
//  Od metoda:
//like(), koja povecava broj lajkova za 1.
//dislike(), koja smanjuje broj lajkova za 1 (broj lajkova ne moze da bude manji od nule)
//share(), koja povecava broj deljenja za 1
//print(), koja stampa objavu u formatu:
//(ime i prezime osobe koja je objavila) >>> (ime i prezime na cijem profilu)
//(tekst objave)
//Likes (broj lajkova) | Shares (broj deljenja)
//
//U glavnoj klasi napraviti minimum dva FacebookPost-a i nad svakim pozvati svaku funkciju.
        FacebookPost prviPost = new FacebookPost();
        prviPost.korisnik1 = "Jovana Tomcic";
        prviPost.korisnik2 = "Bojana Tomcic";
        prviPost.tekstObjave = "Srecan rodjendan!";
        prviPost.brojLajkova = 0;
        prviPost.brojDeljenja = 0;

        FacebookPost drugiPost = new FacebookPost();
        drugiPost.korisnik1 = "Milena Milenovic";
        drugiPost.korisnik2 = "Marija Maric";
        drugiPost.tekstObjave = "Hello!";
        drugiPost.brojLajkova = 0;
        drugiPost.brojDeljenja = 0;

        prviPost.like();
        prviPost.like();
        prviPost.dislike();
        prviPost.dislike();
        prviPost.share();
        prviPost.stampaj();

        drugiPost.like();
        drugiPost.like();
        drugiPost.like();
        drugiPost.dislike();
        drugiPost.share();
        drugiPost.share();
        drugiPost.share();
        drugiPost.stampaj();
    }
}
