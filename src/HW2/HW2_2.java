package HW2;

public class HW2_2 {
    public static void fillArray() {
        int[] arrFill = new int[8];
        for (
                int i = 1, j = 0;
                i < arrFill.length; i++)
            arrFill[i] = j += 3;
        for (
                int x : arrFill)
            System.out.print(x + " ");
            }

    public static void main(String[] args) {
        fillArray();
    }
}
