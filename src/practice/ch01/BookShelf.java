package practice.ch01;

import java.util.Iterator;

public class BookShelf implements Iterable<Book>{
// public class BookShelf {
    private Book[] books;
    private int last = 0;

    public BookShelf(int maxsize) {
        this.books = new Book[maxsize];
    }

    public Book getBookFrom(int index) {
        return books[index];
    }

    public void appendBook(Book book) {
        this.books[last] = book;
        last++;
    }

    public int getLength() {
        return last;
    }


    @Override
    public Iterator<Book> iterator() {
        return new BookShelfIterator(this); //인자를 현재 책꽂이 자신으로 넘겨줌, 반복자 객체를 생성해서 반환
    }

    // ctrl+/ = 주석처리
}
