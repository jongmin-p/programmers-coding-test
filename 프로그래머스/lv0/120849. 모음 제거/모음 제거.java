class Solution {
    public String solution(String my_string) {
        // a, e, i, o, u 를 전부 공백으로 치환 (replaceAll 메서드)
        return my_string.replaceAll("[aeiou]", "");
    }
}

/*
        String str = "aabbcdd";

        String result1 = str.replace("bcd", "*");       // 특정 문자열만 변환 가능
        String result2 = str.replaceAll("[bcd]", "*");  // 정규식 이용 가능

        System.out.println("replace()    --- result -> " + result1);
        System.out.println("replaceAll() --- result -> " + result2);
*/
