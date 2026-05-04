package hw.ch11;

import java.util.List;

public abstract class Entry {
    private Entry parent;

    protected void setParent(Entry parent) {
        this.parent = parent;
    }

    public abstract String getName();

    public abstract int getSize();

    public void printList() { 
        printList("");
    }

    protected abstract void printList(String prefix);

    //트리 전체를 재귀적으로 탐색, 이름에 keyword가 포함된 모든 엔트리를 리스트로 반환
    public abstract List<Entry> search(String keyword);

    public String getFullName() {
        StringBuilder fullname = new StringBuilder();
        Entry entry = this;
        do {
            fullname.insert(0, entry.getName());
            fullname.insert(0, "/");
            entry = entry.parent;
        } while (entry != null);
        return fullname.toString();
    }

    @Override
    public String toString() {
        return getName() + " (" + getSize() + ")";
    }
}
