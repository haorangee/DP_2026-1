package ch05.A2b;

public enum Triple {
    ALPHA, BETA, GAMMA; //각 상수에  triple 인스턴스 하나씩 자동으로 생성되어 저장됨


    private Triple() {
        System.out.println("The instance " + this + " is created.");
    }

    public static Triple getInstance(String name) {
        return valueOf(name); // 이 valueOf() 메소드는 enum 클래스에서 제공하는 static 메소드로, 문자열로 상수 이름을 받아 해당 상수의 인스턴스를 리턴한다. (예: Triple.getInstance("ALPHA") -> Triple.ALPHA)
    }
}
