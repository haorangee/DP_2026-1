package ch10.Q4;

import java.util.*;

class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("D", "B", "C", "E", "A");

        // 사전순으로 작은 순서(오름차순)
        // 비교기의 타입이 Comparator임, // 문자열을 비교하는 비교기
        list.sort(new Comparator<String>() {  //Comparator: Functional Interface, compare 메서드 하나만 존재
        // 인터페이스는 원래 new 할 수 없으나, 이 인터페이스가 정의하는 메소드(여기서는 compare)를 아래에서 실제 구현해주면 new 할 수 있음
            @Override
            public int compare(String s1, String s2) {
                return s1.compareTo(s2);  // s1이 s2보다 사전순으로 작으면 음수, 같으면 0, 크면 양수 반환
            }
        });  // 오름차순을 위한 comparator를 넣어줌
        System.out.println(list);

        list.sort((s1,s2) -> s1.compareTo(s2));  // 람다식으로 간결하게 작성

        // 사전순으로 큰 순서 (내림차순)
        list.sort(new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s2.compareTo(s1);  // 뒤에가 클 경우에만 앞으로 보냄 (내림차순)
                // s2가 s1보다 사전순으로 작으면 음수, 같으면 0, 크면 양수 반환
            }
        }); // 내림차순을 위한 comparator를 넣어줌
        System.out.println(list);
    }
}
