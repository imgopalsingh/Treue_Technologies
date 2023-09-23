import java.util.*;
public class BOOKS {
    private int number;
    private String name;
    private String author;
    private String category;
    private boolean isAvailable;
    private String ownedBy;
    private double price;

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public String getOwnedBy() {
        return ownedBy;
    }
    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }
    public void setOwnedBy(String ownedBy) {
        this.ownedBy = ownedBy;
    }
    public boolean isAvailable() {
        return isAvailable;
    }

    public BOOKS() {
    }
    
    public BOOKS(int number, String name, String author, String category, boolean isAvailable, String ownedBy,double price) {
        this.number = number;
        this.name = name;
        this.author = author;
        this.category = category;
        this.isAvailable = isAvailable;
        this.ownedBy = ownedBy;
        this.price=price;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public int getnumber() {
        return number;
    }
    public void setnumber(int number) {
        this.number = number;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }


    public static List<Book> getBookList(){

        List<Book> BOOKS=new ArrayList<>();
        BOOKS.add(new BOOKS(0, "Head First Java", "Author", "Kathy Sierra", true, null,100));
        BOOKS.add(new BOOKS(1, "Math Algebra", "General", "Mathematics", true, null,800));
        BOOKS.add(new BOOKS(2, "Information Technology", "Computer lab", "IT", true, null,80));
        BOOKS.add(new BOOKS(3, "Java Programming", "New School", "Computer Science ", true, null,880));
        BOOKS.add(new BOOKS(4, "Advance Java", "New School", "Computer Science", true, null,709));
        BOOKS.add(new BOOKS(5, "Python", "py lab", "Computer Science", true, null,1000));
        BOOKS.add(new BOOKS(6, "REACT NATIVE", "Android Development", "CS IT", true, null,2000));
        return BOOKS;
    }
    
}
