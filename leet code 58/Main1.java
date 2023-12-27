public class Main1 {
        public static int lengthOfLastWord(String s) {
            int count = 0;
            boolean foundCharacter = false;
    
            for (int i = s.length() - 1; i >= 0; i--) {
                if (s.charAt(i) != ' ') {
                    count++;
                    foundCharacter = true;
                } else if (foundCharacter) {
                    // If a character is found and then a space is encountered,
                    // it means we've reached the end of the last word.
                    break;
                }
            }
    
            return count;
        }

    public static void main(String[] args) {
        String s = "Hello world ";

        int ans = lengthOfLastWord(s);

        System.out.println(ans);
    }
    
}
