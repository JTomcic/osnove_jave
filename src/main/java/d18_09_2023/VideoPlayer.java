package d18_09_2023;

public class VideoPlayer {
    protected int duzinaVidea;
    protected int vremeVidea;
    protected int jacinaZvuka;
    protected int kvalitetVidea;
    public VideoPlayer(int duzinaVidea, int vremeVidea, int jacinaZvuka, int kvalitetVidea) {
        this.duzinaVidea = duzinaVidea;
        this.vremeVidea = vremeVidea;
        this.jacinaZvuka = jacinaZvuka;
        this.kvalitetVidea = kvalitetVidea;

    }
    public int getDuzinaVidea() {
        return duzinaVidea;
    }

    public void setDuzinaVidea(int duzinaVidea) {
        this.duzinaVidea = duzinaVidea;
    }

    public int getVremeVidea() {
        return vremeVidea;
    }

    public void setVremeVidea(int vremeVidea) {
        this.vremeVidea = vremeVidea;
    }

    public int getJacinaZvuka() {
        return jacinaZvuka;
    }

    public void setJacinaZvuka(int jacinaZvuka) {
        this.jacinaZvuka = jacinaZvuka;
    }

    public int getKvalitetVidea() {
        return kvalitetVidea;
    }

    public void setKvalitetVidea(int kvalitetVidea) {
        this.kvalitetVidea = kvalitetVidea;
    }
    public void stampaj() {
        System.out.println("Duzina videa: " + this.duzinaVidea);
        System.out.println("Trenutno vreme videa: " + this.vremeVidea);
        System.out.println("Jacina zvuka: " + this.jacinaZvuka);
        System.out.println("Kvalitet videa: " + this.kvalitetVidea);
    }
}
