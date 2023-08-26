package d25_08_2023;

import java.util.Scanner;

public class Zadatak7 {
    public static void main(String[] args) {
//        Napisati funkciju koja za tri prosledjena broja vraca najmanji od ta 3. U glavnom programu iskoristi funkciju i ispisti odgovarajucu poruku.
//
//Ako se proslede brojevi 4,6,1 u poziv metode, metoda vraca 1
//Ako se proslede brojevi 4,6,33 u poziv metode, metoda vraca 4
        Scanner s = new Scanner(System.in);
        System.out.println("Unesi tri broja: ");
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();

        System.out.println("Ako se proslede brojevi " + a + ", " + b + ", " + c + " u poziv metode, metoda vraca " + minimalanBroj(a, b, c) );
    }
    public static int minimalanBroj(int a, int b, int c) {
        int minBroj = a;
        if (minBroj > b) {
            minBroj = b;
        }
        if (minBroj > c); {
            minBroj = c;
        }
        return minBroj;
    }
}
