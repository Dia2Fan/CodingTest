import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        PriorityQueue<Integer> negativeQueue = new PriorityQueue<>();
        Deque<Integer> zeroQueue = new ArrayDeque<>();
        PriorityQueue<Integer> positiveQueue = new PriorityQueue<>(Comparator.reverseOrder());
        int totalNumber=0;
        for (int i = 0; i < N; i++) {
            int checkNumber = sc.nextInt();
            if(checkNumber<0){
                negativeQueue.offer(checkNumber);
            }else if(checkNumber==0){
                zeroQueue.offer(checkNumber);
            }else{
                positiveQueue.offer(checkNumber);
            }
        }
        while(!negativeQueue.isEmpty()&&negativeQueue.size()>1){
            int negativeNumber1 = negativeQueue.poll();
            int negativeNumber2 = negativeQueue.poll();
            totalNumber += negativeNumber1 * negativeNumber2;

        }
        if(!negativeQueue.isEmpty()&&!zeroQueue.isEmpty()){
            int negativeNumber=negativeQueue.poll();
            int zeroNumber = zeroQueue.poll();
            totalNumber +=negativeNumber*zeroNumber;

        }
        while (!negativeQueue.isEmpty()){
            totalNumber+=negativeQueue.poll();
        }
        while (!zeroQueue.isEmpty()){
            totalNumber+=zeroQueue.poll();
        }
        while(!positiveQueue.isEmpty()&&positiveQueue.size()>1){
            int positiveNumber1 = positiveQueue.poll();
            int positiveNumber2 = positiveQueue.poll();
            if(positiveNumber1==1||positiveNumber2==1){
                totalNumber+=positiveNumber1;
                totalNumber+=positiveNumber2;
                continue;
            }
            totalNumber += positiveNumber1*positiveNumber2;
        }
        while (!positiveQueue.isEmpty()){
            totalNumber+=positiveQueue.poll();
        }
        System.out.println(totalNumber);

    }


}



