import java.util.*;
class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] check = s.split(" ");
        for(int i=check.length-1;i>=0;i--){
            if(check[i].equals("Z")){
                check[i-1]="0";
            }else{
                answer+=Integer.parseInt(check[i]);
            }
        }
        return answer;
    }
}