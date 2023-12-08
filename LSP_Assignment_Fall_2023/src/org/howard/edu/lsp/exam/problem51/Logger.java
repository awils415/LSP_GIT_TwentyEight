package org.howard.edu.lsp.exam.problem51;

public class Logger {
	private static Logger _instance;
    private String log;

    private Logger() {
        this.log = "";
    }
    
    public static Logger getInstance() {
    	if (_instance == null) {
            synchronized (Logger.class) {
                if (_instance == null) {
                    _instance = new Logger();
                }
            }
        }
        return _instance;
    }

    public void logMessage(String message) {
        this.log += message + "\n";
    }

    public void displayLog() {
        System.out.println("Log:\n" + log);
    }
    
    public static void main(String[] args) {
        // Get the singleton instance
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();
        System.out.println("Are both loggers of the same reference? " + (logger1 == logger2));

        // Set the log levels and log messages
        logger1.logMessage("trace level log message");
        logger1.logMessage("debug level log message");
        logger1.logMessage("info level log message");
        logger2.logMessage("warn level log message");
        logger2.logMessage("error level log message");

        // Display all logged messages
        System.out.println("Displaying all logged messages...");
        logger1.displayLog();
    }
}
