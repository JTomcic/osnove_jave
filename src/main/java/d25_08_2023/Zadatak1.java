package d25_08_2023;

public class Zadatak1 {
    public static void main(String[] args) {

//        Napisati metodu stampajVrednostZa10Vecu u kojoj se stampa prosledjena vrednost za 10 veca.
//        Iz main-a pozvati izvrsenje metode za razlicite vrednosti.
        stampajVrednostZa10Vecu(5);
        stampajVrednostZa10Vecu(6);
        stampajVrednostZa10Vecu(7);
        stampajVrednostZa10Vecu(8);
        stampajVrednostZa10Vecu(9);

    }
    public static void stampajVrednostZa10Vecu(int broj) {
        System.out.println(broj * 10);
    }
}
