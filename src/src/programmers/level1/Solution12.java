package programmers.level1;

public class Solution12 {
    public double solution(int[] arr) {
        double answer = 0;
        double sum = 0;
        for (double i : arr) {
            sum += i;
        }
        return answer = sum / arr.length;
    }

    public static void main(String[] args) {
        Solution12 a = new Solution12();

        int average[] = {5, 5};
        double result = a.solution(average);
        System.out.println("result = " + result);

    }
}
