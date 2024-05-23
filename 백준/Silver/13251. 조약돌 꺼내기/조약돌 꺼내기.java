import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int stoneColorNumber = sc.nextInt();
        int[] stonesNumber = new int[stoneColorNumber];
        int totalStoneNumber=0;
        for (int i = 0; i < stoneColorNumber; i++) {
            int colorStonesNumber = sc.nextInt();
            stonesNumber[i]=colorStonesNumber;
            totalStoneNumber+=colorStonesNumber;
        }
        double[][] chooseStoneDP= new double[totalStoneNumber+1][totalStoneNumber+1];
        for (int i = 0; i <= totalStoneNumber; i++) {
            chooseStoneDP[i][0]=1;
            chooseStoneDP[i][i]=1;
            chooseStoneDP[i][1]=i;
        }
        for (int i = 3; i <= totalStoneNumber; i++) {
            for (int j = 2; j < i; j++) {
                chooseStoneDP[i][j] = chooseStoneDP[i-1][j]+chooseStoneDP[i-1][j-1];
            }
        }
        int chosenStone = sc.nextInt();
        double wantedStone =0;
        for (int i : stonesNumber) {
            wantedStone+=chooseStoneDP[i][chosenStone];
        }
        System.out.println(wantedStone/chooseStoneDP[totalStoneNumber][chosenStone]);
    }

}