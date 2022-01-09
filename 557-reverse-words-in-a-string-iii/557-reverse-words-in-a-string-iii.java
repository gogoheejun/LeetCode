import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public String reverseWords(String s) {
        char[] words = s.toCharArray();
        StringBuilder answer = new StringBuilder();
        ArrayList<Character> tmpList = new ArrayList<>();
        for(char c : words){
            if(c!=' '){
                tmpList.add(c);
            }else {
                Collections.reverse(tmpList);
                StringBuilder str = new StringBuilder();
                for(char x : tmpList){
                    str.append(x);
                }
                answer.append(str);
                answer.append(" ");
                tmpList = new ArrayList<>();
            }
        }
        Collections.reverse(tmpList);
        StringBuilder str = new StringBuilder();
        for(char x : tmpList){
            str.append(x);
        }
        answer.append(str);
        tmpList = new ArrayList<>();
        return answer.toString();
    }
}