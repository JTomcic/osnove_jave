package d12_09_2023;

public class ZeleniKarton {
    private String student;
    private  int brojIndeksa;
    private String predmet;
    private String profesor;
    private int ocena;
    public ZeleniKarton(String student, int brojIndeksa, String predmet, String profesor, int ocena) {
        this.student = student;
        this.brojIndeksa = brojIndeksa;
        this.predmet = predmet;
        this.profesor = profesor;
        this.ocena = ocena;
    }
    public String getStudent() {
        return student;
    }
    public void setStudent(String student) {
        this.student = student;
    }
    public int getBrojIndeksa() {
        return brojIndeksa;
    }
    public void setBrojIndeksa(int brojIndeksa) {
        this.brojIndeksa = brojIndeksa;
    }
    public String getPredmet() {
        return predmet;
    }
    public void setPredmet(String predmet) {
        this.predmet = predmet;
    }
    public String getProfesor() {
        return profesor;
    }
    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }
    public int getOcena() {
        return ocena;
    }
    public void setOcena(int ocena) {
        this.ocena = ocena;
    }
    public boolean polozenIspit() {
        if (this.ocena > 5 && this.ocena <= 10) {
            return true;
        } else {
            return false;
        }
    }
    public void stampaj() {
            System.out.println(predmet + " - " + ocena);
            System.out.println("Student " + this.student + ", " + this.brojIndeksa);
            System.out.println("Profesor: " + profesor);
        }

}
