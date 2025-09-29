//Assignment Task 03: Matrix Compression
class AssgnTask3 {

    //Complete this method so that it gives the Expected Output
    //YOU ONLY HAVE TO SUBMIT THIS METHOD, NO OTHER DRIVER CODE
    public static int[][] compressMatrix(Integer[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] p = new int[2][2];
        int sumTr = 0, sumTl = 0, sumBr = 0, sumBl = 0;

        for (int i = 0; i < m / 2; i++) {
            for (int j = 0; j < n / 2; j++) {
                sumTr += matrix[i][j];
            }
        }
        for (int i = 0; i < m / 2; i++) {
            for (int j = n / 2; j < n; j++) {
                sumTl += matrix[i][j];
            }
        }
        for (int i = m / 2; i < m; i++) {
            for (int j = 0; j < n / 2; j++) {
                sumBr += matrix[i][j];
            }
        }
        for (int i = m / 2; i < m; i++) {
            for (int j = n / 2; j < n; j++) {
                sumBl += matrix[i][j];
            }
        }
        p[0][0] = sumTr;
        p[0][1] = sumTl;
        p[1][0] = sumBr;
        p[1][1] = sumBl;

        return p;
    }

    //DO NOT CHANGE ANY DRIVER CODE BELOW THIS LINE
    public static void main(String[] args) {
        Integer[][] matrix = {
            { 1, 2, 3, 4 },
            { 5, 6, 7, 8 },
            { 1, 3, 5, 2 },
            { -2, 0, 6, -3 }
        };
        System.out.println("Given Matrix: ");
        Arr.print2D(matrix);
        
        System.out.println("\nExpected Output:");
        System.out.print("| 14 | 22 |\n| 2  | 10 |\n");
        
        System.out.print("\nYour Output:\n");
        Integer[][] returnedArray = compressMatrix(matrix);
        Arr.print2D(returnedArray);
    }
}
