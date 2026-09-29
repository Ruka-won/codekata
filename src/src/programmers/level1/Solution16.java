package programmers.level1;

import java.util.Arrays;

public class Solution16 {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        for (int i = 0; i < n ; i ++) {
            answer[i] = (long) x * (i + 1);
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution16 a = new Solution16();
        long[] result = a.solution(2,5) ;
        System.out.println("result = " + Arrays.toString(result));

    }

}
