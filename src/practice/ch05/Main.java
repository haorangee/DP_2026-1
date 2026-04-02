package practice.ch05;

public class Main {

    public static void main(String[] args) {
        // Singleton s1 = new Singleton(); //컴파일 에러: Singleton() has private access in Singleton
        Singleton s2 = Singleton.getInstance();
        Singleton s3 = Singleton.getInstance();

        System.out.println("s2: " + s2); //얘네 둘(s2, s3)이 주소가 같으면 같은 객체, 아니면 다른 객체
        System.out.println("s3: " + s3); //실행결과 둘이 주소 다름 -> 다른 객체 2개가 생성됨

        if (s2 == s3) {
            System.out.println("s2와 s3는 같은 Singleton 객체입니다.");
        } else {
            System.out.println("s2와 s3는 다른 Singleton 객체입니다.");
        }

        Singleton2 s4 = Singleton2.INSTANCE; // enum의 상수는 객체이므로, Singleton2.INSTANCE는 Singleton2 타입의 객체 주소를 저장하는 변수
        s4.hello(); 

    }
    
}
