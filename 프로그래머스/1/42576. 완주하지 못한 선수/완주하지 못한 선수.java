import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Arrays.sort(participant);
        Arrays.sort(completion);
        try{for(int i=0;i<participant.length;i++){
            if(!participant[i].equals(completion[i])){
                return participant[i];
            }
        }}catch(Exception e){
            answer = participant[participant.length-1];
        }
       /* for(int i=0;i<participant.length;i++){
            for(int j=0;j<completion.length;j++){
                if(participant[i].equals(completion[j])){
                    participant[i]=null;
                    completion[j]=null;
                    break;
                }
            }
        }
        for(int i=0;i<participant.length;i++){
            if(participant[i]!=null){
                answer=participant[i];
                break;
            }
        }*/
        return answer;
    }
}