package Mission5;

import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;

public class HangeulClock {
    public static void main(String[] args) {

        Clock cl = new Clock();
        cl.setHour();

    }
}

class Clock {
        LocalTime time = LocalTime.now();
        int hour = time.getHour();
        int minute = time.getMinute();
        String[][] hangule =
                {{"한", "두", "세", "네", "다", "섯",},
                        {"여", "섯", "일", "곱", "여", "덟",},
                        {"아", "홉", "열", "한", "두", "시",},
                        {"자", "이", "삼", "사", "오", "십",},
                        {"정", "일", "이", "삼", "사", "오",},
                        {"오", "육", "칠", "팔", "구", "분",},};


        //시간 기능
        public void setHour() {

            String pattern = "h";
            SimpleDateFormat simple = new SimpleDateFormat(pattern);
            Integer hour = Integer.parseInt(simple.format(new Date()));


            HashMap<Integer, Integer[]> setDate = new HashMap<>();

            setDate.put(1, new Integer[]{0, 0});
            setDate.put(2, new Integer[]{0, 1});
            setDate.put(3, new Integer[]{0, 2});
            setDate.put(4, new Integer[]{0, 3});
            setDate.put(5, new Integer[]{0, 4, 0, 5});
            setDate.put(6, new Integer[]{1, 0, 1, 1});
            setDate.put(7, new Integer[]{1, 2, 1, 3});
            setDate.put(8, new Integer[]{1, 4, 1, 5});
            setDate.put(9, new Integer[]{2, 0, 2, 1});
            setDate.put(10, new Integer[]{2, 2});
            setDate.put(11, new Integer[]{2, 2, 2, 3});
            setDate.put(12, new Integer[]{2, 2, 2, 4});

            Integer[] temp = setDate.get(hour);
            System.out.println("----change time num to hangeul-----");//임시
            System.out.println("currnet time: " + hour + "시");//임시

            for (int i = 0; i < temp.length; i = i + 2) {
                System.out.println(hangule[temp[i]][temp[i + 1]] + "시");

            }
        }

    //분 파싱
        public void setMinute() {
            String tens = String.valueOf(minute).substring(0,1); //분 십의 자리
            String units = String.valueOf(minute).substring(1); //분 일의 자리
        }
}
