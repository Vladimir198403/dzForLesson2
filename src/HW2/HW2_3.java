package HW2;

public class HW2_3 {
    public static void changeArray() {
        int[] arrChange = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for (
                int i = 0;
                i < arrChange.length; i++) {

            if (arrChange[i] < 6) arrChange[i] *= 2;

            System.out.print(arrChange[i] + " ");
        }
    }

    public static void main(String[] args) {
        changeArray();
    }
}

