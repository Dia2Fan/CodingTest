class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        for(int a =i;a<=j;a++){
            String check = a+"";
            char[] check1=check.toCharArray();
            for(int p=0;p<check1.length;p++){
                if((check1[p]-48)==k){
                    answer++;
                    
                }
            }
        }
        return answer;
    }
}