package d14_09_2023;

public class Zadatak1 {
    public static void main(String[] args) {
        Ispit ispit1 = new Ispit("Matematika", 8, "Profesor1");
        Ispit ispit2 = new Ispit("Fizika", 7, "Profesor2");

        Student student1 = new Student("12345", "Marko Marković", "Osnovne");
        student1.dodajIspit(ispit1);
        student1.dodajIspit(ispit2);

        student1.stampaj();
    }
}
