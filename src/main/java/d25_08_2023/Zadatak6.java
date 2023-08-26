package d25_08_2023;

import java.util.Scanner;

public class Zadatak6 {
    public static void main(String[] args) {
//        Napisati funkciju koja za pronalazi koliko ima celih brojeve izmedju brojeva M i N.
//
//Primer izvrsenja:
//izbroji(5, 10) ima za rezultat 4. Kako? 5 6 7 8 9 10
//izbroji(-5, 1) ima za rezultlat 5 . Kako? -5 -4 -3 -2 -1 0 1
        Scanner s = new Scanner(System.in);
        System.out.println("Unesi vrednosti: ");
        int m = s.nextInt();
        int n = s.nextInt();

        izbroj(m, n);
    }
    public static void izbroj (int m, int n) {
        int counter = 0;
        int i = m;
        String nizBrojeva = "";
        while (i <= n) {
            if (i != m && i != n) {
                counter++;
            }
            nizBrojeva = nizBrojeva + i + ", ";
            i++;
        }
        System.out.println("izbroji (" + m + ", " + n + ")" + " ima za rezultat " + counter + ". " + "Kako? " + nizBrojeva);
    }
}
