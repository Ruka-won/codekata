package programmers.level1;

public class Solution9 {
    public int soultion(int n) {
        int answer = 0;
        for (int i = 0; i <= n ; i++) {

            if (i % 2 == 0) {
                answer += i;
            }

        }
        return answer;
    }

    public static void main(String[] args) {
        Solution9 a = new Solution9();
        int result = a.soultion(4);
        System.out.println("result = " + result);
    }
}
