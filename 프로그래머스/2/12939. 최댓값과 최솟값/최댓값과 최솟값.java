import java.util.*;
class Solution {
    public String solution(String s) {
        StringTokenizer st = new StringTokenizer(s," ");
        int[] check = new int[st.countTokens()];
        int i=0;
        while(st.hasMoreTokens()){
            check[i]=Integer.parseInt(st.nextToken());
            i++;
        }
        Arrays.sort(check);
        StringBuilder sb = new StringBuilder();
        sb.append(check[0]);
        sb.append(" ");
        sb.append(check[check.length-1]);
        return sb.toString();
    }
}
//