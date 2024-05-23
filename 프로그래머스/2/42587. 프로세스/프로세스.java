import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        int locationPriority = priorities[location];
        int next = priorities.length-1;
        Deque<Integer> deque = new ArrayDeque<>();
       
        for(int i=0;i<priorities.length;i++){
            deque.offer(priorities[i]);
        }
        
        Arrays.sort(priorities);
        int MaxPriority = priorities[next];
        
        while(true){
            if(deque.peek()==MaxPriority){
                deque.poll();
                answer++;
                next--;
                if(locationPriority==MaxPriority&&location==0){
                    break;
                }else{
                    location--;
                }
                MaxPriority=priorities[next];
                
            }else{
                int inputPriority=deque.poll();
                deque.offer(inputPriority);
                if(location==0){
                    location = deque.size()-1;
                }else{
                    location--;
                }
                
            }
        }
        
        return answer;
    }
}