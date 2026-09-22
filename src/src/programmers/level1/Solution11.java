package programmers.level1;

public class Solution11 {
    public String solution(int num) {
        String answer = "";

        if (num % 2 == 0) {
            answer = "Even";
        } else {
            answer = "Odd";
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution11 a = new Solution11();
        Solution11 b = new Solution11();

        System.out.println("result = " + a.solution(3));
        System.out.println("result = " + b.solution(2));


    }
}
