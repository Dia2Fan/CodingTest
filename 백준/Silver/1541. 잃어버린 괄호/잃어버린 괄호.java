import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String calculate = sc.nextLine();
        StringTokenizer st = new StringTokenizer(calculate,"+-",true);
        int positiveNumber=0;
        int negativeNumber=0;
        int checkMinus =0;
        while(st.hasMoreTokens()){
            String check = st.nextToken();
            if(!check.equals("+")&&!check.equals("-")){
                if(checkMinus==0){
                    positiveNumber+=Integer.parseInt(check);
                }else{
                    negativeNumber+=Integer.parseInt(check);
                }
            }
            if(check.equals("+")){
                if(checkMinus==0){
                    int positive = Integer.parseInt(st.nextToken());
                    positiveNumber+=positive;
                }
                else{
                    int negative = Integer.parseInt(st.nextToken());
                    negativeNumber+=negative;
                }
            }
            if(check.equals("-")){
                checkMinus++;

            }
        }
        System.out.println(positiveNumber-negativeNumber);
    }


}



