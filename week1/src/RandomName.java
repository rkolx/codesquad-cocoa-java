import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class RandomName {
    public static void main(String[] args) {

        String[] names = {"반스", "Sonny", "Ella", "Bart", "Jarry", "검봉", "Konda", "Yan", "Hanse", "Teemo"};
        Collections.shuffle(Arrays.asList(names)); //섞었다

        Scanner sc = new Scanner(System.in);
        System.out.print("몇명 뽑을래? : ");
        int input = sc.nextInt();

        String[] random = new String[input];

        for (int i = 0; i < input; i++) {
            random[i] = names[i];
        }

        String pick = String.join(", ", random);
        System.out.println(pick);

    }

}
