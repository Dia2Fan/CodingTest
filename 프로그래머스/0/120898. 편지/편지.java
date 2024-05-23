class Solution {
    public int solution(String message) {
        int answer = 0;
        String[] mes1 = message.split("");
            answer = mes1.length * 2;
        return answer;
    }
}