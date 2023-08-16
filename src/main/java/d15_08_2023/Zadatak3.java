package d15_08_2023;

public class Zadatak3 {
    public static void main(String[] args) {
//        Napisati program koj racuna Z prema formuli: (X - Y) NA KVADRAT.
//        X i Y su celi brojevi.
        int X = 5;
        int Y = 3;
        int Z = (X - Y) * (X - Y);

        System.out.println("X=" + X);
        System.out.println("Y=" + Y);
        System.out.println("Formula" + ":" + " Z=(X - Y) NA KVADRAT");
        System.out.println("Rezultat je " + Z);
    }
}
