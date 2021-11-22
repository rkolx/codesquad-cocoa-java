package Mission5;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

public class HangeulClock {


}

class Clock {

    Integer[] temp1;
    Integer[] temp2;

    final String RESET = "\033[0m";  // Text Reset    public static final String BLACK_BOLD_BRIGHT = "\033[1;90m"; // BLACK
    final String RED_BOLD_BRIGHT = "\033[1;91m";   // RED
    final String GREEN_BOLD_BRIGHT = "\033[1;92m"; // GREEN
    final String YELLOW_BOLD_BRIGHT = "\033[1;93m";// YELLOW
    final String BLUE_BOLD_BRIGHT = "\033[1;94m";  // BLUE
    final String PURPLE_BOLD_BRIGHT = "\033[1;95m";// PURPLE
    final String CYAN_BOLD_BRIGHT = "\033[1;96m";  // CYAN

    String[][] hangeul =
            {{"한", "두", "세", "네", "다", "섯",},
                    {"여", "섯", "일", "곱", "여", "덟",},
                    {"아", "홉", "열", "한", "두", "시",},
                    {"자", "이", "삼", "사", "오", "십",},
                    {"정", "일", "이", "삼", "사", "오",},
                    {"오", "육", "칠", "팔", "구", "분",}};


    public void setHour() {
        String pattern = "h";
        SimpleDateFormat simple = new SimpleDateFormat(pattern);
        Integer hour = Integer.parseInt(simple.format(new Date()));

        HashMap<Integer, Integer[]> setDate = new HashMap<>();
        setDate.put(1, new Integer[]{0, 0, 2, 5});
        setDate.put(2, new Integer[]{0, 1, 2, 5});
        setDate.put(3, new Integer[]{0, 2, 2, 5});
        setDate.put(4, new Integer[]{0, 3, 2, 5});
        setDate.put(5, new Integer[]{0, 4, 0, 5, 2, 5});
        setDate.put(6, new Integer[]{1, 0, 1, 1, 2, 5});
        setDate.put(7, new Integer[]{1, 2, 1, 3, 2, 5});
        setDate.put(8, new Integer[]{1, 4, 1, 5, 2, 5});
        setDate.put(9, new Integer[]{2, 0, 2, 1, 2, 5});
        setDate.put(10, new Integer[]{2, 2, 2, 5});
        setDate.put(11, new Integer[]{2, 2, 2, 3, 2, 5});
        setDate.put(12, new Integer[]{2, 2, 2, 4, 2, 5});

        for (int i = 0; i < temp1.length; i = i + 2) {
            hangeul[temp1[i]][temp1[i + 1]] =
                    PURPLE_BOLD_BRIGHT + hangeul[temp1[i]][temp1[i + 1]] + RESET;
        }
    }



    public void ClockView() {
        for(String[] i : hangeul) {
            for (String j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
