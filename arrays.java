import java.util.*;
public class arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char vovels[] = new char[5];
        char alphabets[] = {'a','c','b','d','e','f'}; 
        String txt = "Hello world";
        String words[] = {"Hello world","testing","popular"};
        System.out.println(words.length);
        vovels[0] = 'a';
        vovels[1] = 'e';
        vovels[2] = 'i';
        vovels[3] = 'o';
        vovels[4] = 'u';
        // be careful -> index.outofbound
        Arrays.sort(alphabets);
        System.out.println(Arrays.toString(vovels));
        System.out.println(vovels);
        int startingIndex = 1;
        int endingIndex = 4;
        char key = 'o';
        int foundIndex = Arrays.binarySearch(vovels,startingIndex,endingIndex,key);
        System.out.println(foundIndex);
        Arrays.fill(args, alphabets);
    }
    
}
