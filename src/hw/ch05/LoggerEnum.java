package hw.ch05;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

enum LoggerEnum {
    INSTANCE;

    private static final Map<String, LoggerEnum> map = new HashMap<>();
    static {
        Arrays.stream(values()).forEach(v -> map.put(v.name(), v));
    }

    private final StringBuilder logBuffer = new StringBuilder();

    public static LoggerEnum getInstance(String name) {
        return map.get(name);
    }

    public void log(String message) {
        logBuffer.append("[").append(System.currentTimeMillis()).append("] ")
                 .append(message).append(System.lineSeparator());

        System.out.println("[LoggerEnum] " + message);
    }

    public String getLog() {
        return logBuffer.toString();
    }
}
