import java.util.*;
public class arrayss {
    public static void main(String[] args) {
        int number[] ={1,2,3,4,5};
        int copyOfnumber[] = Arrays.copyOf(number,number.length);
        System.out.println(number == copyOfnumber);
    }
    
}
