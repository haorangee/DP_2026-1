package hw.ch03;

public class Main {
    public static void main(String[] args) {
        
        System.out.println("학번: 20220934, 이름: 이하늘");

        // [3-1] 기존 display 동작 확인
        AbstractDisplay d1 = new CharDisplay('H');
        AbstractDisplay d2 = new StringDisplay("Hello");

        d1.display();  // 기본 동작(display): 5회 반복
        d2.display();

        
        //[3-2] Step1 테스트: 반복 횟수 제어

        AbstractDisplay d3 = new CharDisplay('X', 3);
        AbstractDisplay d4 = new StringDisplay("Test", 7);

        d3.display();
        d4.display();

        //[3-3] Step2 테스트: 새로운 Display
        AbstractDisplay num = new NumberDisplay(42, 4);
        num.display();
    }
}
