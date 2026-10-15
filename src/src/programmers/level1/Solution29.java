package programmers.level1;

import java.util.Arrays;

public class Solution29 {
    public int[] solution(int[] arr) {

        if (arr.length <= 1) {
            return new int[]{-1};
        }
        int min = Arrays.stream(arr).min().getAsInt();

        int[] answer = new int[arr.length-1];

        int index = 0;

        for (int i : arr) {
            if (i != min){
                answer[index] = i;
                index++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution29 a = new Solution29();
        int[] result = a.solution(new int[]{10});
        System.out.println("result = " + Arrays.toString(result));
    }
}

