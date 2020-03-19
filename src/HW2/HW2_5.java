package HW2;

public class HW2_5 {
    public static void MinMax() {
        int[] MinMax = {25, 40, -3, 18, 100, 100, 23, -8};
        int min = MinMax[0], max = MinMax[0];
        for (int i = 0; i < MinMax.length; i++) {
            if (MinMax[i] > max) {
                max = MinMax[i];
            }
            if (MinMax[i] < min) {
                min = MinMax[i];

            }
        }
        System.out.println("По результату анализа массива данных ");
        System.out.println("Максимальный и минимальный элемент данного массива является: " + max + " и " + min);
    }
        public static void main(String[] args) {
            MinMax();
        }
}

