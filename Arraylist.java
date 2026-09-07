import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Arraylist {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println(list);

        List<Integer> list2 = new ArrayList<>();

        list2.add(105);
        list2.add(201);
        list2.add(301);

        System.out.println(list2);

        Iterator<Integer> iterator = list.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());


            List<Integer> list3 = new ArrayList<>();

        list3.add(11);
        list3.add(22);
        list3.add(33);

        System.out.println(list3.get(2));
        }
    }
}