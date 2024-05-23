class Solution {
    public int solution(int n) {
        int answer = 1;
        //1+++n 까지 합 (((i-1)*j)+(j*(j+1))/2)
        for(int i=1;i<n;i++){
            for(int j=0;j<n;j++){
                if((((i-1)*j)+(j*(j+1))/2)==n){
                    answer++;
                    break;
                }else if((((i-1)*j)+(j*(j+1))/2)>n){
                    break;
                }
            }
        }
        return answer;
    }
}