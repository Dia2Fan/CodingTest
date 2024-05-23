import java.util.*;
class Solution {
    public int solution(String A, String B) {
        String check;
        int answer = 0;
        for(int i=0;i<B.length();i++){
        String First = A.substring(A.length()-i);
        String Last = A.substring(0,A.length()-i);
            check= First + Last; 
            if(check.equals(B)){
            return answer;
            }
            answer++;
        }
        answer = -1;
        return answer;
    }
}