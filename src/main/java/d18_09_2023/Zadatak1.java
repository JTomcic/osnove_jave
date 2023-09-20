package d18_09_2023;

public class Zadatak1 {
    public static void main(String[] args) {


        VideoPlayer videoPlayer = new VideoPlayer(55, 2, 78, 240);
        videoPlayer.stampaj();

        Control timeControl = new TimeControl(true);
        timeControl.izvrsiAkciju(videoPlayer);
        timeControl.izvrsiAkciju(videoPlayer);
        videoPlayer.stampaj();

        Control audioControl = new AudioControl(true);
        audioControl.izvrsiAkciju(videoPlayer);
        audioControl.izvrsiAkciju(videoPlayer);
        videoPlayer.stampaj();

        Control qualityControl = new QualityOptimizerControl(25);
        Control timeControl1 = new TimeControl(false);
        timeControl1.izvrsiAkciju(videoPlayer);
        qualityControl.izvrsiAkciju(videoPlayer);
        videoPlayer.stampaj();
    }
}
