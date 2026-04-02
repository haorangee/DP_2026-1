package ch04.A2;

import ch04.A2.framework.Product;
import ch04.A2.idcard.IDCardFactory;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        IDCardFactory factory = new IDCardFactory();
        Product card1 = factory.create("Youngjin Kim"); //100번
        Product card2 = factory.create("Heungmin Son"); //101번
        Product card3 = factory.create("Kane"); //102번
        card1.use();
        card2.use();
        card3.use();

        Map<Integer, String> ownersBySerial = factory.getOwnersBySerial();
        System.out.println("ownersBySerial = " + ownersBySerial);

        boolean isValid = ownersBySerial.size() == 3
                && "Youngjin Kim".equals(ownersBySerial.get(100))
                && "Heungmin Son".equals(ownersBySerial.get(101))
                && "Kane".equals(ownersBySerial.get(102));

        if (!isValid) {
            throw new IllegalStateException("해시맵 검증 실패: " + ownersBySerial);
        }

        System.out.println("해시맵 검증 성공");
    }
}
