package Day4.ProblemDay4;

public class AddTwoMatrices {

    public static void main(String[] args) {
        int[][] matrix1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9} 
        };
        int[][] matrix2 = {
                {10, 11, 12},
                {13, 14, 15},
                {16, 17, 18} 
            };

        int[][] result = new int[matrix1.length][matrix1[0].length];
        for (int i = 0; i < matrix1.length; i++) 
        {
            for (int j = 0; j < matrix1[0].length; j++)
              result[i][j] = matrix1[i][j] + matrix2[i][j];
        }

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) 
            {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
            }

        }

}
    

