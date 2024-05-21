import java.util.*;

public class Main {
    static class Node{
        int start ;
        int end ;
        public Node(int start,int end){
            this.start =start;
            this.end =end;
        }
    }
    static boolean[] visited;
    static ArrayList<Node>[] nodeList;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nodeNumber = sc.nextInt();
        nodeList = new ArrayList[nodeNumber];
        visited = new boolean[nodeNumber];
        for (int i = 0; i < nodeNumber; i++) {
            nodeList[i] = new ArrayList<>();
        }
        for (int i = 0; i < nodeNumber; i++) {
            int start = sc.nextInt();
            if(start == -1){
                continue;
            }else {
                nodeList[start].add(new Node(start,i));
            }
        }
            int removedNode=sc.nextInt();
            DFS(removedNode);

        int liftNodeCount=0;
        for (ArrayList<Node> nodes : nodeList) {
            if(nodes!=null&&nodes.isEmpty()){
                liftNodeCount++;
            }else if(nodes!=null&&nodes.size()==1){
                for (Node node : nodes) {
                    if(node.end==removedNode){
                        liftNodeCount++;
                    }
                }
            }
        }
        System.out.println(liftNodeCount);
    }
    static void DFS(int i){
        if(!nodeList[i].isEmpty()){
            for (Node nodeNow : nodeList[i]) {
                if(!nodeList[nodeNow.end].isEmpty()){
                    DFS(nodeNow.end);
                }
                nodeList[nodeNow.end]=null;
            }
        }
        nodeList[i]=null;
    }
}