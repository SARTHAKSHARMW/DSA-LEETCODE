class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;

        // 1) Transpose
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // 2) Reverse each row
        for (int i = 0; i < n; i++) {
            reverse(matrix[i]);
        }
    }

    private void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
// in this first find transpose then find reverse row ; 