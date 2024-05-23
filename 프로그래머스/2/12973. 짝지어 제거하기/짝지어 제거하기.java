import java.util.*;
class Solution
{
    public int solution(String s)
    {
        int answer = -1;
        Stack stack = new Stack();
        String[] check = s.split("");
        for(int i=0;i<check.length;i++){
            if(!stack.empty()&&check[i].equals(stack.peek())){
                stack.pop();
            }else{
                stack.push(check[i]);
            }
        }
        if(stack.empty()){
            answer=1;
        }else{
            answer=0;
        }
        return answer;
    }
}