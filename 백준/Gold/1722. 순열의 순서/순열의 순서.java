import java.util.*;
//공부 더 해서 복습할것!
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        long[] Factorial=new long[21];
        boolean[] visited = new boolean[21];
        int[] answer1 = new int[21];
        Factorial[0]=1;
        for (int i = 1; i <= 20; i++) {
            Factorial[i]=i*Factorial[i-1];
        }
        sc.nextLine();
        int whatToDo = sc.nextInt();
        if(whatToDo==1){
            long order =sc.nextLong();
            for (int i = 1; i <=num; i++) {
                for (int j = 1,count=1; j <= num; j++) {
                    if(visited[j])continue;
                    if(order <= count * Factorial[num-i]){
                        order-=(count-1)*Factorial[num-i];//Factorial로 순서 잡는것까지는 해결, 왜 order 값을 빼줘야하는건가?
                        answer1[i]=j;
                        visited[j]=true;
                        break;
                    }
                    count++;
                }
            }
            for (int i = 1; i <= num; i++) {
                System.out.print(answer1[i]+" ");
            }


        }else{
            long answer2 =1;
            for (int i = 1; i <=num; i++) {
                answer1[i]=sc.nextInt();
                long count=0;
                for (int j = 1; j <answer1[i]; j++) {
                    if(!visited[j]){
                        count++;
                    }
                }
                answer2 +=count*Factorial[num-i];
                visited[answer1[i]]=true;
            }
            System.out.print(answer2);
        }

    }
}

