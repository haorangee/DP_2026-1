package practice.ch10;

public class Main {
    public static void main(String[] args) {

        // //손 2개 얻기
        // Hand h1 = Hand.ROCK; //바위
        // Hand h2 = Hand.SCISSORS; //가위

        // System.out.println(h1 + " vs " + h2);
        // if (h1.isStrongerThan(h2)) {
        //     System.out.println(h1 + "이 " + h2 + "보다 강합니다.");
        // } else if (h1.isWeakerThan(h2)) {
        //     System.out.println(h2 + "가 " + h1 + "보다 약합니다.");
        // } else {
        //     System.out.println("비겼습니다.");
        // }


        //플레이어 2명 생성
        Player player1 = new Player("이하늘", new WinningStrategy(314));
        Player player2 = new Player("손흥민", new WinningStrategy(187));

        //게임 시키기

        for (int i = 0; i < 100; i++) {
            Hand h1 = player1.nextHand();
            Hand h2 = player2.nextHand();

            if (h1.isStrongerThan(h2)) {
                System.out.println("Winner: " + player1);
                player1.win();
                player2.lose();
            } else if (h1.isWeakerThan(h2)) {
                System.out.println("Winner: " + player2);
                player1.lose();
                player2.win();
            } else {
                System.out.println("Even...");
                player1.even();
                player2.even();
            }
        }

        System.out.println("Total result:");
        System.out.println(player1);    
        System.out.println(player2);

    }
}
