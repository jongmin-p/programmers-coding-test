class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        String[] each = my_string.split("");

        for(int i = 0; i <= my_string.length() - 1; i++) {
            answer += each[i].repeat(n);
        }

        System.out.println(answer);
        return answer;
    }
}