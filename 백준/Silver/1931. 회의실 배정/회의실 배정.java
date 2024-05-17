import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] meetingTime = new int[N][2];
        for (int i = 0; i < N; i++) {
            meetingTime[i][0]=sc.nextInt();
            meetingTime[i][1]=sc.nextInt();
        }
        Arrays.sort(meetingTime, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1]<o2[1] ? -1 :(o1[1]==o2[1] ? (o1[0]<o2[0] ? -1 : (o1[0]==o2[0] ? 0 : 1)): 1);
            }
        });
        int count =1;
        int endTime = meetingTime[0][1];
        for (int i = 1; i < N; i++) {
            if(meetingTime[i][0]>=endTime){
                endTime = meetingTime[i][1];
                count++;
            }
        }
        System.out.println(count);
    }


}



