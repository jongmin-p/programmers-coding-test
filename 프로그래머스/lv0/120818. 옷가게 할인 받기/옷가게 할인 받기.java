class Solution {
    public int solution(int price) {
        int answer = 0;
        
        if (price >= 500000) {
            answer = (int)(price * 0.8); // 정수 형변환 해줘야 에러 안 뜲.
        } else if (price >= 300000) {
            answer = (int)(price * 0.9);
        } else if (price >= 100000) {
            answer = (int)(price * 0.95);
        } else {
            answer = (int)(price);
        }
        
        return answer;
    }
}