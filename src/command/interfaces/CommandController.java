package command.interfaces;

public interface CommandController {
    void setCommand(Command command);
    void press();
    void undo();
}
