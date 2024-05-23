import java.util.*;
class Solution {
   public int[] solution(int n) {
        ArrayList<Integer> odd = new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(!(i%2==0)){
                odd.add(i);
            }
        }
        int[] answer = new int[odd.size()];
        for (int i = 0 ; i < odd.size() ; i++)
            answer[i] = odd.get(i).intValue();
        return answer;
    }
}