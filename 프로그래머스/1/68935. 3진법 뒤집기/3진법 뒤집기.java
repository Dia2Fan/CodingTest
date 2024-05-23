class Solution {
    public int solution(int n) {
       int answer = 0;
        long newn=0;
        int a=0;
        while(Math.pow(3,a)<=n){
            a++;
        }
        a-=1;

        StringBuilder sb = new StringBuilder();
        for(int i=a;i>=0;i--){
            sb.append((int)(n/Math.pow(3,i)));
            System.out.println((int)(n/Math.pow(3,i)));
            n%= (int) Math.pow(3,i);
        }
        newn = Long.parseLong(sb.reverse().toString());
        System.out.println(newn);
        for(int i=0;newn>0;i++){
            answer+= (int) ((newn%10)*Math.pow(3,i));
            newn/=10;
        }

        return answer;
    }
}