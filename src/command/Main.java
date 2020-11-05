package command;
import command.command_classes.*;
import command.command_controller.RemoteControl;
import command.interfaces.CommandController;
import command.receiver_classes.Light;
import command.receiver_classes.StereoMusic;

/*
 * Author : Vijay Sharma 05-11-2020
 */

/*
        Command Pattern : Encapsulate Request/Commands as object.

        It stores commands/requests in a queue and provide undoable operations also.
        Separates the Invoker and the object(command) in action.
        Invoker doesn't need to know the command implementation and the command type it is just to perform actions.

        in this example we are creating an Home automation system

        Receivers : Light, StereoMusic
        Commands : lightOn, lightOf, musicOn, musicOff, musicVolumeUp, musicVolumeDown
                in extension we can provide Undo command to rollback the last executed command;

        Invoker : Remote control
 */

public class Main {

    public static void main(String[] args) {
    
        CommandController remote = new RemoteControl();

        Light light = new Light();
        StereoMusic music = new StereoMusic();

        LightOnCommand lightOn = new LightOnCommand(light);
        LightOffCommand lightOff = new LightOffCommand(light);
        StereoMusicOnCommand musicOn = new StereoMusicOnCommand(music);
        StereoMusicOffCommand musicOff = new StereoMusicOffCommand(music);
        StereoMusicVolumeUpCommand volumeUp = new StereoMusicVolumeUpCommand(music);
        StereoMusicVolumeDownCommand volumeDown = new StereoMusicVolumeDownCommand(music);

        remote.setCommand(lightOn);
        remote.press();
        remote.setCommand(musicOn);
        remote.press();
        remote.setCommand(volumeDown);
        remote.press();
        remote.setCommand(volumeUp);
        remote.press();
        remote.undo();
        remote.setCommand(lightOff);
        remote.press();
        remote.setCommand(musicOff);
        remote.press();
    }
}
