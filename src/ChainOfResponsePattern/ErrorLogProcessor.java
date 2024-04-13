package ChainOfResponsePattern;

public class ErrorLogProcessor extends LogProcessor{

    public ErrorLogProcessor(LogProcessor logProcessor) {
        super(logProcessor);
    }

    //    public ErrorLogProcessor(LogProcessor nextlogProcessor) {
//        super(nextlogProcessor);
//    }
    @Override
    public void log(int logLevel, String msg) {
        if(logLevel== ERROR){
            System.out.println("ERROR: "+msg);
        }
        super.log(logLevel, msg);
    }

}
