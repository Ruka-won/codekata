package programmers.level1;

public class Solution24 {
    public String solution(String[] seoul) {
        String answer = "";

        for (int i = 0; i <= seoul.length; i++) {

            if (seoul[i].equals("Kim")) {
                return "김서방은 " + i + "에 있다";
            }

        }
        return answer;
    }

    public static void main(String[] args) {
        Solution24 a = new Solution24();
        String[] seoul = {"Jane", "Kim"};
        String result = a.solution(seoul);
        System.out.println(result);


    }
}
