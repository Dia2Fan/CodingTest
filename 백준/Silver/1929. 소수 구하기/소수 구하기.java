import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();

        if(start <= 2){
            System.out.println(2);
            start = 3;
        }

        for (int i = start; i <=end; i++) {
            boolean checkPrime =true;
            for (int j = 2; j*j<=i ; j++) {
                if(i%j==0){
                    checkPrime=false;
                    break;
                }
            }
            if(checkPrime)System.out.println(i);
        }
    }
}