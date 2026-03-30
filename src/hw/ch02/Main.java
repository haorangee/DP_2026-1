package hw.ch02;

public class Main {
    public static void main(String[] args) {
        System.out.println("학번: 20220934, 이름: 이하늘");
        
        //KoreanOutletAdapter 생성
        KoreanOutlet koreanOutlet = new KoreanOutlet();
        Charger charger = new KoreanOutletAdapter(koreanOutlet);

        //Smartphone에 전달
        Smartphone myphone = new Smartphone(charger);

        //charge() 메소드 호출
        myphone.charge();
    }
}
 