import java.util.Scanner;

public class Gugudan {
    public static void main(String[] args) {

        int start, end = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("앞단을 입력: ");
        start = sc.nextInt();
        if (start < 2 || start > 10) {
            System.out.println("구구단이니 1이랑 10이상은 안돼, 다시 입력해줘: ");
            start = sc.nextInt();
        } else System.out.println(start);

        System.out.println("뒷단을 입력: ");
        end = sc.nextInt();
        if (end < start || end > 10) {
            System.out.println("끝단이니 앞단보다 작아서도 10이상도 안돼, 다시 입력해줘: ");
            end = sc.nextInt();
        } else System.out.println(end);


        for (int i = start; i<=end; i++) {
            System.out.println(i + "단을 시작할게");
            for (int j = 1; j<10; j++) {
                System.out.println(i + "*" + j + "=" + i * j);
            }
            System.out.println();
        }

    }

}