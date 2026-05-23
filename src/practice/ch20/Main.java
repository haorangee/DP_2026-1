package practice.ch20;

// if 실행 안되면, cd bin, java practice.ch20.Main
public class Main {
    public static void main(String[] args) {

        // 메모리를 많이 차지함
        BigChar bigChar = new BigChar('1');
        bigChar.print();

        //공장을 통해서 BigChar 인스턴스를 얻는다
        BigCharFactory factory = BigCharFactory.getInstance();

        BigChar bigChar2 = factory.getBigChar('1');
        bigChar2.print();

        BigChar bigChar3 = factory.getBigChar('1');
        bigChar3.print();

        if(bigChar2 == bigChar3) {
            System.out.println("bigChar2와 bigChar3는 같은 인스턴스입니다.");
        } else {
            System.out.println("bigChar2와 bigChar3는 다른 인스턴스입니다.");
        }

        // BigString을 이용
        BigString bigString = new BigString("1212123"); //공장을 이용했으니 객체 공유
        bigString.print();

    }
}
