import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
            long number1 = sc.nextLong();
            long number2 = sc.nextLong();
            long number=GCD(number1,number2);
            StringBuilder sb = new StringBuilder();
            for (long i = 0; i < number; i++) {
            sb.append(1);
        }
        System.out.println(sb.toString());
    }

    private static long GCD(Long number1, Long number2) {
        long max = Math.max(number1,number2);
        long min = Math.min(number1,number2);

        while(min!=0){
            long temp =min;
            min = max % min;
            max = temp;
        }
        return max;
    }
}