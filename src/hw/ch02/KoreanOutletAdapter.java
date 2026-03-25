package hw.ch02;

public class KoreanOutletAdapter implements Charger { //어댑터 역할, 타겟 인터페이스 Charger를 구현
    private KoreanOutlet koreanOutlet; //어댑티 역할

    public KoreanOutletAdapter(KoreanOutlet koreanOutlet) {
        this.koreanOutlet = koreanOutlet;
    }

    @Override
    public int charge() {
        //어댑티 역할이 어댑티에게 위임
        //KoreanOutlet의 provide() 메소드를 호출하여 charge()로 변환
        return koreanOutlet.provide();
    }
}
