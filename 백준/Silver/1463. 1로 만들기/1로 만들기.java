import java.util.*;

public class Main {
    static int[] minCheck;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        minCheck = new int[N+1];
        for (int i = 1; i <= N; i++) {
            if(minCheck[i]!=0){
                minCheck[i]=Math.min(minCheck[i],minCheck[i-1]+1);
            }else{
                minCheck[i]=minCheck[i-1]+1;
            }
            if(2*i<=N){
                if(minCheck[2*i]!=0){
                    minCheck[2*i]=Math.min(minCheck[i]+1,minCheck[2*i]);
                }else{
                    minCheck[2*i]=minCheck[i]+1;
                }
            }
            if(3*i<=N){
                if(minCheck[3*i]!=0){
                    minCheck[3*i]=Math.min(minCheck[i]+1,minCheck[3*i]);
                }else{
                    minCheck[3*i]=minCheck[i]+1;
                }
            }
        }

        System.out.println(minCheck[N]-1);
    }
}

