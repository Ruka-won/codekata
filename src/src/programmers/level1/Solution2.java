package programmers.level1;

public class Solution2 {
    public int solution(int num1, int num2) {
        int answer = 0;
        answer = num1 * num2;
        return answer;
    }

    public static void main(String[] args) {
        Solution2 a = new Solution2();

        int result = a.solution(3, 4);
        System.out.println(result);



    }

}
