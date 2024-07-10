package CollectionsFramework.Set;

import java.util.HashSet;

public class lec95_set {
    public static void main(String[] args) {
        HashSet<Integer> hs1 = new HashSet<>(6, 0.5f);
        hs1.add(1);
        hs1.add(3);
        hs1.add(5);
        hs1.add(7);
        hs1.add(9);
        System.out.println(hs1);
    }
}
