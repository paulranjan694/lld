package chain_of_responsibility_pattern.logger;

public class InfoLogger extends Logger {
    public InfoLogger(Logger logger) {
        super(logger);
    }

    @Override
    public void log(Level level, String message) {
        if(level == Level.Info){
            System.out.println(message);
        }else{
            super.log(level, message);
        }
    }
}
