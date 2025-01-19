package TwoDimensionArray;

public class addTwoMatrix {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {1, 9, 3}, {1, 2, 3}};
        int[][] num = {{1, 2, 3}, {1, 2, 3}, {1, 2, 3}};
        int m = arr.length;
        int n = num[0].length;
        int[][] res = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                res[i][j] = arr[i][j] + num[i][j];
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
    }
}
