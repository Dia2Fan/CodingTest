import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text1 = sc.nextLine();
        String text2 = sc.nextLine();
        int[][] dp = new int[text1.length()+1][text2.length()+1];
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= text1.length(); i++) {
            for (int j = 1; j <= text2.length(); j++) {
                if(text1.charAt(i-1)==text2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1]+1;
                }else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }

            }
        }
        int i=text1.length();
        int j=text2.length();
        while(i>0&&j>0){
            if(dp[i-1][j]==dp[i][j]){
                i--;
            } else if (dp[i][j-1]==dp[i][j]) {
                j--;
            }else {
                sb.append(text1.charAt(i-1));
                i--;
                j--;
            }
        }
        System.out.println(sb.length());
        System.out.println(sb.reverse());
    }
}

