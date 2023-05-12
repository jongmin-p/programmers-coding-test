class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;

        // 먼저, s1 의 길이만큼 반복
        for(String s : s1) {
            // 중첩 반복 (s2의 길이만큼)
            for(int i = 0; i < s2.length; i++) {
                // 반복 중, s1 배열의 요소와, s2 배열의 요소 중 일치하는 것이 있다면 1씩 추가
                if (s.equals(s2[i])) {
                    answer++;
                }
            }
        }
        return answer;
    }
}