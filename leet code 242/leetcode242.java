import java.util.*;

public class leetcode242 {
    public static boolean isAnagram(String s, String t) {   

        if(s.length() != t.length()) return false;

        Map<Character, Integer> hm1 = new TreeMap<>();

        //Hash table for string 1
        for(int i=0; i<s.length(); i++){
            if(hm1.containsKey(s.charAt(i))){
                hm1.put(s.charAt(i), hm1.get(s.charAt(i)) + 1);
            }
            else{
                hm1.put(s.charAt(i), 1);
            }
        }

        for(int i=0; i<t.length(); i++){
            if(hm1.containsKey(t.charAt(i))){
                hm1.put(t.charAt(i), hm1.get(t.charAt(i)) -1);
            }
        }

         int flag = 0;

        for(int i=0; i<s.length(); i++){
            if(hm1.get(s.charAt(i)) != 0) {
                flag = 1;
                break;
            }
        }

        if(flag==0){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        String s = "anagram", t = "nagaram";
        System.out.println(isAnagram(s, t));
    }
    
}
