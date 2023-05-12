class Solution {
    public int solution(int hp) {
        int answer = 0;
        int l = 0;  // 대장 개미
        int m = 0;  // 병정 개미
        int s = 0;  // 일개미

        // 대장 개미 수
        l = hp / 5;

        // 병정 개미 수 (hp % 5 가 2보다 작으면 병정 개미는 추가X, 2보다 크면 1 추가)
        m = ((hp % 5) <= 2) ? 0 : 1;
        
        // 총 hp 에서 대장 개미수 * 5, 병정 개미수 * 3 을 각각 뺀 수
        s =  hp - (l * 5) - (m * 3);

        answer = l + m + s;

        return answer;
    }
}