class Solution {
    public int solution(int[] dot) {
        int answer = 0;
        int zero = 0;
        
        // 좌표(x, y) 가 각각 0보다 크면 +1, 작으면 -1, 같으면 0 을 할당함.
        int x = (dot[0] > zero) ? 1 : (dot[0] < zero) ? -1 : 0;
        int y = (dot[1] > zero) ? 1 : (dot[1] < zero) ? -1 : 0;
        
        
        if(x + y == 2) {            // 둘 다 양수인 경우 1사분면,
            answer = 1;
        } else if (x + y == -2) {   // 둘 다 음수인 경우 3사분면,
            answer = 3;
        } else {                    // 하나는 양수, 하나는 음수인 경우
                                    // x 가 음수이면 2사분면, 양수이면 4사분면
            answer = (x == -1) ? 2 : 4;
            
            // if (x == -1) {
            //     answer = 2;
            // } else if (y == -1) {
            //     answer = 4;
            // }
        }
        
        return answer;
    }
}