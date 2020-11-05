package command.command_classes;

import command.receiver_classes.Light;
import command.interfaces.Command;

/*
 * Author : Vijay Sharma 05-11-2020
 */
public class LightOnCommand implements Command {

    private Light light;
    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
