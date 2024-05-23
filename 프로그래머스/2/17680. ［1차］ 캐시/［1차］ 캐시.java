import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        Queue<String> check = new LinkedList<String>();
        for (int i = 0; i < cities.length; i++) {
            if(cacheSize==0){
            answer = cities.length*5;
            break;
            }
            if (check.contains(cities[i].toLowerCase())) {
                check.remove(cities[i].toLowerCase());
                check.add(cities[i].toLowerCase());
                answer += 1;
            } else {
                if (check.size() < cacheSize) {
                    check.add(cities[i].toLowerCase());
                } else {
                    check.poll();
                    check.add(cities[i].toLowerCase());
                }
                answer += 5;
            }
        }
        return answer;
    }
}