public class SpiralMatrix {
    public static void printSpiral(int matrix[][]) {
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length;
        int endCol = matrix[0].length;

        while (startRow < endRow && startCol < endCol) {
            // Top row
            for (int j = startCol; j < endCol; j++) {
                System.out.print(matrix[startRow][j] + " ");
            }

            // Right column
            for (int i = startRow + 1; i < endRow; i++) {
                System.out.print(matrix[i][endCol - 1] + " ");
            }

            // Bottom row
            if ((endRow - 1) > startRow) {
                for (int j = endCol - 2; j >= startCol; j--) {
                    System.out.print(matrix[endRow - 1][j] + " ");
                }
            }

            // Left column
            if ((endCol - 1) > startCol) {
                for (int i = endRow - 2; i > startRow; i--) {
                    System.out.print(matrix[i][startCol] + " ");
                }
            }

            startRow++;
            endRow--;
            startCol++;
            endCol--;
        }

        System.out.println();
    }

    public static void main(String[] args) {
        int matrix[][] = {
            {1,  2,  3,  4},
            {5,  6,  7,  8},
            {9, 10, 11, 12}, 
            {13,14, 15, 16}
        };
        printSpiral(matrix);
    }
}
