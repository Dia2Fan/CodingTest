class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        int check = (2*(k-1)%numbers.length);
        
        answer=numbers[check];
        
        return answer;
    }
}