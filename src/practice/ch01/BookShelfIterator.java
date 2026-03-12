package practice.ch01;

import java.util.Iterator; //JDK에서 제공하는 Iterator 인터페이스를 사용하기 위해 import, 제너릭
import java.util.NoSuchElementException;

public class BookShelfIterator implements Iterator<Book> { //책을 하나씩 꺼내오는 반복자
    private BookShelf bookShelf;
    private int index; //다음에 꺼내올 책의 위치를 저장하는 필드

    public BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf; //자기가 돌아다닐 책꽂이를 저장하는 필드
        this.index = 0;
    }

    @Override
    public boolean hasNext() { //다음 책이 있는지 여부를 반환하는 메서드
        if (index < bookShelf.getLength()) {
            return true; //꺼내올 책이 남아있음
        } else {
            return false; //꺼내올 책이 더 이상 없음
        }
    }

    @Override
    public Book next() { //다음 책을 반환하는 메서드, hasNext()로 다음 책이 있는지 확인한 후에 호출해야 함
        if (!hasNext()) {
            throw new NoSuchElementException(); //더 이상 책이 없으면 예외를 던짐
        }
        Book book = bookShelf.getBookFrom(index); //반복자가 책꽂이에 접근 ,index번째 책을 꺼내옴
        index++; 
        return book;
    }
}
