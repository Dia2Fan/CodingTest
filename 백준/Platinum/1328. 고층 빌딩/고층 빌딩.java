import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int L = sc.nextInt();
        int R = sc.nextInt();
        long[][][] buildings = new long[N+1][L+1][R+1];
        buildings[1][1][1] = 1;
        for (int i = 2; i <=N; i++) {
            for (int j = 1; j <=L; j++) {
                for (int k = 1; k <=R; k++) {
                   buildings[i][j][k] = buildings[i-1][j-1][k]%1000000007+buildings[i-1][j][k-1]%1000000007+(buildings[i-1][j][k]*(i-2))%1000000007;
                }
            }
        }
        System.out.println(buildings[N][L][R]%1000000007);
    }
}

