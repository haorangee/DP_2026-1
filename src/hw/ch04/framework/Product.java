package hw.ch04.framework;

//일반적인 제품
public abstract class Product {
    //제품의 생성시 항상 이름 강제로 저장하기 위해
    public Product(String name, int serial, String issuedDate) {
        // 생성자 구현
    }

    //제품을 사용하기 위한 API가 use()라고 생각해보자.
    //제품은 항상 use() 메소드를 구현해줘야 함
    public abstract void use();
}
