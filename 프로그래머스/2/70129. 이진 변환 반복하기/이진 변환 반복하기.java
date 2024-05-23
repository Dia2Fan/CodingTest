class Solution {
    public int[] solution(String s) {
        int[] answer = {0,0};
        int count =0;
        int countZero=0;
        while(!s.equals("1")){
            int countLength=s.length();
            s=s.replace("0","");
            countZero+=countLength-s.length();
            s=Integer.toBinaryString(s.length());
            count++;
        }
        answer[0]=count;
        answer[1]=countZero;
        return answer;
    }
}