class Solution {
    public int solution(String[][] board, int h, int w) {
        int answer = 0;
        int[] dh = {0,1,-1,0};
        int[] dw = {1,0,0,-1};
        for(int i=0;i<dh.length;i++){
            try{
                if(board[h+dh[i]][w+dw[i]].equals(board[h][w])){
                    answer++;
                }
            }catch(ArrayIndexOutOfBoundsException e){
            
            }
        }
            
        return answer;
    }
}