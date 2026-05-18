package hw.ch17;

public class Main {
    public static void main(String[] args) {

        System.out.println("학번:20220934, 이름: 이하늘");

        // 관찰 대상 생성
    
        // 시작은 짝수로 하고, 범위 내에서 난수(짝수)들을 10회 생성하도록 설정
        NumberGenerator generator = new EvenNumberGenerator(0,30);

        // 관찰자 생성
        Observer observer1 = new DigitObserver();
        Observer observer2 = new GraphObserver();
        Observer observer3 = new RangeObserver();

        // 관찰 대상에 관찰자 등록
        generator.addObserver(observer1);
        generator.addObserver(observer2);
        generator.addObserver(observer3);
        

        // 관찰 대상 실행(숫자 생성)
        // 알아서 관찰자 둘한테 통지 감
        generator.execute();
    }
}
