package hw.ch06.framework;

import java.util.HashMap;
import java.util.Map;

public class Manager {
    //Product: 부모 타입 => 모든 종류의 자식 Product 객체를 관리할 수 있음
    //부모인 Product만 고려해서 코드 작성, 자식인 MessageBox, UnderlinePen은 고려하지 않아도 됨
    private Map<String,Product> showcase = new HashMap<>(); //(key, value) 쌍을 관리

    //원본 객체를 등록하는 메소드
    public void register(String name, Product prototype) {
        showcase.put(name, prototype);
    }

    public Product create(String prototypeName) {
        Product p = showcase.get(prototypeName); // 등록할 때 이름을 key로 해서 원본 객체를 검색해서 가져옴
        return p.createCopy(); // 원본 객체의 복제본을 생성하여 반환
    }
}
