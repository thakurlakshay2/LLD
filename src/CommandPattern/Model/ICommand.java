package CommandPattern.Model;


//COMMAND
public interface ICommand {

    public  void execute();

    public void undo();

    public void redo();
}
