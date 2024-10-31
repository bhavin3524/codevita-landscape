import java.util.Arrays;

class MaxMinElementTest {
    public int maxElement(int[] arr) {
        return Arrays.stream(arr)
                .max().getAsInt();

    }

    public static int minElement(int[] arr) {
        return Arrays.stream(arr)
                .min().getAsInt();
    }
}

public class MaxMinElementArray {
    public static void main(final String[] args) {
        final MaxMinElementTest maxMinElementTest = new MaxMinElementTest();
        int[] arr = {34, 55, 98, 78, 22, 87, 17};
        int minElement = MaxMinElementTest.minElement(arr);
        int maxElement = maxMinElementTest.maxElement(arr);
        System.out.println("min element: ====" + minElement);
        System.out.println("max element: ====" + maxElement);
    }
}
