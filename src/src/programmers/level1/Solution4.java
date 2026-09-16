package programmers.level1;

public class Solution4 {
    public int solution(int num1, int num2) {
        int answer = 0;
        if(num1 == num2) {
            answer = 1;
        }else if(num1 != num2) {
            answer = -1;
            }
        return answer;

    }

    public static void main(String[] args) {
        Solution4 a = new Solution4();

        int result = a.solution(7, 99);
        System.out.println(result);

    }
}
