package practice.ch11;

import java.util.ArrayList;
import java.util.List;

public class Directory extends Entry {
    private String name;
    private List<Entry> directory = new ArrayList<>();  //컬렉션, 자식(엔트리)를 보관할 리스트, Entry: 부모 타입(디렉토리와 파일 모두 저장 가능)

    public Directory(String name) {  // 디렉토리는 사이즈 없음(자식을 다 합쳐야 본인 사이즈 나와서)
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    // 같은 함수가 계속해서 호출되는 재귀적 구조
    // entry가 파일인 경우에는 getSize()가 파일의 크기를 반환하고, entry가 디렉토리인 경우에는 디렉토리에서 파일의 getSize()가 또 호출되어 디렉토리의 크기를 반환한다.
    @Override
    public int getSize() {  // 자기 자식들의 크기를 모두 더함. 여기서는 directiry라는 변수에 자식들이 다 담겨있음
        int size = 0;
        for (Entry entry: directory) { //형식 for (원소 변수 : 컬렉션) 
            size += entry.getSize(); // 자식 엔트리의 크기를 얻어서 size에 더함
        }
        return size;
    }

    @Override
    protected void printList(String prefix) {  // prefix: 상위 디렉터리까지의 경로
        System.out.println(prefix + "/" + this); // 자기 출력하고 
        for (Entry entry: directory) { // 자식에 대해서
            entry.printList(prefix + "/" + name);  //이전 경로에 자기 이름을 붙임
        }
    }

    // 디렉터리 엔트리를 디렉터리에 추가한다
    public Entry add(Entry entry) {
        directory.add(entry);
        return this;
    }
}
