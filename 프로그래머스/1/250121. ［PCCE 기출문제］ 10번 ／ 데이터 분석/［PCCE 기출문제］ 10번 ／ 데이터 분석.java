import java.util.*;
class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        int[][] answer = {};
        //ext와 val_ext를 통해서 data추출 -> sort_by로 정렬!
        ArrayList<int[]> list = new ArrayList<>();
            switch(ext){
                    case "code" -> {
                        for(int i=0;i<data.length;i++){
                            if(data[i][0]<val_ext){
                                list.add(data[i]);
                            }
                        }
                        break;
                   }
                    case "date"->{
                        for(int i=0;i<data.length;i++){
                            if(data[i][1]<val_ext){
                                list.add(data[i]);
                            }
                        }
                        break;
                    }
                    case "maximum"->{
                        for(int i=0;i<data.length;i++){
                            if(data[i][2]<val_ext){
                                list.add(data[i]);
                            }
                        }
                        break;
                    }
                    case "remain"->{
                        for(int i=0;i<data.length;i++){
                            if(data[i][3]<val_ext){
                                list.add(data[i]);
                            }
                        }
                        break;
                    }
            }
        int[][] check = new int[list.size()][4];
        for(int i=0;i<check.length;i++){
            check[i]=list.get(i);
        }
        switch(sort_by){
                    case "code"->{
                        for(int i=0;i<check.length-1;i++){
                            for(int j=i+1;j<check.length;j++){
                                if(check[i][0]>check[j][0]){
                                    int[] change = check[i];
                                    check[i]=check[j];
                                    check[j]=change;
                                }
                            }
                        }
                        break;
                   }
                    case "date"->{
                        for(int i=0;i<check.length-1;i++){
                            for(int j=i+1;j<check.length;j++){
                                if(check[i][1]>check[j][1]){
                                    int[] change = check[i];
                                    check[i]=check[j];
                                    check[j]=change;
                                }
                            }
                        }
                        break;
                    }
                    case "maximum"->{
                        for(int i=0;i<check.length-1;i++){
                            for(int j=i+1;j<check.length;j++){
                                if(check[i][2]>check[j][2]){
                                    int[] change = check[i];
                                    check[i]=check[j];
                                    check[j]=change;
                                }
                            }
                        }
                        break;
                    }
                    case "remain"->{
                        for(int i=0;i<check.length-1;i++){
                            for(int j=i+1;j<check.length;j++){
                                if(check[i][3]>check[j][3]){
                                    int[] change = check[i];
                                    check[i]=check[j];
                                    check[j]=change;
                                }
                            }
                        }
                        break;
                    }
            }
        answer = check;

        return answer;
    }
}