package command.command_classes;

import command.receiver_classes.Light;
import command.interfaces.Command;

/*
 * Author : Vijay Sharma 05-11-2020
 */
public class LightOffCommand implements Command {

    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
