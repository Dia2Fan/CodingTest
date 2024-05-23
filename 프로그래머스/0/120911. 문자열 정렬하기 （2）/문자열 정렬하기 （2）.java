import java.util.*;
class Solution {
    public String solution(String my_string) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        char[] X = my_string.toCharArray();
        for(int i=0;i<X.length;i++){
            if(X[i]>=65&&X[i]<=90){
                X[i]+=32;
            }
        }
    Arrays.sort(X);
        for(int i=0;i<X.length;i++){
            sb.append(X[i]);
        }
        
        return sb.toString();
    }
}