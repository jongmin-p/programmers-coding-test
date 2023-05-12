class Solution {
    public int solution(int hp) {
        int answer = 0;
        int l = 0;  // 대장 개미
        int m = 0;  // 병정 개미
        int s = 0;  // 일개미

        l = hp / 5;
        m = ((hp % 5) <= 2) ? 0 : 1;
        s =  hp - (l * 5) - (m * 3);

        answer = l + m + s;

        return answer;
    }
}