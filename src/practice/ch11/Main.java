package practice.ch11;

public class Main {
    public static void main(String[] args) {

        // 디렉토리 트리를 만든다
        // Directory root = new Directory("root");


        //디렉토리 대신 Entry 타입으로 선언 (부모 타입으로 선언 - 더 유연한 코드)
        Entry root = new Directory("root"); // 업 캐스팅 (Directory형 -> Entry형으로 변환됨) => 업 캐스팅은 자동으로 일어남 (형변환 연산자 생략 가능)

        Directory bin = new Directory("bin");
        Directory tmp = new Directory("tmp");
        Directory usr = new Directory("usr");

        // 트리형성 시 루트 밑에 추가해줌
        //컴파일러 입장에선 변수의 타입이 중요함
        ((Directory) root).add(bin);  //형변환(타입 캐스팅) => 다운 캐스팅(부모 타입 -> 자식 타입) => 다운 캐스팅은 명시적으로 해야함 (형변환 연산자 필요)
        ((Directory) root).add(tmp);
        ((Directory) root).add(usr);

        bin.add(new File("vi", 10000));
        bin.add(new File("latex", 20000));

        //경로 출력
        root.printList();
    
}
