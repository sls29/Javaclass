package februarie.feb13;

import com.google.common.collect.Ordering;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class GuavaExample {

    public static void main(String[] args) {
        List<Integer> toSort = Arrays.asList(3, 5, 4, null, 1, 2);
        Collections.sort(toSort, Ordering.natural().nullsFirst());
        System.out.println(toSort);

        Collections.sort(toSort, Ordering.natural().nullsLast());
        System.out.println(toSort);

        List<Integer> withoutNulls = Arrays.asList(3, 5, 4, 1, 2);
        Collections.sort(withoutNulls, Ordering.natural().reverse());
        System.out.println(withoutNulls);

    }

}
