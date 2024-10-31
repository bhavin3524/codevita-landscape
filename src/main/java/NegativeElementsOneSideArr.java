import java.util.Arrays;

class ReArrangeNegativeElementsArr {
    public void rearrangeNegativeElements(int... arr) {
        if (arr.length == 0) {
            return;
        }

        //{11, -55, -44, 17, 23, -99, -92}
        //{11, -55, -44, 17, 23, -99}
        //{11, -55, -44, 17, 23}
        //{11, -55, -44, 17}
        //{11, -55, -44}
        //{11, -55}
        //{11}

        int n = arr.length;
        int j = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
    }
}

public class NegativeElementsOneSideArr {
    public static void main(String[] args) {

        ReArrangeNegativeElementsArr reArrangeNegativeElementsArr = new ReArrangeNegativeElementsArr();

        int[] arr = {11, -55, -44, 17, 23, -99, -92};

        reArrangeNegativeElementsArr.rearrangeNegativeElements(arr);

        System.out.println(Arrays.toString(arr));
    }
}
