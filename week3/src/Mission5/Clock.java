package Mission5;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

public class Clock {
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
        HashMap<Integer, Integer[]> setDate = new HashMap<>();
        setDate.put(1, new Integer[]{0,0, 2,5});
        setDate.put(2, new Integer[]{0,1, 2,5});
        setDate.put(3, new Integer[]{0,2, 2,5});
        setDate.put(4, new Integer[]{0,3, 2,5});
        setDate.put(5, new Integer[]{0,4, 0,5, 2,5});
        setDate.put(6, new Integer[]{1,0, 1,1, 2,5});
        setDate.put(7, new Integer[]{1,2, 1,3, 2,5});
        setDate.put(8, new Integer[]{1,4, 1,5, 2,5});
        setDate.put(9, new Integer[]{2,0, 2,1, 2,5});
        setDate.put(10, new Integer[]{2,2, 2,5});
        setDate.put(11, new Integer[]{2,2, 2,3, 2,5});
        setDate.put(12, new Integer[]{2,2, 2,4, 2,5});

        String pattern = "h";
        SimpleDateFormat simple = new SimpleDateFormat(pattern);
        Integer hour = Integer.parseInt(simple.format(new Date()));

        temp1 = setDate.get(hour);

        for (int i = 0; i < temp1.length; i = i + 2) {
            hangeul[temp1[i]][temp1[i + 1]]=
                    PURPLE_BOLD_BRIGHT+hangeul[temp1[i]][temp1[i + 1]]+RESET;
        }

    }



    public void setMinute() {
        HashMap<Integer, Integer[]> setDate = new HashMap<>();
        setDate.put(0, new Integer[]{5, 5});
        setDate.put(1, new Integer[]{4, 1, 5, 5});
        setDate.put(2, new Integer[]{4, 2, 5, 5});
        setDate.put(3, new Integer[]{4, 3, 5, 5});
        setDate.put(4, new Integer[]{4, 4, 5, 5});
        setDate.put(5, new Integer[]{4, 5, 5, 5});
        setDate.put(6, new Integer[]{5, 1, 5, 5});
        setDate.put(7, new Integer[]{5, 2, 5, 5});
        setDate.put(8, new Integer[]{5, 3, 5, 5});
        setDate.put(9, new Integer[]{5, 4, 5, 5});

        setDate.put(10, new Integer[]{3, 5});
        setDate.put(20, new Integer[]{3, 1, 3, 5});
        setDate.put(30, new Integer[]{3, 2, 3, 5});
        setDate.put(40, new Integer[]{3, 3, 3, 5});
        setDate.put(50, new Integer[]{3, 4, 3, 5});

        //setDate.put(0, new Integer[]{3,0, 4,0});
        //setDate.put(12, new Integer[]{4,0, 5,0});

        String pattern1 = "m";
        SimpleDateFormat simple1 = new SimpleDateFormat(pattern1);
        Integer minute = Integer.parseInt(simple1.format(new Date()));

        if(minute>=10){
            Integer tens = Integer.parseInt(String.valueOf(minute).substring(0, 1));
            Integer units = Integer.parseInt(String.valueOf(minute).substring(1));
            temp1 = setDate.get(tens*10);
            temp2 = setDate.get(units);

            for (int i = 0; i < temp1.length; i = i + 2) {
                hangeul[temp1[i]][temp1[i + 1]] =
                        PURPLE_BOLD_BRIGHT+hangeul[temp1[i]][temp1[i + 1]]+RESET;
            }
            for (int j = 0; j < temp2.length; j = j + 2) {
                hangeul[temp2[j]][temp2[j + 1]]=
                        PURPLE_BOLD_BRIGHT+hangeul[temp2[j]][temp2[j + 1]]+RESET;
            }
        }else if(minute!=0){
            temp1 = setDate.get(minute);
            for (int j = 0; j < temp1.length; j = j + 2) {
                hangeul[temp1[j]][temp1[j + 1]]=
                        PURPLE_BOLD_BRIGHT+hangeul[temp1[j]][temp1[j + 1]]+RESET;
            }
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

