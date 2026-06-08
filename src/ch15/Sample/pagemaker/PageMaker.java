package ch15.Sample.pagemaker;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

//퍼사드 클래스
public class PageMaker {
    private PageMaker() {  // 얘는 객체 생성을 못함.
    }

    // 이메일 주소와 파일 이름을 받아서 HTML 페이지를 만드는 메소드
    public static void makeWelcomePage(String mailaddr, String filename) {
        try {
            Properties mailprop = Database.getProperties("maildata");

            String username = mailprop.getProperty(mailaddr); // 이메일 주소로 사용자 이름을 얻음

            HtmlWriter writer = new HtmlWriter(new FileWriter(filename)); 


            // 웰컴 페이지를 작성하는 부분
            writer.title(username + "'s web page");
            writer.paragraph("Welcome to " + username + "'s web page!");
            writer.paragraph("Nice to meet you!");
            writer.mailto(mailaddr, username);
            writer.close();

            System.out.println(filename + " is created for " + mailaddr + " (" + username + ")");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
