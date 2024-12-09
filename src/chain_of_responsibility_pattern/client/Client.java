package chain_of_responsibility_pattern.client;

import chain_of_responsibility_pattern.logger.*;

public class Client {
    public static void main(String[] args) {
        Logger logger = new InfoLogger(new ErrorLogger(new DebugLogger(null)));
        logger.log(Level.Debug,"In debug level");
        logger.log(Level.Info,"In info level");
        logger.log(Level.Error,"In error level");
    }
}
