package suanfa;
import java.util.*;
//有效的字母异位词
public class Anagram {

    public static boolean isAnagram(String s, String t) {

        if(s.length()!=t.length()){
            return false;
        }
        Map<Character,Integer> table= new HashMap<Character,Integer>();
        for(int i=0;i<s.length();i++){
            table.put(s.charAt(i),table.getOrDefault(s.charAt(i),0)+1);
        }
        for(int i=0;i<t.length();i++){
            table.put(t.charAt(i),table.getOrDefault(t.charAt(i),0)-1);
            if(table.get(t.charAt(i))<1){
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args){
       String s = "abagram", t = "nagaram";
        isAnagram(s,t);

    }




}
