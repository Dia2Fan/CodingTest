import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lessonNumber = sc.nextInt();
        int blueRayNumber = sc.nextInt();
        int endTime =0;
        int startTime=0;
        int[] lessonNumbers = new int[lessonNumber];
        for (int i = 0; i < lessonNumber; i++) {
            lessonNumbers[i]= sc.nextInt();
            endTime +=lessonNumbers[i];
            if(startTime<lessonNumbers[i]) startTime=lessonNumbers[i];
        }

        while(startTime<= endTime){
            int middle = startTime+ (endTime - startTime)/2;
            int sum=0;
            int count=0;
            for (int i = 0; i < lessonNumbers.length; i++) {
                if(sum+lessonNumbers[i]>middle){
                    count++;
                    sum=0;
                }
                sum+=lessonNumbers[i];
            }
            if(sum!=0) count++;
            if(count<=blueRayNumber){
                endTime = middle-1;
            }else{
                startTime=middle+1;
            }

        }
        System.out.println(startTime);
    }

}



