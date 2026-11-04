package programmers.level2;

public class Solution35 {
   long solution(int price, int money, int count) {
        long answer = 0;
        // 이용한 횟수 만큼 곱하기로 요금 인상
        for (int i = 1 ; i <= count ; i++) {
            answer += (long) price * i;
        }
        return answer > money ? answer - money : 0;
    }

    public static void main(String[] args) {
        Solution35 a = new Solution35();
        long result = a.solution(3,20,4);
        System.out.println("result = " + result);

    }
}
