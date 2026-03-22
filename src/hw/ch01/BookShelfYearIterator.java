package hw.ch01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException; 
import java.util.List;

public class BookShelfYearIterator implements Iterator<Book> {
    private List<Book> sortedBooks; //List는 인터페이스임
    private int index;

    public BookShelfYearIterator(BookShelf bookShelf) {
        sortedBooks = new ArrayList<>();
        for (int i = 0; i < bookShelf.getLength(); i++) {
            sortedBooks.add(bookShelf.getBookFrom(i));
        }
        // 출판연도 역순으로 정렬
        sortedBooks.sort((b1, b2) -> Integer.compare(b2.getYear(), b1.getYear()));
        this.index = 0;

    }

    @Override
    public boolean hasNext() {
        return index < sortedBooks.size(); //현재 index가 정렬된 책 리스트의 크기보다 작은지 확인
    }
       


    @Override
    public Book next() {
        if (!hasNext()) {
            throw new NoSuchElementException(); //더 이상 책이 없으면 예외를 던짐
        }
        return sortedBooks.get(index++); //현재 index의 책을 반환하고, index를 증가시킴
    }
}
