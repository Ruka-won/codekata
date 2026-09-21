package programmers.level1;

public class Solution10 {
    public double solution(int[] numbers) {
        double answer = 0;
        double sum = 0;
        for (int i : numbers) {
            sum += i;
        }
        answer = sum / numbers.length;

        return answer;
    }

    public static void main(String[] args) {
        Solution10 a = new Solution10();
            int[] testNumbers = new int[]{89,90,91,92,93,94,95,96,97,98,99} ;
            //배열함수는 하나의 객체로 구성이 되어있어, 여러 값이 아닌 덩어리 하나로 넣어줘야함
            //위와 같은 testNumbers 구조로 넣는 것이 정석
            double result = a.solution(testNumbers);
            System.out.println("result = " + result);
    }
}
