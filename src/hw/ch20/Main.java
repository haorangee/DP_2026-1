package hw.ch20;


public class Main {

    // ANSI 색상 코드 (문자열에서 ESC 넣기 -> \033 또는 \u001b)
    static final String RED = "\033[31m";
    static final String GREEN = "\033[32m";
    static final String YELLOW = "\033[33m";
    static final String BLUE = "\033[34m";
    static final String MAGENTA = "\033[35m";
    static final String CYAN = "\033[36m";
    static final String RESET = "\033[0m";


    public static void main(String[] args) {

        System.out.println("이름: 이하늘, 학번: 20220934");

        if (args.length == 0) {
            System.out.println("Usage: java Main digits");
            System.out.println("Example: java Main 1212123");
            System.exit(0);
        }

        BigString bs = new BigString(args[0]);
        String[] colors = new String[args[0].length()];
        String[] palette = {RED, BLUE, GREEN, MAGENTA, CYAN, YELLOW, BLUE};
        for (int i = 0; i < args[0].length(); i++) {
            colors[i] = palette[i % palette.length];
        }
        bs.print(colors);
    }
}
