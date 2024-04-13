package ChainOfResponsePattern;

public class InfoLogProcessor extends LogProcessor{
    public InfoLogProcessor(LogProcessor nextlogProcessor) {
        super(nextlogProcessor);
    }

    @Override
    public void log(int logLevel, String msg) {
        if(logLevel== INFO){
            System.out.println("INFO: "+msg);
        }
        super.log(logLevel, msg);
    }
}
