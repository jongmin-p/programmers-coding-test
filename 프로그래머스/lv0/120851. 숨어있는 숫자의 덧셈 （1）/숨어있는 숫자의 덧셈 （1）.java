class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] str = my_string.split("");

        // 만약 문자열 str 각 요소 중에서, 정수 0 ~ 9 사이의 숫자가 나오면,
        // 해당 문자열을 정수로 바꾼 후 answer 에 더해라
        for (String s : str) {
            if (s.matches("[0-9]")) {
                answer += Integer.valueOf(s);
            }
        }

        return answer;
    }
}