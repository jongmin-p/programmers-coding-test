import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;

        Arrays.sort(numbers);   // 배열 정렬 (오름차순)
                // 가장 큰 수(마지막 요소)       두번째로 큰 수 (마지막 이전의 요소)
        answer = numbers[numbers.length - 1] * numbers[numbers.length - 2];

        return answer;
    }
}