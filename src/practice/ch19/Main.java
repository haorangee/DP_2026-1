package practice.ch19;

public class Main {
    public static void main(String[] args) {

        // 메인이 하는 일 2개 -> UI생성, 시계

        // UI 프레임 생성
        SafeFrame frame = new SafeFrame("금고 경비 시스템");

        // 시계
        while (true) { //무한루프
            for (int hour = 0; hour < 24; hour++) {
                frame.setClock(hour);   // 시간 설정 
                try {
                    Thread.sleep(1000); // 1초마다 시간 변경(신호주고 1초쉬는거 반복) -> 이거 시험 나올듯
                } catch (InterruptedException e) {
                }
            }
        }
        
    }
}
