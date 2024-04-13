package CommandPattern;

import CommandPattern.Model.AirConditioner;
import CommandPattern.Model.ICommand;
import CommandPattern.Model.RemoteControl;
import CommandPattern.Model.TurnOnAcCommand;
import CommandPattern.Storage.ICommandStorage;
import CommandPattern.Storage.StackBasedCommandStorage;

public class Main {
//CLIENT -> INVOKER -> COMMAND -> RECEIVER


    public static void main(String[] args) {
        //for undo and redo  functionality
        ICommandStorage commandStorage=new StackBasedCommandStorage();
        AirConditioner ac=new AirConditioner();

        RemoteControl rc=new RemoteControl(commandStorage);

        ICommand turnOnAc=new TurnOnAcCommand(ac);
        rc.setCommand(turnOnAc);
        rc.pressButton();

    }

}
