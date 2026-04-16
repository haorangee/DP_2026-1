package practice.ch10;

import java.util.Random;

public class ProbStrategy implements Strategy {
    private Random random;
    private int prevHandValue = 0; // 직전에 낸 손의 값
    private int currentHandValue = 0;  //이번에 낼 손의 값 (가장 최근에 낸 손의 값)
    private int[][] history = {
        { 1, 1, 1, },
        { 1, 1, 1, },
        { 1, 1, 1, },
    };

    public ProbStrategy(int seed) {
        random = new Random(seed);
    }

    @Override
    //핵심 전략
    public Hand nextHand() {
        int bet = random.nextInt(getSum(currentHandValue));

        int handvalue = 0;
        if (bet < history[currentHandValue][0]) {
            handvalue = 0;
        } else if (bet < history[currentHandValue][0] + history[currentHandValue][1]) {
            handvalue = 1;
        } else {
            handvalue = 2;
        }
        prevHandValue = currentHandValue;
        currentHandValue = handvalue;
        return Hand.getHand(handvalue);
    }

    private int getSum(int handvalue) {  //행의 합을 구한다
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += history[handvalue][i];   //행 번호는 고정, 열 번호는 0,1,2로 바뀐다 -> 그 행의 모든 열을 더한다
        }
        return sum;
    }

    @Override
    public void study(boolean win) {
        if (win) {
            history[prevHandValue][currentHandValue]++;
        } else {
            history[prevHandValue][(currentHandValue + 1) % 3]++;
            history[prevHandValue][(currentHandValue + 2) % 3]++;
        }
    }
}
