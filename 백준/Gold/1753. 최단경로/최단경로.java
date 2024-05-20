import java.util.*;

public class Main {
    static class Node implements Comparable<Node>{
       int toNext;
       int toLength;

        public Node(int toNext, int toLength) {
            this.toNext = toNext;
            this.toLength = toLength;
        }

        @Override
        public int compareTo(Node o) {
            return this.toLength<o.toLength ? -1 : (this.toLength==o.toLength ? 0 : 1);
        }
    }
    static int[] minDistance;
    static boolean[] visited;
    static ArrayList<Node>[] nodeList;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nodeNumber = sc.nextInt();
        int edgeNumber = sc.nextInt();
        int startPoint = sc.nextInt();
        nodeList= new ArrayList[nodeNumber+1];
        for (int i=1;i<=nodeNumber;i++){
            nodeList[i]=new ArrayList<>();
        }
        minDistance = new int[nodeNumber+1];
        visited = new boolean[nodeNumber+1];
        Arrays.fill(minDistance,100000000);
        minDistance[startPoint]=0;
        for (int i = 0; i < edgeNumber; i++) {
            int nodeNum = sc.nextInt();
            nodeList[nodeNum].add(new Node(sc.nextInt(), sc.nextInt()));

        }
        PriorityQueue<Node> deque = new PriorityQueue<>();
        for (int i = 0; i <minDistance.length; i++) {
            if(minDistance[i]==0){
                deque.offer(new Node(startPoint,0));
            }
        }
        while(!deque.isEmpty()){
            Node current = deque.poll();
           if(visited[current.toNext]) continue;
           visited[current.toNext] = true;
            for (Node node : nodeList[current.toNext]) {
                int newDistance = node.toLength ;
                int newNext = node.toNext;
                if(minDistance[newNext]>minDistance[current.toNext]+newDistance){
                    minDistance[newNext] = minDistance[current.toNext]+newDistance;
                    deque.offer(new Node(newNext, minDistance[newNext]));
                }//최소거리 조정부분 주의하기!
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