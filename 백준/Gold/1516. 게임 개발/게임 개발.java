import java.util.*;

public class Main {
    static ArrayList<ArrayList<Integer>> buildings;
    static int[] building;
    static int[] totalBuildTime;
    static int[] buildTime;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int buildingNumber = sc.nextInt();
        buildings = new ArrayList<>();
        building = new int[buildingNumber+1];
        buildTime = new int[buildingNumber+1];
        totalBuildTime = new int[buildingNumber+1];
        for (int i = 0; i <= buildingNumber; i++) {
            buildings.add(new ArrayList<>());
        }
        for (int i = 1; i <= buildingNumber; i++) {
            int number=sc.nextInt();
            buildTime[i]=number;
            int check = sc.nextInt();
            while(check!=-1){
                building[i]++;
                buildings.get(check).add(i);
                check=sc.nextInt();
            }

        }
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        for (int i = 1; i <= buildingNumber; i++) {
            if(building[i]==0){
                deque.offer(i);
            }
        }
        while(!deque.isEmpty()){
            int current = deque.poll();
            for (Integer next : buildings.get(current)) {
                totalBuildTime[next] = Math.max(totalBuildTime[next], totalBuildTime[current] + buildTime[current]);
                building[next]--;
                if(building[next]==0){
                    deque.offer(next);
                }
            }

        }
        for (int i = 1; i <=buildingNumber; i++) {
            totalBuildTime[i] += buildTime[i];
            System.out.println(totalBuildTime[i]);
        }

    }
}