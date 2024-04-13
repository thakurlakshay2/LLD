package ChainOfResponsePattern;

public class Main {

    public static void main(String[] args) {
        LogProcessor logProcessor=new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));
        logProcessor.log(LogProcessor.ERROR,"ERR");
        logProcessor.log(LogProcessor.DEBUG,"DEB");
        logProcessor.log(LogProcessor.INFO,"INP");
    }
}
