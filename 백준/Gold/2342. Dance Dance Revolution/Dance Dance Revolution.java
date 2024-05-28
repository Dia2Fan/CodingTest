import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][][] DDR = new int[100001][5][5];
        int orders = sc.nextInt();
        if (orders == 0) {
            System.out.println(0);
            return;
        }
        DDR[1][orders][0] = 2;
        DDR[1][0][orders] = 2;
        int minPower = Integer.MAX_VALUE;
        int stopIndex = 1;
        for (int i = 1; i < DDR.length; i++) {
            orders = sc.nextInt();
            if (orders == 0)
                break;
            for (int j = 0; j <= 4; j++) {
                for (int k = 0; k <= 4; k++) {
                    if (DDR[i][j][k] != 0) {
                        if (orders != k) {
                            int cost = j == 0 ? 2 : (Math.abs(orders - j) == 2 ? 4 : (orders == j ? 1 : 3));
                            DDR[i + 1][orders][k] = Math.min(DDR[i + 1][orders][k] == 0 ? Integer.MAX_VALUE : DDR[i + 1][orders][k], DDR[i][j][k] + cost);
                        }
                        if (orders != j) {
                            int cost = k == 0 ? 2 : (Math.abs(orders - k) == 2 ? 4 : (orders == k ? 1 : 3));
                            DDR[i + 1][j][orders] = Math.min(DDR[i + 1][j][orders] == 0 ? Integer.MAX_VALUE : DDR[i + 1][j][orders], DDR[i][j][k] + cost);
                        }
                    }
                }
            }
            stopIndex = i + 1;
        }

        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j <= 4; j++) {
                if (DDR[stopIndex][i][j] != 0 && minPower > DDR[stopIndex][i][j])
                    minPower = DDR[stopIndex][i][j];
            }
        }
        System.out.println(minPower);
    }
}