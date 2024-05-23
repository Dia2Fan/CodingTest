class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        StringBuilder sbEven = new StringBuilder();
        StringBuilder sbOdd = new StringBuilder();
        for(int i=0;i<num_list.length;i++){
            if(num_list[i]%2==0){
                sbEven.append((num_list[i]+""));
            }else{
                sbOdd.append((num_list[i]+""));
            }
        }
        answer = Integer.parseInt(sbEven.toString())+Integer.parseInt(sbOdd.toString());
        return answer;
    }
}