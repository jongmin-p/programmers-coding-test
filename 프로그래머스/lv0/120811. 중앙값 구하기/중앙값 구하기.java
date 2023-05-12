import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int center = 0;     // 중앙에 위치한 값의 인덱스를 저장할 변수

        Arrays.sort(array);

        // 중앙에 위치한 인덱스 값
        center = (array.length / 2);

        answer = array[center];

        return answer;
    }
}