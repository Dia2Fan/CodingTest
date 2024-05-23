class Solution {
    public int solution(int a, int b) {
        int answer = 2;
        int B;
        int A;
        B=b; A=a;
        
        while(A!=0){
            int temp =B;
            B=A;
            A=temp%A;   
        }
            b/=B;
        
            while(b%2==0){
                b/=2;
            }
            while(b%5==0){
                b/=5;
            }
            answer = b==1? 1 : 2;
        return answer;
    }
}