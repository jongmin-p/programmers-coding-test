import java.util.Arrays;

class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = {};

        // num1 번째 인덱스부터 ~ num2 번째 인덱스까지 복사 (마지막은 복사 안 되기에 num2 + 1)
        answer = Arrays.copyOfRange(numbers, num1, num2 + 1);
        return answer;
    }
}
