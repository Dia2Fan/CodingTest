import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        boolean[] isPrime = new boolean[100000001];
        Arrays.fill(isPrime,true);
        isPrime[0]=isPrime[1]=false;
        for (int i = 2; i <= Math.sqrt(isPrime.length-1); i++) {
            if(isPrime[i]){
                for (int j = i*i; j <= isPrime.length-1; j+=i) {
                    isPrime[j]=false;
                }
            }
        }
        for (int i = N; i < isPrime.length; i++) {
            if(isPrime[i]){
                String check = i+"";
                int start =0;
                int end=check.length();
                while(start<=end){
                    if(check.substring(start,start+1).equals(check.substring(end-1,end))){
                        start++;
                        end--;
                    }else{
                        break;
                    }
                    if(start>=end){
                        System.out.println(i);
                        return;
                    }
                }
            }
        }

    }
}