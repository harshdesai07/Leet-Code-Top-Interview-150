import java.util.*;

public class leetcode290 {
     public static boolean wordPattern(String pattern, String s) {
        

        String[] words = s.split(" ");
        if(words.length != pattern.length()) return false;

        HashMap<Character, String> map = new HashMap<>();

        for(int i=0; i<pattern.length(); i++){
            char c = pattern.charAt(i);

            if(map.containsKey(c) && !map.get(c).equals(words[i])) return false;
            if(map.containsValue(words[i]) && !map.containsKey(c)) return false;
            else map.put(c, words[i]);

        }
        
        return true;
    }


    public static void main(String[] args) {
        String pattern = "abba", s = "dog dog dog dog";

        System.out.println(wordPattern(pattern, s));
    }
}
