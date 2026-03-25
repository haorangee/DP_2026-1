package practice.ch03;

public abstract class AbstractDisplay {
    // open, print, close는 하위 클래스에 구현을 맡기는 추상 메소드 
    protected abstract void open();
    public abstract void print();
    public abstract void close();

    // display는 AbstractDisplay에서 구현하는 메소드 
    // 큰 틀을 제공하는 메소드 => 템플릿 메소드
    public final void display() {  //final이 붙은 메소드는 하위 클래스에서 오버라이드 할 수 없음(자식들이 큰 흐름을 변경하지 못하도록 함)
        open();
        for (int i = 0; i < 5; i++) {
            print();
        }

        close();
    }
}
