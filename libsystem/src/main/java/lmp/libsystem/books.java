
package lmp.libsystem;


public class books {
    
    private Long bookId;
    
    private String bookName;
    
    private String bookSeries;
    
    private String bookAuthor;
    
    private String bookPublisher;
    
    private int bookRelease;
    
    private int bookType;
    
    private int bookGenre;
    
    private int bookQuantity;
    
    private int bookPages;
    
    private int bookPrice;

    public books(Long bookId, String bookName, String bookSeries, String bookAuthor, String bookPublisher, int bookRelease, int bookType, int bookGenre, int bookQuantity, int bookPages, int bookPrice) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.bookSeries = bookSeries;
        this.bookAuthor = bookAuthor;
        this.bookPublisher = bookPublisher;
        this.bookRelease = bookRelease;
        this.bookType = bookType;
        this.bookGenre = bookGenre;
        this.bookQuantity = bookQuantity;
        this.bookPages = bookPages;
        this.bookPrice = bookPrice;
    }

    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookSeries() {
        return bookSeries;
    }

    public void setBookSeries(String bookSeries) {
        this.bookSeries = bookSeries;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getBookPublisher() {
        return bookPublisher;
    }

    public void setBookPublisher(String bookPublisher) {
        this.bookPublisher = bookPublisher;
    }

    public int getBookRelease() {
        return bookRelease;
    }

    public void setBookRelease(int bookRelease) {
        this.bookRelease = bookRelease;
    }

    public int getBookType() {
        return bookType;
    }

    public void setBookType(int bookType) {
        this.bookType = bookType;
    }

    public int getBookGenre() {
        return bookGenre;
    }

    public void setBookGenre(int bookGenre) {
        this.bookGenre = bookGenre;
    }

    public int getBookQuantity() {
        return bookQuantity;
    }

    public void setBookQuantity(int bookQuantity) {
        this.bookQuantity = bookQuantity;
    }

    public int getBookPages() {
        return bookPages;
    }

    public void setBookPages(int bookPages) {
        this.bookPages = bookPages;
    }

    public int getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(int bookPrice) {
        this.bookPrice = bookPrice;
    }
    
}
