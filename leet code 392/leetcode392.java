

public class leetcode392 {
    // Function Definition
    public static boolean isSubsequence(String s, String t) {
        int i=0,j=0;
        int n=t.length();
        int m=s.length();
        // we can use string inbuild method to retrive elements
        // but retriving element from array is much more faster as compared to string
        // as in order to retrive from string we call a method 
        char ss[]=s.toCharArray();
        char tt[]=t.toCharArray();

        if(m==0) // s is empty 
        return true;

        while(i<n){
            if(tt[i]==ss[j]){
                j++;
            }
            i++;
            
            if(j==m)
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        String str1 = "abc", str2 = "ahbgdc";

        System.out.println(isSubsequence(str1, str2));
    }
    
}
