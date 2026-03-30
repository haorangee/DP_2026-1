package hw.ch03;

public class CharDisplay extends AbstractDisplay {
    private char ch; // 표시해야 하는 문자 

    // 생성자 
    public CharDisplay(char ch) {
        super(); // 기본 반복 횟수 5로 설정
        this.ch = ch;
    }

    //새 생성자 추가(원하는 반복 횟수) 
    //[3-2] 생성자에서 받은 repeatCount로 문자를 반복해서 표시하도록 수정
    public CharDisplay(char ch, int repeatCount) {
        super(repeatCount); // 지정된 반복 횟수로 초기화
        this.ch = ch;
    }
    

    @Override
    public void open() {
        // 시작 문자열 "<<"를 표시한다 
        System.out.print("<<");
    }

    @Override
    public void print() {
        // 필드에 저장해 둔 문자를 1회 표시한다
        System.out.print(ch);
    }

    @Override
    public void close() {
        // 종료 문자열 ">>"를 표시한다 
        System.out.println(">>");
    }
}
