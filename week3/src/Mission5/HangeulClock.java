package Mission5;

public class HangeulClock {



}

class Clock {

    final String RESET = "\033[0m";  // Text Reset    public static final String BLACK_BOLD_BRIGHT = "\033[1;90m"; // BLACK
    final String RED_BOLD_BRIGHT = "\033[1;91m";   // RED
    final String GREEN_BOLD_BRIGHT = "\033[1;92m"; // GREEN
    final String YELLOW_BOLD_BRIGHT = "\033[1;93m";// YELLOW
    final String BLUE_BOLD_BRIGHT = "\033[1;94m";  // BLUE
    final String PURPLE_BOLD_BRIGHT = "\033[1;95m";// PURPLE
    final String CYAN_BOLD_BRIGHT = "\033[1;96m";  // CYAN
    final String WHITE_BOLD_BRIGHT = "\033[1;97m"; // WHITE

    String[][] hangeul =
            {{"한", "두", "세", "네", "다", "섯",},
                    {"여", "섯", "일", "곱", "여", "덟",},
                    {"아", "홉", "열", "한", "두", "시",},
                    {"자", "이", "삼", "사", "오", "십",},
                    {"정", "일", "이", "삼", "사", "오",},
                    {"오", "육", "칠", "팔", "구", "분",}};
}
