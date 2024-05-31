import java.util.*;
class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();
        HashMap<String,Integer> str1Map = new HashMap<>();
        HashMap<String,Integer> str2Map = new HashMap<>();
        int gyo = 0;
        int hap = 0;
        for(int i=0;i<str1.length()-1;i++){
            String check = str1.substring(i,i+2);
            String checksame = check;
            checksame=checksame.replaceAll("[^a-z]","");
            if(checksame.equals(check))str1Map.put(str1.substring(i,i+2),str1Map.getOrDefault(str1.substring(i,i+2),0)+1);
            
        }
        for(int i=0;i<str2.length()-1;i++){
            String check = str2.substring(i,i+2);
            String checksame = str2.substring(i,i+2);
            checksame=checksame.replaceAll("[^a-z]","");
            if(checksame.equals(check))str2Map.put(str2.substring(i,i+2),str2Map.getOrDefault(str2.substring(i,i+2),0)+1);
        }
        for(String str2word : str2Map.keySet()){
            if(str1Map.containsKey(str2word)){
                gyo+= str1Map.get(str2word) <= str2Map.get(str2word)? str1Map.get(str2word) : str2Map.get(str2word);
            }
        }
        for(String str2word : str2Map.keySet()){
            if(str1Map.containsKey(str2word)){
                hap+= str1Map.get(str2word) >= str2Map.get(str2word)? str1Map.get(str2word) : str2Map.get(str2word);
            }else{
                hap+=str2Map.get(str2word);
            }
        }
        for(String str1word : str1Map.keySet()){
            if(!str2Map.containsKey(str1word)){
                hap+= str1Map.get(str1word);
            }
        }
        if(gyo==0&&hap==0)return 65536;
        answer = (int)((double) gyo / hap * 65536);
        return answer;
    }
}