package HW2;

public class HW2_1 {

    public static void InvertArray() {
        //Задать целочисленный массив, состоящий из элементов 0 и 1.
        // Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
        // С помощью цикла и условия заменить 0 на 1, 1 на 0;
        int[] arrInsvert = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

        for (int i = 0; i < arrInsvert.length; i++) {
            arrInsvert[i] = arrInsvert[i] == 1 ? 0 : 1;
            System.out.print(arrInsvert[i] + " ");
        }
        System.out.println("\n");

    }

    public static void main(String[] args) {
        InvertArray();
    }

}
