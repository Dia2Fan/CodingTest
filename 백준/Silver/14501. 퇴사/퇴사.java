import java.util.*;
//
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int days = sc.nextInt();
        int[][] moneyList = new int[2][days + 1];
        for (int i = 1; i <= days; i++) {
            moneyList[0][i] = sc.nextInt(); //Ti
            moneyList[1][i] = sc.nextInt(); //Pi
        }
        int[] maxMoney = new int[days + 2];

        for (int i = 1; i <= days; i++) {
            // 상담을 받지 않는 경우를 고려하여 maxMoney[i]를 업데이트
            maxMoney[i] = Math.max(maxMoney[i], maxMoney[i-1]);

            // 상담을 받는 경우를 고려하여 maxMoney[i + moneyList[0][i]]를 업데이트
            if (i + moneyList[0][i] <= days + 1) {
                maxMoney[i + moneyList[0][i]] = Math.max(maxMoney[i + moneyList[0][i]], maxMoney[i] + moneyList[1][i]);
            }
        }
        // 마지막 날에 상담을 받지 않는 경우를 고려하여 maxMoney[days + 1]를 업데이트
        maxMoney[days + 1] = Math.max(maxMoney[days + 1], maxMoney[days]);

        System.out.println(maxMoney[days + 1]);
    }
}
//import java.util.*;
// 최초 코드 -> 상담을 하루 쉬고 다음날 상담을 받을지 아니면 오늘 상담을 받을지를 고려하지 않았음,무조건 상담이 끝나면 다음 일을 수락하도록 설계됨
//해결1 : 상담일이 1인건 해결할 수 있다는 점을 고려해서 maxMoney의 최대범위를 1 더 늘려준다.(지금 코드로는 마지막날 상담일1인 부분이 고려되지 않을 수 있음)
//해결2 : 상담을 해결했을때 끝나는 날에 상담을 받을 지, 아니면 다음 날 상담을 받을지 고려하게 코드를 수정
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int days = sc.nextInt();
//        int[][] moneyList = new int[2][days + 1];
//        for (int i = 1; i <= days; i++) {
//            moneyList[0][i]= sc.nextInt();//Ti
//            moneyList[1][i]= sc.nextInt();//Pi
//        }
//        int[] maxMoney = new int[days + 1];
//
//        for (int i = 1; i <=days ; i++) {
//            if(i+moneyList[0][i]<=days+1){
//
//                if(i+moneyList[0][i]<=days){
//                    maxMoney[i + moneyList[0][i]] = Math.max(maxMoney[i + moneyList[0][i]], maxMoney[i] + moneyList[1][i]);
//                }
//                maxMoney[i]+=moneyList[1][i];
//            }
//            System.out.println(maxMoney[i]);
//        }
//        int maxValue =0;
//        for (int i : maxMoney) {
//            if(maxValue<i){
//                maxValue=i;
//            }
//        }
//        System.out.println(maxValue);
//    }
//}
//


