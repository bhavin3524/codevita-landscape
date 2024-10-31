import java.util.Arrays;

class RotateArrayTest {
    public void rotateArrTest(int k, int... arr) {
        if (k == 0) {
            return;
        }
        k--;
        leftShiftElement(arr);
        rotateArrTest(k, arr);
    }

    private void leftShiftElement(int... arr) {
        int first = arr[0];
        for (int j = 0; j < arr.length - 1; j++) {
            arr[j] = arr[j + 1];
        }
        arr[arr.length - 1] = first;
    }
}

public class RotateArrayByOne {
    public static void main(String[] args) {
        RotateArrayTest rotateArrayTest = new RotateArrayTest();
        int[] arr = {11, 12, 13, 14, 15};
        rotateArrayTest.rotateArrTest(3, arr);
        System.out.println(Arrays.toString(arr));
    }
}
