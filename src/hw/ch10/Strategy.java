package hw.ch10;

public interface Strategy {

    //Strategy가 가져야 할 전략(API)
    public abstract Hand nextHand();  //다음에 낼 손을 얻는다, 
    // 리턴 타입이 Hand인 이유는 다음에 낼 손이 가위, 바위, 보 중 하나이기 때문이다. (Hand 클래스에서 가위, 바위, 보 객체를 만들어서 관리한다.)
    public abstract void study(boolean win); //다음 승부에 사용될 전략 준비 메소드
}
