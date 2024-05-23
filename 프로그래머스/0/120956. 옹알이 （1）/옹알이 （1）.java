class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        for(int i=0;i<babbling.length;i++){
            babbling[i]=babbling[i].replaceFirst("aya"," ")
                .replaceFirst("ye"," ")
                .replaceFirst("woo"," ")
                .replaceFirst("ma"," ");
            babbling[i]=babbling[i].replace(" ","");
            if(babbling[i].equals("")){
                answer++;
            }
            
            }
        
    return answer;    
    }

}