package programmers.level1;

import java.util.Arrays;

public class Solution17 {
    public int[] solution(long n) {
        String str = String.valueOf(n);
        int length = str.length();
        int[] answer = new int[length];
        int i = 0;
        while (n > 0) {
            answer[i] = (int) (n % 10) ;
            n = n / 10;
            i++;

        }
        return answer;
    }

    public static void main(String[] args) {
        Solution17 a = new Solution17();
        int[] result = a.solution(12345);
        System.out.println("result = " + Arrays.toString(result));

    }
}
