package collection.set.javaset.test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetOperationsTest_old {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(List.of(1, 2, 3, 4, 5));
        Set<Integer> set2 = new HashSet<>(List.of(3, 4, 5, 6, 7));

        Set<Integer> sol1 = getSol1(set1, set2);
        Set<Integer> sol2 = getSol2(set1, set2);
        Set<Integer> sol3 = getSol3(set1, sol2);

        System.out.println("합집합: " + sol1);
        System.out.println("교집합: " + sol2);
        System.out.println("차집합: " + sol3);
    }

    private static Set<Integer> getSol3(Set<Integer> set1, Set<Integer> sol2) {
        Set<Integer> sol3 = new HashSet<>();
        for (int s : set1) {
            for (int p : sol2) {
                if (s == p) {
                    //
                }
            }
        }
        return set1;
    }

    private static Set<Integer> getSol2(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> sol2 = new HashSet<>();
        for (int s : set1) {
            for (int p : set2) {
                if (s == p) {
                    sol2.add(p);
                }
            }
        }
        return sol2;
    }

    private static Set<Integer> getSol1(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> sol1 = new HashSet<>();
        sol1.addAll(set1);
        sol1.addAll(set2);
        return sol1;
    }
}
