class Solution {
    public int solution(int n) {
        int answer = 0;
        String[] str = Integer.toString(n).split("");

        for(int i = 0; i < str.length; i++) {
            answer += Integer.valueOf(str[i]);
        }
        
        return answer;
    }
}