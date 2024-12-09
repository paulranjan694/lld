package chain_of_responsibility_pattern.logger;

public class DebugLogger extends Logger {

    public DebugLogger(Logger logger) {
        super(logger);
    }

    @Override
    public void log(Level level, String message) {
        if(level == Level.Debug){
            System.out.println(message);
        }else{
            super.log(level, message);
        }
    }
}
