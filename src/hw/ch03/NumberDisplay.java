package hw.ch03;


public class NumberDisplay extends AbstractDisplay{ 
    private int number; // 표시해야 하는 숫자 
    

    // 생성자 
    public NumberDisplay(int number, int repeatCount) {
        super(repeatCount); // 지정된 반복 횟수로 초기화            
        this.number = number;
    }

    @Override
    public void open() {
        // 시작 문자열 "<<"를 표시한다 
        System.out.println("<<Number>>");
    }

    @Override
    public void print() {
        System.out.println(number);
    }

    @Override
    public void close() {
        // 종료 문자열 ">>"를 표시한다 
        System.out.println("<<Number>");
    }

   
    
}
