import java.util.*;

public class Main {
    static long[] tree;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nodeNumber = sc.nextInt();
        int changeNumber = sc.nextInt();
        int rangeSumNumber = sc.nextInt();
        sc.nextLine();
        int treepow=0;
        int powNum=0;
        while(treepow==0){
            if(Math.pow(2,powNum)>=nodeNumber){
                treepow=powNum+1;
            }
            powNum++;
        }
        tree = new long[(int)Math.pow(2,treepow)];
        int leftStartIndex = (int)Math.pow(2,treepow-1)-1;
        for (int i = (int)Math.pow(2,treepow-1); i < (int)Math.pow(2,treepow-1)+nodeNumber; i++) {
            tree[i]=sc.nextLong();
        }
        sc.nextLine();
        setTree(leftStartIndex);
        for (int i = 0; i < changeNumber+rangeSumNumber; i++) {
            int whatToDo = sc.nextInt();
            if(whatToDo==1){
                int index = sc.nextInt();
                long number = sc.nextLong();
                sc.nextLine();
                changeNumber(index,number);
            }else{
                int start = sc.nextInt();
                int end = sc.nextInt();
                sc.nextLine();
                System.out.println(rangeSum(start, end));
            }
        }

    }
    public static void changeNumber(int index,long number){
        int changeIndex = tree.length/2+index-1;
        long originalValue=tree[changeIndex];
        while (changeIndex!=0){
            tree[changeIndex] += number - originalValue;
            changeIndex/=2;
        }
    }
    public static long rangeSum(int start,int end){
        start = start+tree.length/2-1;
        end = end+tree.length/2-1;
        ArrayList<Integer> indexList = new ArrayList<>();
        while(start<=end){
            if(start%2==1){
                indexList.add(start);
            }
            start = (start+1)/2;
            if(end%2==0){
                indexList.add(end);
            }
            end =(end-1) / 2;
        }
        long sum = 0;
        for (Integer integer : indexList) {
            sum +=tree[integer];
        }
        return sum;
    }
    public static void setTree(int index){
        for (int i = index; i >= 1; i--) {
            tree[i]=tree[i*2]+tree[i*2+1];
        }

    }

}