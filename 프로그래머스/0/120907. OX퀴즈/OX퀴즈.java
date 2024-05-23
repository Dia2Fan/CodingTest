import java.util.*;
class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        for(int i=0;i<quiz.length;i++){
            int check=0;
            StringTokenizer st = new StringTokenizer(quiz[i]);
            while(st.hasMoreTokens()){
                String token = st.nextToken();
                switch(token){
                    case "+"->check+=Integer.parseInt(st.nextToken());
                    case "-"->check-=Integer.parseInt(st.nextToken());
                    case "=" -> {
                        if(check==Integer.parseInt(st.nextToken())){
                            answer[i] = "O";
                        }else{
                            answer[i] = "X";
                        }
                    }

                    default ->check+=Integer.parseInt(token);
                }
            }

        }
        return answer;
    }
}
