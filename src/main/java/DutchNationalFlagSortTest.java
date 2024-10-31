import java.util.Arrays;

class DutchNationalFlagTest {
    public void dutchNationalFlagSortArrTest(int[] arr) {
        int low = 0;
        int mid = 0;
        int high = arr.length - 1;

        while (mid <= high) {
            switch (arr[mid]) {
                case 0:
                    swap(arr, low, mid);
                    low++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    swap(arr, mid, high);
                    high--;
                    break;
            }
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

public class DutchNationalFlagSortTest {
    public static void main(String[] args) {
        DutchNationalFlagTest dutchNationalFlagTest = new DutchNationalFlagTest();
        int[] arr = {2, 0, 1, 2, 0, 1, 0, 2, 1};
        dutchNationalFlagTest.dutchNationalFlagSortArrTest(arr);
        System.out.println(Arrays.toString(arr));
    }
}
