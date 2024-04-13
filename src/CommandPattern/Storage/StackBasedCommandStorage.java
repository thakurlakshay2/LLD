package CommandPattern.Storage;

import CommandPattern.Model.ICommand;

import java.util.Stack;

public class StackBasedCommandStorage implements ICommandStorage {
    Stack<ICommand> undoCommandStorage;
    Stack<ICommand> redoCommandStorage;

    public StackBasedCommandStorage() {
        this.undoCommandStorage = new Stack<>();
        this.redoCommandStorage=new Stack<>();
    }

    @Override
    public void addCommand(ICommand command) {
        undoCommandStorage.add(command);
    }

    @Override
    public ICommand removeCommand() {
        if(undoCommandStorage.isEmpty()){
            return null;
        }
        ICommand undoCommand=undoCommandStorage.pop();
        redoCommandStorage.push(undoCommand);
        return undoCommand;
    }

    @Override
    public boolean isEmpty() {
        return undoCommandStorage.isEmpty();
    }

    @Override
    public ICommand redoCommand() {
        return redoCommandStorage.pop();
    }
}
