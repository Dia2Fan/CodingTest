import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        PriorityQueue<Integer> hallOfFame = new PriorityQueue<>();
        int queueSize = k;
        int days=0;
        while(days<score.length){
            if(hallOfFame.size()>=queueSize&&score[days]>hallOfFame.peek()){
                hallOfFame.offer(score[days]);    
                hallOfFame.poll();
            }else if(hallOfFame.size()>=queueSize&&score[days]<=hallOfFame.peek()){
            }else{
                hallOfFame.offer(score[days]);
            }
            answer[days]=hallOfFame.peek();
            days++;
        }
        
        return answer;
    }
}