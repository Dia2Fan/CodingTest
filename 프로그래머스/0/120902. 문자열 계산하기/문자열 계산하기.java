import java.util.*;
class Solution {
    public int solution(String my_string) {
        int answer = 0;
        StringTokenizer st = new StringTokenizer(my_string," ");
        while(st.hasMoreTokens()){
            String token = st.nextToken();
            switch(token) {
                case "+" -> answer += Integer.parseInt(st.nextToken());
                case "-" -> answer -= Integer.parseInt(st.nextToken());
                default -> answer += Integer.parseInt(token);
            }
        }

        return answer;
    }
}