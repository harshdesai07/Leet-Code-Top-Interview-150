import java.util.*;

public class leetcode57 {
    public static int[][] insert(int[][] intervals, int[] newInterval) {
        ArrayList<int[]> al = new ArrayList<>();

        for(int[] arr: intervals){
            //1. no overlapping
            if(arr[1] < newInterval[0]) al.add(arr);

            //got the correct position of newInterval 
            else if(arr[0]>newInterval[1]){
                al.add(newInterval);
                newInterval = arr;
            }

            //2. Overlapping
            else{
                newInterval[0] = Math.min(newInterval[0], arr[0]);
                newInterval[1] = Math.max(newInterval[1], arr[1]);
            }
        }
        al.add(newInterval);

        return al.toArray(new int[al.size()][]);
    }
}
