class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        int check = n;
        StringBuilder sb = new StringBuilder(); 
        while(check>0){
            sb.append(check % k); 
            check /= k;
        }
        String[] checkList = sb.reverse().toString().split("0");
        for(int i=0;i<checkList.length;i++){
            if(!checkList[i].equals("")){
                if(isPrime(Long.parseLong(checkList[i]))) answer++;
            }
        }
        return answer;
    }
    public boolean isPrime(long n){
        if(n<2)return false;
        if(n==2||n==3) return true;
        boolean check = true;
        for(long i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                check = false;
                break;
            }else{
                check = true;
            }
        }
        return check;
        }
    
}