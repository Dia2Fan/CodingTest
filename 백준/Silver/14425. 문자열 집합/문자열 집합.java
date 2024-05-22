import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int setSNumber = sc.nextInt();
        int wordNumber = sc.nextInt();
        Word head = new Word();
        sc.nextLine();
        while(setSNumber>0){
            String text = sc.next();
            Word now = head;
            for (int i = 0; i < text.length(); i++) {
                char alphabet=text.charAt(i);
                if(now.next[alphabet-'a']==null){
                    now.next[alphabet-'a']=new Word();
                }
                now = now.next[alphabet-'a'];
                if(i==text.length()-1){
                    now.isEnd=true;
                }
            }
            setSNumber--;
        }
    int setSCount=0;
    while(wordNumber>0){
        String checkText = sc.next();
        Word now = head;
        for(int i=0;i<checkText.length();i++){
            if(now.next[checkText.charAt(i)-'a']==null)break;
            now=now.next[checkText.charAt(i)-'a'];
            if(i==checkText.length()-1){
                if (now.isEnd) setSCount++;
            }
        }
        wordNumber--;
    }
        System.out.println(setSCount);

    }
    static class Word{
        Word[] next = new Word[26];
        boolean isEnd;
    }
}