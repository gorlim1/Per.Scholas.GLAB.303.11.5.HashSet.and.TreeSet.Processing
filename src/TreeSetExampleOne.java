import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExampleOne {

    public static void main(String[] args) {

        TreeSet<Integer> num_TreeSet = new TreeSet<>();

        num_TreeSet.add(20);
        num_TreeSet.add(5);
        num_TreeSet.add(15);
        num_TreeSet.add(25);
        num_TreeSet.add(10);

        Iterator<Integer> iter_set = num_TreeSet.iterator();

        System.out.println("TreeSet using Iterator: ");

//        for (Integer param_TreeSet : num_TreeSet) {
//            System.out.println(param_TreeSet);
//        }

        while (iter_set.hasNext()) {

            System.out.println(iter_set.next());
        }
    }
}
