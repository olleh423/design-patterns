package command.command_classes;

import command.receiver_classes.StereoMusic;
import command.interfaces.Command;

/*
 * Author : Vijay Sharma 05-11-2020
 */
public class StereoMusicOffCommand  implements Command {

    private StereoMusic music;

    public StereoMusicOffCommand(StereoMusic music) {
        this.music = music;
    }

    @Override
    public void execute() {
        music.off();
    }

    @Override
    public void undo() {
        music.on();
    }
}
