package programmers.level1;

public class Solution19 {
    public long solution(long n) {
        long answer = 0;
        long sqrt = (long) Math.sqrt(n);

        if (sqrt * sqrt == n) {
            answer = (sqrt+1) * (sqrt+1);
        } else {
            answer = -1;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution19 a = new Solution19();
        long result = a.solution(121);
        System.out.println("result = " + result);
    }
}
