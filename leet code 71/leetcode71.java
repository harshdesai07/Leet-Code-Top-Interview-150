import java.util.Stack;

public class leetcode71 {
    public String simplifyPath(String path) {
        String[] s = path.split("/+");
        Stack<String> st = new Stack<>();

        for(String s1: s){
            if(!st.isEmpty() && s1.equals("..")) st.pop();
            else if(!s1.equals(".") && !s1.equals("") && !s1.equals("..")) st.push(s1);
        }

        StringBuilder sb = new StringBuilder();

        for(String s1: st){
           sb.append("/").append(s1);
        }

        return sb.length()==0 ? "/" : sb.toString();

    }
}
