package ch15.A2.pagemaker;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PageMaker {
    private PageMaker() {
    }

    public static void makeWelcomePage(String mailaddr, String filename) {
        try {
            Properties mailprop = Database.getProperties("maildata");

            String username = mailprop.getProperty(mailaddr);

            HtmlWriter writer = new HtmlWriter(new FileWriter(filename));

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

    public static void makeLinkPage(String filename) {
        try {
            HtmlWriter writer = new HtmlWriter(new FileWriter(filename));

            writer.title("Link page");

            Properties mailprop = Database.getProperties("maildata");

            for (String mailaddr: mailprop.stringPropertyNames()) {
                String username = mailprop.getProperty(mailaddr, "(unknown)"); // 이메일 주소로 사용자 이름을 얻음, 없으면 "(unknown)" 반환
                writer.mailto(mailaddr, username); //메일주소, 사람이름 주면 하나씩 만들어줌
            }

            writer.close();
            System.out.println(filename + " is created.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
