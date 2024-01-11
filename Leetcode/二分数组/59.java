class Solution {
    public int[][] generateMatrix(int n) {
        int loop = 0;
        int[][] res = new int[n][n];
        int start = 0;
        int count = 1;
        int i, j;
        while(loop++ < n / 2) {
            // from top left to right
            for (j = start; j < n - loop; j++) {
                res[start][j] = count++;
            }
            //from right top to bottom
            for (i = start; i < n - loop; i++) {
                res[i][j] = count++;
            }
            //from bottom right to left
            for (; j >= loop; j--) {
                res[i][j] = count++;
            }
            //from left bottom to top 
            for(; i >= loop; i--) {
                res[i][j] = count++;
            }
            start++;
        }
        if (n %2 == 1) {
            res[start][start] = count;
        }
        return res;

    }
}