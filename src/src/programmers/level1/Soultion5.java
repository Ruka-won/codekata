package programmers.level1;

public class Soultion5 {
    public int solution(int num1, int num2){
        int answer = -1;
        answer = num1 + num2;
        return answer;
    }

    public static void main(String[] args) {
        Soultion5 a = new Soultion5();
        int result = a.solution(100, 2);
        System.out.println(result);

    }

}
