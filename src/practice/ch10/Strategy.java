package practice.ch10;

public interface Strategy {

    //Strategy가 가져야 할 전략(API)
    public abstract Hand nextHand();  //다음에 낼 손을 얻는다
    public abstract void study(boolean win); //다음 승부에 사용될 전략 준비 메소드
}
