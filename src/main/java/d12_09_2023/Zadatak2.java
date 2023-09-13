package d12_09_2023;

import java.util.ArrayList;

public class Zadatak2 {
    public static void main(String[] args) {


//    Zadatak
//Kreirati klasu ZeleniKarton koja ima:
//ime i prezime studenta
//broj indeksa
//naziv predmeta
//ime i prezime profesora
//ocenu - od 5 do 10
//gettere i settere
//konstruktore
//metodu koja vraca da li je ispit polozen ili ne (ispit je polozen ako je ocena veca od 5)
//metodu stampaj koja stampa podatke u formatu:
//		(naziv predmeta) - (ocena)
//		Student: ime i prezime, broj indeksa
//		Profesor: ime i prezime
//
//	U glavnoj klasi:
//kreirati niz od 5 zelenih kartona za ispite i odstampati podatke za sve ispite
//Zatim program pronalazi i ispisuje prosecnu ocenu za sve ispite
        ArrayList<ZeleniKarton> zeleniKartoni = new ArrayList<ZeleniKarton>();
        zeleniKartoni.add(new ZeleniKarton("Jovana Tomcic" , 195, "srpski jezik","Marko Markovic", 9));
        zeleniKartoni.add(new ZeleniKarton("Jelena Jovanovic" , 196, "engleski jezik","Milan Maric",8));
        zeleniKartoni.add(new ZeleniKarton("Bojana Tomcic" , 197, "ruski jezik","Nenad Nenadovic",7));
        zeleniKartoni.add(new ZeleniKarton("Jelena Veljovic" , 198, "nemacki jezik","Ivan Ivanovic",6));
        zeleniKartoni.add(new ZeleniKarton("Milica Veljovic" , 199, "francuski jezik","Stefan Stefanovic",4));
        int ukupanZbirOcena = 0;
        for (int i = 0; i < zeleniKartoni.size(); i++) {
            zeleniKartoni.get(i).stampaj();
            System.out.println();
            ukupanZbirOcena = ukupanZbirOcena + zeleniKartoni.get(i).getOcena();
        }
        System.out.println("Prosecna ocena " + ukupanZbirOcena / zeleniKartoni.size());
    }
}
