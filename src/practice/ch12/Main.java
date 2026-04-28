package practice.ch12;

public class Main {
    public static void main(String[] args) {
        Display d1 = new StringDisplay("Hello, world.");  // 중심 객체
        d1.show();

        Display d2 = new SideBorder(d1, '*');  // 첫번째 장식 (d1을 SideBorder로 감쌈)
        d2.show();

        Display d3 = new FullBorder(d1); // d1을 완전한 테두리로 장식
        d3.show();

        Display d4 = new FullBorder(d2);
        d4.show();

    }
}
