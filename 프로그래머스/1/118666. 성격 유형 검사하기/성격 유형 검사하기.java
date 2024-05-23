import java.util.*;
class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        Map<String, Integer> map = new HashMap<>(Map.of("R", 0, "T", 0, "C", 0, "F", 0, "J", 0, "M", 0, "A", 0, "N", 0));
        
        for(int i=0;i<survey.length;i++){
            String[] check = survey[i].split("");
            if(choices[i]<4){   
                map.replace(check[0],map.get(check[0])+(4-choices[i]));  
            }else if(choices[i]>4){
                map.replace(check[1],map.get(check[1])+choices[i]-4);
            }
        }
        StringBuilder sb = new StringBuilder();
        if(map.get("R")>=map.get("T")){
            sb.append("R");
        }else{
            sb.append("T");
        }
        if(map.get("C")>=map.get("F")){
            sb.append("C");
        }else{
            sb.append("F");
        }
        if(map.get("J")>=map.get("M")){
            sb.append("J");
        }else{
            sb.append("M");
        }
        if(map.get("A")>=map.get("N")){
            sb.append("A");
        }else{
            sb.append("N");
        }
        answer = sb.toString();
     return answer;   
    }

}