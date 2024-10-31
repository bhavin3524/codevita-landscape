import java.util.Arrays;
import java.util.Comparator;

class KthMaxMinElementTest {
    public int kthMinElement(int arr[], int k) {
        return Arrays.stream(arr)
                .sorted()
                .distinct()
                .skip(k - 1)
                .findFirst()
                .getAsInt();
    }

    public int kthMaxElement(int[] arr, int k) {
        return Arrays.stream(arr)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .distinct()
                .skip(k - 1)
                .findFirst()
                .get();
    }
}

public class KthMaxMinElementArray {
    public static void main(String[] args) {
        KthMaxMinElementTest kthMaxMinElementTest = new KthMaxMinElementTest();
        int[] arr = {3, 5, 7, 2, 8, -1, 4, 10, 12};
        System.out.println("kthMaxElement: == " + kthMaxMinElementTest.kthMaxElement(arr, 3));
        System.out.println("kthMinElement: == " + kthMaxMinElementTest.kthMinElement(arr, 3));
    }
}
