package programmers.level1;

public class Solution5 {
    public int solution(int num1, int num2){
        int answer = -1;
        answer = num1 + num2;
        return answer;
    }

    public static void main(String[] args) {
        Solution5 a = new Solution5();
        int result = a.solution(100, 2);
        System.out.println(result);

    }

}
