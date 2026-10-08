package programmers.level1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution25 {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();

        for (int element : arr) {
            if (element % divisor == 0) {
                list.add(element);
            }
        }
        if (list.isEmpty()) {
            return new int[]{-1};
        }
        Collections.sort(list);

        answer = new int[list.size()]; // 공간 할당
        for (int i= 0; i <list.size(); i++) { // 숫자 넣고
            answer[i] = list.get(i);
        }
        return answer; // 반환
    }

    public static void main(String[] args) {
        Solution25 a = new Solution25();
        int[] result = a.solution(new int[]{5, 9, 7, 10}, 5);

        for (int num : result) {
            System.out.print(num + " ");
        }


    }
}
