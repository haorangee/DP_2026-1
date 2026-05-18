package hw.ch17;

public class RangeObserver implements Observer {
    @Override
    public void update(NumberGenerator generator) {
        System.out.print("RangeObserver:");
        int number = generator.getNumber();
        if (number < 10) {
            System.out.println("[Low]");
        } else if (number < 20) {
            System.out.println("[Mid]");
        } else {
            System.out.println("[High]");
        }
        try {
            Thread.sleep(100);  //0.1초 대기
        } catch (InterruptedException e) {
        }
    }
    
}
