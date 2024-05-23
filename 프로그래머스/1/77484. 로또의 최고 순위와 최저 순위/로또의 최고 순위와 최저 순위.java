class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = {0,0};
        int Wincheck=0;
        int Losecheck=0;
        boolean LoseChecking = true;
        for(int i=0;i<lottos.length;i++){
            LoseChecking=true;
            for(int j=0;j<win_nums.length;j++){
                if(lottos[i]==win_nums[j]){
                    Wincheck++;
                    LoseChecking = true;
                    break;
                }else if(lottos[i]!=0&&lottos[i]!=win_nums[j]){
                    LoseChecking = false;
                    
                }
            }
            if(!LoseChecking){
                Losecheck++;
            }
        }
        switch(Wincheck){
                case 0->{if(Losecheck>5){Losecheck=5;}answer[0]=1+Losecheck;answer[1]=6;break;}
                case 1->{answer[0]=1+Losecheck;answer[1]=6;break;}
                case 2->{answer[0]=1+Losecheck;answer[1]=5;break;}
                case 3->{answer[0]=1+Losecheck;answer[1]=4;break;}
                case 4->{answer[0]=1+Losecheck;answer[1]=3;break;}
                case 5->{answer[0]=1+Losecheck;answer[1]=2;break;}
                case 6->{answer[0]=1;answer[1]=1;break;}
        }
        
        return answer;
    }
}