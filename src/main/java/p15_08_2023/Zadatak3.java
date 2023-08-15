package p15_08_2023;

import java.sql.SQLOutput;

public class Zadatak3 {

    public static void main(String[] args) {
//Napisati program koji na ekranu stampa podatke u formatu:
//[IME I PREZIME]
//[BROJ TELEFONA], [ULICA I BROJ], [GRAD]
//[EMAIL]
        String firstNameAndLastName = "Jovana Tomcic";
        String brojTelefona = "1234567890";
        String ulicaIBroj = "FF 4";
        String grad = "Kursumlija";
        String email = "tomcicjovana92@gmail.com";

        System.out.println("IME I PREZIME: " + firstNameAndLastName);
        System.out.println("BROJ TELEFONA: " + brojTelefona+", " + "ULICA I BROJ: " + ulicaIBroj+", " + "GRAD: " + grad);
        System.out.println("EMAIL: " + email);



    }
}
