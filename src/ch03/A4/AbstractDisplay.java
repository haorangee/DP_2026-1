package ch03.A4;

public interface AbstractDisplay {
    public void open();
    public void print();
    public void close();

    public default void display() {  //이 메소드는 defalt 메소드로 구현이 제공됨. 인터페이스에서 구현이 제공되는 메소드는 default 메소드라고 불림
        open();
        for (int i = 0; i < 5; i++) {
            print();
        }
        close();
    }
}
 