class Solution {
    public int solution(String str1, String str2) {
        // 문자열 str1 안에 str2 가 포함돼 있으면 1 반환, 아니면 2 반환
        return str1.indexOf(str2) != -1 ? 1 : 2;
    }
}