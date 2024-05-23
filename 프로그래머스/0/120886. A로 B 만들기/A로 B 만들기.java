import java.util.*;
class Solution {
    public int solution(String before, String after) {
        int answer = 1;
        String[]Before=before.split("");
        String[]After=after.split("");
        Arrays.sort(Before);
        Arrays.sort(After);
        for(int i=0;i<Before.length;i++){
            if(Before[i].equals(After[i])){
            }else{answer=0;
                 break;}
        }
        return answer;
    }
}