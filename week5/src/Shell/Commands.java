package Shell;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Commands {
    public static void main(String[] args) throws IOException {


        ProcessBuilder builder = new ProcessBuilder(
                "cmd.exe", "/c", "dir");
        builder.redirectErrorStream(true);
        Process p = builder.start();
        BufferedReader r = new BufferedReader(new InputStreamReader(p.getInputStream()));
        String line;
        while (true) {
            line = r.readLine();
            if (line == null) { break; }
            System.out.println(line);
        }
    }
}


