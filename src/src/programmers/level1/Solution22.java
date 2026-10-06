package programmers.level1;

public class Solution22 {
    public long solution(int a, int b) {
        long answer = 0;
        int start = Math.min(a, b);
        int end = Math.max(a, b);
        //3~5 사이에 있는 3, 4, 5값을 더해서 12을 반환
        //a,b값이 같은 경우는 둘중 아무거나 동일 값을 반환

        if (start == end) {
            return start;
        } else {
            for (int i = start; i <= end; i++) {
                answer += i;
            }

            return answer;
        }
    }
        public static void main (String[]args){
            Solution22 a = new Solution22();
            long result = a.solution(5, 3);
            System.out.println("result = " + result);
        }

}
