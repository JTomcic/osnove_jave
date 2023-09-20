package d18_09_2023;

public class TimeControl extends Control{
    private boolean unapred;

    public TimeControl(boolean unapred) {
        this.unapred = unapred;
    }
    @Override
    public void izvrsiAkciju(VideoPlayer videoPlayer) {
        int novoVremeVidea = 0;

        if ( this.unapred == true) {
            novoVremeVidea = videoPlayer.getVremeVidea() + 15;
        } else {
            novoVremeVidea = videoPlayer.getVremeVidea() - 15;
        }

        if (novoVremeVidea <= videoPlayer.getDuzinaVidea() && novoVremeVidea >= 0) {
            videoPlayer.setVremeVidea(novoVremeVidea);
        }
    }
}
