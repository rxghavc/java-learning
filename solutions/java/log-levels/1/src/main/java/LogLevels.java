public class LogLevels {
    
    public static String message(String logLine) {
        int indexofcolon = logLine.indexOf(":");
        logLine = logLine.substring(indexofcolon + 1);
        return logLine.trim();
    }

    public static String logLevel(String logLine) {
        int indexofopenbrack = logLine.indexOf("[");
        int indexofclosebrack = logLine.indexOf("]");
        String level = logLine.substring(indexofopenbrack + 1, indexofclosebrack);
        return level.trim().toLowerCase();
    }

    public static String reformat(String logLine) {
        return message(logLine) + " " + "(" + logLevel(logLine) + ")";
    }
}
