import java.util.*;

public class Main {
    static int[] city;
    static boolean[][] citiesData;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cities = sc.nextInt();
        int roadData = sc.nextInt();
        city = new int[cities +1];
        for (int i = 0; i <= cities; i++) {
            city[i]=i;
        }
        citiesData = new boolean[cities+1][cities+1];
        for (int i = 1; i <=cities; i++) {
            for (int j = 1; j <=cities; j++) {
                int check=sc.nextInt();
                if(check==1&&!citiesData[i][j]){
                    citiesData[i][j]=true;
                    citiesData[j][i]=true;
                    union(city[i],city[j]);
                }
            }
        }
        int startCity=sc.nextInt();
        int isConnected=city[find(startCity)];
        for (int i = 1; i <=roadData-1; i++) {
            int check = sc.nextInt();
            if(city[find(check)]!=isConnected){
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }



    private static void union(int value1, int value2) {
        int myValue1=find(value1);
        int myValue2=find(value2);
        city[myValue2]=myValue1;
    }

    private static int find(int value1){
        if(city[value1]==value1){
            return value1;
        }else{
            return city[value1] = find(city[value1]);
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