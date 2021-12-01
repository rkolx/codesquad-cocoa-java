package Shell;

import java.io.*;
import java.util.Scanner;

public class Commands {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        System.out.print("HanShell>");

        ProcessBuilder builder = new ProcessBuilder("cmd.exe", "/c", sc.nextLine());
        builder.redirectErrorStream(true);
        Process p = builder.start();
        BufferedReader r = new BufferedReader(new InputStreamReader(p.getInputStream(),"MS949"));

        String line="";
        while ((line = r.readLine())!=null) {
            if (line.trim().length() == 0) {
                continue;
            }System.out.println(line);
        }
    }
}


