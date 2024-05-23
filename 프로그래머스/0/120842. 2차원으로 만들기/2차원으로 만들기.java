class Solution {
    public int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length/n][n];
        int p =0;
        for(int i=0;i<num_list.length/n;i++){
                for(int k=0;k<n;k++){
                 answer[i][k]=num_list[k+p];  
                }
            p+=n;
        }
        
        return answer;
    }
}