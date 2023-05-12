import java.util.Arrays;

class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        
        Arrays.sort(sides);

        // 가장 큰 값이 나머지 2개의 값의 합보다 작으면 1, 아니면 2 반환
        answer = (sides[0] + sides[1] > sides[2]) ? 1 : 2;

        return answer;
    }
}