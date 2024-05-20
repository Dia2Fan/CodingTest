import java.util.*;

public class Main {
    static class Bus implements Comparable<Bus>{
        int endPoint;
        int cost;
        public Bus(int endPoint,int cost){
            this.endPoint = endPoint;
            this.cost = cost;
        }
        @Override
        public int compareTo(Bus o){
            return Integer.compare(this.cost, o.cost);
        }
    }
    static ArrayList<Bus>[] busList;
    static boolean[] visited;
    static int[] toCityCost;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int citiesNumber = sc.nextInt();
        int busesNumber = sc.nextInt();
        busList = new ArrayList[citiesNumber+1];
        visited = new boolean[citiesNumber+1];
        toCityCost = new int[citiesNumber+1];
        Arrays.fill(toCityCost,Integer.MAX_VALUE);
        for (int i = 1; i <= citiesNumber; i++) {
            busList[i] = new ArrayList<>();
        }
        for (int i = 0; i < busesNumber; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            int cost = sc.nextInt();
            busList[start].add(new Bus(end,cost));
        }
        int start = sc.nextInt();
        int end = sc.nextInt();
        toCityCost[start]=0;
        PriorityQueue<Bus> queue = new PriorityQueue<>();
        queue.offer(new Bus(start,0));
        while(!queue.isEmpty()){
            Bus nowBus = queue.poll();
            if(visited[nowBus.endPoint]) continue;
            visited[nowBus.endPoint] =true;
            for (Bus bus : busList[nowBus.endPoint]) {
                int NextCity = bus.endPoint;
                int Cost = bus.cost;
                if(toCityCost[NextCity]>toCityCost[nowBus.endPoint]+Cost){
                    toCityCost[NextCity]=toCityCost[nowBus.endPoint]+Cost;
                    queue.offer(new Bus(NextCity,toCityCost[NextCity]));
                }
            }

        }
        System.out.println(toCityCost[end]);
    }
}