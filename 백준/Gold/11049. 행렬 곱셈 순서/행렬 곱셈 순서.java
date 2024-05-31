import java.util.*;

public class Main {
    static int[][] matrix;
    static int[][] minSum;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        matrix = new int[size+1][2];
        minSum = new int[size+1][size+1];
        for (int i = 0; i <= size; i++) {
            for (int j = 0; j <= size; j++) {
                minSum[i][j]=-1;
            }
        }
        for (int i = 1; i <= size; i++) {
            matrix[i][0]= sc.nextInt();
            matrix[i][1]= sc.nextInt();
        }
        int result=matrixCalculate(1,size);
        System.out.println(result);

    }
    public static int matrixCalculate(int start,int end){
        if(minSum[start][end]!=-1)return minSum[start][end];
        if(start==end) return 0;
        if(end==start+1) return matrix[start][0]*matrix[start][1]*matrix[end][1];
            int result = Integer.MAX_VALUE;
            for (int i = start; i <end; i++) {
                result=Math.min(result,matrix[start][0]*matrix[i][1]*matrix[end
                        ][1]+matrixCalculate(start,i)+matrixCalculate(i+1,end));
            }
        minSum[start][end]=result;
            return result;

    }
}


