package practice.ch03;

public class Main {
    public static void main(String[] args) {
        //CharDisplay d1 = new CharDisplay('H'); //'H'는 char, "H"는 String(문자열)
        AbstractDisplay d1 = new CharDisplay('H');  //자식 클래스의 인스턴스를 부모 클래스 타입의 변수에 대입할 수 있다. => 다형성
        d1.display();

        //StringDisplay d2 = new StringDisplay("Hello, world.");
        AbstractDisplay d2 = new StringDisplay("Hello, world."); //자식 객체 타입 대신 부모 타입으로 선언해도 동작됨
        d2.display();

        AbstractDisplay d3;
        //부모 타입으로 선언하는게 프로그램이 좀 더 유연해짐
         //d3는 어떤 걸 가르켜도 잘 동작하도록...?
         //추상클래스는 인스턴스 만들 수 x
    }
}
