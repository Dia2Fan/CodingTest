class Solution {
    public String solution(String s, int n) {
        String answer = "";
        char[] check = s.toCharArray();
        for(int i=0;i<check.length;i++){
            if(check[i]>=65&&check[i]<=90){
                check[i]=(char)((check[i]+n-65)%26+65);
                answer+=check[i];
            }else if(check[i]>=97&&check[i]<=122){
                check[i]=(char)((check[i]+n-97)%26+97);
                answer+=check[i];
            }else{
                answer+=check[i];
                 }
        }
        
        return answer;
    }
}