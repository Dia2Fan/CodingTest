import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum=0;
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
        for (int i = 0; i < N; i++) {
            queue.offer(sc.nextInt());
        }
        while (queue.size()!=1){
            int number1 = queue.poll();
            int number2 =queue.poll();
            queue.offer(number1+number2);
            sum+=number1+number2;
        }
        System.out.println(sum);
    }


}