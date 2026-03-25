package practice.ch02.delegation;

public class Main {
    public static void main(String[] args) {
        Print print = new PrintBannerAdapter02("Hello World");
        print.printWeak();
        print.printStrong();

        //원래는 부모 타입이더라도, print에 선언된 메소드만 호출할 수 있음
        //But, Neverthless 너무 호출하고 싶으면, 타입캐스팅(형변환)해서 호출 가능
        // if ()로 안묶어주면, .이 ()보다 우선순위 높아서 형변환 적용X  
        ((PrintBannerAdapter02)print).getYourName();

    }
}
 