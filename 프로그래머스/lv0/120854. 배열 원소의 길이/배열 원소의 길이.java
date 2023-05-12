import java.util.*;

class Solution {
    public int[] solution(String[] strlist) {
        // 각 요소(문자열) 의 글자수를 동적으로 담을 공간
        ArrayList<Integer> list = new ArrayList<>();
        // 각 문자열의 글자수가 담겨져 있는, ArrayList<Integer> 를 정수 배열로 변환해서 담을 곳
        int[] answer = {};

        // 1. 각 요소의 글자수를 list 에 담는다 (동적 배열)
        for(String str : strlist) {
            list.add(str.length());
        }

        // 2. ArrayList 를 int 배열로 변환
        // 2-1. int 배열 사이즈 지정
        answer = new int[list.size()];

        // 2-2. ArrayList 에 담긴 i 번째 값을,  int 배열의 i 번째에다가 복사
        for (int i = 0 ; i < list.size() ; i++ ) {
            answer[i] = list.get(i).intValue();
        }

        return answer;
    }
}

/*
        int[] answer = new int[strlist.length];

        for(int i = 0; i < strlist.length; i++){
            answer[i] = strlist[i].length();
        }
        
        return answer;
*/