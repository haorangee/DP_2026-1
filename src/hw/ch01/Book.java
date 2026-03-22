package hw.ch01; //작성하는 패키지가 어디에 속하는지 (폴더명과 같아야 함)

public class Book {
    private String name;
    private String genre;      // 장르: "소설","과학","역사","기술" 등
    private int year;          // 출판연도 (예:2008)
    private double price;      // 가격 (단위:원, 예:30000.0)

    // 기존 생성자 유지
    public Book(String name) {
        this.name = name;
        this.genre = "Unknown";
        this.year = 0;
        this.price = 0.0;
    }

    // 새로운 생성자 오버로딩
    public Book(String name, String genre, int year, double price) {
        this.name = name;
        this.genre = genre;
        this.year = year;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getGenre() {
        return genre;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }
}
