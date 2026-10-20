package programmers.level2;

public class Solution32 {
    public int solution(int[] a, int[] b) {
        int answer = 0;
        int length = a.length;
        for (int i = 0 ; i < length ; i++) {
            answer += a[i] * b[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution32 a = new Solution32();
        int result = a.solution(new int[]{-1,0,1}, new int[]{1,0,-1});
        System.out.println("result = " + result);
    }
}
