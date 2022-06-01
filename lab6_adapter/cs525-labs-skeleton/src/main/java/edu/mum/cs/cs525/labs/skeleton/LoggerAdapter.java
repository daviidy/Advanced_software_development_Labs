package edu.mum.cs.cs525.labs.skeleton;

import org.apache.logging.log4j.LogManager;

public class LoggerAdapter implements Logger{
    private static final org.apache.logging.log4j.Logger logger = LogManager.getLogger(LoggerAdapter.class);

    @Override
    public void log(LogLevel logLevel, String message) {
        switch (logLevel){
            case INFO:
                logger.info(message);
            case DEBUG:
                logger.debug(message);
            case ERROR:
                logger.error(message);
            case FATAL:
                logger.fatal(message);
            case TRACE:
                logger.trace(message);
            case WARNING:
                logger.warn(message);
        }
    }
}
