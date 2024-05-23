import java.util.*;
class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        String X = num+"";
        String[] Y = X.split("");
        for(int i=0;i<Y.length;i++){
            if(Y[i].equals(k+"")){
                answer=i+1;
                break;
            }else{answer=-1;}
        }
        return answer;
    }
}