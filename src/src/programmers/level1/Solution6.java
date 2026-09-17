package programmers.level1;

public class Solution6 {
    public int solution(int num1, int num2) {
        int answer = 0;
        answer = (int) ((double) num1 / num2 * 1000);
        return answer;

    }
    public static void main(String[] args) {

        Solution6 a = new Solution6();
        int result = a.solution(3, 2);
        System.out.println(result);

    }
}
