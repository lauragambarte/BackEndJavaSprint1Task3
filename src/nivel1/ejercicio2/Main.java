package nivel1.ejercicio2;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        ListIterator<Integer> listIterator = null;
        List<Integer> numbers = new ArrayList<Integer>();
        //variable can be from interface list class but the object (after new) has to be of the proper class arraylist
        numbers.add(5);
        numbers.add(8);
        numbers.add(18);
        numbers.add(100);
        numbers.add(4);
        List<Integer> reverseNumbers = new ArrayList<Integer>();
//Obtaining list iterator
        listIterator = numbers.listIterator(numbers.size());

        //iterador points to the beginning, and goes to the next. Needs a while or for. Goes thru everything, no matter the order.
        //listiterator can go fwd and backwards.
//        while (listIterator.hasNext()) {
//            System.out.println(listIterator.next());
//        }
        while (listIterator.hasPrevious()) {
           reverseNumbers.add(listIterator.previous());
        }

        System.out.println(reverseNumbers);
    }
}
