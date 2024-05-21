import java.util.*;

public class Main {
    static int[][] map ;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mapSize = sc.nextInt();
        map = new int[mapSize+1][mapSize+1];
        for (int i = 1; i <= mapSize; i++) {
            for (int j = 1; j <= mapSize; j++) {
                map[i][j] = sc.nextInt();
            }
        }
        for (int k = 1; k <mapSize+1; k++) {
            for (int i = 1; i <mapSize+1; i++) {
                for (int j = 1; j <mapSize+1; j++) {
               if(map[i][k]+map[k][j]>1){
                   map[i][j]=1;
               }
                }
            }
        }


        for (int i = 1; i <= mapSize; i++) {
            for (int j = 1; j <= mapSize; j++) {
                System.out.print(map[i][j]+" ");
            }
            System.out.println();
        }
    }
}