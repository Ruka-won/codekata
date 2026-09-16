package programmers;

public class Level2 {
    public int solution(int num1, int num2) {
        int answer = 0;
        answer = num1 * num2;
        return answer;
    }

    public static void main(String[] args) {
        Level2 a = new Level2();

        int result = a.solution(3, 4);
        System.out.println(result);



    }

}
