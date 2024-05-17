import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long start = sc.nextLong();
        long end = sc.nextLong();
        boolean[] isPrime = new boolean[(int)Math.sqrt(end)+1];
        Arrays.fill(isPrime,true);
        isPrime[0]=isPrime[1]=false;
        for (int i = 2; i <= Math.sqrt(isPrime.length) ; i++) {
            if(isPrime[i]){
                for (int j = i*i; j <=(int)Math.sqrt(end); j+=i) {
                    isPrime[j]=false;
                }
            }
        }
        long count =0;
        for (int i = 0; i < isPrime.length; i++) {
            if(isPrime[i]){
                int powNum =2;
                while(Math.pow(i,powNum)<=end){
                    if(Math.pow(i,powNum)>=start){
                        count++;
                    }
                    powNum++;
                }
            }
        }
        System.out.println(count);

    }
}