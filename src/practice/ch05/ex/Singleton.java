package practice.ch05.ex;

public class Singleton {
    private static Singleton singleton = null;

    private Singleton() {
        System.out.println("인스턴스가 생성되었습니다.");
        slowdown();  // 생성 시간이 오래 걸리도록 함
    }

    public static synchronized Singleton getInstance() {
        if (singleton == null) {  //첫 번째 호출 시에만 인스턴스가 생성됨. 그 이후는 생성되어 있던걸 반환
            singleton = new Singleton();
        }
        return singleton;
    }

    private void slowdown() {
        try {
            Thread.sleep(1000); // CPU를 내놓고 1초간 쉼
        } catch (InterruptedException e) {

        }
    }
}
