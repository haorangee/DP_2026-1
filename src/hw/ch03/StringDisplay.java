package hw.ch03;

public class StringDisplay extends AbstractDisplay {
    private String string;  // 표시해야 하는 문자열 
    private int width;      // 문자열의 길이

    // 생성자 
    public StringDisplay(String string) {
        super(); // 기본 반복 횟수 5로 설정
        this.string = string;
        this.width = string.length();
    }

    //새 생성자 추가(원하는 반복 횟수)
    // [3-2] 생성자에서 받은 repeatCount로 문자열을 반복해서 표시하도록 수정
    public StringDisplay(String string, int repeatCount) {
        super(repeatCount); // 지정된 반복 횟수로 초기화
        this.string = string;
        this.width = string.length();
    }
        

    @Override
    public void open() {
        printLine();
    }

    @Override
    public void print() {
        System.out.println("|" + string + "|");
    }

    @Override
    public void close() {
        printLine();
    }

    //  open과 close에서 호출되어 "+----+" 문자열을 표시하는 메소드
    private void printLine() {
        System.out.print("+");
        for (int i = 0; i < width; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }
}
