import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int[] numberList = new int[number];
        int[] LeftSumList = new int[number];
        int[] RightSumList = new int[number];

        for (int i = 0; i <number; i++) {
            numberList[i] = sc.nextInt();
        }
        LeftSumList[0]=numberList[0];
        RightSumList[number-1]=numberList[number-1];
        int max=LeftSumList[0];
        for (int i = 1; i < number; i++) {
            LeftSumList[i]=Math.max(numberList[i],LeftSumList[i-1]+numberList[i]);
            if(max<LeftSumList[i]) max=LeftSumList[i];
        }
        for (int i = number-2; i >=0; i--) {
            RightSumList[i]=Math.max(numberList[i],RightSumList[i+1]+numberList[i]);
            if(max<RightSumList[i])max=RightSumList[i];
        }
        for (int i = 1; i < number-1; i++) {
            int sum = LeftSumList[i-1]+RightSumList[i+1];
            if(max<sum) max=sum;
        }
        System.out.println(max);
    }
}

