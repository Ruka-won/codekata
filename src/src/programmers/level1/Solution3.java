package programmers.level1;

public class Solution3 {
    public int solution(int age) {
        int answer = 0;
        int year = 2022 ;
            answer = year - age + 1;

        return answer;
    }


    public static void main(String[] args) {
        Solution3 a = new Solution3();

        int result = a.solution(40);
        System.out.println(result);

    }
}
