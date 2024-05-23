class Solution {
    public String solution(String new_id) {
       String answer = "";
        new_id=new_id.toLowerCase();
        new_id=new_id.replaceAll("[^0-9 a-z_.-]","");
        String check="";
        while(!new_id.equals(check)){
            check=new_id;
            new_id=new_id.replace("..",".");
        }
        if(new_id.indexOf(".")==0){
            new_id=new_id.replaceFirst(".","");
        }
        if(!new_id.isEmpty() &&new_id.indexOf(".",new_id.length()-1)==new_id.length()-1){

            new_id=new_id.substring(0,new_id.length()-1);
        }
        if(new_id.length()==0){
            new_id="aaa";
        }
        if(new_id.length()>15){
            new_id=new_id.substring(0,15);
             if(!new_id.isEmpty() &&new_id.indexOf(".",new_id.length()-1)==new_id.length()-1){

            new_id=new_id.substring(0,new_id.length()-1);
        }
        }
        while(new_id.length()<3){
            new_id=new_id+new_id.substring(new_id.length()-1);
        }
        answer=new_id;
        return answer;
    }
}