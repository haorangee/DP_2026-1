package hw.ch03;

public abstract class AbstractDisplay {

    private int repeatCount;
    public AbstractDisplay() {
        this.repeatCount = 5; // 기본 반복 횟수는 5로 설정
    }


    //원하는 반복 횟수
    public AbstractDisplay(int repeatCount) {
        this.repeatCount = repeatCount;
    }
    public abstract void open();
    public abstract void print();
    public abstract void close();

    //Template Method: display()는 open(), print(), close() 메소드를 호출하여 전체 표시 과정을 정의한다
    public final void display() {
        open();
        for (int i = 0; i < repeatCount; i++) {
            print();
        }
        close();
    }
}
 