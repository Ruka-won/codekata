package programmers.level1;

import java.util.List;

public class Solution27 {
    public String solution(String phone_number) {
        int length = phone_number.length();
        String stars = "*".repeat(length-4);
        String tail = phone_number.substring(length-4);

        return stars + tail;
    }

    public static void main(String[] args) {
        Solution27 a = new Solution27();
        String result = a.solution("01033334444");
        System.out.println("result = " + result);
    }

}
