package ch11.Sample;

public class Main {
    public static void main(String[] args) {
        System.out.println("Making root entries...");
        Directory rootdir = new Directory("root");
        Directory bindir = new Directory("bin");
        Directory tmpdir = new Directory("tmp");
        Directory usrdir = new Directory("usr");
        Directory lhn = new Directory("lhn");  // 내 이름 이니셜 딴 디렉토리 만들어봄

        //rootdir 밑에 얘네들이 달림
        rootdir.add(bindir);
        rootdir.add(tmpdir);
        rootdir.add(usrdir);
        rootdir.add(lhn);

        lhn.add(new File("lhn1", 100));
        lhn.add(new File("lhn2", 200));
        lhn.add(new File("lhn3", 300));

        //이 파일 2개를 bin아래에 추가함
        bindir.add(new File("vi", 10000));
        bindir.add(new File("latex", 20000));
        rootdir.printList();
        System.out.println();

        System.out.println("Making user entries...");
        Directory youngjin = new Directory("youngjin");
        Directory gildong = new Directory("gildong");
        Directory dojun = new Directory("dojun");

        usrdir.add(youngjin);
        usrdir.add(gildong);
        usrdir.add(dojun);

        youngjin.add(new File("diary.html", 100));
        youngjin.add(new File("Composite.java", 200));

        gildong.add(new File("memo.tex", 300));
        
        dojun.add(new File("game.doc", 400));
        dojun.add(new File("junk.mail", 500));
        
        rootdir.printList();
    }
}
