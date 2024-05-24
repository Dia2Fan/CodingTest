import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int aCount=sc.nextInt();
        int zCount=sc.nextInt();
        int K = sc.nextInt();
        int[][] DP = new int[aCount+zCount+1][aCount+zCount+1];
        for (int i = 0; i <DP.length; i++) {
            DP[i][0]=1;
            DP[i][i]=1;
            DP[i][1]=i;
        }
        for (int i = 3; i <= aCount+zCount; i++) {
            for (int j = 2; j<= aCount+zCount; j++) {
                DP[i][j] = DP[i-1][j]+DP[i-1][j-1];
                if(DP[i][j]>1000000000) DP[i][j] = 1000000001;
            }
        }
        if(DP[aCount+zCount][aCount]<K){
            System.out.println(-1);
        }else{
            StringBuilder sb = new StringBuilder();
            int totalNumber =aCount+zCount-1;
            while(!(aCount==0&&zCount==0)){
                if(DP[totalNumber][zCount]<K){
                    K=K-DP[totalNumber][zCount];
                    totalNumber--;
                    zCount--;
                    sb.append("z");
                }else{
                    totalNumber--;
                    aCount--;
                    sb.append("a");
                }
            }
            System.out.println(sb.toString());
        }
    }
}

