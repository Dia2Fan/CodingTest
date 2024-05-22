import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for (int i = 1; i <= T; i++) {
            int K = scanner.nextInt();
            int N = scanner.nextInt();
            System.out.println(apartmentPeople(K, N));
        }
    }

    public static int apartmentPeople(int k, int n) {
        int people=0;
        int[][] apartment = new int[k+1][n];
        for (int i=0;i<k+1;i++) {
            for (int j=0;j<n;j++) {
                apartment[0][j] = j+1;
                apartment[i][0] =1;
            }

        }

        for (int i=1;i<k+1;i++) {
            for (int j=1;j<n;j++) {
                apartment[i][j]=apartment[i][j-1]+apartment[i-1][j];
            }
        }
        people=apartment[k][n-1];
        return people;
    }
}