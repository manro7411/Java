import java.util.*;
public class Mapping {
    public static void main(String[] args) {
        HashMap<String,Integer> examscore = new HashMap<String,Integer>();
        examscore.put("Math", 75); 
        examscore.put("Science", 90); 
        examscore.put("Social", 70); 

        // examscore.clear();

        System.out.println(examscore.toString());
        System.out.println(examscore.get("Math"));
        examscore.remove("Science");
        System.out.println(examscore.toString());
        System.out.println(examscore.size());
    }
    
}
