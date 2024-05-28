import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int width = sc.nextInt();
        int height = sc.nextInt();
        sc.nextLine();
        int[][] dp = new int[width+1][height+1];
        for (int i = 1; i <= width; i++) {
           String[] temp = sc.nextLine().split("");
            for (int j = 1; j <= height; j++) {
               dp[i][j]=Integer.parseInt(temp[j-1]);
            }
        }
        int maxLength =0;
        for (int i = 1; i <= width; i++) {
            for (int j = 1; j <= height; j++) {
                if(dp[i][j]==1){
                    dp[i][j]=Math.min(Math.min(dp[i-1][j],dp[i][j-1]), dp[i-1][j-1]) + 1;
                    maxLength=Math.max(maxLength, dp[i][j]);
                }
            }
        }
        System.out.println((int)Math.pow(maxLength ,2));
    }
}

