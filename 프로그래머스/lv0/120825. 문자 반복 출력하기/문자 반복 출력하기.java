class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        String[] eachLetter = my_string.split("");            // 문자열 쪼개기

        // 문자열의 길이 - 1 만큼 반복
        for(int i = 0; i <= my_string.length() - 1; i++) {
            // 쪼갠 문자열의 각 단어들(eachLetter[i]) 을 n 번씩 반복해서 이어 붙이기
            answer += eachLetter[i].repeat(n);
        }

        return answer;
    }
}
