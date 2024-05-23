class Solution {
    public int solution(int M, int N) {
        int answer = 0;
        answer = (M-1)+(N-1)*M >= (N-1)+(M-1)*N ? (N-1)+(M-1)*N : (M-1)+(N-1)*M;
        return answer;
    }
}