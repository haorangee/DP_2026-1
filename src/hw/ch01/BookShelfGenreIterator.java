package hw.ch01;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class BookShelfGenreIterator implements Iterator<Book> {
    private BookShelf bookShelf;
    private String genre;
    private int index;

    public BookShelfGenreIterator(BookShelf bookShelf, String genre) {
        this.bookShelf = bookShelf;
        this.genre = genre;
        this.index = 0;
        moveToNextMatch(); //처음부터 일치하는 책이 있는 위치로 이동
    }

    private void moveToNextMatch() {
        while (index < bookShelf.getLength()) {
            Book book = bookShelf.getBookFrom(index);
            if (book.getGenre().equals(genre)) {
                break;
            }
            index++;
        }
    }

    @Override
    public boolean hasNext() {
        return index < bookShelf.getLength(); //현재 index가 책꽂이의 길이보다 작은지 확인
    }

    @Override
    public Book next() {
        if (!hasNext()) {
            throw new NoSuchElementException(); //더 이상 일치하는 책이 없으면 예외를 던짐
        }
        Book book = bookShelf.getBookFrom(index); //현재 index의 책을 꺼냄
        index++; //다음 위치로 이동
        moveToNextMatch(); //다음 일치하는 책이 있는 위치로 이동
        return book; //현재 책을 반환
    }
}
