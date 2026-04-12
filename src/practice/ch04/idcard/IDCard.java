package practice.ch04.idcard;

//IDCard랑 Product는 다른 패키지에 있기 때문에 import 해줘야 한다.
import practice.ch04.framework.Product; 

public class IDCard extends Product {
    private String owner;
    private int serial;

    //Main이 얘를 호출할려면 누구나 불러올 수 있도록 public으로 만들어야 한다.
    //아무나 이 생성자를 직접 호출 못하도록 (공장을 거쳐 호출하도록) public 안붙임
    IDCard(String owner, int serial) {
        super(owner, serial);

        System.out.println(owner + "의 카드를" + serial + "번으로 만듭니다.");
        this.owner = owner;
        this.serial = serial;
    }

    @Override
    public void use() {
        System.out.println(this.toString() + "을 사용합니다.");
    }

    @Override
    //toString() : 이 객체의 문자열이 필요할 때 자동으로 호출되는 메소드
    //Object 클래스의 toString() 메소드를 오버라이드해서 IDCard 객체의 문자열 표현을 정의한다.
    //Object 클래스는 자바의 모든 클래스가 암묵적으로 상속받는 최상위 클래스이므로, 모든 객체는 toString() 메소드를 가지고 있다.
    public String toString() {
        return "[IDCard:" + owner + "(" + serial + ")]";
    }

    public String getOwner() {
        return owner;
    }

    public int getSerial() {
        return serial;
    }
}
