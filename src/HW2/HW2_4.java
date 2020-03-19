package HW2;

public class HW2_4 {
    public static void fillDiagonal() {
        int[][] fillDiagonal = new int[5][5];

        for (int i = 0; i < fillDiagonal.length; i++) {

            for (int j = 0, j2 = fillDiagonal[i].length; j < fillDiagonal[i].length; j++, j2--) {

                if (i == j || i == (j2 - 1)) fillDiagonal[i][j] = 1;

                System.out.print(fillDiagonal[i][j] + " ");
            }

            System.out.print("\n");
        }
    }
    public static void main(String[] args) {
        fillDiagonal();
    }
}
