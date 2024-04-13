package CommandPattern.Model;

public class TurnOfAcCommand implements ICommand {
    AirConditioner ac;

    public TurnOfAcCommand(AirConditioner ac) {
        this.ac = ac;
    }

    @Override
    public void execute() {
        ac.tunrOffAc();
    }

    @Override
    public void undo() {
        ac.turnOnAc();
    }

    @Override
    public void redo() {
        execute();
    }
}
