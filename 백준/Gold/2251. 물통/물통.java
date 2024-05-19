import java.util.*;

public class Main {
    static boolean[][] visited;
    static ArrayList<Integer> result = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] cap = new int[3];
        cap[0] = sc.nextInt();
        cap[1] = sc.nextInt();
        cap[2] = sc.nextInt();

        visited = new boolean[201][201];
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{0, 0, cap[2]});

        while (!q.isEmpty()) {
            int[] cur = q.poll();
            if (visited[cur[0]][cur[1]]) continue;
            visited[cur[0]][cur[1]] = true;
            if (cur[0] == 0) result.add(cur[2]);

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (i == j) continue;
                    int[] next = Arrays.copyOf(cur, 3);
                    if (cur[i] + cur[j] >= cap[j]) {
                        next[i] = cur[i] - (cap[j] - cur[j]);
                        next[j] = cap[j];
                    } else {
                        next[i] = 0;
                        next[j] = cur[i] + cur[j];
                    }
                    q.add(next);
                }
            }
        }

        Collections.sort(result);
        for (int v : result) System.out.print(v + " ");
    }
}