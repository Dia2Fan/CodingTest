class Solution {
    public int solution(int number, int limit, int power) {
        int[] divisorCount = new int[number];
        for (int i = 1; i <= number; i++) {
            for (int j = i; j <= number; j += i) {
                divisorCount[j - 1]++;
            }
        }

        int totalIron = 0;
        for (int count : divisorCount) {
            if (count <= limit) {
                totalIron += count;
            } else {
                totalIron += power;
            }
        }

        return totalIron;
    }
}