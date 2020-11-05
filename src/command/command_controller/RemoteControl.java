package command.command_controller;

import command.interfaces.Command;
import command.interfaces.CommandController;

/*
 * Author : Vijay Sharma 05-11-2020
 */
public class RemoteControl implements CommandController {

    private Command command;

    @Override
    public void setCommand(Command command) {
        this.command = command;
    }

    @Override
    public void press() {

        if(command == null) {
            System.out.println("Command not set.");
            return;
        }

        command.execute();
    }

    @Override
    public void undo() {
        command.undo();
    }
}
