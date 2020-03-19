package HW2;

public class HW2_6 {
    private static boolean AnaliticArray(int[] HalfArr) {
        int LeftSum, RightSum;
        for (int i = 0; i < HalfArr.length + 1; i++) {
            LeftSum = 0;
            RightSum = 0;

            for (int j = 0; j < i; j++) {
                LeftSum += HalfArr[j];
            }

            for (int j = i; j < HalfArr.length; j++) {
                RightSum += HalfArr[j];
            }


            if (LeftSum == RightSum) return true;
        }

        return false;
    }
}

