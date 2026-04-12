package hw.ch06;

import hw.ch06.framework.Product;

public class BoderLine implements Product{
    private char borderchar;


    // 1. 생성자: 경계 문자를 인자로 받음
    public BoderLine(char borderchar) {
        this.borderchar = borderchar;
    }


    //2. use() 메소드 구현
    @Override
    public void use(String s) {
        int len = s.length();
        for (int i = 0; i < len + 4; i++) {
            System.out.print(borderchar);
        }
        System.out.println();
        System.out.println(borderchar + " " + s + " " + borderchar);
        for (int i = 0; i < len + 4; i++) {
            System.out.print(borderchar);
        }
        System.out.println();
    }

    //3. createCopy() 메소드 구현 (clone() 활용)
    @Override
    public Product createCopy() {
        Product p = null;
        try {
            p = (Product)clone();  //자기 복제
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return p;
    }

}
