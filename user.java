import java.time.LocalDate;
import java.time.Period;
import java.util.*;
public class user {
    // proporties 
    public String name;
    public LocalDate birthday;
    public ArrayList<Book> books = new ArrayList<Book>();

    public  void borrow(Book book){
        this.books.add(book);

    }

    public int age() {
        Period period = Period.between(this.birthday, LocalDate.now());
        return period.getYears();
    }
    
}
