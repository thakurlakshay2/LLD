package CommandPattern.Model;

import CommandPattern.Storage.ICommandStorage;

import java.util.Stack;

//INVOKER
public class RemoteControl {
    ICommandStorage commandHistory;
    private   ICommand command;

    public RemoteControl(ICommandStorage storage) {
        this.command=null;
        this.commandHistory=storage;
    }

    public void setCommand(ICommand command){
        this.command=command;
        commandHistory.addCommand(command);
    }
    public void pressButton(){
        command.execute();
    }

    public void undo(){
        if(!commandHistory.isEmpty()){
            ICommand lastCommand=commandHistory.removeCommand();
            lastCommand.undo();
        }
    }

    public void redo(){
        ICommand redoCommand=commandHistory.redoCommand();
        redoCommand.undo();
    }
}
