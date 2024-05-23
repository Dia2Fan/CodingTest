class Solution {
    public String solution(int[] food) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        for(int i=1;i<food.length;i++){
            if(food[i]%2==0){
                sb.append((i+"").repeat(food[i]/2));
            }else if(food[i]%2!=0&&food[i]>1){
                sb.append((i+"").repeat((food[i]-1)/2));
            }
        }
        answer = sb.toString()+"0"+sb.reverse().toString();
        return answer;
    }
}