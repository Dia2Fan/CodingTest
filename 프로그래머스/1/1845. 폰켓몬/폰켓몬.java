import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int answer = 1;
        Arrays.sort(nums);
        int check = nums[0];
        for(int i=0;i<nums.length;i++){
            if(check!=nums[i]){
                check=nums[i];
                answer++;
                if(answer>nums.length/2){
                    answer=nums.length/2;
                    break;
                }
                
            }
        }
        return answer;
    }
}