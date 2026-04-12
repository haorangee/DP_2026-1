package practice.ch01;

//이미 정의된 java.util 패키지의 Iterator 인터페이스를 사용하기 위해 import
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

    // 장르 필터 iterator 반환
    public Iterator<Book> iteratorByGenre(String genre) {
        return new BookShelfGenreIterator(this, genre);
    }

    // 출판연도 역순 iterator 반환
    public Iterator<Book> iteratorByYear() {
        return new BookShelfYearIterator(this);
    }

}
