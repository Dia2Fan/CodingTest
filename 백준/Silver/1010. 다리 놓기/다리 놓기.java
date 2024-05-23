import java.util.*;

public class Main {
    static int[][] bridge = new int[30][30];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int questionNumber = sc.nextInt();
        for (int i = 1; i <=29; i++) {
                bridge[i][0]=1;
                bridge[i][i]=1;
                bridge[i][1]=i;

        }
        for (int i = 3; i <=29; i++) {
            for (int j = 2; j <i; j++) {
                bridge[i][j]=bridge[i-1][j]+bridge[i-1][j-1];
            }
        }
        for (int i = 0; i < questionNumber; i++) {
            int west = sc.nextInt();
            int east = sc.nextInt();
            System.out.println(bridge[east][west]);
        }
    }

}