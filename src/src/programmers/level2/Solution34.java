package programmers.level2;

import java.util.Arrays;

public class Solution34 {
    public String solution(String s) {
        char[] arr  = s.toCharArray();

        Arrays.sort(arr);

        StringBuilder sb = new StringBuilder();

        for(int i = arr.length - 1; i >= 0 ; i--) {
            sb.append(arr[i]);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Solution34 a = new Solution34();
        String result = a.solution("Zbcdefg");
        System.out.println("result = " + result);
        
    }
}
