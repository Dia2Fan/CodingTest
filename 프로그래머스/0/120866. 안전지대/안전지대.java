class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                if(board[i][j]==1){
                    for(int p=0;p<3;p++){
                            for(int k=0;k<3;k++){
                              try{if(board[i+1-p][j+1-k]!=1){
                                   board[i+1-p][j+1-k]=2;
                              }}catch(ArrayIndexOutOfBoundsException e){continue;}  
                            }
                        }   
                    
                    
                }
            }
            
        }
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                if(board[i][j]==0){
                    answer++;
                }
            }
            
        }
        return answer;
    }
}