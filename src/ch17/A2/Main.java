package ch17.A2;

public class Main {
    public static void main(String[] args) {
        NumberGenerator generator = new RandomNumberGenerator();

        Observer observer1 = new DigitObserver();
        Observer observer2 = new GraphObserver();
        Observer observer3 = new FrameObserver(); // 이거 하나 더 추가해줌

        generator.addObserver(observer1);
        generator.addObserver(observer2);
        generator.addObserver(observer3);

        generator.execute();
    }
}
