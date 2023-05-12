import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        ArrayList<Integer> list = new ArrayList<>();
        String[] str = my_string.split("");
        int[] answer = {};


        for(String s : str) {
            if (s.matches("[0-9]")) {
                list.add(Integer.valueOf(s));
            }
        }

        // ArrayList 를 일반 정수 배열로 변환
        answer = new int[list.size()];
        
        for (int i = 0 ; i < list.size() ; i++) {
            answer[i] = list.get(i);
        }

        // 배열 오름차순 정렬
        Arrays.sort(answer);
        
        return answer;
    }
}