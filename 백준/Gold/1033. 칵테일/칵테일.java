import java.util.*;
public class Main{
    static class Ingredient{
        int toIndex;
        int myRatio;
        int yourRatio;

        public Ingredient(int toIndex, int myRatio, int yourRatio) {
            this.toIndex = toIndex;
            this.myRatio = myRatio;
            this.yourRatio = yourRatio;
        }
    }
    static ArrayList<Ingredient>[] list;
    static long LCM=1;
    static boolean[] visited;
    static long[] ratios;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int totalIngredientNumber = sc.nextInt();
        visited=new boolean[totalIngredientNumber];
        list = new ArrayList[totalIngredientNumber];
        ratios = new long[totalIngredientNumber];
        for (int i = 0; i < totalIngredientNumber; i++) {
            list[i] = new ArrayList<>();
        }
        for (int i = 0; i < totalIngredientNumber-1; i++) {
            int myIngredientNumber= sc.nextInt();
            int toIngredientNumber = sc.nextInt();
            int myRatio = sc.nextInt();
            int yourRatio= sc.nextInt();
            list[myIngredientNumber].add(new Ingredient(toIngredientNumber,myRatio,yourRatio));
            list[toIngredientNumber].add(new Ingredient(myIngredientNumber,yourRatio,myRatio));
            LCM *= LCM(myRatio,yourRatio);

        }
        ratios[0]=LCM;
        DFS(0);
        long mgcd = ratios[0];
        for (int i = 1; i < ratios.length; i++) {
            mgcd = GCD(mgcd,ratios[i]);
        }
        for (int i = 0; i < ratios.length; i++) {
            System.out.println(ratios[i] / mgcd);
        }

    }
    private static void DFS(int index){
            visited[index]=true;
            for (Ingredient myIngredient : list[index]) {
                if(!visited[myIngredient.toIndex]){
                    visited[myIngredient.toIndex]=true;
                    ratios[myIngredient.toIndex] = ratios[index] * myIngredient.yourRatio / myIngredient.myRatio ;
                    DFS(myIngredient.toIndex);
                }
            }

    }
    private static long GCD(long number1, long number2) {
        long max = Math.max(number1,number2);
        long min = Math.min(number1,number2);

        while(min!=0){
            long temp =min;
            min = max % min;
            max = temp;
        }
        return max;
    }
    private static long LCM(long number1, long number2) {
        long gcd = GCD(number1,number2);
    return number1*number2/gcd;
    }
}