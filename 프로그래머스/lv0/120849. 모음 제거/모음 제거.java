class Solution {
    public String solution(String my_string) {
        // a, e, i, o, u 를 전부 공백으로 치환 (replaceAll 메서드)
        return my_string.replaceAll("[aeiou]", "");
    }
}