public class leetcode48 {
    public static void rotate(int[][] matrix) {
        int n = matrix.length;
        
        // //Method 1:
        // // Time Complexity: O(n*n)
        // // Space Complexity: O(1)
        
        // //1. calculate the transpose of a matrix
        // for(int i=0; i<n; i++){
        //     for(int j=i; j<n; j++){
        //         int temp = matrix[i][j];
        //         matrix[i][j] = matrix[j][i];
        //         matrix[j][i] = temp;
        //     }
        // }

        // //2. reverse the row
        // for(int i=0; i<n; i++){
        //     for(int j=0; j<n/2; j++){
        //         int temp = matrix[i][j];
        //         matrix[i][j] = matrix[i][n-j-1];
        //         matrix[i][n-j-1] = temp;
        //     }
        // }

        //Method 2: Swapping
        // Time Complexity: O(n*n)
        // Space Complexity: O(1)

        for(int i=0; i<(n+1)/2; i++){
            for(int j=0; j<n/2; j++){
                // 4 ways swapping
                // temp = bottom left
                int temp = matrix[n-j-1][i];

                // bottom left = bottom right
                matrix[n-j-1][i] = matrix[n-i-1][n-j-1];

                // bottom right = top right
                matrix[n-i-1][n-j-1] = matrix[j][n-i-1];

                // top right = top left
                matrix[j][n-i-1] = matrix[i][j];

                // top left = temp
                matrix[i][j] = temp;
            }
        }


    }

    public static void main(String[] args) {
        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        rotate(arr);

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
    
}
