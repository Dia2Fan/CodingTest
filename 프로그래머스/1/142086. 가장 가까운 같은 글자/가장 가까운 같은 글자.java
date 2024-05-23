class Solution {
    public int[] solution(String s) {
        
        String[] str = s.split("");
        int[] answer = new int[str.length];
        answer[0]=-1;
        for(int i=str.length-1;i>0;i--){
            for(int j=i-1;j>=0;j--){
                if(str[i].equals(str[j])){
                    answer[i]=i-j;
                    break;
                }else{
                    answer[i]=-1;
                }
            }
        }
        return answer;
    }
}