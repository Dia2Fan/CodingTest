import java.util.*;
class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        Stack stack = new Stack();
        for(int i=0;i<ingredient.length;i++){
            if(stack.search(1)==3&&stack.search(2)==2&&stack.search(3)==1&&ingredient[i]==1){
                stack.push(ingredient[i]);
                stack.pop();
                stack.pop();
                stack.pop();
                stack.pop();
                answer++;
            }else{
                stack.push(ingredient[i]);
            }
        }
        
        return answer;
    }
}