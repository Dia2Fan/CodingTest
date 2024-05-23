/*자바에서는 일부 경우에 자동으로 int와 Integer를 서로 변환해줍니다. 이러한 변환을 자동으로 수행하는 것을 "오토 박싱(Auto Boxing)"과 "오토 언박싱(Auto Unboxing)"이라고 합니다.

오토 박싱은 기본 자료형(int, double 등)을 그에 대응하는 래퍼 클래스(Integer, Double 등)의 객체로 자동으로 변환해주는 기능이고, 오토 언박싱은 그 반대의 동작을 수행합니다.

하지만 ArrayList에서 요소를 삭제할 때는 int형 인덱스를 사용해야 합니다. 따라서 ArrayList의 get 메서드를 사용하여 요소를 가져올 때에는 오토 언박싱이 일어나지만, 인덱스를 얻어내고자 할 때는 명시적으로 int로 캐스팅해주어야 합니다.
import java.util.*;
class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);
        ArrayList<Integer> list = new ArrayList<>();
        for (int person : people) {
            list.add(person);
        }
        while (!list.isEmpty()) {
            int check = list.get(list.size()-1);
            int i = 0;
            ArrayList<Integer> list1 = new ArrayList<>();//인덱스 담아놓을 곳
            list1.add(list.size()-1);
            while (check < limit) {
                if (check + list.get(i) < limit&& i < list.size() - 1) {
                    i++;
                }else if (check + list.get(i) == limit && i < list.size() - 1) {
                    list1.add(i);
                    break;
                } else {
                    if (i >= 1&& i < list.size() - 1)) {
                        check += list.get(i - 1);
                        list1.add(i - 1);
                        i = 0;
                    } else {
                        break;
                    }
                }
            }
            for (int j = 0; j <list1.size(); j++) {//담긴 인덱스만큼 인원수 제거
                list.remove((int) list1.get(j));
            }
            answer++;
        }

        return answer;
    }
} //문제를 제대로 읽자!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!*/
import java.util.Arrays;
class Solution {
    public int solution(int[] people, int limit) {
        Arrays.sort(people);
        int answer = 0;
        int left = 0;
        int right = people.length - 1;

        while (left <= right) {
            if (people[left] + people[right] <= limit) {
                left++;
            }
            right--;
            answer++;
        }
        
        return answer;
    }
}