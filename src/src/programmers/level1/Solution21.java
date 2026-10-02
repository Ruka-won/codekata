package programmers.level1;

public class Solution21 {
    public boolean solution(int x) {
        boolean answer = true;
        int sum = 0;
        int original = x;
        //정수의 앞자리와 뒷자리를 더한 수로 나누었을 때 다 나눠지면 하샤드 수임
        while(x != 0) {
            // x = 18 / 10 (1) , 18 % 10 (8)
            sum += x % 10;
            x = x / 10;
        }
        //x 값은 변하고 있기에 기존 값을 따로 저장해줘야함.
            if (original % sum == 0) {
                answer = true;
            } else {
                answer = false;
            }

            return answer;

        }

    public static void main(String[] args) {
        Solution21 a = new Solution21();
        boolean result = a.solution(13);
        System.out.println("result = " + result);
        
        
    }

}
