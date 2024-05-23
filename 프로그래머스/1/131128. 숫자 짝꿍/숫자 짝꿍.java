import java.util.*;
class Solution {
    public String solution(String X, String Y) {
        String answer = "";
        char[] XC = X.toCharArray();
        char[] YC = Y.toCharArray();
        Arrays.sort(XC);
        Arrays.sort(YC);
        StringBuilder sb = new StringBuilder();
        int i=0;
        int j=0;
        while(i<XC.length&&j<YC.length){
            if(XC[i]==YC[j]){
                sb.append(XC[i]);
                i++;
                j++;
            }else if(XC[i]>YC[j]){
                j++;
            }else if(XC[i]<YC[j]){
                i++;
            }
        }
        sb.reverse();
        answer = sb.toString();
       try{ if(answer.equals("")){
            answer="-1";
        }else if(Integer.parseInt(answer)==0){
            answer="0";
        }}catch(Exception e){
       
    }
        return answer;
    }
}