import java.util.Scanner;
public class scanner {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        
        int name = sc.nextInt();
        double a1=sc.nextDouble();
        double a2=sc.nextDouble();
        String operation = sc.nextLine();
        if (operation.equals("sum")) {
            System.out.printf("%f + %f = %f", a1,a2,a1+a2);
            
        }
        System.out.println(name);
        // condition
        byte aStringbyte = 100; // -128 to 127
        short aSmallNumber = 20000; //-32.768 to 32.767
        int aninterger = 2147483647; // -2147483647 to 2147483647
        long aLargenumber = 9223372036854775807L; // -9223372036854775808 to 9223372036854775807
        double aDouble = 1.976;
        float aFloat = 3.4028F;
        boolean isweekend = true;
        boolean isWeek = false;
        char percent = '\u00A9';
        System.out.println(percent);
        int number1 = 5;
        double number2 = number1;
        System.out.println(number2);
        double num11 = 5.8;
        int inp = (int)num11;
        System.out.println(inp);
        // operator 
        int a = 12;
        int b = 6;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a == b);

        int score = 2;
        int turn = 10;
        turn--;
        score += 2;
        System.out.println("Score :"+score);
        System.out.println("Score :"+turn);
        System.out.println(score++);
        System.out.println(score);
        String fullname = "Ratchanon Traitiprat";
        System.out.println(fullname.toLowerCase());
        System.out.println(fullname.toUpperCase());
        String country = "Bangkok";
        int ages = 21;
        System.out.println("My name is "+fullname+"I'm from "+country+" I'm "+ages+" year old");

        String literalString1 = "abc";
        String literalString2 = "abc";
        System.out.println(literalString1.equalsIgnoreCase(literalString2));
        String sky = "The sky is blue";
        System.out.println(sky.replace("blue","green"));
        System.out.println(sky.contains("sky"));

        String objString1 = new String("xyz");
        String objString2 = new String("xyz");
        System.out.println(literalString1 == literalString2);
        System.out.println(objString1 == objString2);

        double gpa = Double.parseDouble(sc.nextLine());


        if (a >= 6 && b == 12) {
            System.out.println("The result is true");
            for (int i = 0; i < args.length; i++) {
                System.out.println(i);
                
            }
        }
        int num1 = 23;
        if (num1 > 20) {
            System.out.println(num1);
        }else{
            System.out.println("error");
        }

        System.out.println( );
        System.out.println("End of section 1");

        String inputString1 = sc.nextLine();
        
        switch (inputString1) {
            case "sum":
            System.out.println("Hello world");
                break;
        
            default:System.out.println("End the process");
                break;
        }
    }
}
