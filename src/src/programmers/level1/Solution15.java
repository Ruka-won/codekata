package programmers.level1;

public class Solution15 {
    public int solution(int n){
        int answer = 0;

        for (int x = 1; x < n; x++){

            if ((n % x) == 1){
                answer = x;
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution15 a = new Solution15();
        int result = a.solution(10);
        System.out.println("result = " + result);
    }
}

