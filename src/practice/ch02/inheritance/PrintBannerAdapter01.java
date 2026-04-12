package practice.ch02.inheritance;

//어댑터 
//어댑터는 target 인터페이스를 구현하는 클래스이다.
//Banner를 상속, Print 인페를 구현
public class PrintBannerAdapter01 extends Banner implements Print {
    // (1) 인자가 없는 생성자는 자동으로 만들어짐
    // (2) 생성자는 상속되지 않는다

    public PrintBannerAdapter01(String string) {  //생성자는 String을 받는다.
        super(string);  //super: 부모 생성자를 호출함
    }

   
    @Override
    public void printWeak() { //Banner 클래스 상속받아서 showWithParen() 사용 가능
        showWithParen();   //객체.메소드() 형태로 호출
                           //객체 이름이 없으면 this.메소드() 형태로 호출 (내가 제공하는 메소드 중 하나 호출)
    }

    @Override
    public void printStrong() {
        showWithAster();
    }
    
}
