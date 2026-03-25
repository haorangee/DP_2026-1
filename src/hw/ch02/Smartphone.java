package hw.ch02;

public class Smartphone {
    private Charger charger; //타겟 인터페이스를 참조하는 필드

    public Smartphone(Charger charger) {
        this.charger = charger;
    }

    public void charge() {
        int voltage = charger.charge(); //타겟 인터페이스의 메소드를 호출하여 충전
        System.out.println("스마트폰이 " + voltage + "V에서 충전됩니다.");
    }
}
