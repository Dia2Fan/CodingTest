import java.util.*;

public class Main {
    static int[] Peoples;
    static int[] knowTruthPeoples;
    static ArrayList<Integer>[] partyList;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int partyPeople = sc.nextInt();
        int partyNumber = sc.nextInt();
        int knowTruthPeopleNumber = sc.nextInt();
        int knowRepresentativePeople=0;
        Peoples = new int[partyPeople +1];
        for (int i = 0; i <= partyPeople; i++) {
            Peoples[i]=i;
        }
        partyList = new ArrayList[partyNumber];

        if(knowTruthPeopleNumber>=1){
            knowTruthPeoples = new int[knowTruthPeopleNumber];
            for (int i = 0; i < knowTruthPeoples.length; i++) {
                knowTruthPeoples[i]=sc.nextInt();
            }
            knowRepresentativePeople = knowTruthPeoples[0];
            for (int i = 1; i < knowTruthPeoples.length; i++) {
                union(knowRepresentativePeople,knowTruthPeoples[i]);
            }
        }else{
            System.out.println(partyNumber);
            return;
        }

        for (int i = 0; i < partyNumber; i++) {
            partyList[i] = new ArrayList<>();
            int participatedNumber = sc.nextInt();
            if(participatedNumber==1){
                partyList[i].add(sc.nextInt());
            }else if(participatedNumber==0){
            }else{
                int representativePeople = sc.nextInt();
                partyList[i].add(representativePeople);
                for (int j = 0; j < participatedNumber-1; j++) {
                    int people = sc.nextInt();
                    partyList[i].add(people);
                    union(representativePeople, people);
                }
            }
        }
        int participatedPartyNumber=0;
        for (ArrayList<Integer> list : partyList) {
            boolean canParticipate = true;
            for (Integer integer : list) {
                if(Peoples[find(knowRepresentativePeople)]==find(integer)){
                    canParticipate = false;
                    break;
                }
            }
            if(canParticipate) participatedPartyNumber++;
        }
        System.out.println(participatedPartyNumber);
    }



    private static void union(int value1, int value2) {
        int myValue1=find(value1);
        int myValue2=find(value2);
        Peoples[myValue2]=myValue1;
    }

    private static int find(int value1){
        if(Peoples[value1]==value1){
            return value1;
        }else{
            return Peoples[value1] = find(Peoples[value1]);
        }
    }

    private static void checkSet(int values1, int values2) {
        int value1 = find(values1);
        int value2 = find(values2);
        if(value1==value2){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }

    }
}