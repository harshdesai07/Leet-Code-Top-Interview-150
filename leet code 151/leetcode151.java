public class leetcode151 {
    public static String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        String[] words = s.trim().split(" +");

        for(int i=words.length-1; i>=0; i--){
            sb.append(words[i]);
            sb.append(" ");
        }

        return sb.toString();
        
    }
    

    public static void main(String[] args) {
        String s = "the sky is blue";
        System.out.println(reverseWords(s));
    }
}
