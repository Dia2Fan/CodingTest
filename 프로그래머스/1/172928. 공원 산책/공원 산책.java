class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] answer = {0,0};
        for(int i=0;i<park.length;i++) {
            if (park[i].indexOf("S") != -1) {
                answer[0] = i;
                answer[1] = park[i].indexOf("S");
            }
        }
            for(int i=0;i<routes.length;i++){
    outerLoop :  switch(routes[i].substring(0,1)){
                    case "E"->{
                        int A = Integer.parseInt(routes[i].replaceAll("[^0-9]",""));
                        if(answer[1]+A>park[answer[0]].length()-1){
                            System.out.println(answer[0]+","+answer[1]+"오류 E 범위넘음");
                            break;
                        }
                        if(park[answer[0]].substring(answer[1],answer[1]+A+1).indexOf("X")!=-1){
                            System.out.println(answer[0]+","+answer[1]+"오류 E X있음");
                            break;
                        }
                        answer[1]=answer[1]+A;
                        System.out.println(answer[0]+","+answer[1]+"동쪽");
                        break;
                    }
                    case "W"->{
                        int A = Integer.parseInt(routes[i].replaceAll("[^0-9]",""));
                        if(answer[1]-A<0){
                            System.out.println(answer[0]+","+answer[1]+"오류 W 범위넘음");
                            break;
                        }
                        if(park[answer[0]].substring(answer[1]-A,answer[1]).indexOf("X")!=-1){
                            System.out.println(answer[0]+","+answer[1]+"오류 W X있음");
                            break;
                        }
                        answer[1]=answer[1]-A;
                        System.out.println(answer[0]+","+answer[1]+"서쪽");
                        break;
                    }
                    case "S"->{
                        int A = Integer.parseInt(routes[i].replaceAll("[^0-9]",""));
                        if(answer[0]+A>park.length-1){
                            System.out.println(answer[0]+","+answer[1]+"오류 S 범위넘음");
                            break;
                        }
                        for(int j=answer[0];j<=answer[0]+A;j++){
                            if(park[j].substring(answer[1],answer[1]+1).equals("X")){
                                System.out.println(answer[0]+","+answer[1]+"오류 S X있음");
                                break outerLoop;
                            }
                        }
                        answer[0]=answer[0]+A;
                        System.out.println(answer[0]+","+answer[1]+"남쪽");
                        break;
                    }
                    case "N"->{
                        int A = Integer.parseInt(routes[i].replaceAll("[^0-9]",""));
                        if(answer[0]-A<0){
                            System.out.println(answer[0]+","+answer[1]+"오류 N 범위넘음");
                            break;
                        }
                        for(int j=answer[0]-A;j<answer[0];j++){
                            if(park[j].substring(answer[1],answer[1]+1).equals("X")){
                                System.out.println(answer[0]+","+answer[1]+"오류 N X있음");
                                break outerLoop;
                            }
                        }
                        answer[0]=answer[0]-A;
                        System.out.println(answer[0]+","+answer[1]+"북쪽");
                        break;
                    }
                }
            }
        return answer;
    }
}