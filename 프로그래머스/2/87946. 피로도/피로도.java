import java.util.*;

public class Solution {
    public int solution(int k, int[][] dungeons) {
        List<int[]> dungeonsList = new ArrayList<>(List.of(dungeons));
        return permute(dungeonsList, k, 0);
    }

    private int permute(List<int[]> dungeons, int k, int start) {
        if (start == dungeons.size()) {
            return countMaxDungeons(dungeons, k);
        }
        int max = 0;
        for (int i = start; i < dungeons.size(); i++) {
            Collections.swap(dungeons, start, i);
            max = Math.max(max, permute(dungeons, k, start + 1));
            Collections.swap(dungeons, start, i);
        }
        return max;
    }

    private int countMaxDungeons(List<int[]> dungeons, int k) {
        int count = 0;
        for (int[] dungeon : dungeons) {
            if (k >= dungeon[0]) {
                k -= dungeon[1];
                count++;
            } else {
                break;
            }
        }
        return count;
    }
}

