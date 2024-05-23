class Solution {
    public String solution(String my_string) {
        char[] cha=my_string.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<cha.length;i++){
            if(cha[i]>=65&&cha[i]<=90){
                cha[i]+=32;
                sb.append(cha[i]);
            }else if(cha[i]>=97&&cha[i]<=122){
                cha[i]-=32;
                sb.append(cha[i]);
            }
        }
        
        return sb.toString();
    }
}