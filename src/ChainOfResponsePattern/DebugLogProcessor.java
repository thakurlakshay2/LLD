package ChainOfResponsePattern;

public class DebugLogProcessor extends LogProcessor{

    public DebugLogProcessor(LogProcessor nextlogProcessor) {
        super(nextlogProcessor);
    }
    @Override
    public void log(int logLevel, String msg) {
        if(logLevel== DEBUG){
            System.out.println("DEBUG: "+msg);
        }
        super.log(logLevel, msg);
    }
}
