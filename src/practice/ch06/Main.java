package practice.ch06;

import practice.ch06.framework.Manager;

public class Main {
    public static void main(String[] args) {
        // //메인 메소드 내용
        // //원본을 이용
        // MessageBox mbox1 = new MessageBox('*'); //MessageBox 객체 m1 생성
        // mbox1.use("Hello, World."); //m1 객체의 use() 메소드 호출

        // UnderlinePen upen1 = new UnderlinePen('-'); //UnderlinePen 객체 u1 생성
        // upen1.use("Hello, World."); //u1 객체의 use() 메소드

        // //복제 객체를 이용
        // mbox1.createCopy().use("Hello, World."); //m1 객체의 createCopy() 메소드로 복제한 객체의 use() 메소드 호출
        // upen1.createCopy().use("Hello, World."); //u1 객체의 createCopy() 메소드로 복제한 객체의 use() 메소드 호출
    

        //Manager를 이용
        //준비
        Manager manager = new Manager(); //Manager 객체 생성

        //원본 객체 생성 및 등록
        MessageBox mbox1 = new MessageBox('*'); //MessageBox 객체 m1 생성
        manager.register("star box", mbox1); //Manager 객체에 m1 객체 등록

        UnderlinePen upen1 = new UnderlinePen('-'); //UnderlinePen 객체 u1 생성
        manager.register("underline pen", upen1); //Manager 객체에 u1 객체 등록
    
    
        MessageBox mbox2 = new MessageBox('/'); //MessageBox 객체 m2 생성
        manager.register("slash box", mbox2); //Manager 객체에 m2 객체 등록

        //복제 객체를 얻어와서 사용
        manager.create("star box").use("Hello, World."); //Manager 객체에서 "star box" 이름으로 등록된 객체를 복제해서 얻어와서 use() 메소드 호출
        manager.create("underline pen").use("Hello, World."); //Manager 객체에서 "underline pen" 이름으로 등록된 객체를 복제해서 얻어와서 use() 메소드 호출
        manager.create("slash box").use("Hello, World."); //Manager 객체에서 "slash
    }
}
