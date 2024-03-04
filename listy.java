import java.util.ArrayList;
import java.util.Comparator;
class Listy {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(3);
        numbers.add(2);
        numbers.add(5);
        numbers.remove(2);
        numbers.set(2, Integer.valueOf(30));
        numbers.sort(Comparator.reverseOrder());
        numbers.sort(Comparator.naturalOrder());
        System.out.println(numbers.get(2));
        System.out.println(numbers.toString());
        // numbers.clear();
        System.out.println(numbers.isEmpty());
        while (true) {
            System.out.println("Before:"+numbers.toString());
            numbers.forEach(number ->{
                numbers.set(numbers.indexOf(number),number * 2);
            });
            System.out.println("after :"+ numbers.toString());
        }
    }
}
