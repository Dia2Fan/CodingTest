import java.util.*;
class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int[] wall = new int[n];
        int j=0;
        for(int i=0;i<wall.length;i++){
            try{if((i+1)==section[j]){
                wall[i]=1;
                    j++;
                }
            }catch(Exception e){
                break;
            }
        }
        for(int i=0;i<wall.length;i++){
            if(wall[i]==1){
                try{
                    for(int k=i;k<=i+m-1;k++){
                        wall[k]=0;
                    }
                }catch(Exception e){
                    answer++;
                    break;
                }
                answer++;

            }
        }
        return answer;
    }
}