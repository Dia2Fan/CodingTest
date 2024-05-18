import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int totalNumber =sc.nextInt();
        for(int i=0;i<totalNumber;i++){
            int number1 = sc.nextInt();
            int number2 = sc.nextInt();
            LCM(number1,number2);
        }
    }

    private static void LCM(int number1, int number2) {
        int max = Math.max(number1,number2);
        int min = Math.min(number1,number2);
        
        while(min!=0){
            int temp =min;
            min = max % min;
            max = temp;
        }
        System.out.println(number1*number2/max);
    }
}