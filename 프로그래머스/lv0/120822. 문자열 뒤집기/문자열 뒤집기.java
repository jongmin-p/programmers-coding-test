class Solution {
    public String solution(String my_string) {
        String answer = "";
        String[] each = my_string.split("");            // 문자열 하나씩 쪼개기

        // 문자열의 길이만큼 반복. (인덱스 i 를 역순으로)
        for (int i = my_string.length() - 1; 0 <= i; i--) {
            answer += each[i];      // 문자열을 역순으로 붙이기
        }

        System.out.println(answer);

        return answer;
    }
}