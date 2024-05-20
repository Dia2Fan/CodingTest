import java.util.*;

public class Main {
    static int[] students;
    static ArrayList<Integer>[] student;
    static ArrayList<Integer> studentOrder;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalStudentsNumber = sc.nextInt();
        int relationsNumber = sc.nextInt();
        students = new int[totalStudentsNumber+1];
        student = new ArrayList[totalStudentsNumber+1];
        studentOrder = new ArrayList<>();
        for (int i = 1; i <= totalStudentsNumber; i++) {
            student[i] = new ArrayList<>();
        }
        for (int i = 0; i < relationsNumber; i++) {
            int student1 = sc.nextInt();
            int student2 = sc.nextInt();
            student[student1].add(student2);
            students[student2]++;
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 1; i <= totalStudentsNumber; i++) {
            if(students[i]==0){
                pq.offer(i);
            }
        }
        while(!pq.isEmpty()){
            int current = pq.poll();
            studentOrder.add(current);
            for (Integer next : student[current]) {
                students[next]--;
                if(students[next]==0){
                    pq.offer(next);
                }
            }
        }
        for (Integer integer : studentOrder) {
            System.out.print(integer+" ");
        }
    }
}