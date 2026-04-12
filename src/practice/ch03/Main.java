package practice.ch03;

public class Main {
    public static void main(String[] args) {
        AbstractDisplay d1 = new CharDisplay('H');
        d1.display();

        AbstractDisplay d2 = new StringDisplay("Hello, world.");
        d2.display();

        AbstractDisplay d3;
    }
}
