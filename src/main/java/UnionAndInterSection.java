import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class UnionAndInterSectionTest {
    public List<Integer> findUnion(int[] arr1, int[] arr2) {
        return Stream.concat(Arrays.stream(arr1).boxed(), Arrays.stream(arr2).boxed())
                .distinct()
                .sorted()
                .collect(Collectors.toList());
    }

    public List<Integer> findIntersection(int[] arr1, final int[] arr2) {
        List<Integer> list2 = Arrays.stream(arr2).boxed().collect(Collectors.toList());
        return Arrays.stream(arr1)
                .boxed()
                .filter(list2::contains)
                .distinct()
                .collect(Collectors.toList());
    }
}

public class UnionAndInterSection {

    public static void main(String[] args) {
        UnionAndInterSectionTest unionAndInterSectionTest = new UnionAndInterSectionTest();
        int[] arr1 = {1, 2, 4, 5, 6};
        int[] arr2 = {2, 3, 5, 7};
        System.out.println("Union ====== " + unionAndInterSectionTest.findUnion(arr1, arr2));
        System.out.println("InterSection ====== " + unionAndInterSectionTest.findIntersection(arr1, arr2));

    }
}
