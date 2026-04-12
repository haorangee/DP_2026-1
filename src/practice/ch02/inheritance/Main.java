package practice.ch02.inheritance;

public class Main {
    public static void main(String[] args) {
        Banner banner = new Banner("Hello World");
        
        banner.showWithParen();
        banner.showWithAster();

        //어댑터 이용
        System.out.println("===어댑터 이용===");

        //Print 인터페이스를 이용해서 Banner 클래스의 기능을 사용하고 싶다.
        Print print = new PrintBannerAdapter01("Hello World");
        print.printWeak();  
        print.printStrong();
    }
}





