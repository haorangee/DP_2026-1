package hw.ch10;

import java.util.Random;

public class WinningStrategy implements Strategy {
    private Random random;
    private boolean won;  // = false; (이렇게 초기화 안해줘도 속성은 자동으로 초기화됨. boolean형은 false로 초기화됨)
    private Hand prevHand; //이전에 낸 손 보관

    public WinningStrategy(int seed) {
        random = new Random(seed);
    }

    @Override
    public Hand nextHand() {
        if (!won) { //이전 게임에서 졌다면 ...
            prevHand = Hand.getHand(random.nextInt(3));
        }
        return prevHand;
    }

    @Override
    // Study(win)을 통해 전달 t/f값은 WinningStrategy 클래스 내부의 private boolean won 필드에 저장됨
    // 이 저장된 값은 나중에 nextHand() 메소드가 호출될 때, if(!won) 문장에서 아주 요긴하게 쓰임
    public void study(boolean win) {
        won = win;
    }
}
