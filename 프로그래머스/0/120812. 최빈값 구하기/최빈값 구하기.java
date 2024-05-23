import java.util.*;
class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int max=0;
        int count = 0;
         HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < array.length; i++) {
            map.put(array[i], map.getOrDefault(array[i],0) + 1);  
        }
        for(int check : map.keySet()){
            if(max<map.get(check)){
                answer = check;
                max=map.get(check);
                count=1;
            }else if(max==map.get(check))
                count++;
            } 

         if(count>1){
            return answer = -1;
        }
        return answer;
    }
}