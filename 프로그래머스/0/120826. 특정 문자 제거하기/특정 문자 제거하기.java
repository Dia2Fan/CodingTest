class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
        String[] X = my_string.split("");
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<X.length;i++){
            if(!X[i].equals(letter)){
                 sb.append(X[i]);
            }
        }
        answer=sb.toString();
        return answer;
    }
}