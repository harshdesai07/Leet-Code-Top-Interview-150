import java.util.*;;

public class leetcode150 {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();

        for(String t: tokens){
            switch(t){
                case "+":
                st.push(st.pop() + st.pop());
                break;

             case "-":
                int n1 = st.pop();
                int n2 = st.pop();
                st.push(n2-n1);
                break;

             case "*":
                st.push(st.pop() * st.pop());
                break;

             case "/":
                int n3 = st.pop();
                int n4 = st.pop();
                st.push(n4/n3);
                break;
            
             default:
                st.push(Integer.parseInt(t));
            }
            
        }

        return st.pop();
    }
}
