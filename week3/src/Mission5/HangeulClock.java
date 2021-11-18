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
        System.out.println();//임시
        cl.setMinute();
        cl.setMinute();

    }
}

class Clock {
        LocalTime time = LocalTime.now();
        int hour = time.getHour();
        int minute = time.getMinute();
        String[][] hangeul =
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

            Integer[] temp = setDate.get(hour);
            System.out.println("----change time num to hangeul-----");//임시
            System.out.println("currnet time: " + hour + "시");//임시

            for (int i = 0; i < temp.length; i = i + 2) {
                System.out.print(hangeul[temp[i]][temp[i + 1]]);

            }
        }
    //분 임시기능
    public void setMinute() {
        //String tens = String.valueOf(minute).substring(0,1); //분 십의 자리
        //String units = String.valueOf(minute).substring(1); //분 일의 자리

        String pattern1 = "m";
        SimpleDateFormat simple1 = new SimpleDateFormat(pattern1);
        Integer minute = Integer.parseInt(simple1.format(new Date()));


        HashMap<Integer, Integer[]> setDate = new HashMap<>();

        setDate.put(1, new Integer[]{4,1, 5,5});
        setDate.put(2, new Integer[]{4,2, 5,5});
        setDate.put(3, new Integer[]{4,3, 5,5});
        setDate.put(4, new Integer[]{4,4, 5,5});
        setDate.put(5, new Integer[]{4,5, 5,5});
        setDate.put(6, new Integer[]{5,1, 5,5});
        setDate.put(7, new Integer[]{5,2, 5,5});
        setDate.put(8, new Integer[]{5,3, 5,5});
        setDate.put(9, new Integer[]{5,4, 5,5});

        setDate.put(0, new Integer[]{3,0, 4,0});
        setDate.put(12, new Integer[]{4,0, 5,0});

        setDate.put(10, new Integer[]{3,5});
        setDate.put(20, new Integer[]{3,1, 3,5});
        setDate.put(30, new Integer[]{3,2, 3,5});
        setDate.put(40, new Integer[]{3,3, 3,5});
        setDate.put(50, new Integer[]{3,4, 3,5});

        Integer[] temp1 = setDate.get(minute);

        System.out.println(minute + "분");//임시

    }


}
