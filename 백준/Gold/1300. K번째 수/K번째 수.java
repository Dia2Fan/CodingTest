import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int startPoint = 1;
        int endPoint = K;
        int x =0;
        while (startPoint<=endPoint){
            int middle = startPoint +(endPoint - startPoint)/2;
            int sum=0;
            for (int i = 1; i <= N; i++) {
                sum+=Math.min(middle/i,N);
            }
            if(sum<K){
                startPoint = middle+1;
            }else{
                endPoint = middle-1;
            }
            x=startPoint;
        }
        System.out.println(x);
    }
}