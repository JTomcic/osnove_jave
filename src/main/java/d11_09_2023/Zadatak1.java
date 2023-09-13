package d11_09_2023;

public class Zadatak1 {
    public static void main(String[] args) {
        Autor infoAutor = new Autor("Mesa Selimovic");
        Knjiga infoKnjiga = new Knjiga(4531, "Dervis i smrt", 1974, infoAutor);
        Autor infoAutor2 = new Autor("Mika Antic");
        Knjiga infoKnjiga2 = new Knjiga(4533, "Plavi cuperak", 1965, infoAutor2);

        infoKnjiga.stampaj();
        infoKnjiga2.stampaj();
    }
}
