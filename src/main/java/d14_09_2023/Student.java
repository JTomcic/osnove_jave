package d14_09_2023;

import java.util.ArrayList;

class Student {
    private String brojIndeksa;
    private String imePrezime;
    private String tipStudija;
    private ArrayList<Ispit> ispiti;

    public Student(String brojIndeksa, String imePrezime, String tipStudija) {
        this.brojIndeksa = brojIndeksa;
        this.imePrezime = imePrezime;
        this.tipStudija = tipStudija;
        this.ispiti = new ArrayList<>();
    }

    public void dodajIspit(Ispit ispit) {
        ispiti.add(ispit);
    }

    public double racunajProsek() {
        ArrayList<Ispit> polozeniIspiti = new ArrayList<>();
        for (int i = 0; i < this.ispiti.size(); i++) {
            if (this.ispiti.get(i).ispitPolozen()) {
                polozeniIspiti.add(this.ispiti.get(i));
            }
        }
        if (polozeniIspiti.size() == 0) {
            return 0;
        }
        double sumaOcena = 0;
        for (int i = 0; i < polozeniIspiti.size(); i++) {
            if (polozeniIspiti.get(i).ispitPolozen()) {
                sumaOcena += polozeniIspiti.get(i).getOcena();
            }
        }

        return sumaOcena / polozeniIspiti.size();
    }

    public void stampaj() {
        System.out.println("(" + this.brojIndeksa + ") - " + this.imePrezime + " - " + this.tipStudija);
        System.out.println("Predmeti:");
        for (int i = 0; i < this.ispiti.size(); i++) {
            if (this.ispiti.get(i).ispitPolozen()) {
                this.ispiti.get(i).stampajIspit();
            }
        }
        double prosek = racunajProsek();
        System.out.println("Prosecna ocena: " +  prosek);
    }
}





