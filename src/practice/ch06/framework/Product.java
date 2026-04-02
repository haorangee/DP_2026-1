package practice.ch06.framework;

// Cloneable를 상속해야 clone() 구현 가능 -> marker interface

//Product 인터페이스를 구현한 클래스는 clone() 메소드를 제공함
public interface Product extends Cloneable {
    public abstract void use(String s);
    public abstract Product createCopy();  //복제 메서드


}
