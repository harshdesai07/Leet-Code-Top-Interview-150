import java.util.*;

public class leetcode383 {
     public boolean canConstruct(String ransomNote, String magazine) {
        // method 1: using map
        // int n = ransomNote.length();
        // int n1 = magazine.length();
        
        // if(n>n1) return false;

        // Map<Character, Integer> map = new HashMap<>();

        // for(int i=0; i<n; i++){
        //     if(map.containsKey(ransomNote.charAt(i))){
        //         map.put(ransomNote.charAt(i), map.get(ransomNote.charAt(i)) +1);
        //     }
        //     else{
        //         map.put(ransomNote.charAt(i),  1);
        //     }
        // }

        // for(int i=0; i<n1; i++){
        //     if(map.containsKey(magazine.charAt(i)) && map.get(magazine.charAt(i))>0){
        //         map.put(magazine.charAt(i), map.get(magazine.charAt(i)) -1);
                
        //     }
        // }

        // for(int i=0; i<n; i++){
        //     if(map.get(ransomNote.charAt(i)) != 0) {
        //        return false;
        //     }
        // }

         

        // return true;

        // method 2: using array and ASCii value
        // first create a array of length 26 to store the frequency of a character
        int[] arr = new int[26]; // here at zeroth index we have character 'a' and so on..

        // now we store the frequency of a character of magazine string in our array using ASCii value
        for (char c : magazine.toCharArray()) arr[c-'a']++;

        // now we itrate through the srting ransomNote
        for (char c : ransomNote.toCharArray()){
            if (arr[c-'a'] == 0) return false; // it means the charater is not present in magazine string or may be already used before
            arr[c-'a']--;
        }

        return true;
    }
}

