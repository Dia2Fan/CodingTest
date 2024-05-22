import java.util.*;

public class Main {
    static String[][] tree;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nodeNumber = sc.nextInt();
        tree = new String[2][nodeNumber];
        while(nodeNumber>-1){
            String s = sc.nextLine();
            StringTokenizer st = new StringTokenizer(s," ");
            while(st.hasMoreTokens()){
                String head =st.nextToken();
                String left =st.nextToken();
                String right =st.nextToken();
                tree[0][head.charAt(0)-'A']=left;
                tree[1][head.charAt(0)-'A']=right;
            }
            nodeNumber--;
        }
        preOrder(0);
        System.out.println();
        inOrder(0);
        System.out.println();
        postOrder(0);

    }

    private static void postOrder(int i) {
        if(!tree[0][i].equals(".")){
            postOrder(tree[0][i].charAt(0)-'A');
        }
        if(!tree[1][i].equals(".")){
            postOrder(tree[1][i].charAt(0)-'A');
        }
        System.out.print((char)(i+'A'));
    }

    private static void inOrder(int i) {
        if(!tree[0][i].equals(".")){
            inOrder(tree[0][i].charAt(0)-'A');
        }

        System.out.print((char)(i+'A'));

        if(!tree[1][i].equals(".")){
            inOrder(tree[1][i].charAt(0)-'A');
        }

    }

    private static void preOrder(int i) {
        System.out.print((char)(i+'A'));
        if(!tree[0][i].equals(".")){
            preOrder(tree[0][i].charAt(0)-'A');
        }
        if(!tree[1][i].equals(".")){
            preOrder(tree[1][i].charAt(0)-'A');
        }
    }

}