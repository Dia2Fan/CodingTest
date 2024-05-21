import java.util.*;

public class Main {
    static int[][] busToCity ;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cityNumber = sc.nextInt();
        int wayNumber = sc.nextInt();
        busToCity = new int[cityNumber+1][cityNumber+1];
        for (int i = 1; i < cityNumber+1; i++) {
            for (int j = 1; j < cityNumber+1; j++) {
                if(i==j){
                    busToCity[i][j]=0;
                }else{
                    busToCity[i][j]=Integer.MAX_VALUE/5;}
            }
        }
        for (int i = 0; i < wayNumber; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int number = sc.nextInt();
            busToCity[x][y] = Math.min(number,busToCity[x][y]);
        }
        for (int k = 1; k <cityNumber+1; k++) {
            for(int i = 1; i <cityNumber+1; i++) {
                for (int j = 1; j <cityNumber+1; j++) {
                    if(i!=j){
                        busToCity[i][j]=Math.min(busToCity[i][j],busToCity[i][k]+busToCity[k][j]);
                    }
                }
            }
        }


        for (int i = 1; i < cityNumber+1; i++) {
            for (int j = 1; j < cityNumber+1; j++) {
                if(busToCity[i][j]!=Integer.MAX_VALUE/5){
                    System.out.print(busToCity[i][j]+" ");    
                }else{
                    System.out.print(0+" ");
                }
                
            }
            System.out.println();
        }
    }
}