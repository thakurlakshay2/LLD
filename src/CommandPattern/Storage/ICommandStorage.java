package CommandPattern.Storage;

import CommandPattern.Model.ICommand;

public interface ICommandStorage {

    void addCommand(ICommand command);

    ICommand removeCommand();

    boolean isEmpty();

    ICommand redoCommand();

}
