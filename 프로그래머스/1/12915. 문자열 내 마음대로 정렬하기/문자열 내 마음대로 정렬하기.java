import java.util.*;
class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = {};
        Arrays.sort(strings);
        for(int i=0;i<strings.length-1;i++){
            for(int j=i+1;j<strings.length;j++){
                char[] checkA=strings[i].toCharArray();
                char[] checkB=strings[j].toCharArray();
                if(checkA[n]>checkB[n]){
                    String temp =strings[i];
                    strings[i]=strings[j];
                    strings[j]=temp;
                }else if(checkA[n]==checkB[n]){
                    for(int k=0;k<checkA.length;k++){
                        try{if(checkA[k]>checkB[k]){
                        String temp =strings[i];
                        strings[i]=strings[j];
                        strings[j]=temp;
                            break;
                            }else if(checkA[k]<checkB[k]){
                            break;
                        }
                           }catch(Exception e){
                            continue;
                        }
                        }
                    
                }
            }
        }
        answer = strings;
        return answer;
    }
}