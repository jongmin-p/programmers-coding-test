class Solution {
    public int[] solution(String[] strlist) {
        // 매개 변수로 넘어온 strlist 의 길이만큼 사이즈 지정
        int[] answer = new int[strlist.length];

        // 매개 변수로 넘어온 strlist 길이만큼 돈다.
        for(int i = 0; i < strlist.length;i++) {
            // 돌면서 각 요소의 길이만큼 answer[i] 에 저장
            answer[i] = strlist[i].length();
        }
        
        return answer;
    }
}