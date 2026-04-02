package practice.ch05;

// enum을 이용한 싱글톤 패턴
public enum Singleton2 {
    INSTANCE; // 상수: Singleton2 타입 객체가 생성되어 저장됨
    //singleton이 자동으로 적용되는 방법...?


    // 필요한 메소드들을 정의할 수 있음
    public void hello() {
        System.out.println("싱글톤 객체의 hello메소드가 호출되었습니다.");
    }


    
}
