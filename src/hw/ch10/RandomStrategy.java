package hw.ch10;

import java.util.Random;

public class RandomStrategy implements Strategy {
    private Random random;

    public RandomStrategy(int seed) {
        random = new Random(seed);
    }

    @Override
    public void study(boolean win) {
    }

    // 랜덤하게 손을 내놓는 전략
    @Override
    public Hand nextHand() {
        return Hand.getHand(random.nextInt(3));
    }
}
