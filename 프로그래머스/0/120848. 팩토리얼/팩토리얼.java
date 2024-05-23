class Solution {
    public int solution(int n) {
        int answer = 1;
while(n>=Factorial(answer)){
    answer++;
}   
    return answer-1;
    }
    
public static int Factorial(int i){
    if(i<=1){
        return i;
            }
    return Factorial(i-1)*i;
}
}

