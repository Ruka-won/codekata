package programmers.level2;


public class Solution31 {
    public String solution(int n) {
        StringBuilder answer = new StringBuilder();

    for (int i = 0 ; i < n ; i++) {

        if (i % 2 == 0) {
            answer.append("수");
        } else {
            answer.append("박");
        }
    }
        return answer.toString();
    }

    public static void main(String[] args) {
        Solution31 a = new Solution31();
        String result = a.solution(3);
        System.out.println("result = " + result);
    }
}
