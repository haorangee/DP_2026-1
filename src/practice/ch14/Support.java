package practice.ch14;


// 트러블 해결자
public abstract class Support {
    private String name;    // 이 트러블 해결자 이름
    private Support next;   // 떠넘길 곳 (Support: 부모 타입 -> 모든 종류의 트러블 해결자를 가리킬 수 있다)

    public Support(String name) {
        this.name = name;
        this.next = null;
    }

    // 떠넘길 곳을 설정한다
    public Support setNext(Support next) {
        this.next = next;
        return next;
    }

    // 트러블 해결 절차를 결정한다
    // 트러블 해결을 요청하는 메소드
    public void support(Trouble trouble) {
        if (resolve(trouble)) { // 자기가 해결하려고 함
            done(trouble);
        } else if (next != null) { // 자기가 해결 못했는데, 뒷 사람이 있으면 ... (null 이 아니면)
            next.support(trouble); // 뒷 사람에게 해결을 떠넘긴다
        } else { // 뒷사람이 자기도 해결 못하고, 뒷사람도 없으면 ...
            fail(trouble); // 해결 못했다고 선언
        }
    }

    // 트러블 해결자의 문자열 표현
    @Override
    public String toString() {
        return "[" + name + "]";
    }

    // 해결하려고 한다
    protected abstract boolean resolve(Trouble trouble);  // 자식들이 해결 방법을 구현한다.

    // 해결했다 
    protected void done(Trouble trouble) {
        System.out.println(trouble + " is resolved by " + this + ".");
    }

    // 해결되지 않았다 
    protected void fail(Trouble trouble) {
        System.out.println(trouble + " cannot be resolved.");
    }
}
