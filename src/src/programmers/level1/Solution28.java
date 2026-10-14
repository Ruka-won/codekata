package programmers.level1;

public class Solution28 {
    public int solution(int[] numbers) {
        int answer = 45;
        int sum = 0;
        for (int number : numbers) {
            sum += number;

        }

        return answer - sum;
    }

    public static void main(String[] args) {
        Solution28 a = new Solution28();
        int result = a.solution(new int[]{1,2,3,4,6,7,8,0});
        System.out.println("result = " + result);
    }
}
