package d14_09_2023;

class Ispit {
    private String nazivPredmeta;
    private int ocena;
    private String profesor;

    public Ispit(String nazivPredmeta, int ocena, String profesor) {
        this.nazivPredmeta = nazivPredmeta;
        this.setOcena(ocena);
        this.profesor = profesor;
    }

    public int getOcena() {
        return ocena;
    }

    public void setOcena(int ocena) {
        if (ocena > 5 && ocena < 10) {
            this.ocena = ocena;
        }
    }

    public boolean ispitPolozen() {
        if (this.ocena >= 6 && this.ocena <= 10) {
            return true;
        } else {
            return false;
        }
    }

    public void stampajIspit() {
        System.out.println(this.nazivPredmeta + " - " + this.profesor + " - " + this.ocena);
    }
}
