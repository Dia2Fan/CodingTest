import java.util.*;

public class Main {
    static class Node implements Comparable<Node>{
        int start ;
        int end ;
        int value;
        public Node(int start,int end, int value){
            this.start =start;
            this.end =end;
            this.value = value;
        }

        public int compareTo(Node o){
            return this.value - o.value;
        }
    }
    static int[] node;
    static ArrayList<Node>[] nodeList;
    static int totalValue=0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nodeNumber = sc.nextInt();
        int edgeNumber = sc.nextInt();
        node = new int[nodeNumber+1];
        nodeList = new ArrayList[nodeNumber+1];
        for (int i = 1; i <= nodeNumber; i++) {
            node[i]=i;
            nodeList[i] = new ArrayList<>();
        }
        for (int i = 0; i < edgeNumber; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            int value = sc.nextInt();
            nodeList[start].add(new Node(start,end,value));
        }
        ArrayList<Node> nodeOrder = new ArrayList<>();
        for (ArrayList<Node> nodes : nodeList) {
            if(nodes!=null)nodeOrder.addAll(nodes);
        }
        Collections.sort(nodeOrder);
        for (int i = 0; i < nodeOrder.size(); i++) {
            if(find(nodeOrder.get(i).start)!=find(nodeOrder.get(i).end)){
                union(nodeOrder.get(i).start,nodeOrder.get(i).end);
                totalValue+=nodeOrder.get(i).value;
            }
        }
        System.out.println(totalValue);
    }
    public static int find(int i){
        if(node[i]==i){
            return i;
        }else{
           return node[i]=find(node[i]);
        }
    }
    public static void union(int i1, int i2){
        int newi1=find(i1);
        int newi2=find(i2);
        node[newi1] = newi2;
    }
}