class Solution {
    public int solution(int slice, int n) {
        int answer = 0;
        
        // 인원수를 피자 조각수대로 나눴을 때 딱 떨어지면,
        if(n % slice == 0) {
            answer = n / slice;
        } else {
            // 인원수를 피자 조각수대로 나눴는데 나머지가 딱 떨어지지 않으면
            // 즉, if (n % slice != 0)
            
            answer = n / slice + 1;
        }
        
        return answer;
    }
}