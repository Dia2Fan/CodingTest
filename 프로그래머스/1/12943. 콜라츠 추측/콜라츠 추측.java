class Solution {
    public int solution(int num) {
        int answer = 0;
        long num1 =num;
        while(num1!=1){
            if(num1%2==0){
                num1/=2;
                answer++;
            }else{
                num1 = num1*3+1;
                answer++;
             }
          if(answer==500){
            answer=-1;
              break;
        }   
        }
       
        return answer;
    }
}