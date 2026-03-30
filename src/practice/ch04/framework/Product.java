package practice.ch04.framework;

public abstract class Product {
    //제품의 생성시 항상 이름 강제로 저장하기 위해
    public abstract Product(String name);

    //제품을 사용하기 위한 API가 use()라고 생각해보자.
    public abstract void use();
}
