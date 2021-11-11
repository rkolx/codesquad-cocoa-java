import java.util.Random;
import java.util.Scanner;

public class oddAndEven {
    public static void main(String[] args) {
        GamePlay game = new GamePlay();
        game.registerUser();
        game.gameStart();
    }
}


//플레이어
class Player {//클래스명 명사로 일반적으로
    public String playName;
    public int score;

    Player(String name, int score) {
        this.playName = name;
        this.score = score;
    }

    void addScore(int score) {

        this.score += score;
    }
    void subScore(int score) {
        this.score -= score;
    }

    @Override
    public String toString() {
        return "player: " + playName  +
                ", score: " + score;
    }
}

//게임
class GamePlay{
    int round = 1;
    Scanner sc = new Scanner(System.in);
    Player me;
    Player you = new Player("Player"+round,120);

    // 플레이어 이름 입력 받고 출력
    void registerUser() {
        System.out.println("게임할 이름을 입력해주세요 : ");
        me = new Player(sc.next(),100);
    }


    //1-20까지 랜덤으로 숫자 하나 뽑기
    int randomNumber() {
        Random random = new Random();
        return random.nextInt(20)+1;
    }

    //홀짝구분하기
    int oddOrEven() {
        int resultNum;
        if (randomNumber() % 2 == 0) {
            resultNum = 0;
        } else {
            resultNum = 1;
        }
        return resultNum;
    }

    //홀짝 입력 및 결과 출력
    void pickAndResult() {
        int temp = oddOrEven();//임시

        System.out.println("이기려고 임시로 보이게 해놨다 : " + temp);//삭제
        System.out.println("1(홀수), 0(짝수) 골라");
        int choiceNum = sc.nextInt();
        System.out.println(me.playName+": "+ me.score +" vs "
                +you.playName+": "+ you.score);//임시
        System.out.println("얼마 걸래");
        int bet = sc.nextInt();


        if (choiceNum == temp) {
            me.addScore(bet);
            you.subScore(bet);
            System.out.println("이겼네! " + me.playName + "(너)님의 점수는 : "
                    + me.score+", " + you.playName +"(라이벌)님의 점수는 : "+ you.score);

        }else {
            me.subScore(bet);
            you.addScore(bet);
            System.out.println("졌네! " + me.playName + "(너)님의 점수는 : "
                    + me.score+", " + you.playName +"(라이벌)님의 점수는 : "+ you.score);
        }

    }

    void gameStart() {
       do {
           if (you.score == 0) {
               round = round + 1;
               System.out.println("============="+round+"round=====================");
               you = new Player("player"+round, me.score+100);
               System.out.println("next plyaer" + round + ": " + you.score);
           }
           pickAndResult();
       } while (me.score != 0 && round < 9);

    }

}