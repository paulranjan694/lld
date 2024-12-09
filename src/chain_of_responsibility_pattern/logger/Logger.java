package chain_of_responsibility_pattern.logger;

public abstract class Logger {
    Logger nextLoggerChain = null;
    
    Logger(Logger nextloggerchain){
        this.nextLoggerChain = nextloggerchain;
    }


    public void log(Level level, String message){
        if(nextLoggerChain != null){
            nextLoggerChain.log(level, message);
        }
    }

}
