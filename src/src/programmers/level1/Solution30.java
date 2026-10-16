package programmers.level1;

public class Solution30 {
    public String solution(String s) {
        int length = s.length();
        int center = length / 2;

        if (length % 2 != 0) {

            return s.substring(center, center + 1);

        } else {

            return s.substring(center -1 , center + 1);
        }

    }

    public static void main(String[] args) {
        Solution30 a = new Solution30();
        String result = a.solution("abcde");
        System.out.println("result = " + result);
    }
}
