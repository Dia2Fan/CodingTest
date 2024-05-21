import java.util.*;

public class Main {
    static int[][] friendMap;
    static int[] baconNumber;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int userNumber = sc.nextInt();
        int relationshipNumber = sc.nextInt();
        friendMap = new int[userNumber +1][userNumber +1];
        baconNumber = new int[userNumber+1];
        for (int i = 1; i < userNumber+1; i++) {
            for (int j = 1; j < userNumber+1; j++) {
                if(i==j){
                    friendMap[i][j] = 0;
                }else{
                    friendMap[i][j] = Integer.MAX_VALUE/2;
                }
            }
        }

        for (int i = 0; i < relationshipNumber; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            friendMap[start][end] = 1;
            friendMap[end][start] = 1;
        }
        for (int k = 1; k < userNumber+1; k++) {
            for (int i = 1; i < userNumber+1; i++) {
                for (int j = 1; j < userNumber+1; j++) {
                    friendMap[i][j] = Math.min(friendMap[i][j],friendMap[i][k]+friendMap[k][j]);
                }
            }
        }
        for (int i = 1; i < userNumber+1; i++) {
            for (int j = 1; j < userNumber+1; j++) {
                baconNumber[i]+=friendMap[i][j];
            }
        }

        int min = Integer.MAX_VALUE;
        int minMan=0;
        for (int i = 1; i <= userNumber; i++) {
            if(min>baconNumber[i]){
                min=baconNumber[i];
                minMan=i;
            }
        }
        System.out.println(minMan);
    }
}