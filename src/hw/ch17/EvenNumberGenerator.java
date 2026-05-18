package hw.ch17;

public class EvenNumberGenerator extends NumberGenerator {
    private int number;	// 현재 수 
    private int end;		// 종료값(이 값은 포함하지 않는다)

    public EvenNumberGenerator(int start, int end) {
    
        this.number = start; // 시작값은 짝수
        this.end = end;
    }

    // 수를 취득한다 
    @Override
    public int getNumber() {
        return number;
    }

    // 수를 생성한다 (증가값은 2로 고정)
    @Override
    public void execute() {
        while (number < end) {
            notifyObservers();
            number += 2;
        }
    }
    
}
