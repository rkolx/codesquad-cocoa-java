import java.util.Random;
import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {


        int round = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("이름을 정해줘 : ");
        String inputPlayer = sc.next();

        Player player = new Player(inputPlayer, 100);
        Player player1 = new Player("player"+round, 120);


        do {
            if (player1.score == 0) {
                System.out.println("nextplayer");
                round = round + 1;
                player1 = new Player("player"+round, player.score+2);
            }


            System.out.println(player+"   vs   "+player1);

            Random random= new Random();
            int randomNumber = random.nextInt(20)+1;
            System.out.println(randomNumber);//임시

            int resultNum = 0;
            if (randomNumber % 2 == 0) {
                resultNum = 0;
                System.out.println(resultNum);//삭제
            } else {
                resultNum = 1;
                System.out.println(resultNum);//삭제
            }


            System.out.println("1(홀수), 0(짝수) 골라");
            int choiceNum = sc.nextInt();
            System.out.println("얼마 걸래");
            int bet = sc.nextInt();


            if (choiceNum == resultNum) {
                player.addScore(bet);
                player1.delScore(bet);
                System.out.println("이겼다. 너의 점수는 : "+ player.score);
                System.out.println("이겼다. 라이벌 점수는 : "+ player1.score);

            }else {
                player.delScore(bet);
                player1.addScore(bet);
                System.out.println("졌다. 너의 점수는 : "+ player.score);
                System.out.println("이겼다. 라이벌 점수는 : "+ player1.score);
            }



        } while (player.score != 0 && round < 8);


    }

    public static class Player { //static 다시 보자
        public String playName;
        public int score;

        public Player(String name, int score) {
            this.playName = name;
            this.score = score;
        }

        public void addScore(int score) {
            this.score += score;
        }

        public void delScore(int score) {
            this.score -= score;
        }

        @Override
        public String toString() {
            return "player : " + playName  +
                    ", score : " + score;
        }
    }









}
