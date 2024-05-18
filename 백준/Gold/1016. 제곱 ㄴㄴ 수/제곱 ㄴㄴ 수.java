import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long min = sc.nextLong();
        long max = sc.nextLong();
        boolean[] isSquareFree = new boolean[(int)(max-min)+1];
        Arrays.fill(isSquareFree,true);
        for (int i = 2; (long)i*i <= max; i++) {
            long sq = (long)i*i;
            long start = ((min + sq - 1) / sq) * sq;
            for (long j = start; j <= max; j += sq) {
                isSquareFree[(int)(j-min)] = false;
            }
        }
        int count=0;
        for (int i = 0; i < isSquareFree.length; i++) {
            if(isSquareFree[i]){
                count++;
            }
        }
        System.out.println(count);
    }
}