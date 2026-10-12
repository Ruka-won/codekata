package programmers.level1;

public class Solution26 {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;

        for (int i = 0 ; i < absolutes.length; i++) {

            if (signs[i] == true) {
                answer += absolutes[i];

            } else {
                answer -= absolutes[i];
            }

        }

        return answer;
    }

    public static void main(String[] args) {
        Solution26 a = new Solution26();
        int result = a.solution(new int[]{4,7,12}, new boolean[]{true,false,true});
        System.out.println("result = " + result);
    }
}
