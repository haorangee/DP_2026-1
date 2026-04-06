package hw.ch05;

enum LoggerEnum {
    INSTANCE;

    private final StringBuilder logBuffer = new StringBuilder();

    public void log(String message) {
        logBuffer.append(message).append(System.lineSeparator());
    }

    public String getLog() {
        return logBuffer.toString();
    }
}
