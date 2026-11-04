package programmers.level2;

public class Solution36 {
    public boolean solution(String s) {
        // 문자열의 s의 길이가 4 혹은 6이고
        // 숫자로만 구성돼어있는 확인해주는 함수
        int length = s.length();

        if (4 != length && 6 != length) {
            return false;
        }

        for (int i = 0 ; i < length ; i++) {
            char c = s.charAt(i);

            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Solution36 a= new Solution36();
        boolean result = a.solution("1234");
        System.out.println("result = " + result);
    }
}
