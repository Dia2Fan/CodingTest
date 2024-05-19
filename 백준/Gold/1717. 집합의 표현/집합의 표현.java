import java.util.*;

public class Main {
    static int[] values;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numbers = sc.nextInt();
        int questionNumber = sc.nextInt();
        values = new int[numbers+1];
        for (int i = 0; i <=numbers ; i++) {
            values[i]=i;
        }
        for (int i = 0; i < questionNumber; i++) {
            int what = sc.nextInt();
            int values1 = sc.nextInt();
            int values2 = sc.nextInt();
            if(what==0){
                union(values1,values2);
            }else if(what==1){
                checkSet(values1,values2);
            }
        }


    }

    private static void union(int value1, int value2) {
        int values1=find(value1);
        int values2=find(value2);
        if(values1!=values2){
            values[values2]=values1;
        }
    }

    private static int find(int value1){
        if(values[value1]!=value1){
            return values[value1]=find(values[value1]);// 이부분 실수하지 않기!
        }else{
            return value1;
        }
    }

    private static void checkSet(int values1, int values2) {
        int value1 = find(values1);
        int value2 = find(values2);
        if(value1==value2){
                System.out.println("YES");
        }else{
                System.out.println("NO");
        }

    }
}