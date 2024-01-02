public class leetcode6 {
    public static String convert(String s, int numRows) {
        if(numRows==1) return s;
            
        StringBuilder sb = new StringBuilder();
        int n = s.length();

        //It will help to get Characters for first and last row
        int k = 2 * (numRows-1);

        for(int i=0; i<numRows; i++){
            //It will help to get charaters for remaining rows
            int idx = i;

            while (idx<n) {
                sb.append(s.charAt(idx));

                //This will help to get values of remaining rows(middle rows)
                if(i!=0 && i!=numRows-1){
                    int k1 = k - (2*i);
                    int k2 = idx + k1;

                    //Helps from out of bound exception
                    if(k2<n) sb.append(s.charAt(k2));
                }

                idx += k;
                
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "PAYPALISHIRING"; 
        int numRows = 3;

        String ans = convert(s, numRows);
        System.out.println(ans);
    }

}
