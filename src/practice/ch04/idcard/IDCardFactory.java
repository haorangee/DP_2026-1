package practice.ch04.idcard;

import practice.ch04.framework.Factory;
import practice.ch04.framework.Product;

public class IDCardFactory extends Factory {

    private int serialNumber;
    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }

    @Override
    protected void registerProduct(Product product) {
        System.out.println(product + "을 등록했습니다.");
    }
}
