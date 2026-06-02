package ch15.Sample.pagemaker;

import java.io.Writer;
import java.io.IOException;


//open integrated file로 html 파일 열었음
public class HtmlWriter {
    private Writer writer;

    public HtmlWriter(Writer writer) {
        this.writer = writer;
    }

    // 타이틀 출력 
    // 제일 먼저 호출되어야 하는 메소드
    public void title(String title) throws IOException {
        writer.write("<!DOCTYPE html>");
        writer.write("<html>");
        writer.write("<head>");
        writer.write("<title>" + title + "</title>");
        writer.write("</head>");
        writer.write("<body>");
        writer.write("\n");
        writer.write("<h1>" + title + "</h1>");
        writer.write("\n");
    }

    // 단락 출력
    public void paragraph(String msg) throws IOException {
        writer.write("<p>" + msg + "</p>");
        writer.write("\n");
    }

    // 링크 출력
    public void link(String href, String caption) throws IOException {
        // <a href="http://www.oreilly.co.jp/">오렐리 일본 사이트</a>
        paragraph("<a href=\"" + href + "\">" + caption + "</a>"); // \"" 해야 맨 앞에 " 붙음. href="http://www.oreilly.co.jp/" 이렇게 출력됨
    }

    // 이메일 주소 출력 
    public void mailto(String mailaddr, String username) throws IOException {
        link("mailto:" + mailaddr, username);
    }

    // HTML 닫기 
    public void close() throws IOException {
        writer.write("</body>");
        writer.write("</html>");
        writer.write("\n");
        writer.close();
    }
}
