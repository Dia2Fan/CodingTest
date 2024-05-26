import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        long[] rectangle = new long[number+1];
        rectangle[1]=1;
        if(number>=2)rectangle[2]=2;
        for (int i = 3; i <= number; i++) {
            rectangle[i]=(rectangle[i-1]%10007+rectangle[i-2]%10007)%10007;
        }
        System.out.println(rectangle[number]);
    }
}

