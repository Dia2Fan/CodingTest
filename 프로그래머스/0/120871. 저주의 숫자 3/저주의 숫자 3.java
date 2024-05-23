import java.util.*;
class Solution {
   public int solution(int n) {
        int answer;
        boolean check;
        ArrayList<Integer> curse3 = new ArrayList<>();
        for(int i=1;i<=1000;i++){
            int checkInt;
            checkInt=i;
            check=false;
            if(checkInt%3!=0){
                while(checkInt>0){
                    if(checkInt%10==3){
                        check = false;
                        break;
                    }else{
                        checkInt/=10;
                    }
                    check = true;
                }
            }   
            if(check){
                    curse3.add(i);
            }
        }
        answer=curse3.get(n-1);
        return answer;
    }
}