package programmers.level1;

public class Solution13 {
    public int solution(int n) {
        int answer = 0;

        while(n != 0) {
            answer += n % 10;
            n /= 10;

        }
        return answer;
    }

    public static void main(String[] args) {
        Solution13 a = new Solution13();
        int result = a.solution(123);
        System.out.println("result = " + result);
    }
}
