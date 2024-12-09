package chain_of_responsibility_pattern.logger;

public class ErrorLogger extends Logger {
    public ErrorLogger(Logger logger) {
        super(logger);
    }

    @Override
    public void log(Level level, String message) {
        if(level == Level.Error){
            System.out.println(message);
        }else{
            super.log(level, message);
        }
    }
}
