package practice.ch05;

public class Singleton {

    // (3) Singleton 객체를 미리 하나 만들어서 static 변수에 저장해 놓는다. (for 클래스에 속하도록)
    private static Singleton singleton = new Singleton();  //클래스 로드 시 실행됨 (이 때 객체 생성되는 듯)

    // (1) 생성자를 private으로 한다. (생성자 맘대로 만드는거 방지)
    private Singleton() {
        System.out.println("Singleton 객체가 생성됩니다.");
    }
    
    // (2) Singleton 객체를 얻어가는 메소드를 정의한다.
    // Singleton 객체 생성되기 전에 getInstance() 메소드를 호출하기 위해서 Static으로 선언한다. Static을 붙여서 클래스에 속하도록
    public static Singleton getInstance() {
        return singleton; // (4) getInstance() 메소드에서는 static 변수에 저장된 미리 만들어진 Singleton 객체의 주소를 리턴한다.
    }


}
