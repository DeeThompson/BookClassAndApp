public class Book {
    private String title;
    private String author;
    private String description;
    private int price;
    private boolean isInStock;
    private String Displaytext;

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


    public void getDisplaytext() {

        System.out.println("Author name:" +getAuthor());
        System.out.println("Author title:" +getTitle());
        System.out.println("Author Description:" +getDescription());



    }
}


