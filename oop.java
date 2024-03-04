import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class oop {
    public static void main(String[] args) {
        user youngUser = new user();
        String date = "15-03-2003";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        youngUser.name = "Ratchanon Traitiprat";
        youngUser.birthday = LocalDate.parse(date, formatter);
        System.out.printf("%s was born back in %s and he is now %d years old \n", youngUser.name, youngUser.birthday, youngUser.age());
        user olderuser = new user();
        olderuser.name = "Passapol Pukhang";
        String date1 = "15-03-2003";
        olderuser.birthday = LocalDate.parse(date1, formatter);
        System.out.printf("%s was born back in %s and he is now %d years old", olderuser.name, olderuser.birthday, olderuser.age());

        Book book = new Book();
        book.title = "Lapsen";
        book.author = "Tunwarat Traitiprat";

        youngUser.borrow(book);
        System.out.printf("%s has borrowed these books: %s \n ", youngUser.name, youngUser.books.toString());

        user user = new user();
        user.name = "Ratchanon Traitiprat";
        user.birthday = LocalDate.parse("2003-03-15");
        Book book = new Book();
        book.title = "Carmilla";
        System.out.printf("%s was born in %s and he is now %d years old. \n", user.name,user.birthday,user.age());
        System.out.printf("%s has borrowed these books: %s \n",user.name,user.books.toString());
    }
}
