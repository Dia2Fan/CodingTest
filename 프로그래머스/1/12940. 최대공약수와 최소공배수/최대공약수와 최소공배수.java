class Solution {
    public int[] solution(int n, int m) { 
        int GCD=n;
        int NMG=m;
        int LCM=0;
        int[] answer = {0,0};
        while(NMG>0){
            int temp=GCD;
            GCD=NMG;
            NMG=temp%NMG;
        }
        answer[0] = GCD;
        answer[1] = GCD * (n/GCD)*(m/GCD);
        return answer;
    }
}