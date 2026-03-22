package ch01.A1;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("Around the World in 80 Days"));
        bookShelf.appendBook(new Book("Bible"));
        bookShelf.appendBook(new Book("Cinderella"));
        bookShelf.appendBook(new Book("Daddy-Long-Legs"));
        bookShelf.appendBook(new Book("East of Eden"));
        bookShelf.appendBook(new Book("Frankenstein"));
        bookShelf.appendBook(new Book("Gulliver's Travels"));
        bookShelf.appendBook(new Book("Hamlet"));

        // 명시적으로 Iterator를 사용하는 방법 
        Iterator<Book> it = bookShelf.iterator();
        while (it.hasNext()) {
            Book book = it.next();
            System.out.println(book.getName());
        }
        System.out.println();

        // 확장 for문을 사용하는 방법
        for (Book book: bookShelf) {
            System.out.println(book.getName());
        }
        System.out.println();

        // //책장에 있는 책 목록 출력
        // //방법1: 책꽂이에 클라이언트가 직접 접근해서 책을 꺼내는 방식
        // System.out.println("Books in the bookshelf:");
        // for (int i = 0; i < bookShelf.getLength(); i++) {
        //     System.out.println("- " + i + ": " + bookShelf.getBookFrom(i).getName());
        // }

        // //방법2: 책꽂이에 반복자(irerator)를 만들어서 책을 꺼내는 방식
        // System.out.println("\nBooks in the bookshelf (using iterator):");
        // Iterator<Book> it = bookShelf.iterator();
        // while (it.hasNext()) {
        //     System.out.println("- " + it.next().getName());
        // }

        // //여기 코드 다시 이해하기**
        // //방법3: 책꽂이에 반복자(irerator)를 만들어서 책을 꺼내는 방식, (for-each 문) 향상된 for문
        // //형식: for (타입 변수명 : 컬렉션) { ... }
        // for (Book b : bookShelf) { //Iterable 인터페이스를 구현했기 때문에 for-each 문을 사용할 수 있음, bookShelf.iterator()가 자동으로 호출됨
        //     System.out.println("- " + b.getName());
        // }
    }
}
