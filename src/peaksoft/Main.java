package peaksoft;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Set<Integer> set1 = new HashSet<>(
                List.of(1, 2, 3)
        );
        Set<Integer> set2 = new HashSet<>(
                List.of(0, 1, 2)
        );

        System.out.println(symmetricDifference(set1, set2));


    }
    public static Set<Integer> symmetricDifference (Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> set = new HashSet<>();

        set.addAll(set1);
        set.addAll(set2);

        ArrayList<Integer> arrayList1 = new ArrayList<>(set1);

        ArrayList<Integer> arrayList2 = new ArrayList<>(set2);

        for (int i = 0; i < set1.size(); i++) {
            for (Integer integer : arrayList2) {
                if (Objects.equals(arrayList1.get(i), integer))
                    set.remove(arrayList1.get(i));
            }
        }

        for (int i = 0; i < set1.size(); i++) {
            for (Integer integer : arrayList1) {
                if (Objects.equals(arrayList2.get(i), integer))
                    set.remove(arrayList2.get(i));
            }
        }

        return set;
    }
}
