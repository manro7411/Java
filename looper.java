public class looper {
    public static void main(String[] args) {
        int number[] ={1,2,3,4,5,6,7,8,9,10};
        int sum = 0;
        for (int i = 0; i < number.length; i++) {
            sum += number[i];
            // System.out.println(number[i]);
            
        }
        System.out.println(sum);
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        System.out.println("-----");
    for (int i = 0; i < 10; i++) {
        for (int j = 0; j < 10; j++) {
            System.out.printf("%d X %d = %d \n",i,j,i * j );   
        }
    }
    for (int i = 0; i < 50; i++) {
        if (i%2 == 1) {
            System.out.println(i);   
        }
    }
    int num[] = {1,2,3,4,5};
    for (int i = 0; i < num.length; i++) {
        if (i%2 == 1) {
            System.out.println(i);
            
        }
        
    }
    }
}
