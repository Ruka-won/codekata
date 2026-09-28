package programmers.level1;

public class Solution14 {
    public int solution(int n) {
        int answer = 0;

        for (int i = 1; i<=n; i++) {

            if ((n % i) == 0) {
                answer += i;
            }

        }


        return answer;
    }

    public static void main(String[] args) {
        Solution14 a = new Solution14();
        int result = a.solution(5);
        System.out.println("result = " + result);
    }
}
