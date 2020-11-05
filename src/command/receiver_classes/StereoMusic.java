package command.receiver_classes;

/*
 * Author : Vijay Sharma 05-11-2020
 */
public class StereoMusic {

    private static final int DEFAULT_VOLUME = 10;

    private boolean isOn;
    private int volume;

    public StereoMusic() {
        this.isOn = false;
        this.volume = DEFAULT_VOLUME;
    }

    public void on() {
        System.out.println("Music on.");
    }

    public void off() {
        System.out.println("Music off.");
    }

    public void volumeUp() {
        if(volume == 40)
            System.out.println("Volume full.");
        else
            System.out.println("Volume : " + (++volume));
    }

    public void volumeDown() {
        if(volume == 0)
            System.out.println("Muted");
        else
            System.out.println("Volume : " + (--volume));
    }
}
