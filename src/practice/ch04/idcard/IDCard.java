package practice.ch04.idcard;

import practice.ch04.framework.Product;

public class IDCard extends Product {
    private String owner;
    private int serial;

    //Main이 얘를 호출할려면 누구나 불러올 수 있도록 public으로 만들어야 한다.
    public IDCard(String owner, int serial) {

        System.out.println(owner + "의 카드를 만듭니다.");
        this.owner = owner;
        this.serial = serial;
    }

    @Override
    public void use() {
        System.out.println(this.toString() + "을 사용합니다.");
    }

    @Override
    public String toString() {
        return "[IDCard:" + owner + "]";
    }

    public String getOwner() {
        return owner;
    }
}
