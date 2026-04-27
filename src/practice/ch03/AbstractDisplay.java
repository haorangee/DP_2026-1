package practice.ch03;

public interface AbstractDisplay {
    public abstract void open();
    public abstract void print();
    public abstract void close();

    //템플릿 메소드
    default void display() {  
        open();
        for (int i = 0; i < 5; i++) {
            print();
        }

        close();
    }
}
