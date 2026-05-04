package hw.ch11;

import java.util.ArrayList;
import java.util.List;

public class File extends Entry {
    private String name;
    private int size;

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    protected void printList(String prefix) {
        System.out.println(prefix + "/" + this);
    }


    // 자기 이름에 keyworkd가 포함되어 있으면 자기 자신을 리스트에 추가, 그렇지 않으면 빈 리스트 반환
    @Override
    public List<Entry> search(String keyword) {
        List<Entry> result = new ArrayList<>();
        if (this.name.contains(keyword)) {
            result.add(this);
        }
        return result;
    }
}
