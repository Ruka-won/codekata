package programmers.level1;

import java.util.Arrays;

public class Solution20 {
    public long solution(long n) {
        char[] arr = String.valueOf(n).toCharArray(); // 글자를 하나하나 받아서 정렬
        Arrays.sort(arr);

        // 내림차순 정렬
        StringBuilder sb = new StringBuilder(new String(arr));
        sb.reverse();

        return Long.parseLong(sb.toString());

    }

    public static void main(String[] args) {
        Solution20 a = new Solution20();
        long result = a.solution(118372);
        System.out.println("result = " + result);

    }
}
