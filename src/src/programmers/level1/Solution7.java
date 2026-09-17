package programmers.level1;

public class Solution7 {
    public int solution(int angle) {
        int answer = 0;
        if (angle == 90) {
            answer = 2;
        } else if (angle < 90) {
            answer = 1;
        } else if (angle == 180) {
            answer = 4;
        } else if (angle < 180) {
            answer = 3;
        }
        return answer;
    }
    public static void main(String[] args) {
        Solution7 a = new Solution7();
        int result = a.solution(200);
        System.out.println(result);

    }
}



