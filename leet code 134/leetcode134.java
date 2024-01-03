public class leetcode134 {
    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int startIdx = 0; // Indicates the starting position to start the circuit
    int sum = 0;      // Tracks the difference between gas and cost at each station
    int total = 0;    // Tracks the overall difference between gas and cost
    
    // Loop through each gas station to calculate the total difference
    for (int i = 0; i < gas.length; i++) {
        sum += gas[i] - cost[i]; // Calculate the difference between gas and cost at each station
        
        // If the current sum indicates inability to proceed further
        if (sum < 0) {
            total += sum; // Accumulate the negative sum into the total
            sum = 0;      // Reset the sum to zero for the next potential starting point
            startIdx = i + 1; // Update the potential starting position to the next station
        }
    }
    total += sum; // Add the final sum to the total
    
    // Check if the total sum of differences is non-negative
    return total >= 0 ? startIdx : -1; // If total is non-negative, return the starting position; otherwise, return -1
    }
    
    public static void main(String[] args) {
        int gas[] = {1,2,3,4,5};
        int cost[] = {3,4,5,1,2};

        //Function Calling
        int ans = canCompleteCircuit(gas, cost);
        System.out.println(ans);
    }
    
}
