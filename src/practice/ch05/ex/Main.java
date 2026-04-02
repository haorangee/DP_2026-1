package practice.ch05.ex;


//thread 역할하는 클래스 먼저 만들기. 이 클래스를 Thread라는 클래스를 상속받도록 만들기
public class Main extends Thread {
    public static void main(String[] args) {

        //스레드를 3개 만듦
        Thread a = new Main("Thread A"); //Thread 객체 a 생성
        Thread b = new Main("Thread B"); //Thread 객체 b 생성
        Thread c = new Main("Thread C"); //Thread 객체 c 생성

        //스레드를 시작함 (스레드가 각자 동작함)
        a.start(); 
        b.start(); 
        c.start();

    }

    @Override
    //Thread run() 메서드를 오버라이드함.
    //이 스레드가 실행할 코드가 담겨있음
    public void run() { //.strat() 메서드가 호출되면 run() 메서드가 실행됨
        
        Singleton s = Singleton.getInstance(); // 싱글톤 인스턴스를 얻음
        System.out.println(getName() + ": " + s);  // 인스턴스의 참조값(주소)을 출력

    }

    public Main(String name) {
        super(name); // Thread 클래스의 생성자 호출하여 스레드 이름 설정
        
    }
}
