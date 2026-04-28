package ch12.Sample;

public class Main {
    public static void main(String[] args) {
        Display b1 = new StringDisplay("Hello, world.");  // 중심 객체

        Display b2 = new SideBorder(b1, '#');  // 첫번째 장식 (b1을 SideBorder로 감쌈)
        Display b3 = new FullBorder(b2); // 두번째 장식

        // 장식한 결과물이 또 장식할 대상이 될 수 있음
        b1.show();
        b2.show();
        b3.show();
        Display b4 =
                    new SideBorder(
                        new FullBorder(
                            new FullBorder(
                                new SideBorder(
                                    new FullBorder(
                                        new StringDisplay("Hello, world.")
                                    ),
                                    '*'
                                )
                            )
                        ),
                        '/'
                    );
        b4.show();
    }
}
