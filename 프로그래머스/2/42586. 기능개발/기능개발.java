import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        Deque<Integer> progressRelease = new ArrayDeque<>();
        List<Integer> ReleaseNumber = new ArrayList<>();
        for(int i=0;i<progresses.length;i++){
            progressRelease.offer(progresses[i]);
        }
        int i=0;
        int j=0;
        int check100=0;
        while(i<progresses.length&&(!progressRelease.isEmpty())){
            if(i<progresses.length&&(progresses[i] + speeds[i]*j >= 100)){
                while(i<progresses.length&&(progresses[i] + speeds[i]*j >= 100)){
                    progressRelease.poll();
                    check100++;
                    i++;
                }
                ReleaseNumber.add(check100);
                check100=0;
            }else{
                j++;
            }
        }
        answer = new int[ReleaseNumber.size()];
        int k =0;
        for(int numbers : ReleaseNumber){
            answer[k] = numbers;
                k++;
        }
        return answer;
    }
}