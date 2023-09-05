package MiniProjekat;

import java.util.ArrayList;

public class Zadatak3 {
    public static void main(String[] args) {
//        **Zadatak: Zamena Placeholdera u SQL Upitu**
//
//Napišite program koji obavlja zamenu placeholdera u SQL upitu.
//
//Program će sačuvati sledeće informacije:
//
//1. SQL upit (string) nad kojim će se obaviti zamena.
//2. Niz vrednosti (niz stringova) koje treba da se ubace umesto placeholdera u SQL upitu.
//
//Placeholder je označeno mesto u stringu na kom treba da se postavi prava vrednost iz niza vrednosti.
// Placeholderi su označeni kombinacijom `%` i pozicijom za zamenu. Na primer, ukoliko SQL upit izgleda ovako:
//
//INSERT INTO Customers (CustomerName, ContactName, Address, City, PostalCode, Country) VALUES ('%0', '%1', '%2', '%3', '%4', '%5');
//
//i niz vrednosti je:
//Cardinal, Tom B. Erichsen, Skagen 21, Stavanger, 4006, Norway
//
//Nakon izvršenja zamene, dobiće se SQL upit:
//
//INSERT INTO Customers (CustomerName, ContactName, Address, City, PostalCode, Country)
// VALUES ('Cardinal','Tom B. Erichsen','Skagen 21','Stavanger','4006','Norway');
//
//Ovaj program koristi `replace` metodu da zameni placeholder pozicije u SQL upitu sa stvarnim vrednostima iz niza.


            ArrayList<String> values = new ArrayList<>();

            values.add("Cardinal");
            values.add("Tom B. Erichsen");
            values.add("Skagen 21");
            values.add("Stavanger");
            values.add("4006");
            values.add("Norway");

            String sqlUpit = "INSERT INTO Customers (CustomerName, ContactName, Address, City, PostalCode, Country) VALUES ('%0', '%1', '%2', '%3', '%4', '%5')";

            for (int i = 0; i < values.size(); i++) {
              sqlUpit = sqlUpit.replace("%" + i, values.get(i));
                }

            System.out.println(sqlUpit);

        }
    }

