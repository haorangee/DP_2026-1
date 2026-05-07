package practice.ch17;

// 관찰자 
// 숫자만큼 별표 찍는애
public class GraphObserver implements Observer {
    @Override
    public void update(NumberGenerator generator) { // 통지받는 메소드
        System.out.print("GraphObserver:");
        int count = generator.getNumber();  
        for (int i = 0; i < count; i++) {
            System.out.print("*");
        }
        System.out.println(""); // 줄바꿈
        try {
            Thread.sleep(100); //0.1초 대기
        } catch (InterruptedException e) {
        }
    }
}
