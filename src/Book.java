public class Book {
    private String title;
    private String author;
    private String description;
    private int price;
    private boolean isInStock;
    private String Displaytext;
    private double displayCost;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isInStock() {
        return isInStock;
    }

    public void setInStock(boolean inStock) {
        isInStock = inStock;
    }

    public void setDisplaytext(String displaytext) {
        Displaytext = displaytext;
    }

    public Book(String title, String author, String description, int price, boolean isInStock) {
        this.title = title;
        this.author = author;
        this.description = description;
        this.price = price;
        this.isInStock = isInStock;


    }

    public Book(String wating_to_exhale, String terri_mcMillian, String romance_novel, String s, String yes) {


    }

    public String getDisplaytext() {

        System.out.println("Author name:" +getAuthor());
        System.out.println("Author title:" +getTitle());
        System.out.println("Author Description:" +getDescription());
        System.out.println("Book cost is:" +getDisplayCost());
        return Displaytext;


    }

    private double getDisplayCost() {

        return displayCost;
    }


    public double getDisplayCost (int number) {
        double total = 0;

        if (isInStock()) {
            total = getPrice() * number;
        }
        return total;
    }
}


