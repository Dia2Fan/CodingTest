import java.util.*;

public class Main {
    static class Pair {
        int node;
        int weight;

        Pair(int node, int weight) {
            this.node = node;
            this.weight = weight;
        }
    }

    static int[] minDistance;
    static ArrayList<Pair>[] adjList;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nodeNumber = sc.nextInt();
        int edgeNumber = sc.nextInt();
        int startPoint = sc.nextInt();
        adjList = new ArrayList[nodeNumber+1];
        for (int i=0;i<=nodeNumber;i++){
            adjList[i] = new ArrayList<>();
        }
        minDistance = new int[nodeNumber+1];
        Arrays.fill(minDistance,100000000);
        minDistance[startPoint]=0;
        for (int i = 0; i < edgeNumber; i++) {
            int nodeNum = sc.nextInt();
            int nextNode = sc.nextInt();
            int weight = sc.nextInt();
            adjList[nodeNum].add(new Pair(nextNode, weight));
        }
        PriorityQueue<Pair> queue = new PriorityQueue<>(Comparator.comparingInt(a -> a.weight));
        queue.offer(new Pair(startPoint, 0));
        while(!queue.isEmpty()){
            Pair current = queue.poll();
            if (current.weight > minDistance[current.node]) continue;
            for (Pair edge : adjList[current.node]) {
                int newDistance = current.weight + edge.weight;
                if (newDistance < minDistance[edge.node]) {
                    minDistance[edge.node] = newDistance;
                    queue.offer(new Pair(edge.node, newDistance));
                }
            }
        }
        for (int i =1;i< minDistance.length;i++) {
            if(minDistance[i]!=100000000){
                System.out.println(minDistance[i]);
            }else{
                System.out.println("INF");
            }
        }
    }
}