package ch21.A1;

public class Main {
    public static void main(String[] args) {

        // 클래스 이름까지 같이 줌
        Printable p = new PrinterProxy("Alice", "Printer");


        System.out.println("이름은 현재 " + p.getPrinterName() + "입니다.");
        p.setPrinterName("Bob");
        System.out.println("이름은 현재 " + p.getPrinterName() + "입니다.");
        p.print("Hello, world.");
    }
}
