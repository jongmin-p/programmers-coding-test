class Solution {
    public int solution(int n) {
        int answer = 0;
        
        // 7로 나눴을 때 나머지 없이 딱 떨어지는 경우
        if (n % 7 == 0) {
            answer = n / 7;
        } else {    // 7로 나눴을 때 나머지가 생기는 경우
            answer = (n / 7) + 1;
        }
        
        return answer;
    }
}