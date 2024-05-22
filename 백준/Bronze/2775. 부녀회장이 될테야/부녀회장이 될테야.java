import java.util.*;

public class Main {
    static int[][] apartment = new int[15][15];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int questionNumber = sc.nextInt();
        for (int i = 1; i <= 14; i++) {
            apartment[0][i]=i;
        }
        for (int i = 1; i <=14; i++) {
            for (int j = 2; j <= 14; j++) {
                apartment[i][1]=1;
                apartment[i][j]=apartment[i][j-1]+apartment[i-1][j];
            }
        }
        for (int i = 0; i < questionNumber; i++) {
            int floor = sc.nextInt();
            int number = sc.nextInt();
            System.out.println(apartment[floor][number]);
        }
    }

}