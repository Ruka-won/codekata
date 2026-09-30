package programmers.level1;

public class Solution18 {
    public int solution (String s) {
        int answer = 0;

            answer = Integer.parseInt(s);


        return answer;
    }

    public static void main(String[] args) {
        Solution18 a = new Solution18();
        int result = a.solution("-1234");
        System.out.println("result = " + result);
    }
}
