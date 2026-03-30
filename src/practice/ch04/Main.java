package practice.ch04;

import practice.ch04.idcard.IDCardFactory;
import ch04.A2.idcard.IDCard;
import practice.ch04.framework.Product;

public class Main {

    public static void main(String[] args) {
        // (1)ID카드를 직접 만들어보자.
        // IDCard c = new IDCard("이하늘");
        // c.use();

        // (2)공장을 통해서 id카드를 만들어보자.
        IDCardFactory f = new IDCardFactory(); //공장을 세우고
        Product c =f.create("이하늘");  //공장에 일을 시킴
        c.use(); //공장에서 만들어진 제품을 사용
    }
    
}
