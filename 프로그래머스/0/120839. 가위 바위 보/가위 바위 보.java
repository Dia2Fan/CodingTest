class Solution {
    public String solution(String rsp) {
        String answer = "";
        String[] RSP = rsp.split("");
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<RSP.length;i++){
            if(RSP[i].equals("2")){
                sb.append("0");
            }else if(RSP[i].equals("0")){
                 sb.append("5");
            }else if(RSP[i].equals("5")){
                 sb.append("2");
            }
        }
        return sb.toString();
    }
}