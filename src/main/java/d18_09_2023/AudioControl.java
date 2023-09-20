package d18_09_2023;

public class AudioControl extends Control{
    private boolean pojacajZvuk;

    public AudioControl(boolean pojacajZvuk) {
        this.pojacajZvuk = pojacajZvuk;
    }

    public boolean getPojacajZvuk() {
        return pojacajZvuk;
    }

    public void setPojacajZvuk(boolean pojacajZvuk) {
        this.pojacajZvuk = pojacajZvuk;
    }
    @Override
    public void izvrsiAkciju(VideoPlayer videoPlayer){
        if (this.pojacajZvuk == true && (videoPlayer.getJacinaZvuka() + 1) <= 100) {
            videoPlayer.setJacinaZvuka(videoPlayer.getJacinaZvuka() + 1);
        }
        if (this.pojacajZvuk == false && (videoPlayer.getJacinaZvuka() - 1) >= 0) {
            videoPlayer.setJacinaZvuka(videoPlayer.getJacinaZvuka() - 1);
        }
    }
}
