import java.util.*;
//코드 리펙토링
public class Main {
    static int[] minCheck;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        minCheck = new int[N+1];
        for (int i = 2; i <= N; i++) {
            minCheck[i]=minCheck[i-1]+1;
            if(i%2==0)minCheck[i]=Math.min(minCheck[i],minCheck[i/2]+1);
            if(i%3==0)minCheck[i]=Math.min(minCheck[i],minCheck[i/3]+1);
        }
        System.out.println(minCheck[N]);
    }
}

