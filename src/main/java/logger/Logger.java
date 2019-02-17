package logger;

public class Logger {
    private static Logger instance;

    public Logger() {
    }

    public static Logger getInstance() {
        if (instance == null) {
            synchronized (Logger.class) {
                if (instance == null) {
                    return new Logger();
                }
            }
        }
        return instance;
    }

    public void log(String string) {
        System.out.println(string);
    }
}
