import java.util.*;

public class Main {
    static int[][] combination;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int combinationNumber = sc.nextInt();
        int wantNumber = sc.nextInt();
        combination = new int [combinationNumber+1][combinationNumber+1];
        for (int i = 0; i <= combinationNumber; i++) {
            combination[i][0]=1;
            combination[i][1]=i;
            combination[i][i]=1;
        }
        for (int i = 3; i <= combinationNumber; i++) {
            for (int j = 2; j <= i; j++) {
                combination[i][j]=combination[i-1][j]+combination[i-1][j-1];
            }
        }
        System.out.println(combination[combinationNumber][wantNumber]);
    }

}