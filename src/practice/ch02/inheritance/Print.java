package practice.ch02.inheritance;

//클라이언트가 원하는 인터페이스, 필요로하는 인터페이스, Target 인터페이스
public interface Print {
    public abstract void printWeak(); //문자열을 약하게 표시(괄호 붙임)
    public abstract void printStrong(); //문자열을 강하게 표시(* 붙임)
}

