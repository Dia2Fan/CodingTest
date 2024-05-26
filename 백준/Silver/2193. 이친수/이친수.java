import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        long[][] twoFriendNumber = new long[2][number+1];
        twoFriendNumber[0][1]=0;
        twoFriendNumber[1][1]=1;
        for (int i = 2; i <= number; i++) {
            twoFriendNumber[0][i]=twoFriendNumber[0][i-1]+twoFriendNumber[1][i-1];
            twoFriendNumber[1][i]=twoFriendNumber[0][i-1];
        }
        System.out.println(twoFriendNumber[1][number]+twoFriendNumber[0][number]);
    }
}

