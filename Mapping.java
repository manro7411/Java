import java.util.HashMap;
class Mapping {
    public static void main(String[] args) {
        HashMap<String,Integer> examscore = new HashMap<String,Integer>();
        examscore.put("Math", 75); 
        examscore.put("Science", 90); 
        examscore.put("Social", 70); 
        System.out.println(examscore.toString());
        System.out.println(examscore.get("Math"));
        examscore.remove("Science");
        System.out.println(examscore.toString());
        System.out.println(examscore.size());
        System.out.println(examscore.containsValue(Integer.valueOf(100)));
        examscore.forEach((subject,score) -> {
            examscore.replace(subject, score - 10);
        });
        System.out.println(examscore.toString());
    }
    
}
