import java.util.*;
public class Main{
    static ArrayList<Integer>[] cities;
    static int wishedDistance;
    static boolean[] visited;
    static int[] distance;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int citiesCount = sc.nextInt();
        int roadsCount = sc.nextInt();
        int Distance = sc.nextInt();
        int startCity = sc.nextInt();
        cities = new ArrayList[citiesCount+1];
        visited = new boolean[citiesCount+1];
        distance = new int[citiesCount+1];
        wishedDistance=Distance;
        for (int i = 0; i < citiesCount+1; i++) {
            cities[i] = new ArrayList<>();
        }
        for (int i = 0; i < roadsCount; i++) {
            int fromCity = sc.nextInt();
            int toCity = sc.nextInt();
            cities[fromCity].add(toCity);
        }
        BFS(startCity);
        for (int i = 0; i < distance.length; i++) {
             if(distance[i]==wishedDistance){
                    cities[0].add(i);
             }
        }
        Collections.sort(cities[0]);
        if(!cities[0].isEmpty()){
            for (Integer i : cities[0]) {
                System.out.println(i);
            }
        }else{
            System.out.println(-1);
        }
    }
    private static void BFS(int statCity){
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        visited[statCity]=true;
        deque.add(statCity);
        while(!deque.isEmpty()){
            int nowCity = deque.poll();
            for (Integer city : cities[nowCity]) {
                if(!visited[city]){
                    visited[city]=true;
                    deque.add(city);
                    distance[city] = distance[nowCity] + 1;
                }
            }
        }
    }
}