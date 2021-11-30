package Shell;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Test test = new Test();
        test.InputCommand();

    }

}

class Test{

    void InputCommand(){
        Scanner sc = new Scanner(System.in);
        System.out.print("HanShell> ");
        sc.nextLine();
    }
}