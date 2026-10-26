package programmers.level1;

public class Solution1 {
    public int solution(int num1, int num2) {
        int answer = 0;
        answer = num1 * num2;
        return answer;


    }

    public static void main(String[] args) {
        Solution1 a = new Solution1();
        int result = a.solution(3,4);
        System.out.println("result = " + result);
        
        
    }

}
