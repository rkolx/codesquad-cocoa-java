package Shell;

import java.io.*;
import java.util.Scanner;

public class Commands {
    public static void main(String[] args) throws IOException {
        Com com = new Com();
        com.input();

}
}

class Com{
    Scanner sc = new Scanner(System.in);


    void test() {
        sc.nextLine();
    }

    void input() throws IOException {
        System.out.print("HanShell>");
        ProcessBuilder builder = new ProcessBuilder("cmd.exe", "/c", sc.nextLine());
        builder.redirectErrorStream(true);
        Process p = builder.start();
        BufferedReader r = new BufferedReader(new InputStreamReader(p.getInputStream(),"MS949"));


        String line;
        while (true) {
            line = r.readLine();
            if (line == null) {input();}
            System.out.println(line);
        }

    }


}