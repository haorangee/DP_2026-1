package hw.ch19;

public class Main {
    public static void main(String[] args) {

        System.out.println("학번:20220934 , 이름: 이하늘");
        SafeFrame frame = new SafeFrame("State Sample");
        while (true) {
            for (int hour = 0; hour < 24; hour++) {
                frame.setClock(hour);   // 시간 설정 
                try {
                    Thread.sleep(1500);
                } catch (InterruptedException e) {
                }
            }
        }
    }
}
