public class rowmaximum1s {

    public static int rowWithMax1s(int[][] mat) {
        int maxCount = 0;
        int rowIndex = -1;

        for (int i = 0; i < mat.length; i++) {
            int count = 0;

            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 1) {
                    count++;
                }
            }

            if (count > maxCount) {
                maxCount = count;
                rowIndex = i;
            }
        }

        return rowIndex;
    }

    public static void main(String[] args) {

        int[][] mat = {
            {0, 1, 1},
            {1, 1, 1},
            {0, 0, 1}
        };

        System.out.println(rowWithMax1s(mat));
    }
}