class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        int maxWidth=dots[0][0];
        int minWidth=dots[1][0];
        int maxLength=dots[0][1];
        int minLength=dots[1][1];
        int Width=0;
        int Length=0;
        if(maxWidth==minWidth){
            minWidth=dots[2][0];
        }
        if(maxLength==minLength){
            minLength=dots[2][1];
        }
        Width=Math.abs(maxWidth-minWidth);
        Length=Math.abs(maxLength-minLength);
        
        return answer=Width*Length;
    }
}