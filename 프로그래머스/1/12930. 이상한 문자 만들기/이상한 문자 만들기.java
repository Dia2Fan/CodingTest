class Solution {
    public String solution(String s) {
        String answer = "";
        char[] check =s.toCharArray();
        int checkSpace=0;
        for(int i=0;i<check.length;i++){
            if(check[i]>=97&&(i-checkSpace)%2==0){
                check[i]=(char)(check[i]-32);
                answer+=(char)check[i];
            }else if(check[i]==32){
                checkSpace=i+1;
                answer+=(char)check[i];
            }else if(check[i]>=65&&check[i]<97&&(i-checkSpace)%2!=0){
                check[i]=(char)(check[i]+32);
                answer+=(char)check[i];
            }else{
                answer+=(char)check[i];
                 }
        }
        return answer;
    }
}