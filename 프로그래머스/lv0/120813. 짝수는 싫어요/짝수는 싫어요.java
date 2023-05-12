import java.util.*;


class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> list = new ArrayList();
        int[] answer = {};

        for(int i = 0; i <= n; i++) {
            // 홀수이면 list 에 추가!
            if(i % 2 != 0) {
                list.add(i);
            }
        }

        // answer 배열의 크기를 list 의 길이만큼 설정
        answer = new int[list.size()];

        // list 에 있는 값들을 하나씩 answer 배열에다가 할당
        for (int i = 0 ; i < list.size() ; i++ ) {
            answer[i] = list.get(i).intValue();
        }
        
        return answer;
    }
}