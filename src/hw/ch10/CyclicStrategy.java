package hw.ch10;

// 가위 -> 바위 -> 보 순서로 손을 순환하며 선택하는 전략
public class CyclicStrategy implements Strategy {
    private int index = 0;
    private static final Hand[] ORDER = {
        Hand.SCISSORS,
        Hand.ROCK,
        Hand.PAPER
    };

    @Override
    public Hand nextHand() {
        Hand hand = ORDER[index];
        index = (index + 1) % ORDER.length;
        return hand;
    }

    @Override
    public void study(boolean win) {
        // 이 전략은 학습하지 않음
    }
}
