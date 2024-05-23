import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        int check=arr[0];
        list.add(arr[0]);
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=check){
                list.add(arr[i]);
                check = arr[i];
            }
        }
        int[] answer = new int[list.size()];
        Iterator<Integer> iterset = list.iterator();
        int i=0;
        while(iterset.hasNext()){
            answer[i]=iterset.next();
            i++;
        }

        System.out.println("Hello Java");

        return answer;
    }
}