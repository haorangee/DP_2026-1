package hw.ch05;

//필요할 때만 생성됨 (처음 호출 -> 객체 생성, 이후 호출 -> 기존 객체 반환)
class LoggerSynchronizedLazy {
    private static LoggerSynchronizedLazy instance;
    
    private final StringBuilder logBuffer; //로그 메시지를 저장하는 버퍼

    private LoggerSynchronizedLazy() {
        System.out.println("LoggerSynchronizedLazy 인스턴스를 생성했습니다");
        logBuffer = new StringBuilder();

    }

    public static synchronized LoggerSynchronizedLazy getInstance() {
        if (instance == null) {
            instance = new LoggerSynchronizedLazy(); //여기서 처음 호출될 때만 객체 생성
            System.out.println("LoggerSynchronizedLazy 인스턴스가 생성되었습니다.");
        }
        return instance;
    }

    public void log(String message) {
        logBuffer.append("[").append(System.currentTimeMillis()).append("] ")
        .append(message).append("\n");
        System.out.println("[LoggerSynchronizedLazy] " + message);
    }

    public String getLog() {
        return logBuffer.toString();
    }
}