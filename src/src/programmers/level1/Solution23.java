package programmers.level1;

public class Solution23 {
    public int solution(int num) {
        long n = (long) num;
        int count = 0;

        while (n != 1 && count < 500) {

            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = (n * 3) + 1;
            }
            count++;
        }

        return (n == 1) ? count : -1;

    }

    public static void main(String[] args) {
        Solution23 a = new Solution23();
        int result = a.solution(626331);
        System.out.println("result = " + result);
    }

}
