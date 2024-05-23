import java.util.*;
class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        int[] stageAttachCount = new int[N];
        int[] stageAliveCount = new int[N];
        Arrays.sort(stages);
        for(int i=0;i<N;i++){
            answer[i]=i+1;
        }
        for(int i=0;i<stages.length;i++){
            for(int j=0;j<stageAttachCount.length;j++){
                if((j+1)==stages[i]){
                    stageAliveCount[j]++;
                }
                if((j+1)<=stages[i]){
                    stageAttachCount[j]++;
                }else{
                    break;
                }
            }     
        }
        for(int i=0;i<N-1;i++){
            for(int j=i;j<N;j++){
                if((double)stageAliveCount[i]/stageAttachCount[i]<(double)stageAliveCount[j]/stageAttachCount[j]){
                    int temp=answer[i];
                    answer[i]=answer[j];
                    answer[j]=temp;
                    int temp1=stageAliveCount[i];
                    stageAliveCount[i]=stageAliveCount[j];
                    stageAliveCount[j]=temp1;
                    int temp2=stageAttachCount[i];
                    stageAttachCount[i]=stageAttachCount[j];
                    stageAttachCount[j]=temp2;
                    
                }else if((double)stageAliveCount[i]/stageAttachCount[i]==(double)stageAliveCount[j]/stageAttachCount[j]&&answer[i]>answer[j]){
                    int temp=answer[i];
                    answer[i]=answer[j];
                    answer[j]=temp;
                    int temp1=stageAliveCount[i];
                    stageAliveCount[i]=stageAliveCount[j];
                    stageAliveCount[j]=temp1;
                    int temp2=stageAttachCount[i];
                    stageAttachCount[i]=stageAttachCount[j];
                    stageAttachCount[j]=temp2;
                }
            }
        }
        
        return answer;
    }
}