import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        long[][] stairNumber = new long[number + 1][10];
        for (int i = 1; i <= 9; i++) {
            stairNumber[1][i] =1;
        }
        stairNumber[1][0]=0;
        int INTEGER = 1000000000;
        for (int i = 2; i <=number ; i++) {
            stairNumber[i][0]=stairNumber[i-1][1]%INTEGER;
            stairNumber[i][9]=stairNumber[i-1][8]%INTEGER;
            for (int j = 1; j <= 8; j++) {
                stairNumber[i][j]=(stairNumber[i-1][j-1]%INTEGER+stairNumber[i-1][j+1]%INTEGER)%INTEGER;
            }
        }
        long sum = 0;
        for (int i = 0; i <= 9; i++) {
            sum+=stairNumber[number][i]%INTEGER;
        }
        System.out.println(sum%INTEGER);
    }
}

