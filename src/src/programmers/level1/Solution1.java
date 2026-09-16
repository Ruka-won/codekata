package programmers.level1;

public class Solution1 {
    public int solution(int num1, int num2) {
        int answer = 0;
        answer = num1 / num2;
        return answer;


    }

    public static void main(String[] args) {
        Solution1 s = new Solution1();

        int result = s.solution(10,2); // 출력 값 입력
        System.out.println(result);


    }
}
