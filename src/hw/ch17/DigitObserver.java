package hw.ch17;

//구체적인 관찰자
public class DigitObserver implements Observer {  
    @Override
    public void update(NumberGenerator generator) {  //통지받는 메소드(관찰대상이 인자로 들어옴)
        System.out.println("DigitObserver:" + generator.getNumber());
        try {
            Thread.sleep(100);  //0.1초 대기
        } catch (InterruptedException e) {
        }
    }
}
