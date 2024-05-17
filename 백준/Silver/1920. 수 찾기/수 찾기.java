import java.util.*;
public class Main {
    static int[] Datas;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int DataNumber = sc.nextInt();
        int[] DataNumbers = new int[DataNumber];
        for (int i = 0; i < DataNumber; i++) {
            DataNumbers[i]= sc.nextInt();
        }
        Arrays.sort(DataNumbers);
        Datas = DataNumbers;
        int findNumber = sc.nextInt();
        for (int i = 0; i < findNumber; i++) {
            int wantNumber = sc.nextInt();
            search(wantNumber);
        }
    }
    public static void search(int wantNumber){
        int startIndex =0;
        int endIndex = Datas.length-1;
        while(startIndex<=endIndex){
            int wantIndex = startIndex +(endIndex - startIndex) / 2;
            if(wantNumber==Datas[wantIndex]){
                System.out.println(1);
                return;
            }
            if(Datas[wantIndex]<wantNumber){
                startIndex=wantIndex+1;
            }else{
                endIndex=wantIndex-1;
            }
        }
        System.out.println(0);

    }

}