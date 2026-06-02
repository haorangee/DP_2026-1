package practice.ch14;

public class Main {
    public static void main(String[] args) {
        
        //해결자 생성
        Support alice = new NoSupport("Alice"); // 아무것도 해결 못하는 해결자
        Support bob = new LimitSupport("Bob", 100); // 번호가 100 미만인 트러블만 해결할 수 있는 해결자
        Support charlie = new SpecialSupport("Charlie", 429); // 번호가 429인 트러블만 해결할 수 있는 해결자
        Support diana = new OddSupport("Diana"); //홀수 번호만 해결

        //사슬 형성 (누구 뒤에 누구 오는지 설정)
        alice.setNext(bob).setNext(charlie).setNext(diana); // alice -> bob -> charlie -> diana
       
        //첫 해결자에게 트러블을 던져줌
        for (int i = 0; i < 500; i += 33) {
            alice.support(new Trouble(i)); 
        }
        //alice.support(new Trouble(429)); //여기선 charlie이 해결

    


        Trouble t1 = new Trouble(100);

        Support s1 = new NoSupport("no support");   
    }
}
