class Solution {
    public int[] solution(String[] wallpaper) {
        int[] answer = {50,50,0,0};
        for(int i=0;i<wallpaper.length;i++){
            for(int j=0;j<wallpaper[i].length();j++){
                String[] check = wallpaper[i].split("");
                if(check[j].equals("#")){
                   if(i<answer[0]){
                       answer[0]=i;
                   }
                   if(i+1>answer[2]){
                       answer[2]=i+1;
                   }
                   if(j<answer[1]){
                       answer[1]=j;
                   }
                   if(j+1>answer[3]){
                       answer[3]=j+1;
                   } 
                }
            }
        }
        
        return answer;
    }
}