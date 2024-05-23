class Solution {
    public int solution(int n) {
        int answer;
        int max = Math.max(n, 6);
        int min = Math.min(n, 6);
        int temp;
        while(true){
            if(max%min==0){
                answer = min;
                break;
            }else{
            temp=max;
            max=min;
            min=temp%min;   
            }
    
        }
        return answer = ((n/min) *(6/min)*min)/6 ;
    }
}